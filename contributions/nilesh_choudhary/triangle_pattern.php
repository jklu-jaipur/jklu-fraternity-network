<!-- HTML form to select the number of rows to display pattern star. -->
<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
	Enter the number of Pattern row count: <input type="number" name="count_rows" min="1">
	<input type="submit" name="submit">
</form>

<?php
/*
 * Perform Submit action.
 */
	if( isset( $_POST['submit'] ) ) {
		// Get the entered number from user.
		$n = $_POST['count_rows'];
		
		// Loop to handle the number of rows.
		for ( $i = 0; $i < $n; $i++ )   
		{
			for ( $k = 1; $k < ( $n - $i ); $k++ )
			{
				// print space.
				echo "&nbsp;"; 
			}
			for( $j = 0; $j <=$i ; $j++ )
			{
				// print star.	  	
				echo "*";	  
			} 	
			echo "<br/>";	
		} 
	}
?>

<!-- 
Input: 4

Output:
   *
  * *
 * * *
* * * *

 -->
