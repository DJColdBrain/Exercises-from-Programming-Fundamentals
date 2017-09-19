<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>
<body>
<!--Write your PHP Script here-->

<?php
drawLine();
drawLeftColumn();
drawLine();
drawRightColumn();
drawLine();
?>
</body>
</html>

<?php
function drawLine(){
    for ($i=1; $i<=5; $i++){
?> <button style="background-color: blue">1</button> <?php
    }?> </br> <?php
}
function drawLeftColumn(){
    for ($i=1; $i<=3; $i++){
        for ($f=1; $f<=5; $f++){
            if ($f == 1){
            ?> <button style="background-color: blue">1</button> <?php
            }else{
                ?> <button >0</button> <?php
            }
        }?> </br> <?php
    }
}function drawRightColumn(){
    for ($i=1; $i<=3; $i++){
        for ($f=1; $f<=5; $f++){
            if ($f == 5){
                ?> <button style="background-color: blue">1</button> <?php
            }else{
                ?> <button >0</button> <?php
            }
        }?> </br> <?php
    }
}
?>