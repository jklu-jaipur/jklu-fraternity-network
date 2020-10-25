<!-- Binary search tree implementation in PHP. -->
<h1>Binary search tree implementation in PHP</h1>
<h2>
Example: Array data:
[ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 ]
<br><br>
Result:<br><br>
<?php 
  
function binarySearch_php(Array $arr, $search) 
{ 
    $low  = 0; 
    $high = count($arr) - 1; 

    // logic for getting the search result.      
    while ($low <= $high) { 
        // Divide the array into two parts.
        $mid = floor(($low + $high) / 2); 
   
        if ( $arr[$mid] == $search ) { 
            return true; 
        } 
  
        if ( $search < $arr[$mid] ) { 
            // Search the element from left side of the array 
            $high = $mid -1; 
        } else { 
            // Search the element from right side of the array 
            $low = $mid + 1; 
        } 
    } 
      
    // After reaching all the side of the array, then the element does not exists.
    return false; 
} 
  
// Array Data 
$arr_data = array(10, 20, 30, 40, 50, 60, 70, 80, 90, 100); 

// Search number:
$search = 70; 
if ( binarySearch_php($arr_data, $search) == true ) { 
    echo $search." Exists in the Array."; 
} else { 
    echo $search." Does not Exist in the Array."; 
}
?>
</h2>
<!-- 
Data: [ 10 20 30 40 50 60 70 80 90 100 ]
#1:
    Input: 70

    Output:
    70 Exists in the Array.
#2:
    Input: 85

    Output:
    85 Does not Exist in the Array.
-->