let jsonArray = [];
let number = 0;
document.getElementById('add').addEventListener('click', agregar);
document.getElementById('modify').addEventListener('click', modificar);

function agregar() {
    let exist = false;
    let code = parseInt(document.getElementById('code').value);
    if(code === 0) {
        alert("Debe ingresa un código de artículo distinto a cero");
        return;
    }
    jsonArray.forEach(element => {
        let newjson = JSON.parse(element);
        if(newjson.codigo == code) {
            alert("Ya existe un artículo con este código");
            exist = true;
        }        
    });
    if(exist) {
        return;
    }
    let desc = document.getElementById('description').value;
    let price = parseInt(document.getElementById('price').value);
    let json = {"codigo" : code, "descripcion" : desc, "precio" : price};
    jsonArray[code] = JSON.stringify(json);
    let tablerow = 
    `<tr class="par">
        <td id="id${code}">${code}</th>
        <td id="desc${code}">${desc}</th>
        <td id="price${code}">${price}</th>
        <td><em class="fa-solid fa-trash" onclick="borrar(${code})"></em></th>
        <td><em class="fa-solid fa-file-pen" id="sel${code}" onclick="seleccionar(${code})"></em></th>
        <td id="imgs${code}" class="imgtd"><input type="file" name="image" id="image" class="image" onchange="imagenes(${code})"></th>
    </tr>`;
    document.getElementById('table').insertRow(-1).innerHTML = tablerow;
    clean();
}

function borrar(num) {
    let index = 0;
    let opcion = confirm("¿Deseas eliminar la fila?");
    if (opcion == true) {
        jsonArray.forEach(element => {
            let newjson = JSON.parse(element);
            if(newjson.codigo != undefined ){
                index++;
                if(newjson.codigo == num) {
                    document.getElementById('table').deleteRow(index);
                    console.log(index);
                    delete jsonArray[num];
                    let myDiv = document.querySelectorAll(".imgprod")[index-1];
                    if(myDiv != undefined) {
                        myDiv.remove("imgprod");
                    }
                }
            }       
        });
	}   
}

function seleccionar(num) {
    number = 0;
    jsonArray.forEach(element => {
        let newjson = JSON.parse(element);
        if(newjson.codigo != undefined ){
            if(newjson.codigo == parseInt(num)) {
                document.getElementById('code').value = newjson.codigo;
                document.getElementById('description').value = newjson.descripcion;
                document.getElementById('price').value = newjson.precio;
                number = newjson.codigo;
            }
        }     
    });
}

function modificar() {
    let exist = false;
    let code = parseInt(document.getElementById('code').value);
    if(code === 0) {
        alert("Debe ingresa un código de artículo distinto a cero");
        return;
    }
    jsonArray.forEach(element => {
        let newjson = JSON.parse(element);
        if(newjson.codigo == code && number != newjson.codigo) {
            alert("Ya existe un artículo con este código");
            exist = true;
        }        
    });
    if(exist) {
        return;
    }

    document.getElementById(`sel${number}`).setAttribute("onclick",`seleccionar(${code})`);
    document.getElementById(`sel${number}`).id = `sel${code}`;
    document.getElementById(`id${number}`).innerHTML= code;
    document.getElementById(`id${number}`).id = `id${code}`;
    delete jsonArray[number];
    let desc= document.getElementById('description').value;
    document.getElementById(`desc${number}`).innerHTML = desc;
    document.getElementById(`desc${number}`).id = `desc${code}`;
    let price = parseInt(document.getElementById('price').value);
    document.getElementById(`price${number}`).innerHTML = price;
    document.getElementById(`price${number}`).id = `price${code}`;
    let json = {"codigo" : code, "descripcion" : desc, "precio" : price};
    jsonArray[code] = JSON.stringify(json);
    clean();
    number = 0;
}

function imagenes(num) {
    let index = 0;
    let img;
    jsonArray.forEach(element => {
        let newjson = JSON.parse(element);
        if(newjson.codigo != undefined ){
            if(newjson.codigo == num) {
                let myDiv = document.querySelectorAll(".imgprod img")[index];
                img = document.querySelectorAll(".image")[index].files[0];
                if(myDiv != undefined) {
                    myDiv.setAttribute("src",`imgs/${img.name}`);
                } else {
                    document.querySelector('.products').innerHTML += `<div class="imgprod"><img src ="imgs/${img.name}">
                    <label>${newjson.descripcion}<label></br>
                    <label>$ ${newjson.precio}<label>
                    </div>`;
                }
            } else {
                index++;
            }
        }       
    }); 
}

function clean() {
    document.getElementById('code').value = "";   
    document.getElementById('description').value = "";
    document.getElementById('price').value = "";
}