<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        div {
            display: inline-block;
            margin: 5px;
            width: 20px;
            height: 20px;
            background-color: blue;
        }
    </style> 
</head>
<body>
<!--Write your PHP Script here-->

<?php
    for ($f = 0 ; $f <=5 ; $f++){
        for ($i = 0 ; $i <10 ; $i++){
    ?> <div style="background-color: rgb(<?=($f *51 + $i * 5)?>, <?=($f *51+ $i * 5)?> , <?=($f *51+ $i * 5)?>"></div> <?php
        }
    ?> </br> <?php
    }
?>
</body>
</html>