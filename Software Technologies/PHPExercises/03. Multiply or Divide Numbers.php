<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num1" />
		M: <input type="text" name="num2" />
        <input type="submit" />
    </form>
	<!--Write your PHP Script here-->
    <?php
    if (isset($_GET['num1'])){
        $num1 = intval($_GET['num1']);
        $num2 = intval($_GET['num2']);
        if (($num1 <=> $num2) == -1 || ($num1 <=> $num2) == 0){
            echo $num1*$num2;
        }else{
            echo $num1/$num2;
        }
    }
    ?>
</body>
</html>