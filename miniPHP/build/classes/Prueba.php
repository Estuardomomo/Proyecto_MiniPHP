<?php 
if ($_POST ["valor1"] !="" and $_POST ["valor2"]!=""){
    if ($_POST["operador"] == "suma") {
        print ($resultado = $_POST ["valor1"] + $_POST ["valor2"]);
        print ('<br /><a href="calculadora.php">Volver</a>');
    } elseif ($_POST["operador"] == "resta") {
        print ($resultado = $_POST ["valor1"] - $_POST ["valor2"]);
        print ('<br /><a href="calculadora.php">Volver</a>');
    } elseif ($_POST["operador"] == "multiplicacion") {
        print ($resultado = $_POST ["valor1"] * $_POST ["valor2"]);
        print ('<br /><a href="calculadora.php">Volver</a>');
    } elseif ($_POST["operador"] == "division") {
        print ($resultado = $_POST ["valor1"] / $_POST ["valor2"]);
        print ('<br /><a href="calculadora.php">Volver</a>');
    }
} else {
    print("Ingresa alg&uacute;n valor");
    print ('<br /><a href="calculadora.php">Volver</a>');
}
?>
<?php
namespace my\name; // see "Defining Namespaces" section

class MyClass {}
function myfunction() {}
const MYCONST = 1;

$a = new MyClass;
$c = new \my\name\MyClass; // see "Global Space" section

$a = strlen('hi'); // see "Using namespaces: fallback to global
                   // function/constant" section

$d = namespace\MYCONST; // see "namespace operator and __NAMESPACE__
                        // constant" section
$d = __NAMESPACE__ . '\MYCONST';
echo constant($d); // see "Namespaces and dynamic language features" section
?>