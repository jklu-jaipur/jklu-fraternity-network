<!-- HTML form to select the number of series needs to be displayed. -->
<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
	Enter the number of Fibonacci series count: <input type="number" name="count_rows" min="1">
	<input type="submit" name="submit">
</form>

<?php
/*
 * Perform Submit action.
 */

if( isset( $_POST['submit'] ) ) {
	// Get the entered number from user.
	$n = $_POST['count_rows'];

	$num = 0;  
	$f1 = 0;  
	$f2 = 1;  

	// Print first two fib. series number by default.
	echo $f1.' '.$f2.' ';
	// Loop to add and display the next number.
	while ( $num < ( $n - 2 ) )  
	{  
		// Addition.
		$f3 = $f2 + $f1;  
		// Display.
		echo $f3.' ';
		// Logic and replacing the previously added number.
		$f1 = $f2;  
		$f2 = $f3;  
		$num = $num + 1;
	}
}
?>

<!-- 
Input: 6
Output:
0 1 1 2 3 5
 -->