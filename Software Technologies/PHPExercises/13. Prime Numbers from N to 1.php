<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
	<!--Write your PHP Script here-->
    <?php
    if (isset($_GET["num"])) {
        $num = intval($_GET["num"]);


        $sum = 1;
        for ( $i=$num; $i >= 2; $i--  ){
            $devisors = 0;
            for ($f = 1; $f <= $i ; $f++){
                if ($i % $f == 0){
                    $devisors++;

                }

            }
            if ($devisors == 2){
                echo "$i ";
            }


        }
    }
    ?>
</body>
</html>