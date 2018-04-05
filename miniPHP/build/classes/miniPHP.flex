class Yytoken {
    Yytoken (int numToken,String token, String tipo, int linea, int columna){
        //Contador para el número de tokens reconocidos
        this.numToken = numToken;
        //String del token reconocido
        this.token = new String(token);
        //Tipo de componente léxico encontrado
        this.tipo = tipo;
        //Número de linea
        this.linea = linea;
        //Columna donde empieza el primer carácter del token
        this.columna = columna;
    }
    //Métodos de los atributos de la clase
    public int numToken;
    public String token;
    public String tipo;
    public int linea;
    public int columna;
    //Metodo que devuelve los datos necesarios que escribiremos en un archive de salida
    public String toString() {
        return "Token #"+numToken+": "+token+" C.Lexico: "+tipo+" ["+linea
        + "," +columna + "]";
    }
}
%%
%line
%column
%ignorecase
a = [aA]
b = [bB]
c = [cC]
d = [dD]
e = [eE]
f = [fF]
g = [gG]
h = [hH]
i = [iI]
j = [jJ]
k = [kK]
l = [lL]
m = [mM]
n = [nN]
o = [oO]
p = [pP]
q = [qQ]
r = [rR]
s = [sS]
t = [tT]
u = [uU]
v = [vV]
w = [wW]
x = [xX]
y = [yY]
z = [zZ]
__halt_compiler= ("__halt_compiler")
break = ("break")
clone = ("clone")
die = ("die()")
empty = ("empty()")
endswitch = ("endswitch")
final = ("final")
global = ("global")
include_once = ("include_once")
list = ("list()")
private = ("private")
return = ("return")
try = ("try")
xor = ("xor")
__CLASS__ = ("__CLASS__")
__NAMESPACE__ = ("__NAMESPACE__")
abstract = ("abstract")
callable = ("callable")
const = ("const")
do = ("do")
enddeclare = ("enddeclare")
endwhile = ("endwhile")
finally = ("finally")
goto = ("goto")
instanceof = ("instanceof")
namespace = ("namespace")
protected = ("protected")
static = ("static")
unset = ("unset()")
yield = ("yield")
__DIR__ = ("__DIR__")
__TRAIT__ = ("__TRAIT__")
and = ("and")
case = ("case")
continue = ("continue")
echo = ("echo")
endfor = ("endfor")
eval = ("eval()")
for = ("for")
if = ("if")
insteadof = ("insteadof")
new = ("new")
public = ("public")
switch = ("switch")
use = ("use")
array = ("array()")
catch = ("catch")
declare = ("declare")
else = ("else")
endforeach = ("endforeach")
exit = ("exit()")
foreach = ("foreach")
implements = ("implements")
interface = ("interface")
or = ("or")
require = ("require")
throw = ("throw")
var = ("var")
while = ("while")
trait = ("trait")
require_once = ("require_once")
print = ("print")
isset = ("isset()")
include = ("include")
function = ("function")
extends = ("extends")
endif = ("endif")
elseif = ("elseif")
default = ("default")
class = ("class")
as = ("as")
__FILE__ = ("__FILE__")
__FUNCTION__ = ("__FUNCTION__")
__LINE__ = ("__LINE__")
__METHOD__ = ("__METHOD__")
ConstanteCompilacion = {__CLASS__}|{__DIR__}|{__FILE__}|{__FUNCTION__}|{__LINE__}|{__METHOD__}|{__NAMESPACE__}|{__TRAIT__}
PalabrasReservadas = {abstract}|{and}|{array}|{as}|{break}|{callable}|{case}|{catch}|{class}|{clone}|{const}|{continue}|{declare}|{default}|{die}|{do}|{echo}|{else}|{elseif}|{empty}|{enddeclare}|{endfor}|{endforeach}|{endif}|{endswitch}|{endwhile}|{eval}|{exit}|{extends}|{final}|{finally}|{for}|{foreach}|{function}|{global}|{goto}|{__halt_compiler}|{if}|{implements}|{include}|{include_once}|{instanceof}|{insteadof}|{interface}|{isset}|{list}|{namespace}|{new}|{or}|{print}|{private}|{protected}|{public}|{require}|{require_once}|{return}|{static}|{switch}|{throw}|{trait}|{try}|{unset}|{use}|{var}|{while}|{xor}|{yield}
%%
{PalabrasReservadas} { System.out.println ("Se leyo una palabra reservada");}
{ConstanteCompilacion} { System.out.println ("Se leyo una constante en tiempo de compilacion");}

