var Employee = /** @class */ (function () {
    function Employee(firstName, lastName, age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    Employee.prototype.fullName = function () {
        return this.firstName + " " + this.lastName + " " + this.age;
    };
    return Employee;
}());
var myEmp = new Employee("raju", "yadav", "21");
console.log(myEmp.fullName());
