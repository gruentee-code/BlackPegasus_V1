package classes;

import javafx.scene.text.Font;

import java.awt.*;

// class created to save instances and variables;
public class Model {
    //Settings
    private static final int WindowWidth = 1000;
    private static final int WindowHeight = 540;
    private static final Font defaultFont = Font.font("Bell MT",22);

    private int myMoney = 100; // balance

    private int riotWilliam = 0;

    private boolean introFinished = false;
    private boolean randomPointsFinished = false;
    private String nickname = "def123";

    private String[] textCh1 = {"Chapter 1. The Prison","You wake up in a cell, captain. Of course, you don't remember what the hell happened yesterday, but the yellow cloth of the officers tells you that you are enprisoned by the Spanish fleet.\n" +
            "\n" +
            "You are in one of their fortifications in the Caribbean. God knows which of them...\n" +
            "\n" +
            "Trying to steady up your thoughts, you sit down and see that you're not alone in here. A dark sillhouette in the shades looks up at you from the corner of the room. It doesn't look like a human being until it stands up and walks towards you.\n",
            "- Hello, sir. I've heard much about you. And I've heard that you don't have a ship anymore.\n" +
                    "\n" +
                    "The sillhouette proves to be a huge man with scars and tattooes of different sea beasts.\n" +
                    "\n" +
                    "- I know how to help you out of this situation. I planned the escape out of this place and a few sailors of yours agreed overnight. I only want to be your right hand on your future new ship.\n" +
                    "\n" +
                    "Without saying a word, you give your new acquaintance a sign of agreement. However, you can't talk any longer, because another Spanish soldier came to you.\n",
            "As soon as you recover totally, your cellmate tells you what was on his mind. His plan is almost ready. He only needed a skillful captain to lead him and some more prisoners out of this hell.\n" +
                    "\n" +
                    "In a few days you get to know everyone who takes part in the escape plan. They seem to trust you more than William, your cellmate. That might be what he was talking about.\n" +
                    "\n" +
                    "In a few more nights, everything is ready for your escape. A riot at midnight gets the guards lost and you easily have your way to the small harboir at the fortress. The only way out is to take a ship and move away with all sails up.\n",
    "As soon as you get aboard, you have to take a riffle and shoot back to protect your people from enemy fire. Spanish soldiers are shooting at you, trying to weaken you as much as they can. Kill as many as you can in order to escape.\n" +
            "1) If less than 10 killed: You succeed in escaping but you can't go much too far. Another ship intercepts you and you cannot escape this time (GAME OVER).\n" +
            "2) If 10 to 19 killed: You succeed in escaping. Your crew is enough to maneuver and avoid enemy ships in the harbour or fight them back if necessary. But you will need to stop by a city to gather new sailors.\n" +
            "3) If more than 20 killed: You escape successfully. The ship has enough supplies for a whole month in open sea. You have just enough people to stand and face any problem and take any ship you meet in the Caribbean "};

    String[] textCh2 = {"Having torn off the flag of the Spanish empire, you arrive at an English city in order to gather some new crewmen in your team. Using all of the gold you got on your ship from her previous owners, you fullfill her needs by fortifying the body and gathering more skilled sailors, who though can't be trusted yet.\n" +
            "\n" +
            "After a day full of productive work, if you can say so, you are left in the middle of a small town under the light of the moon. There is only William besides you.\n" +
            "\n" +
            "- You are a good ol' dog, pal. I think I trust you enough to tell you a secret of mine.\n" +
            "\n" +
            "- What secret? - you ask.\n" +
            "\n" +
            "- Hm. - William thinks for a second longer. - Let's first get to the open sea. Have your time tonight. - and he leaves you alone, heading to your ship.\n"};

    String[] choiceCh2 = {"Go to tavern","Return to the ship and sleep"};

    String[] textCh2p1Intro = {"Entering the building you watch the things happening inside. A bunch of black musicians singing some hasty shuntee songs, a beautiful ample woman standing at the bar stand, tempting you to come get a drink and have a talk with her. In a corner there is an old man without a leg telling stories to a bunch of drunk people who gathered around him. In another part of the room you see a few people trying their luck with the dice. You check through your pockets. You have 100 Reals.\n"};

    String[] textBarmaid = {"- Hello, sweetheart. - says the woman as you approach her. - Want a drink?","You start drinking and listen to what people near you talk. Suddenly you ask the barmaid about the nearby islands.",
    "- Ha. - she smirks looking at you, but doesn't refuse you. - We are on a group of five small nameless islands. The biggest of them is located in the middle. We call it the \"open jaws\", because it looks like that. It is said to be haunted by the Black Pegasus. But I don't actually believe that, if you ask me.",
            "The smallest island is between the jaws to the east. An absolutely empty narrow line of sand. It only makes it difficult to stop in the bay.",
            "Our island is already known to you. North-east from the jaws. The only one where you can have fun. With me, for example. - she winks at you.",
            "And of course you have already heard of the Spanish fortress on the island to the west from here. I don't really know, what exactly they are looking for here. There are no aborigenes around. We are the only people living on the islands",
            "The last island is an empty spot to the south. May be an oasis, may be a prison. A lot of palmtrees, no animals besides seagulls. A mean place.",
            "Well, captain, now you know more about where you are.\n" +
                    "\n" +
                    "*after a few more minutes of talking with the barmaid, you leave her alone*\n"};

    String[] textOldMan = {"You approach the group of people around the one-legged man and listen.",
            "- It is said that the captain of the Black Pegasus was the devil himself. He got his ship alone by killing all the crew on it. All by himself! And then he brought the ship to the jaws. Without any crew. Doesn't seem to be true, captain? Maybe. Still it is true that the island hides his treasure till now. \n" +
                    "But be careful, the crew and the captain himself haunt the island after the ship sank. More than that, everyone who died in their attempts to get the chest, joined those already dead in protecting it.\n",
    "You have the right to trust anyone, but if it were me instead of you, I ain't have got the guts for that.\n" +
            "\n" +
            "*after staying there a little more, you leave them to themselves*"};
    String[] textDicePlayers = {"- Hey, cap. Want to roll dice with us? We throw the three dice up to three times. The one who won the round before a tie wins the tie and, as a result, wins the game."};

    String[] textCh3Intro = {"Off shore again. You are behind the man at the steering of the ship. She does not have a name for you yet, but it has a Spanish name you cannot even pronounce.","You see William approaching you. Again.",
            "- Hey, cap! - he says loudly, just so you can hear him above the sounds of the sea and the ship. - Remember wha'I told ya yesterday? Let's get aside.",
            "You agree, going with him to the borders of the upper deck. He stands very close to you, and you can see how serious he has got in just a moment. You notice the same lightening in his eyes as at the moment he was explaining the escape plan to you in the Spanish fortress.",
    "- You probably have already heard about the curse and the chest of the Black Pegasus. Well, I know its place. In one of two big caves on the highest peak of \"the jaws\". I can bring you there, if you make me your quartermeister"};

    String[] textCh3p1 = {"- I don't think I want you by my side. - you cut him off shortly, stinging with each word. - Encarcer him! - you yell at the sailors",
    "A few men, who did a less important job on the deck in your neighbourhood, came by swiftly and took William by the arms, wordlessly getting him to the orlop, under the deck."};
    String[] textCh3p2={"You don't answer, but your face changes into one of careful interest and attention. He notices that.",
    "- Well, yes, captain. I agree that you can want more details before taking such an important decision.",
            "The caves have beautiful sculpted archs at the entrance. Each with a symbol. You shall choose the one that the Black Pegasus wore on the sails.",
            "- What symbol was it? Do you know it? - you ask.\n" +
                    "\n" +
                    "- Make me your quartermeister, cap. Then we'll be talking. I will show it to you as soon as we arrive. - he lend his hand to you for a handshake.\n"};

    String[] textCh3p2p2 = {"You shake hands with your new quartermeister. From now on every command of yours is always repeated by him, so you don't need to yell at the team. Because he will do it."};

    String[] textCh5Intro = {"In the morning you leave. The island is getting smaller behind the back of your ship. Sailors singing while working.",
    "- Where are we moving, cap? - asked the one at the steer."};
    String[] textCh5p1 = {"- I think it's time we leave this place. - you answer.",
    "- And what about the treasure? - he asks again.",
            "- Let legends stay legends, my friend. Turn to south-west, all sails up, you bilge rats! - you yell smiling",
            "Under a good wind, your ship moves swiftly, and your crew is looking forward to new adventures. Singing and working. Working and singing."};
    String[] textCh5p2 = {"Soon enough, you stop on the shore of the biggest island. It looks beautiful to you. Having taken William and a few sailors from the ship, you head to the deepness of the forests, up the mountains.",
            "He did not lie. Two arches in the stone. Beautiful as hell. You watch the symbols, but they don't tell you a thing. You have no clue which is the one you need. You turn your eyes to William, and he points at the "};

    String[] textCh5p2p1 = {"You enter the cave. After walking a bit into the deepness, you hesitate. Just for a few moments, as your eyes catch the view a small crystal.",
            "It starts glowing brighter as it gathers energy from your torch. Soon the rock wall splits into two, opening an entrance into a room full of gold and precious stones, metals and things. That is a lot of money.",
            "You approach him and angrily take your sword out. He had no time to say a word. His blood spilled onto the floor and the gold."};
    String[] textCh5p2p2 = {"You go into the cave, and suddenly realize that there is no way out anymore. What kind of magic is this? What happened... Why did that happen?... You see something moving around. Ghosts. Though they seem to be harmless, because you can easily get through them, the swords they wear are real.",
            "They slaughter all of you. You can see your body fall. You can hold your sword. But you are one of them. A new protector of the treasures of the \"Black Pegasus\"."};

    public static int getWindowWidth() { return WindowWidth; }

    public static int getWindowHeight() { return WindowHeight; }

    public static Font getDefaultFont() { return defaultFont;}

    public int getMyMoney(){ return myMoney;} // get money
    public void setMyMoney(int newMoney){ myMoney = newMoney;} // set new balance
    public void changeMyMoney(int delta){  myMoney += delta;}

    public String[] getTextCh1(){return textCh1;}

    public String[] getTextCh2(){return textCh2;}

    public String[] getChoiceCh2() {return choiceCh2;}

    public String[][] getTextCh2p1(){
        String[][] textCh2p1 = new String[4][1];
        textCh2p1[0] = textCh2p1Intro;
        textCh2p1[1] = textBarmaid;
        textCh2p1[2] = textOldMan;
        textCh2p1[3] = textDicePlayers;
        return textCh2p1;
    }

    public String[][] getTextCh3(){
        String[][] textCh3 = new String[4][1];
        textCh3[0] = textCh3Intro;
        textCh3[1] = textCh3p1;
        textCh3[2] = textCh3p2;
        textCh3[3] = textCh3p2p2;
        return textCh3;
    }

    public String[][] getTextCh5(){
        String[][] textCh5 = new String[5][1];
        textCh5[0] = textCh5Intro;
        textCh5[1] = textCh5p1;

        String variant = "right";
        if(riotWilliam == 0) variant = "left";
        textCh5p2[textCh5p2.length-1] += variant;
        textCh5[2] = textCh5p2;
        if(variant.equals("left")) textCh5p2p1[textCh5p2p1.length-1] = "You look at him, and nod your head. He is worth your trust.";
        textCh5[3] = textCh5p2p1;
        textCh5[4] = textCh5p2p2;
        return textCh5;
    }

    public void setRiotWilliam(int value){ riotWilliam = value;}
    public int getRiotWilliam(){ return  riotWilliam;}

    public void setRandomPointsFinished(boolean randomPointsFinished) {
        this.randomPointsFinished = randomPointsFinished;
    }

    public boolean isRandomPointsFinished() {
        return randomPointsFinished;
    }

    public void setIntroFinished(boolean introFinished) {
        this.introFinished = introFinished;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
