
function setCookie(cname, cvalue, exdays) {
    var d = new Date();
    d.setTime(d.getTime() + (exdays * 1000));
    var expires = "expires=" + d.toGMTString();
    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
}
function getCookie(cname) {
    var name = cname + "=";
    var decodedCookie = decodeURIComponent(document.cookie);
    var ca = decodedCookie.split(';');
    for (var i = 0; i < ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) == ' ') {
            c = c.substring(1);
        }
        if (c.indexOf(name) == 0) {
            return c.substring(name.length, c.length);
        }
    }
    return "";
}

function findMax(arr) {
    var max = arr[1];
    var len = arr.length;
    for (var i = 2; i < len; i++) {
        if (parseInt(max) < parseInt(arr[i])) {
            max = arr[i];
        }
    }
    return max;
}
function nextTab() {
    var currentSlide = $(".slide.current");
    var currentSlideId = $(currentSlide).attr("id");
    var currentNav = $(".nav-item")[currentSlideId];
    var previousSlide = currentSlide.prev();
    var previousSlideId = $(previousSlide).attr("id");
    var previousSlideBg = $(previousSlide).css("background-color");
    var previousNav = $(".nav-item")[previousSlideId];
    var nextSlide = $(".current").next();
    var nextSlideId = $(nextSlide).attr("id");
    var nextSlideBg = $(nextSlide).css("background-color");
    var nextNav = $(".nav-item")[nextSlideId];
    if ($(nextSlide).hasClass("slide")) {
        $(currentSlide).removeClass("current unshrink").addClass("shrink");
        $(nextSlide).addClass("current unshrink").removeClass("shrink");
        $(nextNav).css("background-color", nextSlideBg);
        $(currentNav).css("background-color", "white");
    }
}
window.onload = function () {
    var tab = window.location.search.substring(1, 2);
    for (var i = 0; i < parseInt(tab) ; i++) nextTab();
    var scores = getCookie("score");
    var score = scores.split('|');
    var max;
    if (score != "") {
        max = findMax(score);
    }
    else {
        max = 0;
        document.getElementById("scoreMessage").innerHTML = "You haven't played this game yet!";
    }
    for (var i = 10; i >= 0; i--) {
        $('#numbers').append("<li><span>"+Math.round(parseInt(max)/10*i)+"</span></li>");
    }
    for (var i = 1; i < score.length; i++) {
        $('#bars').append("<li><div data-percentage='" + Math.round(parseInt(score[i]) / parseInt(max) * 10000)/100 + "' class='bar'></div></li>");
        //alert(a[i]);
    }
    $(function () {
        if (score.length < 7) {
            $("#bars li .bar").css('width', "50px");
            $('#chart #bars li .bar').css('margin-left', '20px');
        }
        else {
            $("#bars li .bar").css('width', "" + (Math.round(400 / score.length) + 1) + "px");
        }
        $("#bars li .bar").each(function(key, bar) {
            var percentage = $(this).data('percentage');

            $(this).animate({
                'height': percentage + '%'
            }, 1000);
        });
    });
}
document.getElementById("deleteData").onclick = function () {
    var cf = confirm("Are you sure to delete all of your scores?");
    if (cf == true) {
        setCookie("score", "", 0);
        location.reload();
    }
}



$(document).ready(function() {
    $(".nav-item, .fa-arrow-right, .fa-arrow-left").mouseover(function() {
        $(this).addClass("increase-size");
        $(this).removeClass("decrease-size");
    });

    $(".nav-item, .fa-arrow-right, .fa-arrow-left").mouseout(function() {
        $(this).removeClass("increase-size");
        $(this).addClass("decrease-size");
    });

    $(".nav-item").click(function() {
        var currentNav = $(this),
            navLinkId = $(this).attr("id"),
            slides = $(".slide"),
            currentSlide = $(slides)[navLinkId],
            slideBg = $(currentSlide).css("background-color");

        $(currentSlide).removeClass("shrink").addClass("current unshrink");
        $(".slide").not(currentSlide).addClass("shrink").removeClass("current unshrink");
        $(currentNav).css("background-color", slideBg);
        $(".nav-item").not(currentNav).css("background-color", "white");
    });
    $("#btnNext").click(function () {
        nextTab();
    });
    $("#btnPrev").click(function () {
        var currentSlide = $(".slide.current");
        var currentSlideId = $(currentSlide).attr("id");
        var currentNav = $(".nav-item")[currentSlideId];
        var previousSlide = currentSlide.prev();
        var previousSlideId = $(previousSlide).attr("id");
        var previousSlideBg = $(previousSlide).css("background-color");
        var previousNav = $(".nav-item")[previousSlideId];
        var nextSlide = $(".current").next();
        var nextSlideId = $(nextSlide).attr("id");
        var nextSlideBg = $(nextSlide).css("background-color");
        var nextNav = $(".nav-item")[nextSlideId];
        if ($(previousSlide).hasClass("slide")) {
            $(currentSlide).removeClass("current unshrink").addClass("shrink");
            $(previousSlide).addClass("current unshrink").removeClass("shrink");
            $(previousNav).css("background-color", previousSlideBg);
            $(currentNav).css("background-color", "white");
        }
    });
    $(this).on("keydown", function(e) {
        var code = e.keyCode || e.which;
        var currentSlide = $(".slide.current");
        var currentSlideId = $(currentSlide).attr("id");
        var currentNav = $(".nav-item")[currentSlideId];
        var previousSlide = currentSlide.prev();
        var previousSlideId = $(previousSlide).attr("id");
        var previousSlideBg = $(previousSlide).css("background-color");
        var previousNav = $(".nav-item")[previousSlideId];
        var nextSlide = $(".current").next();
        var nextSlideId = $(nextSlide).attr("id");
        var nextSlideBg = $(nextSlide).css("background-color");
        var nextNav = $(".nav-item")[nextSlideId];

        if (code == 37) {
            if ($(previousSlide).hasClass("slide")) {
                $(currentSlide).removeClass("current unshrink").addClass("shrink");
                $(previousSlide).addClass("current unshrink").removeClass("shrink");
                $(previousNav).css("background-color", previousSlideBg);
                $(currentNav).css("background-color", "white");
            }
        }

        if (code == 39) {
            if ($(nextSlide).hasClass("slide")) {
                $(currentSlide).removeClass("current unshrink").addClass("shrink");
                $(nextSlide).addClass("current unshrink").removeClass("shrink");
                $(nextNav).css("background-color", nextSlideBg);
                $(currentNav).css("background-color", "white");
            }
        }
    });
});

/*typing*/
var lock = true;
var temp = document.querySelector('.time');
var button = document.querySelector("button");
var words = document.querySelector(".words");
var timerDiv = document.querySelector(".time");
var scoreDiv = document.querySelector(".score");
var points = 0;
var spans;
var typed;
var seconds = 60;
var spark = new Audio("audio/boom.mp3");
spark.volume = 0.1;
var shot = new Audio("audio/shot.wav");
shot.volume = 0.1;
function soundPlay(sound) {
    sound.pause();
    sound.currentTime = 0;
    sound.play();
}
function countdown() {
    points = 0;
    var timer = setInterval(function () {
        button.disabled = true;
        seconds--;
        temp.innerHTML = seconds;
        if (seconds === 0) {
            alert("You have typed " + points+" words.");
            scoreDiv.innerHTML = "0";
            words.innerHTML = "";
            button.disabled = false;
            clearInterval(timer);
            seconds = 60;
            timerDiv.innerHTML = "60";
            button.disabled = false;
        }
    }, 1000);
}

function random() {
    words.innerHTML = "";
    var random = Math.floor(Math.random() * (1184 - 0 + 1)) + 0;
    var wordArray = list[random].split("");
    for (var i = 0; i < wordArray.length; i++) { //building the words with spans around the letters
        var span = document.createElement("span");
        span.classList.add("span");
        span.innerHTML = wordArray[i];
        words.appendChild(span);
    }
    spans = document.querySelectorAll(".span");
}


const list = ['AA', 'AAYOKATTA', 'ABIMASU', 'ABUNAI', 'ACCHI', 'ACHIRA', 'AGARIMASU', 'AGEMASU', 'AIDA', 'AIMASU', 'AISATSU', 'AITE', 'AJI', 'AKA', 'AKACHAN', 'AKAI', 'AKARUI', 'AKEMASU', 'AKI', 'AKIMASU', 'AMAI', 'AMARI', 'AME', 'AMIDANA', 'ANATA', 'ANNA', 'ANNAISYO', 'ANNANI', 'ANO', 'ANOHITO', 'ANOKATA', 'ANZEN', 'AO', 'AOI', 'APAATO', 'ARAIMASU', 'ARE', 'ARIMASU', 'ARU', 'ARUBAMU', 'ARUITE', 'ARUKIMASU', 'ASA', 'ASAGOHAN', 'ASATTE', 'ASE', 'ASHI', 'ASHITA', 'ASOBIMASU', 'ASOKO', 'ATAMA', 'ATAMAGAII', 'ATARASHII', 'ATATAKAI', 'ATO', 'ATODE', 'ATSUI', 'BAI', 'BAKKIN', 'BANGOHAN', 'BANGOU', 'BANGUMI', 'BANSEN', 'BASU', 'BASUTEI', 'BASYO', 'BEDDO', 'BEN', 'BENGOSHI', 'BENKYOU', 'BENRI', 'BIDEO', 'BIIRU', 'BIJUTSU', 'BIN', 'BIRU', 'BIZA', 'BOKU', 'BOKUJOU', 'BONODORI', 'BOONASU', 'BOORU', 'BOTAN', 'BOUEKI', 'BOUNENKAI', 'BOUSHI', 'BUCHOU', 'BUKKA', 'BUNGAKU', 'BUNKA', 'BUNPOU', 'BYOUIN', 'BYOUKI', 'CHANSU', 'CHANTO', 'CHICHI', 'CHIIMU', 'CHIISAI', 'CHIKA', 'CHIKAI', 'CHIKAKU', 'CHIKARA', 'CHIKYUU', 'CHITTOMO', 'CHIZU', 'CHOTTO', 'CHOUDO', 'CHOUDOII', 'CHOUSHI', 'CHUUSHI', 'CHUUSYA', 'CHYU', 'DAIDOKORO', 'DAIETTO', 'DAIGAKU', 'DAIGAKUIN', 'DAITAI', 'DAME', 'DANBOU', 'DANDAN', 'DANME', 'DANSU', 'DARE', 'DAREDEMO', 'DAREKA', 'DASEI', 'DASHIMASU', 'DEETA', 'DEETO', 'DEGUCHI', 'DEHA', 'DEKIMASU', 'DEMASU', 'DEMO', 'DENCHI', 'DENGEN', 'DENKI', 'DENKIYA', 'DENSHI', 'DENSYA', 'DENWA', 'DENWADAI', 'DEPAATO', 'DESUKARA', 'DOA', 'DOCCHI', 'DOCHIRA', 'DOCHIRAMO', 'DOKO', 'DOKODEMO', 'DOKOKA', 'DOKUSHIN', 'DONNA', 'DONO', 'DORAMA', 'DORE', 'DOROBOU', 'DOU', 'DOUBUTSU', 'DOUGU', 'DOUIU', 'DOUMO', 'DOUSHITE', 'DOUSURUNO', 'DOUYATTE', 'DOYOUBI', 'EAKON', 'EDA', 'EE', 'EETO', 'EHAGAKI', 'EHON', 'EIGA', 'EIGO', 'EIGYOU', 'EKI', 'EKIIN', 'EKIMAE', 'EN', 'ENJIN', 'ENJINIA', 'ENPITSU', 'ENRYONAKU', 'ENSATSU', 'ERABIMASU', 'ERAI', 'ESA', 'FIJRUMU', 'FOOKU', 'FUBEN', 'FUEMASU', 'FUKIMASU', 'FUKU', 'FUKURO', 'FUKUZATSU', 'FUMIMASU', 'FUNE', 'FURIMASU', 'FURONTO', 'FUROSHIKI', 'FURUI', 'FUTA', 'FUTARI', 'FUTOI', 'FUTON', 'FUTSUKA', 'FUTSUNO', 'FUTSUU', 'FUXAIRU', 'FUXAITO', 'FUYU', 'GAISYA', 'GAKKOU', 'GAKUSEI', 'GAMU', 'GARASU', 'GASORIN', 'GASU', 'GASURENJI', 'GATSU', 'GAWA', 'GENIN', 'GENKAN', 'GENKI', 'GENKIN', 'GENRYOU', 'GINKOU', 'GINKOUIN', 'GO', 'GOGO', 'GOHAN', 'GOKAZOKU', 'GOMI', 'GOMIBAKO', 'GORO', 'GORUFU', 'GOSYUJIN', 'GOU', 'GOZAIMASU', 'GOZEN', 'GUAI', 'GURAMU', 'GURUUPU', 'GYUUDON', 'HAA', 'HAHA', 'HAIRIMASU', 'HAISYA', 'HAIZARA', 'HAJIME', 'HAJIMENI', 'HAJIMETE', 'HAKIMASU', 'HAKKIRI', 'HAKO', 'HAN', 'HANA', 'HANABI', 'HANBUN', 'HANKO', 'HANTOSHI', 'HAPPYOU', 'HARAIMASU', 'HAREMASU', 'HARIMASU', 'HARU', 'HASAMI', 'HASHI', 'HATAI', 'HATSUKA', 'HATSUON', 'HAYAI', 'HAYAKU', 'HEE', 'HEIWA', 'HEN', 'HENJI', 'HERIMASU', 'HETA', 'HEYA', 'HI', 'HIDARI', 'HIDOI', 'HIGASHI', 'HIKIDASHI', 'HIKIMASU', 'HIKOUKI', 'HIKUI', 'HIMA', 'HIMO', 'HIRAGANA', 'HIROI', 'HIROIMASU', 'HIRU', 'HIRUGOHAN', 'HIRUMA', 'HITO', 'HITORIDE', 'HITSTUYOU', 'HODO', 'HOKANI', 'HOKANO', 'HOKENSYOU', 'HOMEMASU', 'HONDANA', 'HONSYA', 'HONTOU', 'HONTOUNI', 'HONYA', 'HOSHI', 'HOSHII', 'HOSHOUSYO', 'HOSOI', 'HOTERU', 'HOTONDO', 'HOUHOU', 'HOURITSU', 'HYAKU', 'ICHIBAN', 'ICHIDO', 'ICHIDOMO', 'IE', 'IGAKU', 'II', 'IIDESUNE', 'IIDESUYO', 'IIE', 'IIMASU', 'IJOU', 'IJOUDESU', 'IKA', 'IKE', 'IKEBANA', 'IKEN', 'IKENAI', 'IKIMASU', 'IKURA', 'IMA', 'IMANIMO', 'IMASU', 'IMI', 'INAI', 'INAKA', 'INU', 'IREMASU', 'IRIGUCHI', 'IRIMASU', 'IRO', 'IROIRO', 'ISHI', 'ISOGASHII', 'ISOGIMASU', 'ISSYONI', 'ISU', 'ISYA', 'ITSU', 'ITSUDEMO', 'ITSUKA', 'ITSUMO', 'IYA', 'JAMA', 'JAZU', 'JI', 'JIBUN', 'JIBUNDE', 'JIDOUSYA', 'JIKAN', 'JIKKEN', 'JIKO', 'JIMUSYO', 'JIN', 'JINJA', 'JINKOU', 'JISHIN', 'JISYO', 'JITENSYA', 'JITSUHA', 'JIYUUNI', 'JOGINGU', 'JOSEI', 'JOUBU', 'JOUHOU', 'JOUZU', 'JOUZUNI', 'JUGYOU', 'JUKU', 'JUNBI', 'JUU', 'JUUBUN', 'JUUDOU', 'JUUSU', 'JUUSYO', 'JUUYOKKA', 'KAADO', 'KAATEN', 'KABAN', 'KABE', 'KABIN', 'KABUKI', 'KACHIMASU', 'KACHOU', 'KADO', 'KAEMASU', 'KAERIMASU', 'KAERINI', 'KAGAKUSYA', 'KAGAMI', 'KAGI', 'KAGU', 'KAIDAN', 'KAIGAI', 'KAIGAN', 'KAIGI', 'KAIIN', 'KAIJOU', 'KAIMASU', 'KAIRAN', 'KAISHAIN', 'KAISYA', 'KAJI', 'KAKARI', 'KAKARIIN', 'KAKEMASU', 'KAKIMASU', 'KAKUNIN', 'KAMERA', 'KAMI', 'KAMIMASU', 'KAN', 'KANAIMASU', 'KANARAZU', 'KANARI', 'KANASHII', 'KANDUME', 'KANJI', 'KANKEI', 'KANKIRI', 'KANOJO', 'KANPAI', 'KANRININ', 'KANTAN', 'KAO', 'KARA', 'KARADA', 'KARAI', 'KARAOKE', 'KARE', 'KARIMASU', 'KARUI', 'KASA', 'KASHIMASU', 'KASYU', 'KATA', 'KATACHI', 'KATAI', 'KATAKANA', 'KAWA', 'KAWAII', 'KAYOIMASU', 'KAYOUBI', 'KAZE', 'KAZOEMASU', 'KAZOKU', 'KEDO', 'KEEKI', 'KEGA', 'KEIKAN', 'KEIKEN', 'KEISATSU', 'KEITAI', 'KEIZAI', 'KEN', 'KENDOU', 'KENKOU', 'KESA', 'KESHIGOMU', 'KESHIKI', 'KESHIMASU', 'KI', 'KIBISHII', 'KIBOU', 'KIBUNGAII', 'KICHINTO', 'KIEMASU', 'KIIRO', 'KIKAI', 'KIKEN', 'KIKIMASU', 'KIKOEMASU', 'KIMASU', 'KIMEMASU', 'KIMI', 'KIMOCHI', 'KIMONO', 'KINEN', 'KINGAKU', 'KINJO', 'KINOU', 'KINYOUBI', 'KIPPU', 'KIRAI', 'KIREI', 'KIREMASU', 'KIRIMASU', 'KIRIN', 'KIRO', 'KISETSU', 'KISOKU', 'KISSATEN', 'KITA', 'KITANAI', 'KITTO', 'KIZU', 'KO', 'KOCCHI', 'KOCHIRA', 'KODOMO', 'KOE', 'KOI', 'KOIBITO', 'KOKO', 'KOKONOKA', 'KOKUSAI', 'KOMAKAI', 'KOME', 'KOMIMASU', 'KON', 'KONBAN', 'KONDO', 'KONGETSU', 'KONNA', 'KONNANI', 'KONO', 'KONOAIDA', 'KONOGORO', 'KONOGURAI', 'KONOHEN', 'KONSYUU', 'KONYA', 'KOOHII', 'KOOSU', 'KOOTO', 'KOPPU', 'KORE', 'KOREKARA', 'KORO', 'KOSYOU', 'KOTAE', 'KOTAEMASU', 'KOTO', 'KOTOBA', 'KOTOSHI', 'KOUBAN', 'KOUCHA', 'KOUEN', 'KOUGAI', 'KOUGI', 'KOUJOU', 'KOUKOU', 'KOUSATEN', 'KOWAI', 'KUCHI', 'KUDAMONO', 'KUDASAI', 'KUMORI', 'KUN', 'KURAI', 'KURASU', 'KUREMASU', 'KURO', 'KUROI', 'KURUMA', 'KUSURI', 'KUTSU', 'KUUKI', 'KUUKOU', 'KUWASHII', 'KYANPU', 'KYOKA', 'KYOKU', 'KYONEN', 'KYOUIKU', 'KYOUKAI', 'KYOUMI', 'KYOUSHI', 'KYUNI', 'KYUUKOU', 'KYUURYOU', 'MACHI', 'MACHIGAI', 'MACHIMASU', 'MADA', 'MADE', 'MADENI', 'MADO', 'MAE', 'MAGO', 'MAIASA', 'MAIBAN', 'MAINICHI', 'MAIRIMASU', 'MAISYUU', 'MAITOSHI', 'MAITSUKI', 'MAJIME', 'MAKEMASU', 'MAN', 'MANGA', 'MANNAKA', 'MANSYON', 'MARASON', 'MARU', 'MASSUGU', 'MATA', 'MAWARI', 'MAZEMASU', 'MAZU', 'MAZUI', 'ME', 'MEETORU', 'MEGANE', 'MEISHI', 'MICHI', 'MIDORI', 'MIEMASU', 'MIGI', 'MIJIKAI', 'MIKISAA', 'MIKKA', 'MIMASU', 'MIMI', 'MINAMI', 'MINASAN', 'MINATO', 'MINNADE', 'MISE', 'MISEMASU', 'MIZU', 'MOCHIMASU', 'MOCHIRON', 'MOEMASU', 'MOKUTEKI', 'MOKUYOUBI', 'MOMIJI', 'MONDAI', 'MONO', 'MORAIMASU', 'MOSHI', 'MOTTO', 'MOU', 'MOUSUGU', 'MUDA', 'MUGI', 'MUIKA', 'MUKAEMASU', 'MUKAIMASU', 'MUKASHI', 'MUKOU', 'MURA', 'MURI', 'MURYOU', 'MUSUKO', 'MUSUKOSAN', 'MUSUME', 'MUSUMESAN', 'NAGASA', 'NAGEMASU', 'NAIFU', 'NAKA', 'NAKANAKA', 'NAKIMASU', 'NAMAE', 'NAMI', 'NAMIDA', 'NAN', 'NANBAN', 'NANDEMO', 'NANDESUKA', 'NANGAI', 'NANGATSU', 'NANI', 'NANIKA', 'NANJI', 'NANKAIMO', 'NANNICHI', 'NANOKA', 'NANPUN', 'NANSAI', 'NANYOUBI', 'NAORIMASU', 'NARAIMASU', 'NAREMASU', 'NARIMASU', 'NASAIMASU', 'NATSU', 'NAZE', 'NEDAN', 'NEKO', 'NEMASU', 'NEMUI', 'NENKUMI', 'NENREI', 'NESSHIN', 'NETSU', 'NICHI', 'NIGAI', 'NIGEMASU', 'NIGIYAKA', 'NIHONGO', 'NIJIKAI', 'NIKKI', 'NIKU', 'NIMOTSU', 'NINGYOU', 'NIOI', 'NISHI', 'NITSUITE', 'NIWA', 'NIYORUTO', 'NIYOTTE', 'NOHOU', 'NOMIMASU', 'NOMIMONO', 'NOOTO', 'NORIBA', 'NORIMASU', 'NOSEMASU', 'NUGIMASU', 'NUREMASU', 'NYUUKAN', 'NYUUSU', 'OBAACHAN', 'OBASAN', 'OBENTOU', 'OBOEMASU', 'OCHA', 'OCHAWAN', 'OCHIMASU', 'ODAIJINI', 'ODORIMASU', 'OFURO', 'OHANAMI', 'OHANASHI', 'OINORI', 'OISHII', 'OIWAI', 'OJI', 'OJIICHAN', 'OJISAN', 'OKAASAN', 'OKANE', 'OKASHI', 'OKASHII', 'OKIBA', 'OKIMASU', 'OKOSAN', 'OKU', 'OKUJOU', 'OKUNI', 'OKUREMASU', 'OKURIMASU', 'OKURIMONO', 'OKUSAN', 'OKYAKUSAN', 'OMATSURI', 'OMIAI', 'OMIMAI', 'OMIYAGE', 'OMOCHA', 'OMOI', 'OMOIMASU', 'OMOSA', 'OMOSHIROI', 'OMOTE', 'ONAJI', 'ONAKA', 'ONGAKU', 'ONGAKUKA', 'ONNANOKO', 'ONSEN', 'OOI', 'OOKII', 'OOKINA', 'OOKISA', 'OOZEI', 'OREMASU', 'ORIMASU', 'OSAKE', 'OSAKINI', 'OSARA', 'OSHIEMASU', 'OSHIIRE', 'OSHIMASU', 'OSHIRASE', 'OSOI', 'OSOKU', 'OSOUSHIKI', 'OTAKU', 'OTERA', 'OTO', 'OTOKONOKO', 'OTOTOI', 'OTOTOSHI', 'OTOUSAN', 'OTSURI', 'OWARI', 'OWARIMASU', 'OYOGIMASU', 'OYU', 'PAN', 'PANCHI', 'PASOKON', 'PATOKAA', 'PETTO', 'PIANO', 'PITTARI', 'POKETTO', 'POSUTAA', 'POSUTO', 'PUURUU', 'RAINEN', 'RAISYUU', 'RAJIO', 'RAKU', 'REBAA', 'REIBOU', 'REIZOUKO', 'REKISHI', 'RENKYUU', 'REPOOTO', 'RIYUU', 'ROMAJI', 'RONBUN', 'ROUKA', 'RUSU', 'RYOKAN', 'RYOKOU', 'RYOKOUSYA', 'RYOU', 'RYOURI', 'SAABISU', 'SABISHII', 'SADOU', 'SAGEMASU', 'SAI', 'SAIFU', 'SAIGONI', 'SAIKIN', 'SAISYONI', 'SAIZU', 'SAKANA', 'SAKIMASU', 'SAKINI', 'SAKKAA', 'SAKKI', 'SAKUBUN', 'SAKURA', 'SAMA', 'SAMUI', 'SAN', 'SANSEI', 'SARAINEN', 'SARAISYUU', 'SARU', 'SASHIMI', 'SASOIMASU', 'SATOU', 'SATSU', 'SEETAA', 'SEGATAKAI', 'SEI', 'SEIHIN', 'SEIJI', 'SEIKATSU', 'SEISEKI', 'SEITO', 'SEKAI', 'SEKAIJUU', 'SEKIYU', 'SEKKEN', 'SEMAI', 'SEN', 'SENJITSU', 'SENMON', 'SENNUKI', 'SENSEI', 'SENSOU', 'SENSU', 'SENSYUU', 'SENTAKUKI', 'SETSUBI', 'SHIAI', 'SHIAWASE', 'SHIBARAKU', 'SHIGURU', 'SHIKA', 'SHIKASHI', 'SHIKEN', 'SHIKI', 'SHIMA', 'SHIMASU', 'SHIMEMASU', 'SHINAMONO', 'SHINBUN', 'SHINGOU', 'SHINIMASU', 'SHINPAI', 'SHINSETSU', 'SHIO', 'SHIRIMASU', 'SHIRO', 'SHIROI', 'SHIRYOU', 'SHITA', 'SHITAGI', 'SHITEN', 'SHIZEN', 'SHIZUKA', 'SHUUKAN', 'SOBO', 'SOCCHI', 'SOCHIRA', 'SOFU', 'SOFUTO', 'SOKO', 'SONNA', 'SONNANI', 'SONO', 'SONOHOUGA', 'SONOUE', 'SOOSU', 'SORA', 'SORE', 'SOREDE', 'SOREKARA', 'SORENARA', 'SORENI', 'SOROBAN', 'SORYAA', 'SOSHITE', 'SOTO', 'SOU', 'SOUDESUNE', 'SOUSA', 'SUGIMASU', 'SUGOI', 'SUGU', 'SUICCHI', 'SUIDOU', 'SUIEI', 'SUIMASU', 'SUIYOUBI', 'SUKI', 'SUKII', 'SUKIMASU', 'SUKIYAKI', 'SUKOSHI', 'SUKUNAI', 'SUMI', 'SUMIMASEN', 'SUMIMASU', 'SUMOU', 'SUPUUN', 'SUTAATO', 'SUTEKI', 'SUTEMASU', 'SUTEREO', 'SUUPAA', 'SUUTSU', 'SUZUSHII', 'SYAIN', 'SYAKAI', 'SYASHIN', 'SYATSU', 'SYAWAA', 'SYOKUDOU', 'SYOKUYOKU', 'SYORUI', 'SYOUKIN', 'SYOURAI', 'SYOUSETSU', 'SYOUTO', 'SYOUYU', 'SYUKUDAI', 'SYUMI', 'SYUSYOU', 'SYUUMATSU', 'SYUUNYUU', 'TABEMASU', 'TABEMONO', 'TABUN', 'TACHIMASU', 'TADAIMA', 'TADASHII', 'TAIFUU', 'TAIHEN', 'TAIKAI', 'TAIONKEI', 'TAISETSU', 'TAISHIKAN', 'TAITEI', 'TAIYOU', 'TAKAI', 'TAKASA', 'TAKUSAN', 'TAMAGO', 'TAMANI', 'TANA', 'TANGO', 'TANJOUBI', 'TANOSHII', 'TANOSHIMI', 'TANSU', 'TAOREMASU', 'TAORU', 'TARIMASU', 'TASHIKA', 'TATEMASU', 'TATEMONO', 'TATTAIMA', 'TE', 'TEBUKURO', 'TECHOO', 'TEEBURU', 'TEGAMI', 'TEINEI', 'TEISYOKU', 'TEKITOU', 'TEN', 'TENISU', 'TENKI', 'TENKIN', 'TENPURA', 'TENRANKAI', 'TEREBI', 'TESUTO', 'TO', 'TOCHUUDE', 'TOIIMASU', 'TOKEI', 'TOKIDOKI', 'TOKKYUU', 'TOKORO', 'TOKORODE', 'TOKOYA', 'TOKUBETSU', 'TOKUNI', 'TOMEMASU', 'TOMODACHI', 'TONARI', 'TOOI', 'TOOKA', 'TOORIMASU', 'TORAKKU', 'TOREMASU', 'TORI', 'TORIMASU', 'TOSYOKAN', 'TOUROKU', 'TSUGINI', 'TSUGINO', 'TSUIN', 'TSUITACHI', 'TSUKEMASU', 'TSUKI', 'TSUKIMASU', 'TSUKINI', 'TSUKUE', 'TSUMAMI', 'TSUMETAI', 'TSURI', 'TSUYOI', 'UCHIMASU', 'UCHUU', 'UE', 'UEMASU', 'UGOKIMASU', 'UKAGAMASU', 'UKEMASU', 'UKETSUKE', 'UMA', 'UMAI', 'UMAREMASU', 'UMI', 'UN', 'UNDOUKAI', 'URA', 'UREMASU', 'URESHII', 'URIBA', 'URIMASU', 'URUSAI', 'USHIRO', 'USO', 'USUI', 'UTA', 'UTAIMASU', 'UUN', 'UWAGI', 'WAAPURO', 'WAKAI', 'WARAIMASU', 'WAREMASU', 'WARUI', 'WASYOKU', 'WATAKUSHI', 'WATASHI', 'YACHIN', 'YAJIRUSHI', 'YAKAN', 'YAKEDO', 'YAKEMASU', 'YAKIMASU', 'YAKOUBASU', 'YAKUSOKU', 'YAKYUU', 'YAMA', 'YAMEMASU', 'YAMIMASU', 'YARIMASU', 'YASAI', 'YASASHII', 'YASEMASU', 'YASUI', 'YASUMI', 'YATTO', 'YAWARAKAI', 'YOBIMASU', 'YOIMASU', 'YOKATTARA', 'YOKKA', 'YOKO', 'YOKU', 'YOMIKATA', 'YOMIMASU', 'YORIMASU', 'YORU', 'YOTEI', 'YOTEIHYOU', 'YOUJI', 'YOUKA', 'YOUSU', 'YOUSYOKU', 'YOWAI', 'YUBIWA', 'YUKI', 'YUKKURI', 'YUME', 'YUUBE', 'YUUGATA', 'YUUMEI', 'YUUMOA', 'ZEHI', 'ZENBU', 'ZENZEN', 'ZETTAINI', 'ZONJIMASU', 'ZOU', 'ZU', 'ZUBON', 'ZUIBUN', 'ZUTSU', 'ZUTTO'];

document.getElementById("btnPlay").addEventListener("click", function (e) {
    lock = false;
    countdown();
    random();
    button.disabled = true;
});
var mute = false;
document.getElementById("btnMute").addEventListener("click", function (e) {
    if (mute == false) {
        mute = true;
        spark.muted = true;
        shot.muted = true;
        this.innerHTML = "UNMUTE";
    }
    else {
        mute = false;
        spark.muted = false;
        shot.muted = false;
        this.innerHTML = "MUTE";
    }
});

function typing(e) {
    if (e.which >= 65 && e.which <= 90 && lock==false) {
        typed = String.fromCharCode(e.which);
        for (var i = 0; i < spans.length; i++) {
            if (spans[i].innerHTML === typed) { // if typed letter is the one from the word
                if (spans[i].classList.contains("bg")) { // if it already has class with the bacground color then check the next one
                    continue;
                } else if (spans[i].classList.contains("bg") === false && spans[i - 1] === undefined || spans[i - 1].classList.contains("bg") !== false) { // if it dont have class, if it is not first letter or if the letter before it dont have class (this is done to avoid marking the letters who are not in order for being checked, for example if you have two "A"s so to avoid marking both of them if the first one is at the index 0 and second at index 5 for example)
                    spans[i].classList.add("bg");
                    soundPlay(shot);
                    break;
                }
            }
        }
        var checker = 0;
        for (var j = 0; j < spans.length; j++) { //checking if all the letters are typed
            if (spans[j].className === "span bg") {
                checker++;
            }
            if (checker === spans.length) { // if so, animate the words with animate.css class
                soundPlay(spark);
                words.classList.add("animated");
                words.classList.add("fadeOut");
                points++; // increment the points
                scoreDiv.innerHTML = points; //add points to the points div
                document.removeEventListener("keydown", typing, false);
                setTimeout(function () {
                    words.className = "words"; // restart the classes
                    random(); // give another word
                    document.addEventListener("keydown", typing, false);
                }, 400);
            }

        }
    }
}

document.addEventListener("keydown", typing, false);