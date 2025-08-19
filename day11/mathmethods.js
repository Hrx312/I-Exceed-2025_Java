//All math methods
//static methods
'use script';
console.log("--->STATIC METHODS")
console.log("--->basic math methods");
console.log("convert negative values to positive:", Math.abs(-5));
console.log("rounds up to the nearest integer:", Math.ceil(4.2));
console.log("rounds down to the nearest integer:", Math.floor(4.6));
console.log("rounds to the nearest integer:", Math.round(4.4));
console.log("returns the nearest 32bit single precision:", Math.fround(4.5));
console.log("return the mul of x*y in (x,y)",Math.imul(4,-9));
console.log("removes the decimal part of number:", Math.trunc(4.9775767));
console.log("returns 1, -1, or 0 depending on the sign of number:", Math.sign(-10));
console.log("returns maximum value", Math.max(1, 2, 3));
console.log("returns minimum value:", Math.min(1, 2, 3));
console.log("return the power:", Math.pow(2, 3));
console.log("returns the square root:", Math.sqrt(16));
console.log("returns the cube root:", Math.cbrt(27));
console.log("returns the square root of the sum of squares:", Math.hypot(3, 4)); 
console.log("leading zeroes:",Math.clz32(5));

console.log("\n--->trigonometry methods");
console.log("returns the sin value:", Math.sin(1));
console.log("return inverse of sin:", Math.asin(1)); 
console.log("return inverse hyperbolic of sin:", Math.asinh(1)); 
console.log("returns the cosine value:", Math.cos(0));
console.log("returns inverse of cosine :", Math.acos(1));
console.log("returns inverse hyperbolic of cosine :", Math.acosh(1));
console.log("returns tangent value:", Math.tan(1));
console.log("returns inverse of tangent :", Math.atan(1));
console.log("returns inverse hyperbolic of tangent :", Math.atanh(1));
console.log("returns the angle from the X-axis to the point (x, y):", Math.atan2(10, 5));

console.log("\n--->logarithmic & exponential methods");
console.log("returns the natural logarithm (base e) of x:", Math.log(Math.E)); 
console.log("returns the base-10 logarithm of x:", Math.log10(100));
console.log("returns the base-2 logarithm of x:", Math.log2(8));
console.log("returns e raised to the power x:", Math.exp(1)); 
console.log(" returns e raised to the power of a number, subtracted by 1:", Math.expm1(1)); 

console.log("\n--->STATIC PROPERTIES");
console.log("returns a random number between 0 and 1:", Math.random());
console.log("value of pi:", Math.PI);
console.log("value of euler's number:", Math.E);
console.log("natural log of 2:", Math.LN2);
console.log("natural log of 10:", Math.LN10);
console.log("returns the natural logarithm (base e) of 1 + x",Math.log1p);
console.log("log base 2 of e:", Math.LOG2E);
console.log("log base 10 of e:", Math.LOG10E);
console.log("square root of 2:", Math.SQRT2);
console.log("square root of 1/2:", Math.SQRT1_2);
