// prototype object
const bankaccount={
    balance:1000,
    ifsc:"dg35353",
    deposit:function(amt)
            {
                this.balance+=amt;
            },
    withdraw:function(amt)
    {
        this.balance-=amt;
    },
    getBalance:function(amt)
    {
        return this.balance;
    }
 
}
 
let savingaccount=Object.create(bankaccount);
savingaccount.accno="sb111";
savingaccount.accholder="Harsh";
savingaccount.bank="sbi";
savingaccount.branch="bangalore BTM";
 
let currentaccount=Object.create(bankaccount);
currentaccount.accno="cb001";
currentaccount.accholder="Harsh";
currentaccount.bank="sbi";
currentaccount.branch="bangalore BTM";
 
console.log(savingaccount.accholder)
savingaccount.deposit(120000);
savingaccount.withdraw(21000);
savingaccount.deposit(120000);
savingaccount.withdraw(121000);

console.log(savingaccount.getBalance());
console.log(savingaccount);
console.log(bankaccount);
