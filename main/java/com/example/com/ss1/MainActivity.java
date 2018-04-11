package com.example.com.ss1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView name;
    public final static String msg_key="com.example.com.ss1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] text={"Ankit","Ayush","Abhishek","Sakshi","Shurbhi","Divya","Abhay","Mansi","Puru","Kunal","ayushi","Tanu","Harsh","Rohit","ashish","Shivani","chirag"};


        name=(AutoCompleteTextView) findViewById(R.id.editText);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,text);
        name.setAdapter(adapter);
        Toast.makeText(this, "Developer Ankit", Toast.LENGTH_SHORT).show();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void future(View view) {
        String mesg = name.getText().toString();
        int len;
        len = mesg.length();


        int i, sum = 0;
        for (i = 0; i < len; i++) {


            if (mesg.charAt(i) == ' ') {
                sum += 0;
            } else if (mesg.charAt(i) == 'a' || mesg.charAt(i) == 'A' || mesg.charAt(i) == 'i' || mesg.charAt(i) == 'I' || mesg.charAt(i) == 'j' || mesg.charAt(i) == 'J' || mesg.charAt(i) == 'q' || mesg.charAt(i) == 'Q' || mesg.charAt(i) == 'y' || mesg.charAt(i) == 'Y') {
                sum += 1;
            } else if (mesg.charAt(i) == 'b' || mesg.charAt(i) == 'B' || mesg.charAt(i) == 'k' || mesg.charAt(i) == 'K' || mesg.charAt(i) == 'r' || mesg.charAt(i) == 'R') {
                sum += 2;
            } else if (mesg.charAt(i) == 'c' || mesg.charAt(i) == 'C' || mesg.charAt(i) == 'l' || mesg.charAt(i) == 'L' || mesg.charAt(i) == 'g' || mesg.charAt(i) == 'G' || mesg.charAt(i) == 's' || mesg.charAt(i) == 'S') {
                sum += 3;
            } else if (mesg.charAt(i) == 'd' || mesg.charAt(i) == 'D' || mesg.charAt(i) == 'm' || mesg.charAt(i) == 'M' || mesg.charAt(i) == 't' || mesg.charAt(i) == 'T') {
                sum += 4;
            } else if (mesg.charAt(i) == 'e' || mesg.charAt(i) == 'E' || mesg.charAt(i) == 'h' || mesg.charAt(i) == 'H' || mesg.charAt(i) == 'x' || mesg.charAt(i) == 'X'|| mesg.charAt(i) == 'N' || mesg.charAt(i) == 'n') {
                sum += 5;
            } else if (mesg.charAt(i) == 'u' || mesg.charAt(i) == 'U' || mesg.charAt(i) == 'v' || mesg.charAt(i) == 'V' || mesg.charAt(i) == 'w' || mesg.charAt(i) == 'W') {
                sum += 6;
            } else if (mesg.charAt(i) == 'o' || mesg.charAt(i) == 'O' || mesg.charAt(i) == 'z' || mesg.charAt(i) == 'Z') {
                sum += 7;
            } else if (mesg.charAt(i) == 'f' || mesg.charAt(i) == 'F' || mesg.charAt(i) == 'p' || mesg.charAt(i) == 'P') {
                sum += 8;
            } else {
                name.setText("");
                sum = 0;
                name.requestFocus();
                Toast.makeText(this, "Don't use any speacial character or digit.", Toast.LENGTH_LONG).show();
                break;
            }
        }
        if (sum == 0)
            Toast.makeText(this, "Don't use any special character or digit or leave blank", Toast.LENGTH_SHORT).show();
        else {


            String mj = null;
            switch (sum) {
                case 10:
                    mj = "apka naam pratistha aur aatmaviswas ka pratik hai . aise byakti apni ichhanusar burai ya bhalai ke liye samaj m jane jate .vaastav me aise byaktiyo me bahut aatmaviswas hota hai. Aise naam wale byakti jish bat ka nishchay kar lete hai, bo absya poora karte hai. Chanhe vo kam acchha ho ya bura ho.";
                    break;
                case 11:
                    mj = "aise naam ko subh nahi mana jata . aise naam wale byaktiyo ka man sthir nahin rahta. Aise naam wale byaktiyo ko anya logo se bhay aur dagabaji ki asanka rahti hai. Sath hi samay padne par aur apne labh ke liye dusro ko dhoka dene me bhi nahin hichkichate.";
                    break;
                case 12:
                    mj = "aise naam wale byakti manshik chinta aur byabharik jeevan me kasht milta hai. Aise naam wale byaktiyo se dusre log apne swarth pura karte hai. Bashtav me aise naam wale byakti balidaan ka prateek hote hai. Aise naam wale byakti dusro ka kam karne ke liye apni jindgi bhi daw par lagane se nahin hichkichate.";
                    break;
                case 13:
                    mj = "aise naam wale byakti pariwartanseelta(change) ka prateek hai. aise naam wale byakti apne bicharno aur karyakramo(yojanao) me sthir nahin rahte. Bastav me aise naam wale byakti apne kaam ko bade utsah me suru karte hai. Lekin manjil par pahuchne se phle hi unka utsah thanda padh jaata hai. Aise naam wale byakti jish sthan par rahte hai us sthan se bhi bahut jaldi oob jate hai aur badalne ke liye utable ho uthte hai. Bahut se logo ki aisi dharna hai ki yah ashubh naam hai, kintu bastav me aisi baat nahin hai aise naam wale byaktiyo me apurn sakti hoti hai aur yadi iska sahi upyog kiya jay to bahut upyogi ho sakta hai. Yadi sahi marg na mile to aise naam wale byakti viddhonsak ho sakte hai.";
                    break;

                case 14:
                    mj = "aise naam wale byaktiyo ko prakirtik prakop jaise aandhi, tufaan agni, bhukamp aadi ki aasanka rahti hai, vaise naam wale byaktiyo ko juye,satta ya latri se labh hone ki sambhavna hoti hai, kintu aise log atyant bhabukta ke prateek hote hai. Aise log bahut bhabuk hote hai. Or inki bhabukta se dusre log labh uthate hai. Aise naam wale vyakti bahut samajik hote hai  Aur kisi bhi samajik karya me khoobh hissa lete hai.";
                    break;
                case 15:
                    mj = "aise naam bale vyaktiyo ko rahsya se sambandhit kaha jaye to galat nhi hoga. Aise naam vyakti rahsyamay  aise naam bale vyakti rahsyapurn mantro ke gyata hote hai. Aise vyakti kab kya kar bethenge, is bare me kuchh nahi kaha ja sakta . ye log dusro se dhan pane aur paise kamane me safal hote hai. Sath hi ye log music aur art m bahut ruchi lete hai aur is area m bahut unnati karte hai.";
                    break;

                case 16:
                    mj = "aise naam wale log jis bhi area m kaam krte hai us jagah par bahut unnati(progress) krte hai lekin utani hi jalti avnati bhi krte hai. Ishliye aise logo ko jeevan m bahut savdhan rahna chhiye. Aise logo ko apne jeevan m achanak aane wali durghatnao(accidents) se savdhan rahna chahiye . aise log bahut romantic hote hai . bina  sochhe samjhe koi kaam krne se hamesha khatra rahta h. Aise logo ko hamesha mental tension(maaanasik tanaav) rahta hai.";
                    break;
                case 17:
                    mj = "apka naam self confidence ka pratik hai. Aise log jo ek baar kaam krne ka soch lete hai toh jab tak vo kaam pura na ho jaye use nahi chhodte hai. Inke jeevan ka har naya challenge inke jeevan m naya utsaah(confidence) le aata hai. Ye log hard working , kind , peaceful hote hai aur apne kaam se samaj m inhe yash milta hai. Future m Samaj m inka achha naam hota hai.";
                    break;

                case 18:
                    mj = "apka naam kalah aur satruta ka pratik hai. Aise log apne pariwar,dosto(friends) aur anya logo(other people) ki satruta se paresan rahte hai. Ye log satruta aur galat kaamo se dhan(money) kamane ka prayash krte hai. Lekin aise logo ko dhan ke mamle m bhagayaheen hi dekha gaya hai.";
                    break;
                case 19:
                    mj = "apka naam harsh,safalta(success),respect aur strong mental power ka pratik hai. Ye log simple family m janaam lete hai aur baad m inhe bahut success milti hai";
                    break;

                case 20:
                    mj = "apka naam jagrati. aur nyaay(justice) ka pratik hai. Ye log new planning aur possibilities ko sabko batate hai. Ye log kahi bhi kisi k sath ho rahe anyaay ko sahan nahi kar sakte hai.aise log sabhi ke sath ek saman vyavahar(behaviour) karte hai. Chaahe vo us byakti ka sagasambandhi kyu na ho. Aise logo ke dimag m hamesha nayi planning banti rahti hai.";
                    break;
                case 21:
                    mj = "apka naam success , respect, growth ka pratik hai. Aise log bahut jaldi jeevan m safal hote hai. Aur ye log hamesha success pane k prayas m lage rahte hai. Ye log apne kaamo ke dwara apne kul(family) ka naam rosan karte hai.";
                    break;

                case 22:
                    mj = "aise log jada emotional hote hai. Ye log kalpana lok(imaginary world) m adhik bhatakte rahte hai. Kuch kaam karne ki soch kar idhar – udhar ghumte rahte hai lekin last moment par hi vo kaam karte hai jab museebat(difficulties) sir par aa jatee hai. Ye log simple nature ke hote hai ki ye log bahut jaldi kisee par bhi vishvaas kar lete hai aur thoda sa kisi ko paresani m dekh turant uski help k liye tayar ho jate hai.";
                    break;
                case 23:
                    mj = "aise log ahmesha apne se jada strong , sampanna(wealthy) aur bade logo ki help se apna jeevan yapan(life span) karte hai. Ye log sahi direction milne par life m bahut growth karte hai. Ye log bahut hard working hote hai lekin inhe apni mahnat ka pura benefit nahi milta hai.";
                    break;
                case 24:
                    mj = "aise log apne higher officers/parents ki help se bahut unnati(success) prapta karte hai. Ye  log bahut satark(alert) hote hai. Ye log koi bhi kaam karne se pahle us kaam ko achhi tarah check kar lete hai baad m us kaam par hath daalte hai,";
                    break;

                case 25:
                    mj = "aise log apne personal experience k dwaara aur dusro k kraya vidhi ko bechkar apne kaam karne ka tarika banate hai aur iska apne jeevan m labh(benefit) lete hai. In logo ki starting life bahut sangharsh se bhari rahti hai baad m jakar inhe safalta miltee hai. In logo ka dimag bahut tez hota hai aur bahut hard working bhi hota hai. Ye log naye kaam ko sikhne m jara bhi hichkichaate(hesitate)  nahi hai isliye kafi mahnat k baad inhe safalata praapt karte hai.";
                    break;
                case 26:
                    mj = "ye log ko dusaro ki saajhedaaree(partnership), help se nuksan ho sakta hai . ye log bahut satark hote hai aur har kaam ko bahut achhe se samajhte hai phir bhi in logo ko un logo se dhoka uthaana pad sakta hai jin par inhe jada vishvaas hota hai.";
                    break;
                case 27:
                    mj = "aise log dimag se bahut strong aur tej hote hai . jis bhi jagah kaam karte hai uhaa high position praapt kar hi lete hai. Ye log agar dusaro ki salah par na chal kar khud hi kar kaam ke liye decision le toh bahut fayada hota hai.";
                    break;

                case 28:
                    mj = "aise log kisi bhi kaam m success paane ki liye bahut mahanat karte hai lekin thodi si bhi Galati sari mahanat ko kharab kar deti hai. Isliye aise logo ko kaam katam hone tak bahut satark(alert) rahna chahiye. In logo ko business m bahut alert rahna chahiye. In logo ko faltu k competition  m nahi panda chahiye aur dusaro ki baato m aa kar jhhagada, mukadame(court case) m nahi padana chahiye .";
                    break;
                case 29:
                    mj = "apka naam asthirta(instability)  or anishchayki isthati ka pratik hai. Ye log ek baat par sthir nahi hote hai. Aise logo k dost vishvaas k layak nahi hote hai bahut baar ye log apne dosto k karan kasht , haani(lose) hoti hai. In logo ko apne opposite gender se nuksaan uthaana pad sakta hai. Isliye in logo ko relationship m satark rahna chahiye.";
                    break;
                case 30:
                    mj = "ye log bahut pratibha sampanna hote hai aur inka dimag bhi bahut tej hota hai. Isliye inka dhan sangrah(money) ki oor inka  vishesh jhukab hota nahi hota hai lekin ye inka dhayan vidhya (knowledge) k oor hota hai. Inki I.Q. bahut tej rahta hai. Ye log aarthik rup ke samaanya hote hai.";
                    break;

                case 31:
                    mj = "ye log bahut pratibha sampanna hote hai aur ye log akele rahna pasand karte hai. In logo ko vyaaharik aur bhotik safalta nahi milti hai. Ye log svabhav se akele rahne wale aur darpok hote hai.";
                    break;
                case 32:
                    mj = "aise logo ka dimag bahut tez hota hai lekin ye log bahut alsi hote hai. Isliye ye log vahi baat kahte va karte hai jo dusre log kahte va karte hai. Agar ye log soch vichar kar koi yojana banaye aur us par kaam kare toh inhe bahut safalta mil sakti hai.";
                    break;

                case 33:
                    mj = "aise logo m bahut aatmaviwas hota hai. Aise log jis kraya ko karne ka soch lete h usko karne k liye puri lagan se lag jate hai aur kaam ko pura karte samaya aane wali sabhi paresaniyo ka samna karke apne kaam ko pura karte hai. Ye log apni mahnat, lagan va aatmaviswas se apni manjil par pahuchte hai.";
                    break;

                default:
                    mj="Devloper updating your name please put your feedback to devloper email.";

            }

            Intent intent = new Intent(this, Main3Activity.class);
            intent.putExtra(msg_key, mj);
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast toast=Toast.makeText(this,"Devloper Ankit",Toast.LENGTH_LONG);
            toast.show();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
