class Car{
    id:number;
    engine:string;

    constructor(newId:number,newEngine:string){
        this.id=newId;
        this.engine=newEngine;
    }

    show():string{

        return this.engine+" "+this.id;


    }

}

let obj=new Car(123,"abc");

obj.id=26;
console.log(obj.show());