$(window).load(function() {
    // Animate loader off slevelcreen
    $(".se-pre-con").fadeOut("slow");
});


// Java script code

var playing = new Audio("audio/playing.mp3");
playing.volume = 0.2;
var startSound = new Audio("audio/start.mp3");
startSound.volume = 0.2;
var spark = new Audio("audio/shot.wav");
spark.volume = 0.1;
var wrong = new Audio("audio/typeFalse.mp3");
wrong.volume = 0.2;
var audioInjure = new Audio("audio/mhit.mp3");
audioInjure.volume = 0.2;
var win = new Audio("audio/win.mp3");
win.volume = 0.2;
var soundBomb = new Audio("audio/boom.mp3");
soundBomb.volume = 0.1;
var btg = document.getElementById("battleground");
var start = document.getElementById("start");
var Pause = document.getElementById("Pause");
var startBg = document.getElementById("startBg");
var cGame = document.getElementById("consoleGame");
var scoresBox = document.getElementById("scores");
var gameOver = document.getElementById("gameOver");
var overImg = document.getElementById("overImg");
var fPath = document.getElementById("data_middle");
var overTit = document.getElementById("overTit");
var maxScores = document.getElementById("maxScores");
var restart = document.getElementById("restart");
var nowHp = document.getElementById("nowHp");
var bgRed = document.getElementById("bgRed");
var bossView = document.getElementById("boss");
var bossHp = document.getElementById("bossNowHp");
var ispause = false; //Suspension judgment
var flightpath = 0; //Flight distance
var scores = 0; //fraction
var bulletspeed = 10; //Bullet speed
//var probability = 40; //Drop Probability Total Drop Rate = Drop Type/probability
var bulletlevel = 0; //Bullet rating
var planelevel = 0; //Aircraft rating
var bulletrows = 1; //Bullet row number
var isdie = false; //Whether the aircraft died
var userhp = 100; //User blood
var times;
var myplane;
var username;
var typeright = 0;
var typewrong = 0;
var masterbullet = false;
//var percentDefeat=0;
var countTime=0;
var increasetime=0;
var myvartwo;
function mytimertwo(){
    increasetime++;
    if(increasetime%30==0){
        setcookie("t",""+increasetime,35);
    }
}
function btnProgress(){
	window.location.href="highScore.php";
}
function checkMute(myCheckBox){
	if(myCheckBox.checked==true){
	 	playing.muted=true;
        startSound.muted=true;
        spark.muted=true;
        wrong.muted=true;
        audioInjure.muted=true;
        win.muted=true;
        soundBomb.muted=true;
    }else{
    	playing.muted=false;
        startSound.muted=false;
        spark.muted=false;
        wrong.muted=false;
        audioInjure.muted=false;
        win.muted=false;
        soundBomb.muted=false;
    }
}
/*
document.getElementById('clickHere').onclick = function() {
	setcookie('shared', 'true', 1440);
	alert('You have one day to use five templates.');
	location.reload();
}
*/
document.getElementById('shareFacebook').onclick = function() {
    FB.ui({
            method: 'share',
            href: 'https://typingwar.space/jp',
        },
        // callback
        function(response) {
            if (response && !response.error_message) {
                setcookie('shared', 'true', 525600);
                location.reload();

            } else {
                alert('Error while sharing.');
            }
        }
    );
}

function handleClick(myRadio) {
    document.getElementById("battleground").style = "background: url(img/img_bg_level_" + myRadio.value + ".jpg) repeat-y";
}

function setcookie(cname, cvalue, exdays) {
    var d = new Date();
    d.setTime(d.getTime() + (exdays * 1000));
    var expires = "expires=" + d.toGMTString();
    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/"; 
}

function getcookie(cname) {
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

function checksared() {
    var user = getcookie("shared");
    if (user == "true") { //shared
        document.getElementById("notShared").style = "display:none";
        document.getElementById("shared").style = "display:block";
    } else { //not shared
        document.getElementById("notShared").style = "display:block";
        document.getElementById("shared").style = "display:none";
    }
}

function soundplay(sound) {
    sound.pause();
    sound.currentTime = 0;
    sound.play();
}
// My plane
function plane(width, height, positionX, positionY, background) {
    this.width = width;
    this.height = height;
    this.positionX = positionX;
    this.positionY = positionY;
    this.background = background;
}
var planexut = new plane(641, 329, 0, 0, "url(img/myPlane.png)");
var planej = [planexut];

// Bullet
function bullet(width, height, speed, positionX, positionY, background) {
    this.width = width;
    this.height = height;
    this.speed = speed;
    this.positionX = positionX;
    this.positionY = positionY;
    this.background = background;
}
var bulletone = new bullet(14, 32, 10, 0, 0, "url(img/img_bullet.png)");
var rbbulletj = [bulletone];

// Enermy
function enermy(width, height, speed, score, positionX, positionY, background, HP) {
    this.width = width;
    this.height = height;
    this.speed = speed;
    this.score = score;
    this.positionX = positionX;
    this.positionY = positionY;
    this.background = background;
    this.HP = HP;
}
enermyone = new enermy(150, 150, 2, 100, 0, 0, "url(img/storm1.png)", 1);
enermytwo = new enermy(150, 150, 3, 100, 0, 0, "url(img/storm2.png)", 1);
enermythree = new enermy(150, 150, 2, 1000, 0, 0, "url(img/storm3.png)", 2);
enermyfour = new enermy(150, 150, 4, 200, 0, 0, "url(img/storm4.png)", 2);
enermyfive = new enermy(150, 150, 2, 500, 0, 0, "url(img/storm5.png)", 5);
enermysix = new enermy(150, 150, 2, 2000, 0, 0, "url(img/storm6.png)", 20);
var tutgrftj = [enermyone, enermytwo, enermythree, enermyfour, enermyfive, enermysix];

var bosses = [{
    width: 306,
    height: 236,
    score: 10000,
    speedX: 1,
    speedY: 1,
    src: "img/img_plane_boss_0.png",
    HP: 50
}, {
    width: 350,
    height: 234,
    score: 20000,
    speedX: 1,
    speedY: 1,
    src: "img/img_plane_boss_1.png",
    HP: 100
}, {
    width: 352,
    height: 220,
    score: 30000,
    speedX: 1,
    speedY: 1,
    src: "img/img_plane_boss_2.png",
    HP: 200
}];

var bombimg = ["wsparticle_06.png", "wsparticle_07.png", "wsparticle_04.png"];


cGame.onclick = function() {
    startgame();
    cGame.blur();
    playing.addEventListener('ended', function() {
        this.currentTime = 0;
        this.play();
    }, false);
    playing.play();
};
restart.onclick = function() {
    startgame();
    initmainarr();
    win.pause();
    win.currentTime = 0;
    playing.play();
    startSound.play();
}

Pause.onclick = function() {
    /*
	ispause = false;
	Pause.style.display = "none";
	lock = false;*/
    location.reload();
}

//initialization
function reset() {
    btg.innerHTML = "";
    flightpath = 0;
    scores = 0;
    userhp = 100;
    ispause = false;
    isdie = false;
    bulletrows = 1;
    bulletlevel = 0;
    masterbullet=false;
    increasetime=0;
    myvartwo = setInterval(mytimertwo, 1000);
    bulletspeed = rbbulletj[bulletlevel].speed;
    startBg.style.display = "none";
    gameOver.style.display = "none";
    bossView.style.display = "none";
    overTit.getElementsByTagName("img")[0].style.display = "none";
    overTit.getElementsByTagName("img")[1].style.display = "none";
    nowHp.style.width = "100px";
}

function resetmyplane() {
    var startTop = 600;
    var startLeft = 256 - planej[planelevel].width / 2;
    createplane(planelevel, planej, startTop, startLeft);
    var planeX = btg.offsetRight;
    var planeY = btg.offsetBottom - myplane.offsetHeight / 2;
    var btgWidth = btg.offsetWidth;
    var btgHeight = btg.offsetHeight;
    planeX = Math.min(Math.max(planeX, -myplane.offsetWidth / 2), btgWidth - myplane.offsetWidth / 2);
    planeY = Math.min(Math.max(planeY, -myplane.offsetHeight / 2), btgHeight - myplane.offsetHeight / 2);
    myplane.style.top = planeY + "px";
    myplane.style.left = planeX + "px";
}
var cPlane = btg.getElementsByClassName("hostilePlane");
var cBoss = btg.getElementsByClassName("boss");

function startgame() {

    requestfullscreen();
    typeright = 0;
    typewrong = 0;
    lock = false;
    startSound.play();

    reset(); //initialization
    //billBoard() //Refresh the leaderboard
    var max = 0;
    createscores(max, maxScores);
    resetmyplane();
    clearInterval(times);
    // Check interval
    times = setInterval(function() {
        if (!ispause) {
            countTime++;
            btg.style.backgroundPosition = "0px " + flightpath + "px";
            flightpath++; //Flight distance
            scores += 1;
            createscores(scores, scoresBox);
            if (flightpath % bulletspeed == 0) {
                // createbulletrows(bulletrows, bulletlevel) //Create bullets
            }
            movebullet(); //Move the bullets
            choosehostileplane(); //Randomly generated enemy
            movehostileplane(); //Move the enemy
            collidebullte(cPlane); //Hit enemy aircraft detection
            collidebullte(cBoss); //Hit boss
            chooseboss();
            moveboss();
            myplanecollide(cPlane, struckmyplane); //Collision detection aircraft
            myplanecollide(cBoss, struckmyplane); //Collision detection aircraft
            var bDrop = btg.getElementsByClassName("bulletDrop");
            var hBullet = btg.getElementsByClassName("hBullet");
            createflightpath(flightpath); //Number of kilometers generated
        }
    }, 20);
    /*
	document.onkeydown = function(e) {
		if (e.keyCode == 32) {
		    lock = true;
			ispause = true;
			Pause.style.display = "block";
			Pause.style.left = 230 + "px";
			Pause.style.top =360 + "px";
		}
	}*/
}

//MyPlane injured
function beinjured() {
    bgRed.style.display = "block";
    setTimeout(function() {
        bgRed.style.display = "none";
    }, 150);
}
//Aircraft collided with enemy aircraft

function struckmyplane(hElement) {
    if (userhp > 20) {
        masterbullet = false;
        userhp -= 20;

        audioInjure.play();
        beinjured();
        nowHp.style.width = userhp + "px";
        if (hElement.className == "hostilePlane") {
            bomb(hElement);
        }
    } else {
        beinjured();
        bomb(hElement);
        myplanebomb();
    }
}

//Number of kilometers generated
function createflightpath(flightpath) {
    flightpath = flightpath.toString();
    fPath.innerHTML = "";
    if (flightpath.length < 4) {
        var fPathImg = document.createElement("img");
        fPathImg.src = "img/path_f_1.png";
        fPathImg.style.width = "20px";
        fPath.appendChild(fPathImg);
        for (var i = flightpath.length - 1; i >= 0; i--) {
            fPathImg = document.createElement("img");
            fPathImg.src = "img/path_" + flightpath[i] + ".png";
            fPath.appendChild(fPathImg);
        }
    } else {
        var fPathImg = document.createElement("img");
        fPathImg.src = "img/path_f_1.png";
        fPathImg.style.width = "20px";
        fPath.appendChild(fPathImg);
        fPathImg = document.createElement("img");
        fPathImg.src = "img/path_f_2.png";
        fPathImg.style.width = "20px";
        fPath.appendChild(fPathImg);
        for (var i = flightpath.length - 2; i >= 0; i--) {
            if (i == flightpath.length - 4) {
                fPathImg = document.createElement("img");
                fPathImg.src = "img/dian.png";
                fPathImg.style.width = "12px";
                fPathImg.style.marginTop = "5px";
                fPath.appendChild(fPathImg);
            }
            fPathImg = document.createElement("img");
            fPathImg.src = "img/path_" + flightpath[i] + ".png";
            fPath.appendChild(fPathImg);
        }
    }
}
//Hit enemy aircraft detection

function collidebullte(cPlane) {
    var bullets = btg.getElementsByClassName("myBullet");
    //Bullet collision detection
    for (var i = 0; i < bullets.length; i++) {
        for (var j = 0; j < cPlane.length; j++) {
            if (!bullets[i]) {
                continue;
            }
            var kotwm = parseInt(bullets[i].style.left);
            var kmxa = parseInt(bullets[i].style.top);
            var hLeft = parseInt(cPlane[j].style.left);
            var hTop = parseInt(cPlane[j].style.top);
            var bHeight = parseInt(bullets[i].offsetHeight);
            var bWidth = parseInt(bullets[i].offsetWidth);
            var hHeight = parseInt(cPlane[j].offsetHeight);
            var hWidth = parseInt(cPlane[j].offsetWidth);
            if (cPlane[j].HP > 0 && kotwm > hLeft - bWidth && kotwm < hLeft + hWidth && kmxa < hTop + hHeight - bHeight && kmxa > hTop - bHeight) {
                btg.removeChild(bullets[i]);
                cPlane[j].HP--;
                if (cPlane[j].className == "boss") {
                    bossHp.style.width = Math.ceil(cPlane[j].HP / cPlane[j].maxHP * 120) + "px";
                }
                if (cPlane[j].HP <= 0) {
                    scores = scores + cPlane[j].score;
                    createscores(scores, scoresBox); //Generate a score
                    if (cPlane[j].className == "boss") {
                        masterbullet = false;
                        bossView.style.display = "none";
                    }
                    bomb(cPlane[j]);
                }
            }
        }
    }
}
//One side of the aircraft explosion
// My plane die
function myplanebomb() {
    bomb(myplane);
    var max = 0;
    createscores(scores, overImg);
    gameOver.style.display = "block";
    //ispause = true;
    isdie = true;
    clearInterval(times);
    lock = true;
    index = -1;
    playing.pause();

    win.play();
    setcookie("score",getcookie("score")+"|"+scores,525600);
    var accuracy;
    if ((typeright + typewrong) == 0)
        accuracy = 0;
    else accuracy = typeright / (typeright + typewrong);

    if(document.getElementById("userName").value==""){
    	username="No Name";
    }
    else{
    	username=document.getElementById("userName").value;
    }
    if(username.length>30){
        username=username.substring(0,29);
    }
    document.getElementById("tbName").innerHTML = username;

    //alert(typeright / (typeright + typewrong));
    // Save score to Database
    $.ajax({
		url: 'join.php',
		type: 'POST',
		data: {
			name: username,
			score: scores,
			distance: "" + flightpath,
			accuracy: "" + Math.round(accuracy * 10000)/100,
            countTime: countTime
		}
	});
    countTime=0;
    clearInterval(myvartwo);
            var req=new XMLHttpRequest();
            req.onreadystatechange=function(){
                if(req.readyState==4&&req.status==200){
                    document.getElementById("tbDefeat").innerText=Math.round(parseFloat(req.responseText)*10000)/100+"% others.";
                }
            };
            req.open('GET', 'getPercent.php?pscore='+scores, true);
            req.send();


    // Refresh time
    var countId = 0;
    var id = setInterval(frame, 20);

    function frame() {
        countId++;
        if (countId == 100) clearInterval(id);
        document.getElementById("tbScore").innerHTML = (scores / 100 * countId).toFixed(0);
        document.getElementById("tbAccuracy").innerHTML = (accuracy * countId).toFixed(2) + "%";
        document.getElementById("tbDistance").innerHTML = (flightpath / 100000 * countId).toFixed(2) + " km";
    }
    document.getElementById("tbScore").title = "You have reached " + scores + " point.";
    document.getElementById("tbDistance").title = "You have fly " + (flightpath / 1000).toFixed(2) + " km";
    document.getElementById("tbAccuracy").title = "You have typed exactly " + (accuracy * 100).toFixed(2) + "%";
    //document.getElementById("tbDefeat").title = "You have defeated " + Math.round(percentDefeat*10000)/100 + "% people in the world.";
}

//Generate a score
function createscores(scores, sElement) {
    scores = scores.toString();
    sElement.innerHTML = "";
    for (var i = 0; i < scores.length; i++) {
        var scoresImg = document.createElement("img");
        scoresImg.src = "img/number_" + scores[i] + ".png";
        sElement.appendChild(scoresImg);
    }

}
//Aircraft Collision Detection
function myplanecollide(sth, fn) {
    //Aircraft collision detection
    for (var j = 0; j < sth.length; j++) {
        var hLeft = parseInt(sth[j].style.left);
        var hTop = parseInt(sth[j].style.top);
        var hHeight = parseInt(sth[j].offsetHeight);
        var hWidth = parseInt(sth[j].offsetWidth);
        var mLeft = parseInt(myplane.style.left);
        var mTop = parseInt(myplane.style.top);
        var mHeight = parseInt(myplane.offsetHeight);
        var mWidth = parseInt(myplane.offsetWidth);
        if (hTop >= 550) {
            fn(sth[j]);
        }
    }
}
//Aircraft explosion
function bomb(bombPlane) {
    bombPlane.className = "bombPlane";
    bombPlane.style.backgroundImage = "url(img/" + bombimg[0] + ")";
    bombPlane.style.backgroundPosition = "center";
    bombPlane.style.backgroundRepeat = "no-repeat";
    var index = 1;
    clearInterval(bombPlane.times);
    bombPlane.times = setInterval(function() {
        bombPlane.style.backgroundImage = "url(img/" + bombimg[index] + ")";
        index++;
        if (index == 3) {
            clearInterval(bombPlane.times);
            try {
                btg.removeChild(bombPlane);

                soundplay(soundBomb);
            } catch (e) {}
        }
    }, 50);
}
//Move the enemy
function movehostileplane() {
    var tutgrftj = btg.getElementsByClassName("hostilePlane");
    for (var i = 0; i < tutgrftj.length; i++) {
        tutgrftj[i].style.top = parseInt(tutgrftj[i].style.top) + tutgrftj[i].speed + "px";
        if (parseInt(tutgrftj[i].style.top) > 768) {
            btg.removeChild(tutgrftj[i]);
        }
    }
}

function ghuqoxnhmfxu() {
    var mRand = Math.floor(Math.random() * 5);
    switch (mRand) {
        case 0:
            return 58;
            break;
        case 1:
            return 150.5;
            break;
        case 2:
            return 249.5;
            break;
        case 3:
            return 349.5;
            break;
        case 4:
            return 440;
            break;
    }
}
//Choose to generate the enemy
function choosehostileplane() {
    var pLeft = 0;
    var hp;
    if (flightpath % 7680 == 0) {
        pLeft = Math.floor(Math.random() * (513 - tutgrftj[5].width));
        hp = ngthmtcxjmfotplane(pLeft, tutgrftj, 5);
        var rows = 0;
        clearInterval(hp.times);
        hp.times = setInterval(function() {
            if (!ispause) {
                rows++;
                //createSectorBullet(hp,1);
                if (rows > 1 || isdie || (hp.HP == 0)) {
                    clearInterval(hp.times);
                }
            }
        }, 500);
    } else if (flightpath % 1500 == 0) {
        //pLeft = Math.floor(Math.random() * (513 - tutgrftj[4].width));
        pLeft = ghuqoxnhmfxu() - tutgrftj[4].width / 2 + 7;
        ngthmtcxjmfotplane(pLeft, tutgrftj, 4)
    } else if (flightpath % 750 == 0) {
        pLeft = ghuqoxnhmfxu() - tutgrftj[2].width / 2 + 7;
        //pLeft = Math.floor(Math.random() * (513 - tutgrftj[2].width));
        ngthmtcxjmfotplane(pLeft, tutgrftj, 2)
    } else if (flightpath % 375 == 0) {
        pLeft = ghuqoxnhmfxu() - tutgrftj[1].width / 2 + 7;
        //pLeft = Math.floor(Math.random() * (513 - tutgrftj[1].width));
        ngthmtcxjmfotplane(pLeft, tutgrftj, 1)
    } else if (flightpath % 150 == 0) {
        pLeft = ghuqoxnhmfxu() - tutgrftj[0].width / 2 + 7;
        //pLeft = Math.floor(Math.random() * (513 - tutgrftj[0].width));
        ngthmtcxjmfotplane(pLeft, tutgrftj, 0);
    }
}
//Create the enemy
function ngthmtcxjmfotplane(pLeft, tutgrftj, level) {
    var hPlane = document.createElement("div");
    hPlane.style.width = tutgrftj[level].width + "px";
    hPlane.style.height = tutgrftj[level].height + "px";
    hPlane.style.background = tutgrftj[level].background;
    hPlane.style.backgroundPosition = tutgrftj[level].positionX + "px " + tutgrftj[level].positionY + "px";
    hPlane.HP = tutgrftj[level].HP * Math.ceil(flightpath / 1000);
    hPlane.score = tutgrftj[level].score;
    hPlane.speed = tutgrftj[level].speed;
    hPlane.className = "hostilePlane";
    hPlane.style.position = "absolute";
    hPlane.style.top = -tutgrftj[level].height + "px";
    hPlane.style.left = pLeft + "px";
    btg.appendChild(hPlane);
    return hPlane;
}

//Create n rows of bullets
function createbulletrows(rows, level) {
    if (masterbullet == true) {
        var ngthmtmxa = 620;
        var ngthmtotwm = 58;
        createbullet(ngthmtmxa, ngthmtotwm, level);
        var ngthmtmxa = 640;
        var ngthmtotwm = 150.5;
        createbullet(ngthmtmxa, ngthmtotwm, level);
        var ngthmtmxa = 620;
        var ngthmtotwm = 249.5;
        createbullet(ngthmtmxa, ngthmtotwm, level);
        var ngthmtmxa = 640;
        var ngthmtotwm = 349.5;
        createbullet(ngthmtmxa, ngthmtotwm, level);
        var ngthmtmxa = 620;
        var ngthmtotwm = 440;
        createbullet(ngthmtmxa, ngthmtotwm, level);
    } else
        switch (rows) {
            case 1:
                {
                    //1
                    var ngthmtmxa = 620;
                    var ngthmtotwm = 58;
                    createbullet(ngthmtmxa, ngthmtotwm, level);
                    break;
                }
            case 2:
                {
                    //2
                    var ngthmtmxa = 640;
                    var ngthmtotwm = 150.5;
                    createbullet(ngthmtmxa, ngthmtotwm, level);
                    break;
                }
            case 3:
                {
                    var ngthmtmxa = 620;
                    var ngthmtotwm = 249.5;
                    createbullet(ngthmtmxa, ngthmtotwm, level);
                    break;
                }
            case 4:
                {
                    //4
                    var ngthmtmxa = 640;
                    var ngthmtotwm = 349.5;
                    createbullet(ngthmtmxa, ngthmtotwm, level);
                    break;
                }
            case 5:
                {
                    //5
                    var ngthmtmxa = 620;
                    var ngthmtotwm = 440;
                    createbullet(ngthmtmxa, ngthmtotwm, level);
                    break;
                }
        }

}
//Create a bullet
function createbullet(kmxa, kotwm, level) {
    var myBullet = document.createElement("div");
    myBullet.className = "myBullet";
    myBullet.style.width = rbbulletj[level].width + "px";
    myBullet.style.height = rbbulletj[level].height + "px";
    myBullet.style.background = rbbulletj[level].background;
    myBullet.style.backgroundPosition = rbbulletj[level].positionX + "px " + rbbulletj[level].positionY + "px";
    myBullet.style.position = "absolute";
    myBullet.style.top = kmxa + "px";
    myBullet.style.left = kotwm + "px";
    btg.appendChild(myBullet);
}
//Move the bullets
function movebullet() {
    var bullets = btg.getElementsByClassName("myBullet");
    for (var i = 0; i < bullets.length; i++) {
        bullets[i].style.top = parseInt(bullets[i].style.top) - parseInt(bullets[0].style.height) + "px";
        //Remove excess bullets
        if (parseInt(bullets[i].style.top) < -parseInt(bullets[0].style.height)) {
            btg.removeChild(bullets[i]);
        }
    }
}

//
//Create an aircraft
function createplane(level, planej, oTop, oLeft) {
    myplane = document.createElement("div");
    myplane.style.width = planej[level].width + "px";
    myplane.style.height = planej[level].height + "px";
    myplane.style.background = planej[level].background;
    myplane.style.backgroundPosition = planej[level].positionX + "px " + planej[level].positionY + "px";
    myplane.style.position = "absolute";
    myplane.style.zIndex = 99;
    myplane.style.top = oTop + "px";
    myplane.style.left = oLeft + "px";
    btg.appendChild(myplane);
}
var lockEnter = false;
window.onkeydown = function(e) {
    if (e.keyCode == 13 && lockEnter == false) {
        startgame();
        cGame.blur();
        var typeright = 0;
        var typewrong = 0;
        lock = false;
        playing.addEventListener('ended', function() {
            this.currentTime = 0;
            this.play();
        }, false);
        playing.play();
        lockEnter = true;
    }
}

function moveboss() {
    var boss = btg.getElementsByClassName("boss");
    for (var i = 0; i < boss.length; i++) {
        boss[i].style.top = parseInt(boss[i].style.top) + boss[i].speedY + "px";
        boss[i].style.left = parseInt(boss[i].style.left) + boss[i].speedX + "px";
        if (parseInt(boss[i].style.top) >= 100 || parseInt(boss[i].style.top) <= -100) {
            boss[i].speedY = boss[i].speedY * -1;
        }
        if (parseInt(boss[i].style.left) >= (512 - boss[i].offsetWidth) || parseInt(boss[i].style.left) <= 0) {
            boss[i].speedX = boss[i].speedX * -1;
        }
    }
}

function chooseboss() {
    var pLeft = 0;
    var hp;
    if (flightpath % 10000 == 0) {
        pLeft = Math.floor((512 - bosses[2].width) / 2);
        hp = createboss(pLeft, bosses, 2);
        clearInterval(hp.times);
        hp.times = setInterval(function() {
            if (!ispause) {
                //createSectorBullet(hp, 1);
                if (isdie || (hp.HP == 0)) {
                    clearInterval(hp.times);
                }
            }
        }, 1000);
    } else if (flightpath == 6000) {
        masterbullet = true;
        pLeft = Math.floor((512 - bosses[1].width) / 2);
        hp = createboss(pLeft, bosses, 1);
        clearInterval(hp.times);
        hp.times = setInterval(function() {
            if (!ispause) {
                //createSectorBullet(hp, 1);
                if (isdie || (hp.HP == 0)) {
                    clearInterval(hp.times);
                }
            }
        }, 1000);
    } else if (flightpath == 3000) {
        masterbullet = true;
        pLeft = Math.floor((512 - bosses[0].width) / 2);
        hp = createboss(pLeft, bosses, 0);
        clearInterval(hp.times);
        hp.times = setInterval(function() {
            if (!ispause) {
                //createSectorBullet(hp, 1);
                if (isdie || (hp.HP == 0)) {
                    clearInterval(hp.times);
                }
            }
        }, 1000);
    }
}

function createboss(pLeft, bosses, level) {
    var boss = document.createElement("img");
    bossView.style.display = "block";
    boss.style.width = bosses[level].width + "px";
    boss.style.height = bosses[level].height + "px";
    boss.src = bosses[level].src;
    boss.HP = bosses[level].HP * Math.ceil(flightpath / 1000);
    boss.maxHP = boss.HP;
    boss.score = bosses[level].score;
    boss.className = "boss";
    boss.speedX = bosses[level].speedX;
    boss.speedY = bosses[level].speedY;
    boss.style.position = "absolute";
    boss.style.top = "10px";
    boss.style.left = pLeft + "px";
    btg.appendChild(boss);
    return boss;
}

function togglefullscreen() {
    if ((document.fullScreenElement && document.fullScreenElement !== null) ||
        (!document.mozFullScreen && !document.webkitIsFullScreen)) {
        if (document.documentElement.requestfullscreen) {
            document.documentElement.requestfullscreen();
        } else if (document.documentElement.mozRequestFullScreen) {
            document.documentElement.mozRequestFullScreen();
        } else if (document.documentElement.webkitRequestFullScreen) {
            document.documentElement.webkitRequestFullScreen(Element.ALLOW_KEYBOARD_INPUT);
        }
    } else {
        if (document.cancelFullScreen) {
            document.cancelFullScreen();
        } else if (document.mozCancelFullScreen) {
            document.mozCancelFullScreen();
        } else if (document.webkitCancelFullScreen) {
            document.webkitCancelFullScreen();
        }
    }
}

function requestfullscreen() {

    var el = document.body;

    // Supports most browsers and their versions.
    var requestMethod = el.requestfullscreen || el.webkitRequestFullScreen || el.mozRequestFullScreen || el.msRequestFullScreen;

    if (requestMethod) {

        // Native full screen.
        requestMethod.call(el);

    } else if (typeof window.ActiveXObject !== "undefined") {

        // Older IE.
        var wscript = new ActiveXObject("WScript.Shell");

        if (wscript !== null) {
            wscript.SendKeys("{F11}");
        }
    }
}

// typing
var listarr = document.getElementById("list");
var button = document.getElementById('btnWord');
var lock = false;
var preloadtext="Practice typing skill.";
var myVar;
document.addEventListener("keydown", typing, false);
window.onload = function () {
    checksared();
    myVar=setInterval(myTimer, 20);
    lock = true;
    initmainarr();
    console.log("%cPlease play and %cdon't cheat.", "color: blue; font-size:65px;", "color: green; font-size:70px;");
}
var nxpummbatmtym=0;
    function myTimer(){
    while(nxpummbatmtym<preloadtext.length){
        nxpummbatmtym++;
        document.getElementById("preLoadText").innerText = preloadtext.substring(0, nxpummbatmtym) + "|";
        return;
    }
    document.getElementById("preLoadText").innerText = preloadtext;
    clearTimeout(myVar);
}

function checkifduplicate(a, n) {
    // body... 
    for (var i = 0; i < a.length; i++) {
        if (a[i] == n) return true;
    }
    return false;
}


var mainArr = []; //contain 15 start-letter
var wordArr = [];

//get 15 from 24 letters
function initmainarr() {
    mainArr = []; //reset array
    for (var i = 0; i < 15; i++) {
        var random;
        do {
            random = getrandom(26, 0);
        } while (checkifduplicate(mainArr, random)||random==11||random==16||random==21||random==23);
        mainArr.push(random);
    }
    initword();
}
// Init word with known start letter
function initword() {
    wordArr = [] //reset array
    for (var i = 0; i < 15; i++) {
        var random = getrandom(addList[mainArr[i]].length, 0);
        wordArr.push(addList[mainArr[i]][random]);
    }
    printword();
}

// Print to divWork
function printword () {
    // body... 
    var htmlElements = "";
    for (var i = 0; i < 15; i++) {
        //htmlElements += '<div>'+wordArr[i]+'</div>';
        if (i == 0) {
            htmlElements += '<div class="divPercent">';
        }
        else if (i % 3 == 0) {
            htmlElements += '</div> <div class="divPercent">';
        }
        if (i == index) {
            htmlElements += '<div class="content"><div class="visible"><p class="pWord pFire">';
        }
        else {
            htmlElements += '<div class="content"><div class="visibleNone"><p class="pWord pFire">';
        }
        htmlElements += wordArr[i];
        if (i == 14)
            htmlElements += '</p></div></div>';
        else htmlElements += '</p></div></div><br/>';

    }
    htmlElements += '</div>';
    var container = document.getElementById("divWord");
    container.innerHTML = htmlElements;
    
}

function getrandom(max, min) {
    // body... 
    return Math.floor(Math.random() * (max - min)) + min;
}



var index = -1;



function typing(e) {
    if (e.which >= 65 && e.which <= 90) {
        if (lock == false) {
            for (var i = 0; i < mainArr.length; i++) {
                if (mainArr[i] == (e.which) - 65) {
                    //alert(wordArr[i]);
                    /*
    
                    function fire here
                    */
                    soundplay(spark);
                    var mp3 = new Audio('mp3/'+wordArr[i].toLowerCase()+'.mp3');
                    mp3.play();
                    createbulletrows(Math.floor(i / 3) + 1, bulletlevel);

                    wordArr[i] = wordArr[i].substring(1, wordArr[i].length);
                    //
                    lock = true;
                    index = i;
                    typeright++;
                    //
                    printword();
                    return;
                }
            }
            typewrong++;
            soundplay(wrong);
        }
        if (index != -1) {
            if (wordArr[index][0] == String.fromCharCode(e.which)) {
                /*
    
        function fire here
    
        */  soundplay(spark);
                typeright++;

                createbulletrows(Math.floor(index / 3) + 1, bulletlevel);


                if (wordArr[index].length > 1) {
                    wordArr[index] = wordArr[index].substring(1, wordArr[index].length);

                    printword();

                } else {

                    var random;
                    wordArr[index] = "";
                    mainArr[index] = -1;
                    do {
                        random = getrandom(26, 0);
                    } while (checkifduplicate(mainArr, random)||random==11||random==16||random==21||random==23);
                    mainArr[index] = random;
                    //rebuild word
                    random = getrandom(addList[mainArr[index]].length, 0);
                    wordArr[index] = addList[mainArr[index]][random];
                    //
                    lock = false;
                    index = -1;
                    printword();
                }
            }
            else {
                soundplay(wrong);
                typewrong++;
            }
        }
        // else soundplay(wrong);
    }
}

var addList = [];
addList[0] = ['AA', 'AAYOKATTA', 'ABIMASU', 'ABUNAI', 'ACCHI', 'ACHIRA', 'AGARIMASU', 'AGEMASU', 'AIDA', 'AIMASU', 'AISATSU', 'AITE', 'AJI', 'AKA', 'AKACHAN', 'AKAI', 'AKARUI', 'AKEMASU', 'AKI', 'AKIMASU', 'AMAI', 'AMARI', 'AME', 'AMIDANA', 'ANATA', 'ANNA', 'ANNAISYO', 'ANNANI', 'ANO', 'ANOHITO', 'ANOKATA', 'ANZEN', 'AO', 'AOI', 'APAATO', 'ARAIMASU', 'ARE', 'ARIMASU', 'ARU', 'ARUBAMU', 'ARUITE', 'ARUKIMASU', 'ASA', 'ASAGOHAN', 'ASATTE', 'ASE', 'ASHI', 'ASHITA', 'ASOBIMASU', 'ASOKO', 'ATAMA', 'ATAMAGAII', 'ATARASHII', 'ATATAKAI', 'ATO', 'ATODE', 'ATSUI', ];
addList[1] = ['BAI', 'BAKKIN', 'BANGOHAN', 'BANGOU', 'BANGUMI', 'BANSEN', 'BASU', 'BASUTEI', 'BASYO', 'BEDDO', 'BEN', 'BENGOSHI', 'BENKYOU', 'BENRI', 'BIDEO', 'BIIRU', 'BIJUTSU', 'BIN', 'BIRU', 'BIZA', 'BOKU', 'BOKUJOU', 'BONODORI', 'BOONASU', 'BOORU', 'BOTAN', 'BOUEKI', 'BOUNENKAI', 'BOUSHI', 'BUCHOU', 'BUKKA', 'BUNGAKU', 'BUNKA', 'BUNPOU', 'BYOUIN', 'BYOUKI', ];
addList[2] = ['CHANSU', 'CHANTO', 'CHICHI', 'CHIIMU', 'CHIISAI', 'CHIKA', 'CHIKAI', 'CHIKAKU', 'CHIKARA', 'CHIKYUU', 'CHITTOMO', 'CHIZU', 'CHOTTO', 'CHOUDO', 'CHOUDOII', 'CHOUSHI', 'CHUUSHI', 'CHUUSYA', 'CHYU', ];
addList[3] = ['DAIDOKORO', 'DAIETTO', 'DAIGAKU', 'DAIGAKUIN', 'DAITAI', 'DAME', 'DANBOU', 'DANDAN', 'DANME', 'DANSU', 'DARE', 'DAREDEMO', 'DAREKA', 'DASEI', 'DASHIMASU', 'DEETA', 'DEETO', 'DEGUCHI', 'DEHA', 'DEKIMASU', 'DEMASU', 'DEMO', 'DENCHI', 'DENGEN', 'DENKI', 'DENKIYA', 'DENSHI', 'DENSYA', 'DENWA', 'DENWADAI', 'DEPAATO', 'DESUKARA', 'DOA', 'DOCCHI', 'DOCHIRA', 'DOCHIRAMO', 'DOKO', 'DOKODEMO', 'DOKOKA', 'DOKUSHIN', 'DONNA', 'DONO', 'DORAMA', 'DORE', 'DOROBOU', 'DOU', 'DOUBUTSU', 'DOUGU', 'DOUIU', 'DOUMO', 'DOUSHITE', 'DOUSURUNO', 'DOUYATTE', 'DOYOUBI', ];
addList[4] = ['EAKON', 'EDA', 'EE', 'EETO', 'EHAGAKI', 'EHON', 'EIGA', 'EIGO', 'EIGYOU', 'EKI', 'EKIIN', 'EKIMAE', 'EN', 'ENJIN', 'ENJINIA', 'ENPITSU', 'ENRYONAKU', 'ENSATSU', 'ERABIMASU', 'ERAI', 'ESA', ];
addList[5] = ['FIJRUMU', 'FOOKU', 'FUBEN', 'FUEMASU', 'FUKIMASU', 'FUKU', 'FUKURO', 'FUKUZATSU', 'FUMIMASU', 'FUNE', 'FURIMASU', 'FURONTO', 'FUROSHIKI', 'FURUI', 'FUTA', 'FUTARI', 'FUTOI', 'FUTON', 'FUTSUKA', 'FUTSUNO', 'FUTSUU', 'FUXAIRU', 'FUXAITO', 'FUYU', ];
addList[6] = ['GAISYA', 'GAKKOU', 'GAKUSEI', 'GAMU', 'GARASU', 'GASORIN', 'GASU', 'GASURENJI', 'GATSU', 'GAWA', 'GENIN', 'GENKAN', 'GENKI', 'GENKIN', 'GENRYOU', 'GINKOU', 'GINKOUIN', 'GO', 'GOGO', 'GOHAN', 'GOKAZOKU', 'GOMI', 'GOMIBAKO', 'GORO', 'GORUFU', 'GOSYUJIN', 'GOU', 'GOZAIMASU', 'GOZEN', 'GUAI', 'GURAMU', 'GURUUPU', 'GYUUDON', ];
addList[7] = ['HAA', 'HAHA', 'HAIRIMASU', 'HAISYA', 'HAIZARA', 'HAJIME', 'HAJIMENI', 'HAJIMETE', 'HAKIMASU', 'HAKKIRI', 'HAKO', 'HAN', 'HANA', 'HANABI', 'HANBUN', 'HANKO', 'HANTOSHI', 'HAPPYOU', 'HARAIMASU', 'HAREMASU', 'HARIMASU', 'HARU', 'HASAMI', 'HASHI', 'HATAI', 'HATSUKA', 'HATSUON', 'HAYAI', 'HAYAKU', 'HEE', 'HEIWA', 'HEN', 'HENJI', 'HERIMASU', 'HETA', 'HEYA', 'HI', 'HIDARI', 'HIDOI', 'HIGASHI', 'HIKIDASHI', 'HIKIMASU', 'HIKOUKI', 'HIKUI', 'HIMA', 'HIMO', 'HIRAGANA', 'HIROI', 'HIROIMASU', 'HIRU', 'HIRUGOHAN', 'HIRUMA', 'HITO', 'HITORIDE', 'HITSTUYOU', 'HODO', 'HOKANI', 'HOKANO', 'HOKENSYOU', 'HOMEMASU', 'HONDANA', 'HONSYA', 'HONTOU', 'HONTOUNI', 'HONYA', 'HOSHI', 'HOSHII', 'HOSHOUSYO', 'HOSOI', 'HOTERU', 'HOTONDO', 'HOUHOU', 'HOURITSU', 'HYAKU', ];
addList[8] = ['ICHIBAN', 'ICHIDO', 'ICHIDOMO', 'IE', 'IGAKU', 'II', 'IIDESUNE', 'IIDESUYO', 'IIE', 'IIMASU', 'IJOU', 'IJOUDESU', 'IKA', 'IKE', 'IKEBANA', 'IKEN', 'IKENAI', 'IKIMASU', 'IKURA', 'IMA', 'IMANIMO', 'IMASU', 'IMI', 'INAI', 'INAKA', 'INU', 'IREMASU', 'IRIGUCHI', 'IRIMASU', 'IRO', 'IROIRO', 'ISHI', 'ISOGASHII', 'ISOGIMASU', 'ISSYONI', 'ISU', 'ISYA', 'ITSU', 'ITSUDEMO', 'ITSUKA', 'ITSUMO', 'IYA', ];
addList[9] = ['JAMA', 'JAZU', 'JI', 'JIBUN', 'JIBUNDE', 'JIDOUSYA', 'JIKAN', 'JIKKEN', 'JIKO', 'JIMUSYO', 'JIN', 'JINJA', 'JINKOU', 'JISHIN', 'JISYO', 'JITENSYA', 'JITSUHA', 'JIYUUNI', 'JOGINGU', 'JOSEI', 'JOUBU', 'JOUHOU', 'JOUZU', 'JOUZUNI', 'JUGYOU', 'JUKU', 'JUNBI', 'JUU', 'JUUBUN', 'JUUDOU', 'JUUSU', 'JUUSYO', 'JUUYOKKA', ];
addList[10] = ['KAADO', 'KAATEN', 'KABAN', 'KABE', 'KABIN', 'KABUKI', 'KACHIMASU', 'KACHOU', 'KADO', 'KAEMASU', 'KAERIMASU', 'KAERINI', 'KAGAKUSYA', 'KAGAMI', 'KAGI', 'KAGU', 'KAIDAN', 'KAIGAI', 'KAIGAN', 'KAIGI', 'KAIIN', 'KAIJOU', 'KAIMASU', 'KAIRAN', 'KAISHAIN', 'KAISYA', 'KAJI', 'KAKARI', 'KAKARIIN', 'KAKEMASU', 'KAKIMASU', 'KAKUNIN', 'KAMERA', 'KAMI', 'KAMIMASU', 'KAN', 'KANAIMASU', 'KANARAZU', 'KANARI', 'KANASHII', 'KANDUME', 'KANJI', 'KANKEI', 'KANKIRI', 'KANOJO', 'KANPAI', 'KANRININ', 'KANTAN', 'KAO', 'KARA', 'KARADA', 'KARAI', 'KARAOKE', 'KARE', 'KARIMASU', 'KARUI', 'KASA', 'KASHIMASU', 'KASYU', 'KATA', 'KATACHI', 'KATAI', 'KATAKANA', 'KAWA', 'KAWAII', 'KAYOIMASU', 'KAYOUBI', 'KAZE', 'KAZOEMASU', 'KAZOKU', 'KEDO', 'KEEKI', 'KEGA', 'KEIKAN', 'KEIKEN', 'KEISATSU', 'KEITAI', 'KEIZAI', 'KEN', 'KENDOU', 'KENKOU', 'KESA', 'KESHIGOMU', 'KESHIKI', 'KESHIMASU', 'KI', 'KIBISHII', 'KIBOU', 'KIBUNGAII', 'KICHINTO', 'KIEMASU', 'KIIRO', 'KIKAI', 'KIKEN', 'KIKIMASU', 'KIKOEMASU', 'KIMASU', 'KIMEMASU', 'KIMI', 'KIMOCHI', 'KIMONO', 'KINEN', 'KINGAKU', 'KINJO', 'KINOU', 'KINYOUBI', 'KIPPU', 'KIRAI', 'KIREI', 'KIREMASU', 'KIRIMASU', 'KIRIN', 'KIRO', 'KISETSU', 'KISOKU', 'KISSATEN', 'KITA', 'KITANAI', 'KITTO', 'KIZU', 'KO', 'KOCCHI', 'KOCHIRA', 'KODOMO', 'KOE', 'KOI', 'KOIBITO', 'KOKO', 'KOKONOKA', 'KOKUSAI', 'KOMAKAI', 'KOME', 'KOMIMASU', 'KON', 'KONBAN', 'KONDO', 'KONGETSU', 'KONNA', 'KONNANI', 'KONO', 'KONOAIDA', 'KONOGORO', 'KONOGURAI', 'KONOHEN', 'KONSYUU', 'KONYA', 'KOOHII', 'KOOSU', 'KOOTO', 'KOPPU', 'KORE', 'KOREKARA', 'KORO', 'KOSYOU', 'KOTAE', 'KOTAEMASU', 'KOTO', 'KOTOBA', 'KOTOSHI', 'KOUBAN', 'KOUCHA', 'KOUEN', 'KOUGAI', 'KOUGI', 'KOUJOU', 'KOUKOU', 'KOUSATEN', 'KOWAI', 'KUCHI', 'KUDAMONO', 'KUDASAI', 'KUMORI', 'KUN', 'KURAI', 'KURASU', 'KUREMASU', 'KURO', 'KUROI', 'KURUMA', 'KUSURI', 'KUTSU', 'KUUKI', 'KUUKOU', 'KUWASHII', 'KYANPU', 'KYOKA', 'KYOKU', 'KYONEN', 'KYOUIKU', 'KYOUKAI', 'KYOUMI', 'KYOUSHI', 'KYUNI', 'KYUUKOU', 'KYUURYOU', ];
addList[11] = [];
addList[12] = ['MACHI', 'MACHIGAI', 'MACHIMASU', 'MADA', 'MADE', 'MADENI', 'MADO', 'MAE', 'MAGO', 'MAIASA', 'MAIBAN', 'MAINICHI', 'MAIRIMASU', 'MAISYUU', 'MAITOSHI', 'MAITSUKI', 'MAJIME', 'MAKEMASU', 'MAN', 'MANGA', 'MANNAKA', 'MANSYON', 'MARASON', 'MARU', 'MASSUGU', 'MATA', 'MAWARI', 'MAZEMASU', 'MAZU', 'MAZUI', 'ME', 'MEETORU', 'MEGANE', 'MEISHI', 'MICHI', 'MIDORI', 'MIEMASU', 'MIGI', 'MIJIKAI', 'MIKISAA', 'MIKKA', 'MIMASU', 'MIMI', 'MINAMI', 'MINASAN', 'MINATO', 'MINNADE', 'MISE', 'MISEMASU', 'MIZU', 'MOCHIMASU', 'MOCHIRON', 'MOEMASU', 'MOKUTEKI', 'MOKUYOUBI', 'MOMIJI', 'MONDAI', 'MONO', 'MORAIMASU', 'MOSHI', 'MOTTO', 'MOU', 'MOUSUGU', 'MUDA', 'MUGI', 'MUIKA', 'MUKAEMASU', 'MUKAIMASU', 'MUKASHI', 'MUKOU', 'MURA', 'MURI', 'MURYOU', 'MUSUKO', 'MUSUKOSAN', 'MUSUME', 'MUSUMESAN', ];
addList[13] = ['NAGASA', 'NAGEMASU', 'NAIFU', 'NAKA', 'NAKANAKA', 'NAKIMASU', 'NAMAE', 'NAMI', 'NAMIDA', 'NAN', 'NANBAN', 'NANDEMO', 'NANDESUKA', 'NANGAI', 'NANGATSU', 'NANI', 'NANIKA', 'NANJI', 'NANKAIMO', 'NANNICHI', 'NANOKA', 'NANPUN', 'NANSAI', 'NANYOUBI', 'NAORIMASU', 'NARAIMASU', 'NAREMASU', 'NARIMASU', 'NASAIMASU', 'NATSU', 'NAZE', 'NEDAN', 'NEKO', 'NEMASU', 'NEMUI', 'NENKUMI', 'NENREI', 'NESSHIN', 'NETSU', 'NICHI', 'NIGAI', 'NIGEMASU', 'NIGIYAKA', 'NIHONGO', 'NIJIKAI', 'NIKKI', 'NIKU', 'NIMOTSU', 'NINGYOU', 'NIOI', 'NISHI', 'NITSUITE', 'NIWA', 'NIYORUTO', 'NIYOTTE', 'NOHOU', 'NOMIMASU', 'NOMIMONO', 'NOOTO', 'NORIBA', 'NORIMASU', 'NOSEMASU', 'NUGIMASU', 'NUREMASU', 'NYUUKAN', 'NYUUSU', ];
addList[14] = ['OBAACHAN', 'OBASAN', 'OBENTOU', 'OBOEMASU', 'OCHA', 'OCHAWAN', 'OCHIMASU', 'ODAIJINI', 'ODORIMASU', 'OFURO', 'OHANAMI', 'OHANASHI', 'OINORI', 'OISHII', 'OIWAI', 'OJI', 'OJIICHAN', 'OJISAN', 'OKAASAN', 'OKANE', 'OKASHI', 'OKASHII', 'OKIBA', 'OKIMASU', 'OKOSAN', 'OKU', 'OKUJOU', 'OKUNI', 'OKUREMASU', 'OKURIMASU', 'OKURIMONO', 'OKUSAN', 'OKYAKUSAN', 'OMATSURI', 'OMIAI', 'OMIMAI', 'OMIYAGE', 'OMOCHA', 'OMOI', 'OMOIMASU', 'OMOSA', 'OMOSHIROI', 'OMOTE', 'ONAJI', 'ONAKA', 'ONGAKU', 'ONGAKUKA', 'ONNANOKO', 'ONSEN', 'OOI', 'OOKII', 'OOKINA', 'OOKISA', 'OOZEI', 'OREMASU', 'ORIMASU', 'OSAKE', 'OSAKINI', 'OSARA', 'OSHIEMASU', 'OSHIIRE', 'OSHIMASU', 'OSHIRASE', 'OSOI', 'OSOKU', 'OSOUSHIKI', 'OTAKU', 'OTERA', 'OTO', 'OTOKONOKO', 'OTOTOI', 'OTOTOSHI', 'OTOUSAN', 'OTSURI', 'OWARI', 'OWARIMASU', 'OYOGIMASU', 'OYU', ];
addList[15] = ['PAN', 'PANCHI', 'PASOKON', 'PATOKAA', 'PETTO', 'PIANO', 'PITTARI', 'POKETTO', 'POSUTAA', 'POSUTO', 'PUURUU', ];
addList[16] = [];
addList[17] = ['RAINEN', 'RAISYUU', 'RAJIO', 'RAKU', 'REBAA', 'REIBOU', 'REIZOUKO', 'REKISHI', 'RENKYUU', 'REPOOTO', 'RIYUU', 'ROMAJI', 'RONBUN', 'ROUKA', 'RUSU', 'RYOKAN', 'RYOKOU', 'RYOKOUSYA', 'RYOU', 'RYOURI', ];
addList[18] = ['SAABISU', 'SABISHII', 'SADOU', 'SAGEMASU', 'SAI', 'SAIFU', 'SAIGONI', 'SAIKIN', 'SAISYONI', 'SAIZU', 'SAKANA', 'SAKIMASU', 'SAKINI', 'SAKKAA', 'SAKKI', 'SAKUBUN', 'SAKURA', 'SAMA', 'SAMUI', 'SAN', 'SANSEI', 'SARAINEN', 'SARAISYUU', 'SARU', 'SASHIMI', 'SASOIMASU', 'SATOU', 'SATSU', 'SEETAA', 'SEGATAKAI', 'SEI', 'SEIHIN', 'SEIJI', 'SEIKATSU', 'SEISEKI', 'SEITO', 'SEKAI', 'SEKAIJUU', 'SEKIYU', 'SEKKEN', 'SEMAI', 'SEN', 'SENJITSU', 'SENMON', 'SENNUKI', 'SENSEI', 'SENSOU', 'SENSU', 'SENSYUU', 'SENTAKUKI', 'SETSUBI', 'SHIAI', 'SHIAWASE', 'SHIBARAKU', 'SHIGURU', 'SHIKA', 'SHIKASHI', 'SHIKEN', 'SHIKI', 'SHIMA', 'SHIMASU', 'SHIMEMASU', 'SHINAMONO', 'SHINBUN', 'SHINGOU', 'SHINIMASU', 'SHINPAI', 'SHINSETSU', 'SHIO', 'SHIRIMASU', 'SHIRO', 'SHIROI', 'SHIRYOU', 'SHITA', 'SHITAGI', 'SHITEN', 'SHIZEN', 'SHIZUKA', 'SHUUKAN', 'SOBO', 'SOCCHI', 'SOCHIRA', 'SOFU', 'SOFUTO', 'SOKO', 'SONNA', 'SONNANI', 'SONO', 'SONOHOUGA', 'SONOUE', 'SOOSU', 'SORA', 'SORE', 'SOREDE', 'SOREKARA', 'SORENARA', 'SORENI', 'SOROBAN', 'SORYAA', 'SOSHITE', 'SOTO', 'SOU', 'SOUDESUNE', 'SOUSA', 'SUGIMASU', 'SUGOI', 'SUGU', 'SUICCHI', 'SUIDOU', 'SUIEI', 'SUIMASU', 'SUIYOUBI', 'SUKI', 'SUKII', 'SUKIMASU', 'SUKIYAKI', 'SUKOSHI', 'SUKUNAI', 'SUMI', 'SUMIMASEN', 'SUMIMASU', 'SUMOU', 'SUPUUN', 'SUTAATO', 'SUTEKI', 'SUTEMASU', 'SUTEREO', 'SUUPAA', 'SUUTSU', 'SUZUSHII', 'SYAIN', 'SYAKAI', 'SYASHIN', 'SYATSU', 'SYAWAA', 'SYOKUDOU', 'SYOKUYOKU', 'SYORUI', 'SYOUKIN', 'SYOURAI', 'SYOUSETSU', 'SYOUTO', 'SYOUYU', 'SYUKUDAI', 'SYUMI', 'SYUSYOU', 'SYUUMATSU', 'SYUUNYUU', ];
addList[19] = ['TABEMASU', 'TABEMONO', 'TABUN', 'TACHIMASU', 'TADAIMA', 'TADASHII', 'TAIFUU', 'TAIHEN', 'TAIKAI', 'TAIONKEI', 'TAISETSU', 'TAISHIKAN', 'TAITEI', 'TAIYOU', 'TAKAI', 'TAKASA', 'TAKUSAN', 'TAMAGO', 'TAMANI', 'TANA', 'TANGO', 'TANJOUBI', 'TANOSHII', 'TANOSHIMI', 'TANSU', 'TAOREMASU', 'TAORU', 'TARIMASU', 'TASHIKA', 'TATEMASU', 'TATEMONO', 'TATTAIMA', 'TE', 'TEBUKURO', 'TECHOO', 'TEEBURU', 'TEGAMI', 'TEINEI', 'TEISYOKU', 'TEKITOU', 'TEN', 'TENISU', 'TENKI', 'TENKIN', 'TENPURA', 'TENRANKAI', 'TEREBI', 'TESUTO', 'TO', 'TOCHUUDE', 'TOIIMASU', 'TOKEI', 'TOKIDOKI', 'TOKKYUU', 'TOKORO', 'TOKORODE', 'TOKOYA', 'TOKUBETSU', 'TOKUNI', 'TOMEMASU', 'TOMODACHI', 'TONARI', 'TOOI', 'TOOKA', 'TOORIMASU', 'TORAKKU', 'TOREMASU', 'TORI', 'TORIMASU', 'TOSYOKAN', 'TOUROKU', 'TSUGINI', 'TSUGINO', 'TSUIN', 'TSUITACHI', 'TSUKEMASU', 'TSUKI', 'TSUKIMASU', 'TSUKINI', 'TSUKUE', 'TSUMAMI', 'TSUMETAI', 'TSURI', 'TSUYOI', ];
addList[20] = ['UCHIMASU', 'UCHUU', 'UE', 'UEMASU', 'UGOKIMASU', 'UKAGAMASU', 'UKEMASU', 'UKETSUKE', 'UMA', 'UMAI', 'UMAREMASU', 'UMI', 'UN', 'UNDOUKAI', 'URA', 'UREMASU', 'URESHII', 'URIBA', 'URIMASU', 'URUSAI', 'USHIRO', 'USO', 'USUI', 'UTA', 'UTAIMASU', 'UUN', 'UWAGI', ];
addList[21] = [];
addList[22] = ['WAAPURO', 'WAKAI', 'WARAIMASU', 'WAREMASU', 'WARUI', 'WASYOKU', 'WATAKUSHI', 'WATASHI', ];
addList[23] = [];
addList[24] = ['YACHIN', 'YAJIRUSHI', 'YAKAN', 'YAKEDO', 'YAKEMASU', 'YAKIMASU', 'YAKOUBASU', 'YAKUSOKU', 'YAKYUU', 'YAMA', 'YAMEMASU', 'YAMIMASU', 'YARIMASU', 'YASAI', 'YASASHII', 'YASEMASU', 'YASUI', 'YASUMI', 'YATTO', 'YAWARAKAI', 'YOBIMASU', 'YOIMASU', 'YOKATTARA', 'YOKKA', 'YOKO', 'YOKU', 'YOMIKATA', 'YOMIMASU', 'YORIMASU', 'YORU', 'YOTEI', 'YOTEIHYOU', 'YOUJI', 'YOUKA', 'YOUSU', 'YOUSYOKU', 'YOWAI', 'YUBIWA', 'YUKI', 'YUKKURI', 'YUME', 'YUUBE', 'YUUGATA', 'YUUMEI', 'YUUMOA', ];
addList[25] = ['ZEHI', 'ZENBU', 'ZENZEN', 'ZETTAINI', 'ZONJIMASU', 'ZOU', 'ZU', 'ZUBON', 'ZUIBUN', 'ZUTSU', 'ZUTTO', ];