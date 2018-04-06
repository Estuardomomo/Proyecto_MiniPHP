/* The following code was generated by JFlex 1.6.1 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
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

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/User_Len/Documents/GitHub/Proyecto_MiniPHP/miniPHP/src/miniPHP.flex</tt>
 */
class Yylex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\62\1\45\1\50\1\50\1\47\22\0\1\62\1\55\1\52"+
    "\1\65\1\66\1\0\1\53\1\44\1\62\1\62\1\60\1\56\1\62"+
    "\1\42\1\43\1\57\1\41\1\41\6\41\2\41\1\62\1\62\1\36"+
    "\1\61\1\40\1\37\1\0\1\1\1\2\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\12"+
    "\1\63\1\46\1\64\1\0\1\32\1\0\1\1\1\2\1\3\1\4"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\12\1\62\1\54\1\62\1\0\6\12\1\51\32\12\1\12"+
    "\137\12\60\0\2\33\115\0\1\35\u1500\0\1\62\u097f\0\13\62\35\0"+
    "\1\50\1\50\5\0\1\62\57\0\1\62\312\0\1\34\u0ed5\0\1\62"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\ud00f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\23\2\2\1\6\2\1\1\2\2\2\1"+
    "\6\2\1\1\2\2\1\0\4\2\1\0\4\2\1\0"+
    "\4\2\1\0\1\2\1\0\10\2\1\0\1\2\5\0"+
    "\1\2\2\3\1\2\14\0\6\2\1\0\1\2\1\0"+
    "\4\2\1\0\2\2\1\0\1\2\1\0\2\2\2\0"+
    "\1\2\1\0\3\2\1\0\1\2\2\0\7\2\5\0"+
    "\1\2\7\0\12\2\2\0\1\2\1\0\1\2\1\0"+
    "\1\2\1\0\3\2\2\0\2\2\1\0\2\2\1\0"+
    "\1\2\1\0\2\2\2\0\1\2\1\0\1\2\1\0"+
    "\1\2\1\0\2\2\5\0\1\2\3\0\6\2\1\0"+
    "\2\2\4\0\5\2\7\0\1\2\1\0\1\2\1\0"+
    "\3\2\5\0\6\2\1\0\2\2\5\0\1\2\4\0"+
    "\1\2\2\0\3\2\2\0\5\2\1\0\1\2\3\0"+
    "\1\2\3\0\3\2\2\0\3\2\1\0\1\2\2\0"+
    "\1\2\2\0\4\2\3\0\1\2\1\0\2\2\1\0"+
    "\2\2\1\0\3\2\1\0\2\2\1\0\3\2\1\0"+
    "\1\2\2\0\2\2\23\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[339];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\67\0\156\0\245\0\334\0\u0113\0\u014a\0\u0181"+
    "\0\u01b8\0\u01ef\0\u0226\0\u025d\0\u0294\0\u02cb\0\u0302\0\u0339"+
    "\0\u0370\0\u03a7\0\u03de\0\u0415\0\u044c\0\u0483\0\u04ba\0\u04f1"+
    "\0\u0528\0\u055f\0\u0596\0\u05cd\0\u0604\0\u063b\0\67\0\u0672"+
    "\0\u06a9\0\u06e0\0\u0717\0\u074e\0\u0785\0\u07bc\0\u07f3\0\u082a"+
    "\0\u0861\0\u0898\0\u08cf\0\u0906\0\u093d\0\u0974\0\u09ab\0\u09e2"+
    "\0\u0a19\0\u0a50\0\u0a87\0\u0abe\0\u0af5\0\u0b2c\0\u0b63\0\u0b9a"+
    "\0\u0bd1\0\u0c08\0\u0c3f\0\u0c76\0\u0cad\0\u0ce4\0\u0d1b\0\u0d52"+
    "\0\u0d89\0\u0dc0\0\u0df7\0\u0e2e\0\u0e65\0\u0e9c\0\u0ed3\0\u0f0a"+
    "\0\u0f41\0\u0f78\0\u0faf\0\u0fe6\0\u101d\0\u1054\0\u108b\0\u10c2"+
    "\0\u10f9\0\u1130\0\u1167\0\u119e\0\u11d5\0\u120c\0\u1243\0\u063b"+
    "\0\u127a\0\u06a9\0\u12b1\0\u12e8\0\u131f\0\u1356\0\u138d\0\u13c4"+
    "\0\u13fb\0\u1432\0\u1469\0\u14a0\0\u14d7\0\u150e\0\u1545\0\u157c"+
    "\0\u15b3\0\u15ea\0\u1621\0\u1658\0\u168f\0\u16c6\0\u16fd\0\u1734"+
    "\0\u176b\0\u17a2\0\u17d9\0\u1810\0\u1847\0\u187e\0\u18b5\0\u18ec"+
    "\0\u1923\0\u195a\0\u1991\0\u19c8\0\u19ff\0\u1a36\0\u1a6d\0\u1aa4"+
    "\0\u1adb\0\u1b12\0\u1b49\0\u1b80\0\u1bb7\0\u1bee\0\u1c25\0\u1c5c"+
    "\0\u1c93\0\u1cca\0\u1d01\0\u1d38\0\u1d6f\0\u1da6\0\u1ddd\0\u1e14"+
    "\0\u1e4b\0\u1e82\0\u1eb9\0\u1ef0\0\u1f27\0\u1f5e\0\u1f95\0\u1fcc"+
    "\0\u2003\0\u203a\0\u2071\0\u20a8\0\u20df\0\u2116\0\u214d\0\u2184"+
    "\0\u21bb\0\u21f2\0\u2229\0\u2260\0\u2297\0\u22ce\0\u2305\0\u233c"+
    "\0\u2373\0\u23aa\0\u23e1\0\u2418\0\u244f\0\u2486\0\u24bd\0\u24f4"+
    "\0\u252b\0\u2562\0\u2599\0\u25d0\0\u2607\0\u263e\0\u2675\0\u26ac"+
    "\0\u26e3\0\u271a\0\u2751\0\u2788\0\u27bf\0\u27f6\0\u282d\0\u2864"+
    "\0\u1cca\0\u289b\0\u28d2\0\u2909\0\u2940\0\u2977\0\u29ae\0\u29e5"+
    "\0\u2a1c\0\u2a53\0\u2a8a\0\u2ac1\0\u2af8\0\u2b2f\0\u2b66\0\u2b9d"+
    "\0\u2bd4\0\u2c0b\0\u2c42\0\u2c79\0\u2cb0\0\u2ce7\0\u2d1e\0\u2d55"+
    "\0\u2d8c\0\u2dc3\0\u2dfa\0\u2e31\0\u2e68\0\u2e9f\0\u2ed6\0\u2f0d"+
    "\0\u2f44\0\u2f7b\0\u2fb2\0\u2fe9\0\u3020\0\u3057\0\u308e\0\u30c5"+
    "\0\u30fc\0\u3133\0\u316a\0\u31a1\0\u31d8\0\u320f\0\u3246\0\u327d"+
    "\0\u32b4\0\u32eb\0\u3322\0\u3359\0\u3390\0\u33c7\0\u33fe\0\u3435"+
    "\0\u346c\0\u34a3\0\u34da\0\u3511\0\u3548\0\u357f\0\u35b6\0\u35ed"+
    "\0\u3624\0\u365b\0\u3692\0\u36c9\0\u3700\0\u3737\0\u376e\0\u37a5"+
    "\0\u37dc\0\u3813\0\u384a\0\u3881\0\u38b8\0\u38ef\0\u3926\0\u395d"+
    "\0\u3994\0\u39cb\0\u3a02\0\u3a39\0\u3a70\0\u3aa7\0\u3ade\0\u3b15"+
    "\0\u3b4c\0\u3b83\0\u3bba\0\u3bf1\0\u3c28\0\u3c5f\0\u3c96\0\u3ccd"+
    "\0\u3d04\0\u3d3b\0\u3d72\0\u3da9\0\u3de0\0\u3e17\0\u3e4e\0\u3e85"+
    "\0\u3ebc\0\u3ef3\0\u3f2a\0\u3f61\0\u3f98\0\u3fcf\0\u4006\0\u403d"+
    "\0\u4074\0\u40ab\0\u40e2\0\u4119\0\u4150\0\u4187\0\u41be\0\u41f5"+
    "\0\u422c\0\u4263\0\u429a\0\u42d1\0\u4308\0\u433f\0\u4376\0\u43ad"+
    "\0\u43e4\0\u441b\0\u4452\0\u4489\0\u44c0\0\u44f7\0\u452e\0\u4565"+
    "\0\u459c\0\u45d3\0\u460a\0\u4641\0\u4678\0\u46af\0\u46e6\0\u471d"+
    "\0\u4754\0\u478b\0\u47c2";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[339];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\2\11\1\14\1\11\1\15\1\11\1\16"+
    "\1\11\1\17\1\20\1\21\1\22\1\11\1\23\1\11"+
    "\1\24\1\25\1\26\1\2\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\2\1\40\1\37"+
    "\1\11\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\44\3\37\1\50\1\51\70\0\1\11\1\52\30\11"+
    "\2\0\1\37\3\0\1\11\7\0\1\11\16\0\21\11"+
    "\1\53\10\11\1\54\5\0\1\11\7\0\1\11\16\0"+
    "\1\55\12\11\1\56\2\11\1\57\13\11\6\0\1\11"+
    "\7\0\1\11\16\0\4\11\1\60\25\11\1\61\5\0"+
    "\1\11\7\0\1\11\16\0\13\11\1\62\1\11\1\63"+
    "\11\11\1\64\2\11\6\0\1\11\7\0\1\11\16\0"+
    "\24\11\1\65\5\11\1\66\5\0\1\11\7\0\1\11"+
    "\16\0\32\11\6\0\1\11\7\0\1\11\16\0\4\11"+
    "\1\67\25\11\6\0\1\11\7\0\1\11\16\0\14\11"+
    "\1\70\1\71\4\11\1\72\7\11\2\0\1\73\3\0"+
    "\1\11\7\0\1\11\16\0\10\11\1\74\21\11\1\75"+
    "\5\0\1\11\7\0\1\11\16\0\1\76\31\11\6\0"+
    "\1\11\7\0\1\11\16\0\21\11\1\77\2\11\1\100"+
    "\5\11\6\0\1\11\7\0\1\11\16\0\4\11\1\101"+
    "\25\11\6\0\1\11\7\0\1\11\16\0\23\11\1\102"+
    "\2\11\1\103\3\11\6\0\1\11\7\0\1\11\16\0"+
    "\21\11\1\104\10\11\6\0\1\11\7\0\1\11\16\0"+
    "\15\11\1\72\14\11\2\0\1\61\3\0\1\11\7\0"+
    "\1\11\16\0\7\11\1\105\22\11\6\0\1\11\7\0"+
    "\1\11\16\0\32\11\1\106\5\0\1\11\7\0\1\11"+
    "\16\0\31\11\1\107\6\0\1\11\7\0\1\11\23\0"+
    "\1\37\6\0\1\110\1\111\4\0\1\73\11\0\1\73"+
    "\55\0\1\112\2\0\1\113\76\0\1\114\1\37\20\0"+
    "\1\115\44\0\2\37\107\0\1\37\6\0\4\116\1\117"+
    "\25\116\6\0\1\33\1\0\1\120\5\0\1\116\14\0"+
    "\1\121\2\0\1\122\1\0\1\123\3\0\1\124\6\0"+
    "\1\125\21\0\1\126\1\37\1\127\15\0\1\37\46\0"+
    "\1\120\25\0\44\130\1\37\1\0\1\131\20\130\45\0"+
    "\1\37\21\0\45\132\1\0\1\133\3\132\1\37\14\132"+
    "\53\0\1\37\67\0\1\37\73\0\1\32\7\0\1\122"+
    "\1\0\1\123\3\0\1\124\6\0\1\125\21\0\1\126"+
    "\1\0\1\127\12\0\1\37\2\0\1\37\64\0\1\50"+
    "\1\134\1\37\65\0\2\37\5\0\45\50\1\0\1\50"+
    "\3\0\15\50\1\0\1\135\5\11\1\136\1\137\7\11"+
    "\1\140\1\11\1\141\7\11\1\142\16\0\1\11\16\0"+
    "\32\11\2\0\1\143\3\0\1\11\7\0\1\11\16\0"+
    "\4\11\1\144\25\11\6\0\1\11\7\0\1\11\33\0"+
    "\1\145\51\0\32\11\2\0\1\61\3\0\1\11\7\0"+
    "\1\11\16\0\1\146\31\11\6\0\1\11\7\0\1\11"+
    "\16\0\15\11\1\147\14\11\6\0\1\11\7\0\1\11"+
    "\16\0\2\11\1\150\27\11\6\0\1\11\7\0\1\11"+
    "\22\0\1\37\62\0\22\11\1\151\7\11\2\0\1\152"+
    "\3\0\1\11\7\0\1\11\16\0\3\11\1\153\26\11"+
    "\6\0\1\11\7\0\1\11\16\0\23\11\1\154\6\11"+
    "\1\155\5\0\1\11\7\0\1\11\16\0\15\11\1\156"+
    "\14\11\6\0\1\11\7\0\1\11\33\0\1\157\51\0"+
    "\27\11\1\160\2\11\6\0\1\11\7\0\1\11\16\0"+
    "\17\11\1\161\12\11\6\0\1\11\7\0\1\11\16\0"+
    "\32\11\2\0\1\162\3\0\1\11\7\0\1\11\16\0"+
    "\32\11\2\0\1\163\3\0\1\11\7\0\1\11\40\0"+
    "\1\163\11\0\1\163\32\0\32\11\2\0\1\155\3\0"+
    "\1\11\7\0\1\11\40\0\1\155\11\0\1\155\32\0"+
    "\14\11\1\164\15\11\6\0\1\11\7\0\1\11\16\0"+
    "\32\11\1\165\5\0\1\11\7\0\1\11\16\0\1\11"+
    "\1\166\30\11\6\0\1\11\7\0\1\11\16\0\20\11"+
    "\1\167\11\11\6\0\1\11\7\0\1\11\16\0\1\170"+
    "\31\11\6\0\1\11\7\0\1\11\16\0\32\11\1\171"+
    "\5\0\1\11\7\0\1\11\16\0\1\172\31\11\6\0"+
    "\1\11\7\0\1\11\16\0\32\11\1\173\5\0\1\11"+
    "\7\0\1\11\22\0\1\174\62\0\2\11\1\175\1\176"+
    "\1\11\1\177\1\11\1\200\3\11\1\201\1\11\1\202"+
    "\5\11\1\203\6\11\6\0\1\11\7\0\1\11\35\0"+
    "\1\204\51\0\1\205\17\0\1\162\1\206\10\0\1\162"+
    "\32\0\1\207\76\0\1\171\21\0\1\171\53\0\1\210"+
    "\106\0\1\37\27\0\32\116\6\0\1\116\7\0\1\116"+
    "\16\0\32\116\6\0\1\211\1\212\6\0\1\116\4\0"+
    "\1\212\15\0\1\213\33\0\1\120\26\0\32\116\16\0"+
    "\1\116\26\0\1\54\21\0\1\54\40\0\1\214\66\0"+
    "\1\215\64\0\1\216\70\0\1\213\33\0\1\126\1\0"+
    "\1\217\64\0\1\217\25\0\45\130\1\0\1\130\3\0"+
    "\15\130\45\132\1\0\1\132\3\0\15\132\60\134\1\220"+
    "\6\134\1\0\21\11\1\221\10\11\6\0\1\11\7\0"+
    "\1\11\16\0\13\11\1\222\16\11\6\0\1\11\7\0"+
    "\1\11\16\0\23\11\1\223\6\11\6\0\1\11\7\0"+
    "\1\11\16\0\7\11\1\224\22\11\6\0\1\11\7\0"+
    "\1\11\16\0\4\11\1\225\25\11\6\0\1\11\7\0"+
    "\1\11\16\0\2\11\1\226\2\11\1\227\11\11\1\230"+
    "\1\11\1\231\1\232\7\11\2\0\1\233\3\0\1\11"+
    "\7\0\1\11\41\0\1\234\43\0\1\235\31\11\6\0"+
    "\1\11\7\0\1\11\16\0\1\236\66\0\22\11\1\237"+
    "\7\11\2\0\1\240\3\0\1\11\7\0\1\11\16\0"+
    "\23\11\1\241\6\11\2\0\1\155\3\0\1\11\7\0"+
    "\1\11\16\0\32\11\1\242\5\0\1\11\7\0\1\11"+
    "\16\0\4\11\1\243\25\11\6\0\1\11\7\0\1\11"+
    "\22\0\1\244\62\0\22\11\1\245\3\11\1\23\3\11"+
    "\1\246\1\0\1\247\3\0\1\11\7\0\1\11\16\0"+
    "\4\11\1\250\25\11\6\0\1\11\7\0\1\11\41\0"+
    "\1\37\43\0\2\11\1\251\27\11\6\0\1\11\7\0"+
    "\1\11\16\0\1\252\66\0\1\253\31\11\6\0\1\11"+
    "\7\0\1\11\16\0\13\11\1\254\16\11\6\0\1\11"+
    "\7\0\1\11\41\0\1\255\47\0\1\155\62\0\4\11"+
    "\1\256\25\11\6\0\1\11\7\0\1\11\33\0\1\155"+
    "\7\0\1\257\41\0\13\11\1\260\16\11\6\0\1\11"+
    "\7\0\1\11\16\0\24\11\1\261\5\11\6\0\1\11"+
    "\7\0\1\11\16\0\23\11\1\260\6\11\6\0\1\11"+
    "\7\0\1\11\41\0\1\262\43\0\32\11\1\155\5\0"+
    "\1\11\7\0\1\11\31\0\1\61\66\0\1\263\53\0"+
    "\13\11\1\264\16\11\6\0\1\11\7\0\1\11\16\0"+
    "\32\11\1\265\5\0\1\11\7\0\1\11\16\0\24\11"+
    "\1\266\5\11\1\267\5\0\1\11\7\0\1\11\16\0"+
    "\1\270\31\11\6\0\1\11\7\0\1\11\16\0\32\11"+
    "\1\271\5\0\1\11\7\0\1\11\16\0\1\272\31\11"+
    "\6\0\1\11\7\0\1\11\16\0\21\11\1\273\10\11"+
    "\6\0\1\11\7\0\1\11\31\0\1\274\66\0\1\275"+
    "\57\0\1\276\105\0\1\277\52\0\1\300\57\0\32\116"+
    "\6\0\1\211\7\0\1\116\56\0\1\301\66\0\1\301"+
    "\1\212\13\0\1\212\13\0\1\302\113\0\1\303\62\0"+
    "\1\304\47\0\1\213\33\0\1\217\25\0\57\134\1\37"+
    "\1\220\6\134\1\0\6\11\1\237\23\11\6\0\1\11"+
    "\7\0\1\11\16\0\16\11\1\305\13\11\6\0\1\11"+
    "\7\0\1\11\16\0\23\11\1\306\6\11\6\0\1\11"+
    "\7\0\1\11\16\0\17\11\1\307\12\11\6\0\1\11"+
    "\7\0\1\11\16\0\2\11\1\310\27\11\6\0\1\11"+
    "\7\0\1\11\16\0\16\11\1\311\13\11\6\0\1\11"+
    "\7\0\1\11\16\0\10\11\1\312\21\11\1\313\5\0"+
    "\1\11\7\0\1\11\16\0\16\11\1\74\13\11\6\0"+
    "\1\11\7\0\1\11\16\0\4\11\1\314\25\11\6\0"+
    "\1\11\7\0\1\11\16\0\4\11\1\315\25\11\6\0"+
    "\1\11\7\0\1\11\22\0\1\316\103\0\1\317\45\0"+
    "\32\11\1\0\1\37\4\0\1\11\7\0\1\11\37\0"+
    "\1\320\45\0\32\11\2\0\1\37\3\0\1\11\7\0"+
    "\1\11\40\0\1\37\11\0\1\37\32\0\32\11\1\321"+
    "\5\0\1\11\7\0\1\11\32\0\1\304\52\0\32\11"+
    "\1\246\5\0\1\11\7\0\1\11\26\0\1\246\21\0"+
    "\1\246\34\0\26\11\1\103\3\11\6\0\1\11\7\0"+
    "\1\11\23\0\1\37\107\0\1\113\40\0\15\11\1\322"+
    "\14\11\6\0\1\11\7\0\1\11\16\0\23\11\1\323"+
    "\6\11\6\0\1\11\7\0\1\11\31\0\1\324\53\0"+
    "\3\11\1\325\26\11\6\0\1\11\7\0\1\11\16\0"+
    "\4\11\1\326\25\11\6\0\1\11\7\0\1\11\16\0"+
    "\1\327\3\0\1\330\62\0\32\11\2\0\1\331\3\0"+
    "\1\11\7\0\1\11\16\0\1\332\66\0\32\11\1\333"+
    "\5\0\1\11\7\0\1\11\16\0\32\11\1\334\5\0"+
    "\1\11\7\0\1\11\20\0\1\335\67\0\1\37\63\0"+
    "\1\336\31\11\6\0\1\11\7\0\1\11\37\0\1\337"+
    "\45\0\15\11\1\340\14\11\6\0\1\11\7\0\1\11"+
    "\31\0\1\341\53\0\13\11\1\342\16\11\6\0\1\11"+
    "\7\0\1\11\33\0\1\341\51\0\14\11\1\343\15\11"+
    "\6\0\1\11\7\0\1\11\16\0\1\344\31\11\6\0"+
    "\1\11\7\0\1\11\22\0\1\345\106\0\1\346\63\0"+
    "\1\347\55\0\1\333\21\0\1\333\53\0\1\37\57\0"+
    "\1\242\21\0\1\242\34\0\1\350\66\0\1\351\66\0"+
    "\1\11\1\352\30\11\6\0\1\11\7\0\1\11\16\0"+
    "\17\11\1\353\12\11\6\0\1\11\7\0\1\11\16\0"+
    "\31\11\1\354\6\0\1\11\7\0\1\11\16\0\16\11"+
    "\1\355\13\11\6\0\1\11\7\0\1\11\16\0\16\11"+
    "\1\356\13\11\6\0\1\11\7\0\1\11\16\0\13\11"+
    "\1\357\16\11\6\0\1\11\7\0\1\11\31\0\1\360"+
    "\53\0\20\11\1\361\11\11\6\0\1\11\7\0\1\11"+
    "\16\0\22\11\1\362\7\11\2\0\1\363\3\0\1\11"+
    "\7\0\1\11\37\0\1\364\1\363\11\0\1\363\32\0"+
    "\1\365\116\0\1\37\53\0\1\366\51\0\3\11\1\237"+
    "\26\11\6\0\1\11\7\0\1\11\16\0\32\11\1\367"+
    "\5\0\1\11\7\0\1\11\31\0\1\320\53\0\4\11"+
    "\1\60\25\11\6\0\1\11\7\0\1\11\16\0\14\11"+
    "\1\370\15\11\6\0\1\11\7\0\1\11\33\0\1\371"+
    "\51\0\1\372\105\0\1\373\72\0\1\61\45\0\1\37"+
    "\105\0\1\374\54\0\1\37\57\0\22\11\1\375\7\11"+
    "\2\0\1\376\3\0\1\11\7\0\1\11\47\0\1\377"+
    "\35\0\2\11\1\u0100\27\11\6\0\1\11\7\0\1\11"+
    "\22\0\1\337\62\0\23\11\1\u0101\6\11\6\0\1\11"+
    "\7\0\1\11\16\0\4\11\1\u0102\25\11\6\0\1\11"+
    "\7\0\1\11\16\0\32\11\1\u0103\5\0\1\11\7\0"+
    "\1\11\32\0\1\u0104\55\0\1\374\70\0\1\373\64\0"+
    "\1\123\76\0\1\37\53\0\1\u0105\31\11\6\0\1\11"+
    "\7\0\1\11\16\0\31\11\1\u0106\6\0\1\11\7\0"+
    "\1\11\16\0\4\11\1\u0107\25\11\6\0\1\11\7\0"+
    "\1\11\16\0\21\11\1\u0108\10\11\6\0\1\11\7\0"+
    "\1\11\16\0\12\11\1\u0109\17\11\1\0\1\u010a\4\0"+
    "\1\11\7\0\1\11\16\0\4\11\1\237\25\11\6\0"+
    "\1\11\7\0\1\11\22\0\1\240\62\0\24\11\1\u010b"+
    "\5\11\6\0\1\11\7\0\1\11\16\0\22\11\1\323"+
    "\7\11\2\0\1\u010c\3\0\1\11\7\0\1\11\40\0"+
    "\1\u010c\11\0\1\u010c\57\0\1\u010d\43\0\1\155\110\0"+
    "\1\61\60\0\1\u010e\50\0\4\11\1\u010f\25\11\6\0"+
    "\1\11\7\0\1\11\20\0\1\u0110\67\0\1\u0111\63\0"+
    "\1\u0112\72\0\1\u0113\62\0\32\11\2\0\1\337\3\0"+
    "\1\11\7\0\1\11\40\0\1\337\11\0\1\337\63\0"+
    "\1\37\35\0\23\11\1\u0114\6\11\6\0\1\11\7\0"+
    "\1\11\16\0\31\11\1\u0115\6\0\1\11\7\0\1\11"+
    "\16\0\32\11\2\0\1\u0116\3\0\1\11\7\0\1\11"+
    "\41\0\1\337\47\0\1\u0117\62\0\13\11\1\237\16\11"+
    "\6\0\1\11\7\0\1\11\16\0\21\11\1\u0118\10\11"+
    "\6\0\1\11\7\0\1\11\16\0\21\11\1\u0119\10\11"+
    "\6\0\1\11\7\0\1\11\16\0\3\11\1\u011a\26\11"+
    "\6\0\1\11\7\0\1\11\16\0\32\11\1\61\5\0"+
    "\1\11\7\0\1\11\26\0\1\61\21\0\1\61\34\0"+
    "\4\11\1\74\25\11\6\0\1\11\7\0\1\11\26\0"+
    "\1\367\21\0\1\367\40\0\1\u011b\77\0\1\37\51\0"+
    "\15\11\1\u011c\14\11\6\0\1\11\7\0\1\11\22\0"+
    "\1\u0111\100\0\1\246\52\0\1\61\115\0\1\u011d\35\0"+
    "\32\11\1\u011e\5\0\1\11\7\0\1\11\16\0\2\11"+
    "\1\u011f\27\11\6\0\1\11\7\0\1\11\35\0\1\u0120"+
    "\64\0\1\u0121\51\0\1\u0122\3\11\1\u0123\25\11\6\0"+
    "\1\11\7\0\1\11\16\0\21\11\1\u0124\10\11\6\0"+
    "\1\11\7\0\1\11\16\0\22\11\1\u0125\7\11\2\0"+
    "\1\u0126\3\0\1\11\7\0\1\11\37\0\1\37\45\0"+
    "\23\11\1\237\6\11\6\0\1\11\7\0\1\11\34\0"+
    "\1\u0127\66\0\1\u0128\50\0\16\11\1\u0129\13\11\6\0"+
    "\1\11\7\0\1\11\16\0\1\u012a\111\0\1\240\43\0"+
    "\26\11\1\u012b\3\11\6\0\1\11\7\0\1\11\16\0"+
    "\22\11\1\u012c\7\11\2\0\1\u012d\3\0\1\11\7\0"+
    "\1\11\16\0\16\11\1\u012e\13\11\6\0\1\11\7\0"+
    "\1\11\16\0\4\11\1\u012f\25\11\6\0\1\11\7\0"+
    "\1\11\22\0\1\u0130\77\0\1\u0112\66\0\1\337\51\0"+
    "\14\11\1\u0131\15\11\6\0\1\11\7\0\1\11\20\0"+
    "\1\341\64\0\31\11\1\u0132\6\0\1\11\7\0\1\11"+
    "\16\0\17\11\1\u0133\12\11\6\0\1\11\7\0\1\11"+
    "\35\0\1\u0134\47\0\21\11\1\u0135\10\11\6\0\1\11"+
    "\7\0\1\11\16\0\23\11\1\u0136\6\11\6\0\1\11"+
    "\7\0\1\11\41\0\1\u0137\43\0\17\11\1\u0138\12\11"+
    "\6\0\1\11\7\0\1\11\16\0\17\11\1\u0139\12\11"+
    "\6\0\1\11\7\0\1\11\16\0\16\11\1\u013a\13\11"+
    "\6\0\1\11\7\0\1\11\34\0\1\u013b\50\0\14\11"+
    "\1\u013c\15\11\6\0\1\11\7\0\1\11\16\0\32\11"+
    "\6\0\1\11\7\0\1\11\11\0\1\u013d\66\0\1\u013d"+
    "\4\0\32\11\1\u013e\5\0\1\11\7\0\1\11\16\0"+
    "\16\11\1\u013f\13\11\6\0\1\11\7\0\1\11\16\0"+
    "\15\11\1\u0140\14\11\6\0\1\11\7\0\1\11\33\0"+
    "\1\u0141\51\0\32\11\2\0\1\u0142\3\0\1\11\7\0"+
    "\1\11\61\0\1\u0143\5\0\1\u0144\30\0\1\u010d\53\0"+
    "\32\11\2\0\1\u0145\3\0\1\11\7\0\1\11\16\0"+
    "\32\11\2\0\1\u0146\3\0\1\11\7\0\1\11\40\0"+
    "\1\u0146\11\0\1\u0146\40\0\1\37\57\0\44\u0143\1\u0147"+
    "\1\0\1\u0148\20\u0143\45\u0144\1\0\1\u0149\3\u0144\1\u0147"+
    "\14\u0144\24\0\1\u014a\47\0\1\u014b\145\0\1\37\2\0"+
    "\45\u0143\1\0\1\u0143\3\0\15\u0143\45\u0144\1\0\1\u0144"+
    "\3\0\15\u0144\32\0\1\u014c\66\0\1\u014d\40\0\1\u014e"+
    "\72\0\1\u014f\57\0\1\u0150\72\0\1\u0151\105\0\1\u0152"+
    "\43\0\1\u0153\66\0\1\37\71\0\1\u010d\62\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[18425];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\34\1\1\11\14\1\1\0\4\1\1\0"+
    "\4\1\1\0\4\1\1\0\1\1\1\0\10\1\1\0"+
    "\1\1\5\0\4\1\14\0\6\1\1\0\1\1\1\0"+
    "\4\1\1\0\2\1\1\0\1\1\1\0\2\1\2\0"+
    "\1\1\1\0\3\1\1\0\1\1\2\0\7\1\5\0"+
    "\1\1\7\0\12\1\2\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\3\1\2\0\2\1\1\0\2\1\1\0"+
    "\1\1\1\0\2\1\2\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\2\1\5\0\1\1\3\0\6\1\1\0"+
    "\2\1\4\0\5\1\7\0\1\1\1\0\1\1\1\0"+
    "\3\1\5\0\6\1\1\0\2\1\5\0\1\1\4\0"+
    "\1\1\2\0\3\1\2\0\5\1\1\0\1\1\3\0"+
    "\1\1\3\0\3\1\2\0\3\1\1\0\1\1\2\0"+
    "\1\1\2\0\4\1\3\0\1\1\1\0\2\1\1\0"+
    "\2\1\1\0\3\1\1\0\2\1\1\0\3\1\1\0"+
    "\1\1\2\0\2\1\23\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[339];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
public Boolean bandera = true;
public File archivoSalida;
public File archivoError;
private RandomAccessFile raf;
private RandomAccessFile rafi; 
public void Abrir() throws FileNotFoundException{
    raf = new RandomAccessFile(archivoSalida,"rw");
}
public void AbrirError() throws FileNotFoundException{
    rafi = new RandomAccessFile(archivoError,"rw");
}
public void Cerrar() throws IOException{
    raf.close();
}
public void CerrarError() throws IOException{
    rafi.close();
}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 274) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Yytoken nextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { bandera = false;
    try{rafi.writeBytes("Se encontro un error en la linea: "+ Integer.toString(yyline) + " Expresion: " + yytext() + " \n");} catch(IOException ex){}
            }
          case 4: break;
          case 2: 
            { try{raf.writeBytes(yytext());} catch(IOException ex){}
            }
          case 5: break;
          case 3: 
            { bandera = false;
    try{rafi.writeBytes("se encontro un error en la linea: "+ Integer.toString(yyline) + " Expresion: " + yytext() + " \n");}catch(IOException ex){}
            }
          case 6: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
