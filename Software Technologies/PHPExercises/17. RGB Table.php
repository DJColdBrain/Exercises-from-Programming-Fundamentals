<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
	<style>
		table * {
			border: 1px solid black;
			width: 50px;
			height: 50px;
		}
    </style>
</head>
<body>
<table>
    <tr>
        <td>
            Red
        </td>
        <td>
            Green
        </td>
        <td>
            Blue
        </td>
    </tr>
<!--Write your PHP Script here-->
    <?php
        for ($f =1; $f <= 5; $f++){
            ?> <tr>  <?php
            for ($i = 1 ; $i <=3 ; $i++){
                if ($i == 1){
                    ?> <td style="background-color: rgb(<?=($f *51)?>,0, 0)"> </td> <?php
                }elseif ($i == 2){
                    ?> <td style="background-color: rgb(0,<?=($f *51)?>, 0)"> </td> <?php
                }elseif ($i ==3){
                    ?> <td style="background-color: rgb(0,0, <?=($f *51)?>)"> </td> <?php
                }

            } ?> </tr> <?php
        }

    ?>
</table>
</body>
</html>