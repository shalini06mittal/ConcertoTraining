define(["require", "exports"], function (require, exports) {
    "use strict";
    exports.__esModule = true;
    exports.f1 = void 0;
    var Student = /** @class */ (function () {
        function Student(name, email) {
            if (email === void 0) { email = 'test@gmail.com'; }
            this.name = name;
            this.email = email;
            this.name = name;
            this.email = email;
        }
        Student.prototype.display = function () {
            console.log(this.name, this.email);
        };
        return Student;
    }());
    exports["default"] = Student;
    // let s1 = new Student('shalini','45678')
    // let s2 = new Student('shalini')
    // s1.display();
    // s2.display()
    function f1() {
    }
    exports.f1 = f1;
});
