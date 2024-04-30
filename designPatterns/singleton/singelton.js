// ############### Singelton Class ###############

// Code :
class SingletonClass {
    constructor(value) {
        // Check if an instance already exists
        if (!SingletonClass.instance) {
            // If not, create a new instance and assign it to the static property
            SingletonClass.instance = this;
            this.value = value;
        }
        // Return the existing instance if it already exists
        return SingletonClass.instance;
    }
}
// Usage:
const sc1 = new SingletonClass(42);
console.log(sc1)

const sc2 = new SingletonClass();
console.log(sc2)

const sc3 = new SingletonClass(543);
console.log(sc3)

console.log(sc1 === sc2); 

// ############### Singelton function expression ###############

// Code :
const SingletonFuncExp = (() => {
    let instance = null;

    // Private constructor
    function SingletonFunctionExpression(value) {
        if (instance) {
            return instance;
        }
        instance = this;
        this.value = value;
    }

    return SingletonFunctionExpression;
})();

// Usage example
const sf1 = new SingletonFuncExp(42);
console.log(sf1);

const sf2 = new SingletonFuncExp();
console.log(sf2);

const sf3 = new SingletonFuncExp(543);
console.log(sf3);

console.log(sf1 === sf2); // true