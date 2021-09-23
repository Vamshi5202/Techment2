var Car = /** @class */ (function () {
    function Car(newId, newEngine) {
        this.id = newId;
        this.engine = newEngine;
    }
    Car.prototype.show = function () {
        return this.engine + " " + this.id;
    };
    return Car;
}());
var obj = new Car(123, "abc");
obj.id = 26;
console.log(obj.show());
