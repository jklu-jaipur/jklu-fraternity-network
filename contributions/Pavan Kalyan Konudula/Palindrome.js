
//String Palindrome Checker

var input = "MADAM" // alternatively can use prompt() for input

let left = 0;

let right = input.length - 1;

let flag=0;

//using two pointer approach to check for palindrome
while(left<right){

    if(input[left] != input[right])
    {
        flag++;
        break;
    }

    left++;
    right--;

}

if(flag == 1)
    console.log(input + " is not a Palindrome string.");
else
    (input + " is a Palindrome string.")


/*

    Contributed by

                Pavan Kalyan Konudula

*/