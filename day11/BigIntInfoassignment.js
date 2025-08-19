// Intializing BigInt values
let big1 = 78329217836984243986n;
let big2 = BigInt("98373289743274387");

let sum = big1 + big2;// Addition
let sub = big2 - big1;// Subtraction
let multiply = big1 * big2;// Multiplication
let division = big2 / big1;// Division
let remainder = big2 % big1;// Modulas
let power = big1 ** 2n;// Power 

console.log("Sum : ", sum);
console.log("Subtraction : ", sub);
console.log("Multiplication : ", multiply);
console.log("Division : ", division);
console.log("Remainder : ", remainder);
console.log("Power : ", power);

// Comparing two bigint values
console.log(" big1 > big2 ", big1 > big2);
console.log(" big1 === big2 ", big1 === big2);

//Bigint Use Cases In Finance

//Handling Large Transactions
const transaction1 = 1000000000000000000000n;
const transaction2 = 2000000000000000000000n;
const total = transaction1 + transaction2;
console.log("Total Transaction : ",total); 

//Currency Conversion from usd to inr
const usdToInrRate = 83n;
const usdAmount = 100000000000000000n;
const inrAmount = usdAmount * usdToInrRate;
console.log("Converted Amount : ",inrAmount); 

//Interest Calculations
const principal = 5000000000000000000n;
const rate = 5n; // assuming the rate of interest as 5%
const time = 2n; // assuming the timeperiod as 2 years
const interest = (principal * rate * time) / 100n;
console.log("Intersest : ",interest); 

//Account Balances
const accountBalance = 102345678901234567890n;
const transaction = 50000000000000000n;
const updatedBalance = accountBalance + transaction;
console.log("Updated balance after transaction : ",updatedBalance); 


