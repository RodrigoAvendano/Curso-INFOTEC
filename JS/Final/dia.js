class daysOfTheWeek {

    constructor() {
        this.year = this.getMyYear();
        this.month = this.getMyMonth();
        this.day = this.getMyDay(this.month, this.day);
    }

    getMyYear() {
        let year = 0;
        do {
            year = parseInt(prompt("Ingresa el año"));
            if(isNaN(year) || year === 0 || year.toString().length !== 4) {
                alert("Ingresa un año con 4 dígitos");
            }
        }while(isNaN(year) || year === 0 || year.toString().length !== 4);
        return year;
    }

    getMyMonth() {
        let month = 0;
         do {
            month = parseInt(prompt("Ingresa el mes"));
            if(isNaN(month) || month === 0 || month>12) {
                alert("Ingresa un dato válido (1-12)");
            }    
        }while(isNaN(month) || month === 0 || month>12);
        return month;
    }

    getMyDay(month, year) {
        let day = 0;
        do {
            day = parseInt(prompt("Ingresa el día"));
            if(month === 2 && day > 29) {
                if(!this.leapYear(year) && day === 29) {
                    alert("No es un año bisiesto");
                } else {
                    alert("Febrero solo tiene 1-28 días");
                }
            } else if(!this.daysOfMonth(month) && day>30) {
                alert("Este mes solo tiene 30 días")
            } else if(isNaN(day) || day === 0 || day>31) {
                alert("Ingresa un dato válido (1-31)");
            }
        }while(isNaN(day)|| day === 0 || day>31 || month === 2 && day > 29 || month === 2 && day === 29 && !this.leapYear(year) || !this.daysOfMonth(month) && day>30);
        return day;
    }

    daysOfMonth(month) {
        if(month === 1 || month === 3 || month === 5 || month === 7 || month === 8 || month === 10 || month === 12) {
            return
        }
        else {
            return false;
        }
    }

    leapYear(year) {
        if(year % 400 === 0) {
            if(year % 100 === 0) {
                return false;
            }
            if(year % 4 === 0) {
                return;
            }
        } else {
            return false;
        }
    }

    myDate(year,month,day) {
        const objDate = new Date(year, month, day).getDay();
        const days = ["lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"];
        const dayName = days[objDate];
        return dayName;
    }

    getWorkDay() {
        const day = this.myDate(this.year, this.month, this.day);
        const date = `${this.day}-${this.month}-${this.year}`;
        if (day === "sábado" || day === "domingo") {
            return `${date} es día ${day} y no es laborable`;
        } else {
            return `${date} es día ${day} y es laborable`;
        }
    }

    printDate() {
        document.getElementById('work').innerHTML = this.getWorkDay();
    }
}

let myDay = new daysOfTheWeek();
myDay.printDate();