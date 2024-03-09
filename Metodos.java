import java.util.ArrayList;
import java.util.HashMap;

public class Metodos {
    
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static int restar(int a, int b) {
        return a - b;
    }

    public static double dividir(int a, int b) {
        return (double) a / b;
    }
   
    // Metodo que crea un arraylist y para llamarlo desde otro fichero
    // lo llamaremos con getCampeones
    public static ArrayList<String> getCampeones() {
        // Creo un arraylist con los campeones
        ArrayList<String> champions = new ArrayList<>();
        
        //Añado los campeones a la lista
        champions.add("Ahri");
        champions.add("Ezreal");
        champions.add("Garen");
        champions.add("Jinx");
        champions.add("Lux");
        // Devuelvo los campeones, pero el encargado de devolver es getCampeones
        return champions;
    }

    public static HashMap<Integer, String> getHashMap() {

        HashMap<Integer, String> campeones = new HashMap<>();

        campeones.put(1,"aatrox");
        campeones.put(2, "ahri");
        campeones.put(3, "akali");
        campeones.put(4, "akshan");
        campeones.put(5, "alistar");
        campeones.put(6, "amumu");
        campeones.put(7, "anivia");
        campeones.put(8, "annie");
        campeones.put(9, "aphelios");
        campeones.put(10, "ashe");
        campeones.put(11, "aurelion sol");
        campeones.put(12, "azir");
        campeones.put(13, "bardo");
        campeones.put(14, "bel'veth");
        campeones.put(15, "blitzcrank");
        campeones.put(16, "brand");
        campeones.put(17, "braum");
        campeones.put(18, "briar");
        campeones.put(19, "caitlyn");
        campeones.put(20, "camille");
        campeones.put(21, "cassiopeia");
        campeones.put(22, "cho'gath");
        campeones.put(23, "corki");
        campeones.put(24, "darius");
        campeones.put(25, "diana");
        campeones.put(26, "dr.mundo");
        campeones.put(27, "draven");
        campeones.put(28, "ekko");
        campeones.put(29, "elise");
        campeones.put(30, "evelynn");
        campeones.put(31, "ezreal");
        campeones.put(32, "fiddlesticks");
        campeones.put(33, "fiora");
        campeones.put(34, "fizz");
        campeones.put(35, "galio");
        campeones.put(36, "gangplank");
        campeones.put(37,"garen");
        campeones.put(38,"gnar");
        campeones.put(39,"gragas");
        campeones.put(40,"graves");
        campeones.put(41,"gwen");
        campeones.put(42,"hecarim");
        campeones.put(43,"heimerdinger");
        campeones.put(44,"hwei");
        campeones.put(45,"illaoi");
        campeones.put(46,"irelia");
        campeones.put(47,"ivern");
        campeones.put(48,"janna");
        campeones.put(49,"jarvan IV");
        campeones.put(50,"jax");
        campeones.put(51,"jayce");
        campeones.put(52,"jhin");
        campeones.put(53,"jinx");
        campeones.put(54,"k'sante");
        campeones.put(55,"kai'sa");
        campeones.put(56,"kalista");
        campeones.put(57,"karma");
        campeones.put(58,"karthus");
        campeones.put(59,"kassadin");
        campeones.put(60,"katarina");
        campeones.put(61,"kayle");
        campeones.put(62,"kayn");
        campeones.put(63,"kennen");
        campeones.put(64,"kha'zix");
        campeones.put(65,"kindred");
        campeones.put(66,"kled");
        campeones.put(67,"kog'maw");
        campeones.put(68,"leblanc");
        campeones.put(69,"lee sin");
        campeones.put(70,"leona");
        campeones.put(71,"lillia");
        campeones.put(72,"lissandra");
        campeones.put(73,"lucian");
        campeones.put(74,"lulu");
        campeones.put(75,"lux");
        campeones.put(76,"maestro yi");
        campeones.put(77,"malphite");
        campeones.put(78,"malzahar");
        campeones.put(79,"maokai");
        campeones.put(80,"milio");
        campeones.put(81,"miss fortune");
        campeones.put(82,"mordekaiser");
        campeones.put(83,"morgana");
        campeones.put(84,"naafiri");
        campeones.put(85,"nami");
        campeones.put(86,"nasus");
        campeones.put(87,"nautilus");
        campeones.put(88,"neeko");
        campeones.put(89,"nidalee");
        campeones.put(90,"nilah");
        campeones.put(91,"nocturne");
        campeones.put(92,"nunu y willump");
        campeones.put(93,"olaf");
        campeones.put(94,"orianna");
        campeones.put(95,"ornn");
        campeones.put(96,"pantheon");
        campeones.put(97,"poppy");
        campeones.put(98,"pyke");
        campeones.put(99,"qiyanna");
        campeones.put(100,"quinn");
        campeones.put(101,"rakan");
        campeones.put(102,"rammus");
        campeones.put(103,"rek'sai");
        campeones.put(104,"rell");
        campeones.put(105,"renata glasc");
        campeones.put(106,"renekton");
        campeones.put(107,"rengar");
        campeones.put(108,"riven");
        campeones.put(109,"rumble");
        campeones.put(110,"ryze");
        campeones.put(111,"samira");
        campeones.put(112,"sejuani");
        campeones.put(113,"senna");
        campeones.put(114,"seraphine");
        campeones.put(115,"sett");
        campeones.put(116,"shaco");
        campeones.put(117,"shen");
        campeones.put(118,"shyvana");
        campeones.put(119,"singed");
        campeones.put(120,"sion");
        campeones.put(121,"sivir");
        campeones.put(122,"skarner");
        campeones.put(123,"smolder");
        campeones.put(124,"sona");
        campeones.put(125,"soraka");
        campeones.put(126,"swain");
        campeones.put(127,"sylas");
        campeones.put(128,"syndra");
        campeones.put(129,"tahm kench");
        campeones.put(130,"taliyah");
        campeones.put(131,"talon");
        campeones.put(132,"taric");
        campeones.put(133,"teemo");
        campeones.put(134,"thresh");
        campeones.put(135,"tristana");
        campeones.put(136,"trundle");
        campeones.put(137,"tryndamere");
        campeones.put(138,"twisted fate");
        campeones.put(139,"twitch");
        campeones.put(140,"udyr");
        campeones.put(141,"urgot");
        campeones.put(142,"varus");
        campeones.put(143,"vayne");
        campeones.put(144,"veigar");
        campeones.put(145,"vel'koz");
        campeones.put(146,"vex");
        campeones.put(147,"vi");
        campeones.put(148,"viego");
        campeones.put(149,"viktor");
        campeones.put(150,"vladimir");
        campeones.put(151,"volibear");
        campeones.put(152,"warwick");
        campeones.put(153,"wukong");
        campeones.put(154,"xayah");
        campeones.put(155,"xerath");
        campeones.put(156,"xin zhao");
        campeones.put(157,"yasuo");
        campeones.put(158,"yone");
        campeones.put(159,"yorick");
        campeones.put(160,"yuumi");
        campeones.put(161,"zac");
        campeones.put(162,"zed");
        campeones.put(163,"zeri");
        campeones.put(164,"ziggs");
        campeones.put(165,"zilean");
        campeones.put(166,"zoe");
        campeones.put(167,"zyra");

        return campeones;

    }
}