package com.example.worldtour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.worldtour.Adapter.DivisionAdapter;
import com.example.worldtour.Model.DivisionModel;
import com.example.worldtour.TouchListener.RecyclerTouchListener;

import java.util.ArrayList;

public class SpotlistActivity extends AppCompatActivity {
    RecyclerView spotlistRv;
    DivisionAdapter spotlistAdapter;
    ArrayList<DivisionModel> spotlist = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotlist);

        spotlistRv = findViewById(R.id.spotlistRv);

        showlist();


        spotlistAdapter = new DivisionAdapter(this, spotlist);
        spotlistRv.setLayoutManager(new LinearLayoutManager(this));
        spotlistRv.setAdapter(spotlistAdapter);
        spotlistRv.setHasFixedSize(true);
        spotlistRv.addOnItemTouchListener(new RecyclerTouchListener(this, spotlistRv, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Toast.makeText(SpotlistActivity.this, "spot : " + spotlist.size(), Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SpotlistActivity.this, DetailsActivity.class)
                        .putExtra("detailsimage", spotlist.get(position).getImage())
                        .putExtra("detailsname", spotlist.get(position).getName())
                        .putExtra("detailsdescription", spotlist.get(position).getSpotnumber())
                );
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

    private void showlist() {


        String districtName = getIntent().getStringExtra("Districtname");


        int[] borgunaimage = {R.drawable.haringhatabarguna, R.drawable.bibichinishahimosque};

        int[] bholaimage = {R.drawable.monpuraisland, R.drawable.charkukrimukri, R.drawable.taruaislandbhola};

        int[] potuakhaliimage = {R.drawable.alipurkuakata, R.drawable.charbijoykuakata, R.drawable.leburchorkuakata, R.drawable.fatrarchorkuakata, R.drawable.kuakatapatuakhai, R.drawable.sonarchorpatuakhali};

        int[] jhalkathiimage = {R.drawable.saturiajamindarbari, R.drawable.kirtipashazamindarpalace, R.drawable.guavafloatingmarket};

        int[] pirojpurimage = {R.drawable.guavafloatingmarket};

        int[] borishalimage = {R.drawable.lakutiazamindarbaribarisal, R.drawable.oxfordmissionchurch, R.drawable.arifailmosque, R.drawable.satlabillbarisal, R.drawable.durgasagordighibarisal, R.drawable.guthiamosque};

        int[] ponchogorimage = {R.drawable.banglabandhazeropoint, R.drawable.bodeshshorimondir, R.drawable.rocksmuseum, R.drawable.tetuliadakbanglow, R.drawable.kaziteaestatetetulia, R.drawable.tetuliateagarden, R.drawable.mirzapurshahimosque, R.drawable.mirzapurshahimosque};

        int[] lalmonirhatimage = {R.drawable.nidariamasjidlalmonirhat, R.drawable.teestabarrage};

        int[] gaibandhaimage = {R.drawable.friendshipcentergaibandha};

        int[] nilfamariimage = {R.drawable.saidpurcatholicchurch, R.drawable.nilsagarnilphamari, R.drawable.chinimosquesaidpur, R.drawable.saidpurrailwayworkshop, R.drawable.teestabarrage};

        int[] dinajpurimage = {R.drawable.nawabganjnationalpark, R.drawable.dipshikhametischool, R.drawable.rajbaridinajpur, R.drawable.lichigardendinajpur, R.drawable.kantajirtempledinajpur, R.drawable.noyabadmosquedinajpur, R.drawable.ramsagardinajpur, R.drawable.shopnopuripicnicspotdinajpur, R.drawable.naodangazamindarbari};

        int[] kurigramimage = {R.drawable.ochingachkurigram, R.drawable.bhetarbandhzamindarbari, R.drawable.naodangazamindarbari};

        int[] rangpurimage = {R.drawable.ghaghotsenaproyashbinodonpark, R.drawable.vinnyajagatrangpur, R.drawable.harivangamango, R.drawable.tajhatpalacerangpur};

        int[] mymensinghimage = {R.drawable.saloraforest, R.drawable.mymensinghshoshilodge, R.drawable.meghmatvillageresort, R.drawable.alexandarcastle, R.drawable.zainulabedinart};

        int[] sherpurimage = {R.drawable.ghaznileisurecentersherpur, R.drawable.rajarpaharherpur, R.drawable.bonoraniforestresort, R.drawable.sherpurchildrenspark, R.drawable.modhutilaecoparksherpur};

        int[] netrokonaimage = {R.drawable.dingapotahaornetrokona, R.drawable.birishiri, R.drawable.somessoririver};

        int[] jamalpurimage = {R.drawable.gandhiashramjamalpur, R.drawable.luisvillageparkresort, R.drawable.lauchaprapicnicspot};

        int[] rajshahiimage = {R.drawable.varendraresearchmuseumrajshahi, R.drawable.baghamosquerajshahi, R.drawable.puthiarajbari};

        int[] sylhetimage = {R.drawable.mayabonsylhet, R.drawable.ratargulswampforest, R.drawable.dibirhaorsylhet, R.drawable.sukhtararesort, R.drawable.khadimnagarrainforestsylhet, R.drawable.hazratshahparanmazar, R.drawable.kulumchorasylhet, R.drawable.lakkaturateagardensylhet, R.drawable.malnicherrateagardensylhet, R.drawable.hazratshahjalalmazarsylhet, R.drawable.songrampunjijhornawaterfalljaflongsylhet, R.drawable.jaflongsylhet, R.drawable.ratargulswampforest, R.drawable.lovachorasylhet, R.drawable.utmachorasylhet, R.drawable.lalakhaladarbepari, R.drawable.lokkhochora02, R.drawable.bishnandiferryghat, R.drawable.bholaganjsadapathorsylhet, R.drawable.panthumaiadarbepari};

        int[] moulovibazarimage = {R.drawable.kalapaharmoulvibazar, R.drawable.pathariapahar, R.drawable.komolaranirdighirajnagar, R.drawable.adampurbitrajkandmoulovibazar, R.drawable.madhobkundowaterfallsylhet, R.drawable.lawacharanationalpark, R.drawable.humhumadarbepari, R.drawable.porikundawaterfall, R.drawable.hakalukihaorsylhet};

        int[] srimangalimage = {R.drawable.nishorgoecoresortsreemangal, R.drawable.dusairesortspaandvillas, R.drawable.siteshbabuszoo, R.drawable.lasuboncanyonsreemangal, R.drawable.hamidurrahmansreemangal, R.drawable.teamuseumsreemangal, R.drawable.lemongardensreemangal, R.drawable.sevenlayeredtea, R.drawable.baikkabillsreemangal, R.drawable.humhumadarbepari, R.drawable.madhobpurlake};

        int[] sunamgongimage = {R.drawable.paglaborojamemasjid, R.drawable.borderhaatsunamganj, R.drawable.simulbagansunamganj, R.drawable.barektilaunamganj, R.drawable.hasonrajamuseum, R.drawable.niladritekerghatsunamganj, R.drawable.tanguarhaorsunamganj, R.drawable.laurerr};

        int[] hobigongimage = {R.drawable.shankarpashashahimasjid, R.drawable.greenlandparkchunarughathabiganj, R.drawable.stacharinationalparkhabiganj, R.drawable.remakalenga};

        int[] khulnaimage = {R.drawable.swatchofnoground, R.drawable.sundarban, R.drawable.putniislandkhulna, R.drawable.padmabeelterkhadakhulna, R.drawable.karamjalsundarban, R.drawable.bangabondhuisland, R.drawable.dokkhindihi, R.drawable.kotkaseabeachsundarban};

        int[] kustiaimage = {R.drawable.robindrokuthibarikushtia, R.drawable.lalonmelakushtia};

        int[] bagerhatimage = {R.drawable.khanjahanalimazarbagerhat, R.drawable.sixdomedmosque, R.drawable.chunakholamosquebagerhat, R.drawable.dublarcharsundarban, R.drawable.bibibegnimosquebagerhat, R.drawable.chandramahalecopark, R.drawable.bagerhatzindapirmazar, R.drawable.ronobijoypurmosquebagerhat, R.drawable.bagerhatzindapirmazar, R.drawable.singairmosquebagerhat, R.drawable.monglaportbagerhat, R.drawable.karamjalsundarban, R.drawable.khanjahanalimazarbagerhat, R.drawable.kodlamathajoddhatemplebagerhat, R.drawable.sixtydomegombujmosquebagerhat, R.drawable.kotkaseabeachsundarban};

        int[] jashoreimage = {R.drawable.bharatrajardeul, R.drawable.chachrashibtemple, R.drawable.jessoregodkhaliflowermarket, R.drawable.michaelmadhusudanmodhupolli};

        int[] meherpurimage = {R.drawable.meherpurmujibnagar, R.drawable.amjhupineelkuthimeherpur, R.drawable.bhatparaneelkuthimeherpur};

        int[] maguraimage = {R.drawable.siddheswarimathmagura, R.drawable.maguravatervita, R.drawable.puthiarajbari};

        int[] satkhiraimage = {R.drawable.mozaffargardenresort, R.drawable.mandarbariaseabeachsatkhira, R.drawable.bongshipurshahimasjid};

        int [] dhakaimage = {R.drawable.termukhbridge,R.drawable.chayabithiresort,R.drawable.doleswarjamemosjid,R.drawable.takamuseum,R.drawable.baiturroufmasjid,R.drawable.southtownmasjid,R.drawable.insaralirkhudervat,R.drawable.sarighat,R.drawable.upsidedown,R.drawable.shaittabanayantree,R.drawable.gurdwarananak,R.drawable.baotharuttarkhan,R.drawable.nokshipollipurbachal,R.drawable.beautyboarding,R.drawable.curzonhall,R.drawable.rosegarden,R.drawable.bangladeshnationalmuseum,R.drawable.butterflygarden,R.drawable.botanicalgarden,R.drawable.fantasykingdom,R.drawable.nandanpark,R.drawable.hatirjheel,R.drawable.nirjhorresidentialarea,R.drawable.taramosque,R.drawable.dhakeshwaritemple,R.drawable.baldhagardendhaka,R.drawable.bangladeshairforcemuseum,R.drawable.jahangirnagaruniversitymigratotybirds,R.drawable.nationalmemorialjatiosritisoudho,R.drawable.martyredintellectualsmemorialrayerbazar,R.drawable.moinotghatpadmariver,R.drawable.hosenidalandhaka,R.drawable.ahsanmanjil,R.drawable.diabariuttara,R.drawable.golapbunchgolapgram,R.drawable.bhashaninovotheatredhaka,R.drawable.lal};

        int [] chittagongimage = {R.drawable.boaliatrail,R.drawable.boaliatrail,R.drawable.cafe24park,R.drawable.kumiraghatchittagong,R.drawable.horinmarajhornasitakunda,R.drawable.banshkhaliseabeach,R.drawable.sahebbibimasjidraozanchittagong,R.drawable.jamidarpalacenondirhatchittagong,R.drawable.jhorjhoritrailchittagong,R.drawable.lakeviewislandkaptai,R.drawable.medoshmunirashrom,R.drawable.guliakhaliseabeach,R.drawable.khejurtolabeachchittagong,R.drawable.sonaicharitrail,R.drawable.banshkhaliseabeach,R.drawable.chalandagiripath,R.drawable.hazarikhilwildlifeforest,R.drawable.baizidbostamimazar,R.drawable.minibangladeshkalurghat,R.drawable.sandwipchittagong,R.drawable.komoldohojhorna,R.drawable.sagolkandhajhorna,R.drawable.chondranathhill,R.drawable.batalihillchittagong,R.drawable.sohosrodharawaterfallsitakundu,R.drawable.suptodharajhornasitakunda,R.drawable.sitakunduecopark,R.drawable.mohamayalake,R.drawable.bhatiarylakechittagong,R.drawable.warcemeterychittagong,R.drawable.parkibeachchittagong,R.drawable.patengaseabeach,R.drawable.foyslake,R.drawable.napittachorawaterfall,R.drawable.khoiyachorawaterfallsjhornamirsarai};

        int [] coxsbazarimage = {R.drawable.radiantfishworldcoxsbazar,R.drawable.coxsbazar,R.drawable.moheshkhalicoxsbazar,R.drawable.ramurubbergarden,R.drawable.ramucoxsbazar,R.drawable.shamlapurseabeach,R.drawable.mermaidecoresort,R.drawable.shahporiislandcoxsbazar,R.drawable.sonadiaislandmaheshkhali,R.drawable.kutubdiaislandcoxsbazar,R.drawable.himchoriwaterfallcoxsbazar,R.drawable.inanibeachcoxsbazar,R.drawable.himchoricoxzbazar,R.drawable.dulahazrasafaripark,R.drawable.cheradwipsaintmartinisland,R.drawable.saintmartinislandbangladesh,R.drawable.moheshkhaliadinathmondir};


        int [] cumillaimage = {R.drawable.foyjunnesazamindarbari,R.drawable.magicparadisecomilla,R.drawable.dharmasagardighicomilla,R.drawable.mainamatimuseumcomilla,R.drawable.shalbanviharacomilla,R.drawable.moynamotiiworldwarsimetri};

        int [] khagrachoriimage = {R.drawable.mayabinilakekhagrachari,R.drawable.thandachorakhagrachhari,R.drawable.toilafangjhorna,R.drawable.horticultureparkkhagrachhari,R.drawable.hatimuramayungkopal,R.drawable.pancharishantipuraranyakutir,R.drawable.toiduchorajhorna,R.drawable.alutilacave,R.drawable.newzelandkhagrachori};

        int [] chadpurimage = {R.drawable.hilsafishchandpur,R.drawable.balakhalchowdhuribari};

        int [] nowakhaliimage = {R.drawable.gandhiashramtrustnoakhali,R.drawable.bazrashahimosquenoakhali,R.drawable.nijhumdwip,R.drawable.musapurcloser};

        int [] feniimage = {R.drawable.muhuriprojectfeni,R.drawable.borderhaatfeni,R.drawable.rubbergardenparshuramfeni,R.drawable.fenishamseralirbansherkellaresort,R.drawable.fenibijoysinghdighi};

        int [] brammonbariaimage = {R.drawable.shawapnadip,R.drawable.arifailmosque,R.drawable.haripurzamindarbari,R.drawable.borderhaatkasba,R.drawable.ghagutiapoddobeel};

        int [] lakmipurimage = {R.drawable.choralexander};

        int [] rangamatiiamge = {R.drawable.hilltajresortrangamati,R.drawable.rilitelkerangamati,R.drawable.furomonpaharangamati,R.drawable.polwelparkrangamati,R.drawable.tinmukhpillar,R.drawable.ghaghrajhornarangamati,R.drawable.toilafangjhorna,R.drawable.aronnokresortrangamati,R.drawable.rongrangrangamati,R.drawable.juracharirangamati,R.drawable.kattalibilllangadurangamati,R.drawable.muppachorawaterfallbelaicharirangamati,R.drawable.komlokjhorna,R.drawable.jhulontobridgerangamati,R.drawable.dhuppanijhorna,R.drawable.pedatingting,R.drawable.raikhonglakerangamati,R.drawable.shuvolongwaterfall,R.drawable.sajekvalley,R.drawable.hajachorajhorna};

        int [] bandarbanimage = {R.drawable.faipiwaterfall,R.drawable.saingprajhorna,R.drawable.thaankowainjhornajoomghor,R.drawable.boroitolitrail,R.drawable.kirstaungchimbuk,R.drawable.tuinumjhornaalikadambandarban,R.drawable.zingsiamsaitarbandarban,R.drawable.tajingdongbandarban,R.drawable.wangpajhornaalikadam,R.drawable.langlokwaterfallbandarban,R.drawable.shilabandhajhornaroangchoribandarban,R.drawable.likkhiyangwaterfallbandarban,R.drawable.sippiarsuangbandarban,R.drawable.baktlaijhornabandarban,R.drawable.naikhongchariupabanporjotonlake,R.drawable.velakhumbandarban,R.drawable.tinamjhornaalikadam,R.drawable.palongkhiyangjhorna,R.drawable.debotakhumbandarban,R.drawable.sairuhillresort,R.drawable.lamabandarban,R.drawable.prantiklake,R.drawable.marayendongalikadam,R.drawable.jogihaphong,R.drawable.baktlaijhornabandarban,R.drawable.narishyajhiriandharmanik,R.drawable.tinamjhornaalikadam,R.drawable.dimpaharalikadambandarban,R.drawable.tlabongjhorna,R.drawable.mowdokmualzowtlangbandarban,R.drawable.sakahaphongbandarban,R.drawable.satvaikhumbandarban,R.drawable.keokradongbandarban,R.drawable.chingrijhornabandarban,R.drawable.milonchoribandarban,R.drawable.amiakhumbandarban,R.drawable.chimbukhillbandarban,R.drawable.shailapropatbandarban,R.drawable.nafakhumbandarban,R.drawable.alicavealikadam,R.drawable.rupmuhuriwaterfalllikodombandarban,R.drawable.jadipauijhornabandarban,R.drawable.goldentemplebandarban,R.drawable.lungphervasaitarfallsbandarban,R.drawable.paindutinapsaitar,R.drawable.nilachalbandarban,R.drawable.meghlabandarban,R.drawable.nilgiribandarban,R.drawable.bogalakebandarban,R.drawable.rijukwaterfallbandarban,R.drawable.tindubandarban};

        int [] shoriotpurimage = {R.drawable.kartikpurzamindarbari};

        int [] foridputimage = {R.drawable.patrailmasjidfaridpur,R.drawable.mathurapurdeulfaridpur,R.drawable.balakhalchowdhuribari};

        int [] tangailimage = {R.drawable.nagarpurjomidarbari,R.drawable.twohundredonedomemosquetangail,R.drawable.korotiajomidarbari,R.drawable.dhanbarinawabpalacetangail,R.drawable.atiamosquetangail,R.drawable.rubberforestmadhupur,R.drawable.pineapplebazaramarketmodhupurtangail,R.drawable.moherajamidarbaritangail,R.drawable.jamunaresort};

        int [] munsigongimage = {R.drawable.sonarangjoramothmunshiganj,R.drawable.padmahemadhammunshiganj,R.drawable.meghnavillageholidayresort,R.drawable.vaggokuljamidarbari,R.drawable.babaadommosque,R.drawable.arialbeelmunshiganj,R.drawable.hilshafishmawaferighat,R.drawable.padmaresort,R.drawable.mawaresort,R.drawable.idrakpurfort};

        int [] manikgongimage = {R.drawable.betilazamindarbari,R.drawable.teotajamidarbarimanikganj,R.drawable.baliatipalacemanikganj,R.drawable.mustardoilflowermanikganj};

        int [] madaripurimage = {R.drawable.kulpoddizamindarbari,R.drawable.shokunilakemadaripur,R.drawable.rajaramtemplemadaripur,R.drawable.mithapurzamindarbari,R.drawable.amjhupineelkuthimeherpur};

        int [] norshingdiimage = {R.drawable.birshreshthamatiurrahmanmemorialmuseumnarsingdi,R.drawable.monumiazamindarbari,R.drawable.sonaimuriteknarsingdi,R.drawable.balapurzamindarbari,R.drawable.lokkhonsahazamindarbarinarsingdi,R.drawable.lotkongardennarsingdi,R.drawable.dreamholidayparknarsingdi,R.drawable.waribateshwarnarsingdi};

        int [] narayangongimage = {R.drawable.riberenoadventurecampsite,R.drawable.bishnandiferryghat,R.drawable.sodasodizamindarpalace,R.drawable.sonakandafortnarayanganj,R.drawable.hajiganjfortnarayanganj,R.drawable.kadamrasuldargah,R.drawable.shairagardenresort,R.drawable.mayadwipnarayanganj,R.drawable.kaikertek,R.drawable.muraparajamidarbari,R.drawable.lokonathbabaashrambarodi,R.drawable.folkartcraftmuseumsonargaon,R.drawable.banglartajmahalsonargaon,R.drawable.panamcitysonargaonnarayanganj,R.drawable.zindaparknarayanganj,R.drawable.araihazarchor};

        int [] gazipurimage = {R.drawable.srifaltolizamindarbarigazipur,R.drawable.sabahgardenresort,R.drawable.nokkhottrobariresort,R.drawable.shohagpalli,R.drawable.belaibillgazipur,R.drawable.chutiresort,R.drawable.anganaresortgazipur,R.drawable.rangamatiwaterfrontresortgazipur,R.drawable.gazipurbhawalnationalpark,R.drawable.gazipurbangabandhusafaripark,R.drawable.joljongolerkabbo,R.drawable.nuhashpolli};










        String[] rangpurspotname = {"সেনা প্রয়াশ পার্ক", "ভিন্নজগত", "হাড়িভাঙ্গা", "তাজহাট জমিদার বাড়ি"};

        String[] rajshahispotname = {"বরেন্দ্র গবেষনা জাদুঘর", "বাঘা মসজিদ", "পুঠিয়া রাজবাড়ি"};

        String[] dhakaspotname = {"তেরমুখ ব্রিজ", "ছায়াবীথি রিসোর্ট", "দোলেশ্বার জামে মসজিদ", "টাকা জাদুঘর", "বায়তুর রউফ মসজিদ", "সাউথ টাউন মসজিদ", "ইনসার আলীর খুদের ভাত", "সারিঘাট", "আপসাইড ডাউন গ্যালারী", "ষাইট্টা বটগাছ", "গুরুদুয়ারা নানকশাহী", " বাওথার", "নকশিপল্লী", "বিউটি বোর্ডিং", "কার্জন হল", "রোজ গার্ডেন", "বাংলাদেশ জাতীয় জাদুঘর", "প্রজাপতির বাগান", "বোটানিক্যাল গার্ডেন", "ফ্যান্টাসী কিংডম", "নন্দন পার্ক", "হাতিরঝিল", "নির্ঝর আবাসিক এলাকা", "তারা মসজিদ", "ঢাকেশ্বরী মন্দির", "বলধা গার্ডেন", "বিমান বাহিনী জাদুঘর", "পাখির বাড়ি জাহাঙ্গীরনগর", "জাতীয় স্মৃতিসৌধ", "বধ্যভূমি স্মৃতিসৌধ", "নট ঘাট", "হোসেনী দালান", "আহসান মঞ্জিল", "দিয়াবাড়ি", "গোলাপ গ্রাম", "নভোথিয়েটার", "লালবাগ কেল্লা"};

        String[] kishorgongspotname = {"শেখ সাদী জামে মসজিদ ", "ঈশা খাঁ’র জঙ্গলবাড়ি দূর্গ   ", "শেখ মাহমুদ শাহ মসজিদ   ", "মিঠামইন হাওর ", "কুতুব শাহ মসজিদ ", "নিকলী হাওর ", "অষ্টগ্রাম হাওর  "};

        String[] gazipurspotname = {"শ্রীফলতলী জমিদার বাড়ি ", "সাবাহ গার্ডেন রিসোর্ট   ", "নক্ষত্রবাড়ি রিসোর্ট ", " সোহাগ পল্লী  ", "বেলাই বিল ", "ছুটি রিসোর্ট ", " অঙ্গনা রিসোর্ট ", "রাঙামাটি ওয়াটার ফ্রন্ট রিসোর্ট ", "ভাওয়াল ন্যাশনাল পার্ক", "গাজীপুর সাফারি পার্ক ", " জল জঙ্গলের কাব্য", "নুহাশ পল্লী "};


        String[] nayangongspotname = {"রিবেরেনো এডভেঞ্চার ক্যাম্পসাইট ", "বিশনন্দী ঘাট   ", "সদাসদী জমিদার বাড়ি   ", "সোনাকান্দা কেল্লা ", "হাজীগঞ্জ কেল্লা ", "কদম রসুল দরগাহ ", "সায়রা গার্ডেন রিসোর্ট  ", "মায়াদ্বীপ ", "কাইকারটেক হাট", "মুড়াপাড়া জমিদার বাড়ি ", "লোকনাথ বাবার আশ্রম", "সোনারগাঁও যাদুঘর ", "বাংলার তাজমহল ", "পানাম নগর ", "জিন্দা পার্ক ", "চৌদ্দার চর, আড়াইহাজার "};

        String[] norsingdispotname = {"বীরশ্রেষ্ঠ মতিউর রহমান স্মৃতি জাদুঘর ", "মনু মিয়া জমিদার বাড়ি   ", "সোনাইমুড়ি টেক ", " নবীন চন্দ্র সাহা জমিদার বাড়ি  ", "লক্ষণ সাহার জমিদার বাড়ি ", "লটকন বাগান ", "ড্রিম হলিডে পার্ক  ", "উয়ারী বটেশ্বর "};

        String[] madaripurspotname = {"কুল্পদ্দি জমিদার বাড়ি", "শকুনি লেক", "রাজারাম মন্দির", "মিঠাপুর জমিদার বাড়ি", "নীল কুঠি"};

        String[] manikgongspotname = {"বেতিলা জমিদার বাড়ি ", "তেওতা জমিদার বাড়ি   ", "বালিয়াটি জমিদার বাড়ি   ", "সরিষা ক্ষেত, ঝিটকা "};

        String[] munsigongspotname = {"সোনারং জোড়া মঠ ", "পদ্মহেম ধাম   ", "মেঘনা ভিলেজ হলিডে রিসোর্ট   ", "ভাগ্যকুল জমিদার বাড়ি ", "হযরত বাবা আদম শহীদ (র.) এর মসজিদ ", "আড়িয়াল বিল ", "মাওয়া ফেরি ঘাট  ", "পদ্মা রিসোর্ট ", "মাওয়া রিসোর্ট", "ইদ্রাকপুর কেল্লা "};

        String[] tangailspotname = {"নাগরপুর জমিদার বাড়ি ", "২০১ গম্বুজ মসজিদ   ", "করটিয়া জমিদার বাড়ি ", "ধনবাড়ী নবাব প্যালেস   ", "আতিয়া জামে মসজিদ ", "মধুপুরের রাবার বাগান ", "আনারসের হাট, জলছত্র  ", "মহেরা জমিদার বাড়ি ", "যমুনা রিসোর্ট"};

        String[] foridpurspotname = {"পাতরাইল মসজিদ ", "পাতরাইল মসজিদ   ", "পাতরাইল মসজিদ   "};

        String[] shoriotpurspotname = {"কার্তিকপুর জমিদার বাড়ি "};

        String[] chittagongspotname = {"বোয়ালিয়া ট্রেইল ", "বোয়ালিয়া ট্রেইল ", "ক্যাফে ২৪ পার্ক   ", "কুমিরা ঘাট   ", "হরিণমারা হাঁটুভাঙ্গা ট্রেইল ", "বাঁশখালী ", "সাহেব বিবি মসজিদ, রাউজান ", "নন্দীরহাট জমিদার বাড়ি  ", "ঝরঝরি ট্রেইল ", "লেক ভিউ আইল্যান্ড ,কাপ্তাই", "মেধস মুনির আশ্রম ", "গুলিয়াখালী সমুদ্র সৈকত ", "খেজুরতলা বীচ ", "সোনাইছড়ি ট্রেইল ", "বাঁশবাড়িয়া সমুদ্র সৈকত ", "চালন্দা গিরিপথ ", "হাজারিখিল অভয়ারণ্য ", "বায়েজিদ বোস্তামীর মাজার ", "মিনি বাংলাদেশ, কালুর ঘাট ", "সন্দ্বীপ ", "কমলদহ ঝর্ণা ", "ছাগলকান্দা ঝর্ণা ", "চন্দ্রনাথ পাহাড়   ", "বাটালি হিল   ", "সহস্রধারা ঝর্ণা ", "সুপ্তধারা ঝর্ণা ", "সীতাকুণ্ড ইকো পার্ক ", "মহামায়া লেক  ", "ভাটিয়ারী লেক ", "ওয়ার সিমেট্রি", "পারকি সমুদ্র সৈকত ", "পতেঙ্গা সমুদ্র সৈকত ", "ফয়েজ লেক ", "নাপিত্তাছড়া ট্রেইল – কুপিকাটাকুম, মিঠাছড়ি এবং বান্দরকুম ঝর্ণা ", "খৈয়াছড়া ঝর্ণা "};

        String[] coxsbazarspotname = {"রেডিয়েন্ট ফিস ওয়ার্ল্ড ", "কক্সবাজার সমুদ্র সৈকত   ", "মহেশখালী দ্বীপ ", "রামু রাবার বাগান   ", "রামু বৌদ্ধ বিহার ", "শামলাপুর সমুদ্র সৈকত ", "মারমেইড ইকো রিসোর্ট  ", "শাহপরীর দ্বীপ ", "সোনাদিয়া দ্বীপ", "কুতুবদিয়া দ্বীপ ", "হিমছড়ি ঝর্ণা ", "ইনানী বীচ ", "হিমছড়ি ", "ডুলাহাজরা সাফারি পার্ক ", "ছেড়া দ্বীপ ", "সেন্টমার্টিন দ্বীপ ", "আদিনাথ মন্দির, মহেশখালী "};

        String[] cumillaspotname = {"নওয়াব ফয়জুন্নেসা জমিদার বাড়ি ", "ম্যাজিক প্যারাডাইস পার্ক   ", "ধর্মসাগর দীঘি   ", "ময়নামতি জাদুঘর ", "শালবন বৌদ্ধ বিহার ", "ময়নামতি ওয়ার সিমেট্রি "};

        String[] khagrachorispotname = {"মায়াবিনী লেক ", "ঠান্ডা ছড়া   ", "তৈলাফাং ঝর্ণা   ", "হর্টিকালচার পার্ক ", "হাতি মাথা / হাতিমুড়া ", "শান্তিপুর অরণ্য কুটির ", "তৈদুছড়া ঝর্ণা  ", "আলুটিলা গুহা ", "নিউজিল্যান্ড পাড়া"};

        String[] chadpurspotname = {"ইলিশের দেশে ", "বলাখাল জমিদার বাড়ি   "};

        String[] noakhalispotname = {"গান্ধী আশ্রম ট্রাস্ট ", "বজরা শাহী মসজিদ   ", "নিঝুম দ্বীপ   ", "মুছাপুর ক্লোজার "};

        String[] fenispotname = {"মুহুরী প্রজেক্ট ", "ছাগলনাইয়া বর্ডার হাট   ", " রাবার বাগান, পরশুরাম  ", "শমসের গাজীর বাঁশের কেল্লা রিসোর্ট ", "বিজয় সিংহ দীঘি "};

        String[] brammonbarispotname = {"স্বপ্নদ্বীপ ", " আরিফাইল মসজিদ  ", "হরিপুর জমিদার বাড়ি   ", "বর্ডার হাট, কসবা ", "ঘাগুটিয়ার পদ্মবিল "};

        String[] rangamatispotname = {"হিল তাজ রিসোর্ট ", "রিলিতে লেক   ", "ফুরমোন পাহাড়   ", "পলওয়েল পার্ক এন্ড কটেজ ", "তিনমুখ পিলার ", "ঘাগড়া ঝর্ণা  ", "গাছকাটা ঝর্ণা ", "আরণ্যক রিসোর্ট", "রঙরাং ", "জুরাছড়ি ", "লংগদু ", "মুপ্পোছড়া ঝর্ণা ", "কমলক ঝর্ণা ", "ঝুলন্ত সেতু ", "ধুপপানি ঝর্ণা ", "পেদা টিং টিং ", "রাইখং লেক ", "শুভলং ঝর্ণা ", "সাজেক ভ্যালি", "হাজাছড়া ঝর্ণা"};

        String[] bandarbanspotname = {"ফাইপি ঝর্ণা ", "সাইংপ্রা ঝর্ণা   ", " থানকোয়াইন ঝর্ণা  ", "বরইতলী ট্রেইল ", "কির্সতং ", "তুইনুম ঝর্ণা ", " জিংসিয়াম সাইতার ", "তাজিংডং ", "ওয়াং-পা ঝর্ণা ", "লাংলোক ঝর্ণা ", "শীলবান্ধা ঝর্ণা ", "লিখ্যিয়াং ঝর্ণা ", "সিপ্পি আরসুয়াং ", "মুনলাই পাড়া, রুমা ", "নাইক্ষ্যংছড়ি উপবন পর্যটন লেক ", "ভেলাখুম ", "তিনাম ঝর্ণা ", "পালং খিয়াং ঝর্ণা ", "দেবতাখুম ", "সাইরু হিল রিসোর্ট ", "লামা ", "প্রান্তিক লেক ", "মারাইথং ", "কংদুক বা যোগী হাফং ", "বাকলাই ঝর্ণা ", "আন্ধারমানিক ", "দামতুয়া ঝর্ণা ", "ডিম পাহাড় ", "ডাবল ফলস ", "জোতলাং/মোদক মুয়াল ", "সাকা হাফং পর্বত ", "সাতভাইখুম ", "কেওক্রাডং ", "চিংড়ি ঝর্ণা ", "মিলনছড়ি ", "আমিয়াখুম জলপ্রপাত ", "চিম্বুক ", "শৈল প্রপাত ", "নাফাখুম জলপ্রপাত ", "আলীর সুড়ঙ্গ ", "রূপমুহুরী ঝর্ণা ", "জাদিপাই ঝর্ণা ", " স্বর্ণমন্দির  ", "লুং ফের ভা সাইতার ঝর্ণা   ", "তিনাপ সাইতার ", "নীলাচল ", "মেঘলা পর্যটন কেন্দ্র ", "নীলগিরি  ", "বগা লেক ", "ঋজুক ঝর্ণা ", "তিন্দু "};

        String[] lakmipurspotname = {"চর আলেকজান্ডার"};

        String[] khulnaspotname = {"সোয়াচ অব নো গ্রাউন্ড ", "সুন্দরবন   ", "পুটনী আইল্যান্ড   ", "ভূতিয়ার পদ্মবিল, তেরখাদা ", "করমজল পর্যটন কেন্দ্র ", "বঙ্গবন্ধু আইল্যান্ড ", "রবীন্দ্রনাথের শ্বশুরবাড়ি, দক্ষিণডিহি ", "কটকা সমুদ্র সৈকত  "};

        String[] kustiaspotname = {"রবীন্দ্র কুঠিবাড়ি ", "ফকির লালন সাঁইজির মাজার"};

        String[] bagerhatspotname = {"খাঞ্জেলী দীঘি ", "ছয় গম্বুজ মসজিদ   ", "চুনাখোলা মসজিদ   ", "দুবলার চর ", "বিবি বেগনী মসজিদ ", "চন্দ্রমহল ইকো পার্ক ", " চন্দ্রমহল ইকো পার্ক ", "রনবিজয়পুর মসজিদ ", "জিন্দা পীরের মাজার ", "সিংগাইর মসজিদ ", "মংলা পোর্ট ", "করমজল পর্যটন কেন্দ্র ", "খানজাহান আলীর (রঃ) মাজার ", "কোদলা মঠ / অযোধ্যা মঠ ", "ষাট গম্বুজ মসজিদ ", "কটকা সমুদ্র সৈকত "};

        String[] joshorspotname = {"ভরত রাজার দেউল ", "চাঁচড়া শিব মন্দির   ", "ফুলের রাজধানী গদখালী   ", "মধুসূদন দত্তের মধুপল্লী "};

        String[] meherpurspotname = {"মুজিবনগর ", "আমঝুপি নীলকুঠি   ", "ভাটপাড়া নীলকুঠি   "};

        String[] maguraspotname = {"সিদ্ধেশ্বরী মঠ ", "মাগুরার ভাতের ভিটা   ", "শ্রীপুর জমিদার বাড়ি   "};

        String[] satkhiraspotname = {"মোজাফফর গার্ডেন এন্ড রিসোর্ট ", "মান্দারবাড়িয়া সমুদ্র সৈকত   ", "বংশীপুর শাহী মসজিদ "};

        String[] sylhetspotname = {"জুগিরকান্দি মায়াবন ", "রাতারগুল হলিডে হোম   ", "ডিবির হাওর  ", "শুকতারা প্রকৃতি নিবাস ", "খাদিমনগর ন্যাশনাল পার্ক ", "হযরত শাহ পরাণ (রাঃ) এর মাজার ", "কুলুমছড়া  ", "লাক্কাতুরা চা বাগান ", "মালনীছড়া চা বাগান ", "হযরত শাহজালাল (রঃ) মাজার ", "সংগ্রামপুঞ্জি ঝর্ণা ", "জাফলং ", "রাতারগুল সোয়াম্প ফরেস্ট ", "লোভাছড়া ", "উৎমাছড়া ", "লালাখাল ", "লক্ষনছড়া ", "বিছনাকান্দি ", "ভোলাগঞ্জ ", "পান্থুমাই ঝর্ণা "};

        String[] moulovibazarspotname = {"কালাপাহাড় ", "পাথারিয়া পাহাড়   ", "কমলা রানীর দিঘী, রাজনগর   ", "আদমপুর বন ", "মাধবকুন্ড ঝর্ণা ", "লাউয়াছড়া জাতীয় উদ্যান ", "হাম হাম ঝর্ণা  ", "পরিকুণ্ড ঝর্ণা ", "হাকালুকি হাওর "};

        String[] srimongolspotname = {"নিসর্গ ইকো রিসোর্ট ", "দুসাই রিসোর্ট এন্ড স্পা   ", "সিতেশ বাবুর চিড়িয়াখানা   ", "লাসুবন গিরিখাত ", "বীরশ্রেষ্ঠ সিপাহী হামিদুর রহমান স্মৃতিসৌধ ", "চা জাদুঘর ", "লেমন গার্ডেন রিসোর্ট  ", "নীলকণ্ঠ টি কেবিনের সাতরঙের চা ", "বাইক্কা বিল ", "লাউয়াছড়া জাতীয় উদ্যান ", "হাম হাম ঝর্ণা ", "মাধবপুর লেক "};

        String[] sunamgongspotname = {"পাগলা বড় জামে মসজিদ ", "বর্ডার হাট, সুনামগঞ্জ   ", "শিমুল বাগান   ", "বারিক্কা টিলা ", "হাসন রাজার জাদুঘর ", "কেয়ারি – লাইমস্টোন লেক, টেকেরঘাট ", "টাঙ্গুয়ার হাওর  ", "লাউড়ের গড় "};

        String[] hobigongspotname = {"শংকরপাশা শাহী মসজিদ ", "গ্রীনল্যান্ড পার্ক   ", "সাতছড়ি জাতীয় উদ্যান   ", "রেমা-কালেঙ্গা অভয়ারণ্য "};

        String[] barishalspotname = {"লাকুটিয়া জমিদার বাড়ি ", "অক্সফোর্ড মিশন গির্জা   ", "মিয়াবাড়ি জামে মসজিদ   ", "শাপলা গ্রাম, সাতলা ", "দুর্গাসাগর দীঘি ", "গুঠিয়া মসজিদ "};

        String[] pirojpurspotname = {"ভাসমান পেয়ারা বাজার "};

        String[] jhalkathispotname = {"সাতুরিয়া জমিদার বাড়ি ", "কীর্তিপাশা জমিদার বাড়ি   ", "ভাসমান পেয়ারা বাজার   "};

        String[] potuakhalispotname = {"আলীপুর মাছ বাজার", "চর বিজয়   ", "লেবুর চর   ", "ফাতরার চর ", "কুয়াকাটা সমুদ্র সৈকত", "সোনারচর "};

        String[] volaspotname = {"মনপুরা দ্বীপ ", "চর কুকরি মুকরি   ", "তারুয়া সমুদ্র সৈকত   "};

        String[] borgunaspotname = {"হরিনঘাটা পর্যটন কেন্দ্র ", "বিবিচিনি শাহী মসজিদ"};

        String[] maymensinghspotname = {"ছালড়া শালবন ", "শশী লজ   ", "মেঘমাটি ভিলেজ রিসোর্ট   ", "আলেকজান্ডার ক্যাসেল ", "জয়নুল আবেদীন সংগ্রহশালা "};

        String[] sherpurspotname = {"গজনী অবকাশ কেন্দ্র ", "রাজার পাহাড়   ", "বনরাণী ফরেস্ট রিসোর্ট ", "চুকু লুপি চিলড্রেন্স পার্ক   ", "মধুটিলা ইকোপার্ক "};

        String[] netrokonaspotname = {"ডিঙ্গাপোতা হাওর ", "চীনামাটির পাহাড়, বিরিশিরি   ", "সোমেশ্বরী নদী, দুর্গাপুর   "};

        String[] jamalpurspotname = {"গান্ধী আশ্রম ", "লুইস ভিলেজ রিসোর্ট এন্ড পার্ক   ", "লাউচাপড়া অবকাশ কেন্দ্র   "};

        String[] kurigramspotname = {"অচিন গাছ ", "ভেতরবন্দ জমিদার বাড়ি   ", "নাওডাঙ্গা জমিদার বাড়ি   "};

        String[] dinajpurspotname = {"নবাবগঞ্জ জাতীয় উদ্যান ", "দীপশিখা মেটি স্কুল   ", "রাজবাড়ী, দিনাজপুর   ", "লিচু বাগান ", "কান্তজীর মন্দির ", "নয়াবাদ মসজিদ ", "রামসাগর দীঘি ", "স্বপ্নপুরী পিকনিক স্পট  ", "নওডাঙ্গা জমিদার বাড়ি"};

        String[] nilfamarispotname = {"ক্যাথলিক গির্জা, সৈয়দপুর   ", "নীলসাগর ", "চিনি মসজিদ ", "রেলওয়ে কারখানা   ", "তিস্তা ব্যারেজ "};

        String[] gaibandhaspotname = {"ফ্রেন্ডশিপ সেন্টার"};

        String[] lalmonirhatspotname = {"নিদারিয়া মসজিদ", "তিস্তা ব্যারেজ "};

        String[] ponchogorspotname = {" বাংলাবান্ধা জিরো পয়েন্ট", "  বোদেশ্বরী মন্দির ", " রকস মিউজিয়াম  ", "তেঁতুলিয়া ডাক বাংলো ", "কাজী এন্ড কাজী টি স্টেট, তেতুলিয়া ", "তেতুলিয়া চা বাগান ", "মির্জাপুর শাহী মসজিদ  ", " পঞ্চগড় থেকে কাঞ্চনজঙ্ঘা"};

        String[] chapaispotname = {"দারাসবাড়ি মসজিদ", "  ছোট সোনা মসজিদ ", " আল্পনা গ্রাম  ", " খনিয়াদিঘি মসজিদ", "কানসাট আম বাজার "};

        String[] pabnaspotname = {"তাড়াশ ভবন ", "গাজনার বিল", "পাকশী হার্ডিঞ্জ ব্রীজ", "পাকশী রিসোর্ট ", "চলন বিল ", "চাটমোহর শাহী মসজিদ"};

        String[] boguraspotname = {"মহাস্থানগড়", "বেহুলার বাসর ঘর"};

        String[] naugaspotname = {"কুসুম্বা মসজিদ", "বলিহার রাজবাড়ি", "দিবর দীঘি", "ডানা পার্ক", "পাহাড়পুর জাদুঘর", "আলতাদীঘি", "পাহাড়পুর বৌদ্ধ বিহার"};

        String[] natorespotname = {" হালতির বিল", " উত্তরা গণভবন", " চলন বিল"};

        String[] jaipurhatspotname = {"বারশিবালয় মন্দির", "হিন্দা কসবা শাহী মসজিদ"};

        String[] sirajgongspotname = {"চায়না বাঁধ", " হাটিকুমরুলের নবরত্ন মন্দির", "চলন বিল"};


        String[] dhakaspotdetails = getResources().getStringArray(R.array.dhaka_spot);
        String[] kishorgongdetails = getResources().getStringArray(R.array.kishorgong_spot_details);
        String[] gazipur = getResources().getStringArray(R.array.gazipur_spot_details);
        String[] narayangongdetails = getResources().getStringArray(R.array.narayangong_spot_details);
        String[] norsingdidetails = getResources().getStringArray(R.array.norsingdi_spot_details);
        String[] madaripurdetails = getResources().getStringArray(R.array.madaripur_spot_details);
        String[] manikgongdetails = getResources().getStringArray(R.array.manikgong_spot_details);
        String[] munsigongdetails = getResources().getStringArray(R.array.munsigong_spot_details);
        String[] tangaildetails = getResources().getStringArray(R.array.tangail_spot_details);
        String[] foridpurdetails = getResources().getStringArray(R.array.foridpur_spot_details);
        String[] shoriotpurdetails = getResources().getStringArray(R.array.shoriyotpur_spot_details);

        // chittagong start and dhaka finished....................................

        String[] chittagnogdetails = getResources().getStringArray(R.array.Chittagong_spot_details);
        String[] coxsbazardetails = getResources().getStringArray(R.array.coxsbazar_spot_details);
        String[] cumilladetails = getResources().getStringArray(R.array.cumilla_spot_details);
        String[] khagrachoridetails = getResources().getStringArray(R.array.Khagrachori_spot_details);
        String[] chadpurdetails = getResources().getStringArray(R.array.Chadpur_spot_details);
        String[] noyakhalidetails = getResources().getStringArray(R.array.Noyakhali_spot_details);
        String[] fenidetails = getResources().getStringArray(R.array.Feni_spot_details);
        String[] brammonbariadetails = getResources().getStringArray(R.array.Brammonbaria_spot_details);
        String[] rangamatidetails = getResources().getStringArray(R.array.Rangamati_spot_details);
        String[] bandarbandetails = getResources().getStringArray(R.array.Bandarban_spot_details);
        String[] lakhmipurdetails = getResources().getStringArray(R.array.Lakhmipur_spot_details);


        // khulna start and chittagong finished............................


        String[] khulnadetails = getResources().getStringArray(R.array.khulna_spot_details);
        String[] kustiadetails = getResources().getStringArray(R.array.kustia_spot_details);
        String[] bagerhatdetails = getResources().getStringArray(R.array.bagerhat_spot_details);
        String[] joshoredetails = getResources().getStringArray(R.array.jashore_spot_details);
        String[] meherpurdetails = getResources().getStringArray(R.array.meherpur_spot_details);
        String[] maguradetails = getResources().getStringArray(R.array.magura_spot_details);
        String[] satkhiradetails = getResources().getStringArray(R.array.satkhira_spot_details);

        // sylhet start and khulna finished.................................

        String[] sylhetdetails = getResources().getStringArray(R.array.sylhet_spot_details);
        String[] moulovibazardetails = getResources().getStringArray(R.array.moulovibazar_spot_details);
        String[] srimangaldetails = getResources().getStringArray(R.array.srimongol_spot_details);
        String[] sunamgongdetails = getResources().getStringArray(R.array.sunamgong_spot_details);
        String[] hobigongdetails = getResources().getStringArray(R.array.hobigong_spot_details);

        // rajshahi start and sylhet finished..................................


        String[] rajshahidetails = getResources().getStringArray(R.array.rajshahi_spot_details);
        String[] chapaidetails = getResources().getStringArray(R.array.chapainawabgong_spot_details);
        String[] pabnadetails = getResources().getStringArray(R.array.pabna_spot_details);
        String[] boguradetails = getResources().getStringArray(R.array.bogura_spot_details);
        String[] sirajgongdetails = getResources().getStringArray(R.array.sirajgong_spot_details);
        String[] joipurhatdetails = getResources().getStringArray(R.array.jaipurhat_spot_details);
        String[] natoredetails = getResources().getStringArray(R.array.natore_spot_details);
        String[] nougaondetils = getResources().getStringArray(R.array.naugaon_spot_details);

        // mymensingh start and rajshahi finished....................


        String[] mymensinghdetails = getResources().getStringArray(R.array.mymensingh_spot_details);
        String[] sherpurdetails = getResources().getStringArray(R.array.sherpur_spot_details);
        String[] netrokonadetails = getResources().getStringArray(R.array.netrokona_spot_details);
        String[] jamalpurdetails = getResources().getStringArray(R.array.jamalpur_spot_details);


        // randpur start and mymensingh finished......................

        String[] rangpurdetails = getResources().getStringArray(R.array.rangpur_spot_details);
        String[] kurigramdetails = getResources().getStringArray(R.array.kurigram_spot_details);
        String[] dinajpurdetails = getResources().getStringArray(R.array.dinagpur_spot_details);
        String[] nilfamaridetails = getResources().getStringArray(R.array.nilfamari_spot_details);
        String[] gaibandhadetails = getResources().getStringArray(R.array.gaibandha_spot_details);
        String[] lalmonirhatdetails = getResources().getStringArray(R.array.lalmonirhat_spot_details);
        String[] ponchogordetails = getResources().getStringArray(R.array.ponchogor_spot_details);

        // barishal start and rangpur finished......................

        String[] barishaldetails = getResources().getStringArray(R.array.barishal_spot_details);
        String[] pirojpurdetails = getResources().getStringArray(R.array.pirojpur_spot_details);
        String[] jhalkathidetails = getResources().getStringArray(R.array.jhalkathi_spot_details);
        String[] potuakhalidetails = getResources().getStringArray(R.array.potuakhali_spot_details);
        String[] bholadetails = getResources().getStringArray(R.array.bhola_spot_details);
        String[] borgunadetails = getResources().getStringArray(R.array.borguna_spot_details);

        // all details finished.............................


        if (districtName.equals("ঢাকা")) {
            for (int i = 0; i < dhakaspotdetails.length; i++) {
                spotlist.add(new DivisionModel(dhakaspotname[i], dhakaspotdetails[i], dhakaimage[i]));
            }
        } else if (districtName.equals("কিশোরগঞ্জ")) {
            for (int i = 0; i < kishorgongdetails.length; i++) {
                spotlist.add(new DivisionModel(kishorgongspotname[i], kishorgongdetails[i], R.drawable.lal));
            }
        } else if (districtName.equals("গাজীপুর")) {
            for (int i = 0; i < gazipur.length; i++) {
                spotlist.add(new DivisionModel(gazipurspotname[i], gazipur[i], gazipurimage[i]));
            }
        } else if (districtName.equals("নারায়ণগঞ্জ")) {
            for (int i = 0; i < narayangongdetails.length; i++) {
                spotlist.add(new DivisionModel(nayangongspotname[i], narayangongdetails[i], narayangongimage[i]));
            }
        } else if (districtName.equals("নরসিংদী")) {
            for (int i = 0; i < norsingdidetails.length; i++) {
                spotlist.add(new DivisionModel(norsingdispotname[i], norsingdidetails[i], norshingdiimage[i]));
            }
        } else if (districtName.equals("মাদারিপুর")) {
            for (int i = 0; i < madaripurdetails.length; i++) {
                spotlist.add(new DivisionModel(madaripurspotname[i], madaripurdetails[i],madaripurimage[i]));
            }
        } else if (districtName.equals("মানিকগঞ্জ")) {
            for (int i = 0; i < manikgongdetails.length; i++) {
                spotlist.add(new DivisionModel(manikgongspotname[i], manikgongdetails[i], manikgongimage[i]));
            }
        } else if (districtName.equals("মুন্সিগঞ্জ")) {
            for (int i = 0; i < munsigongdetails.length; i++) {
                spotlist.add(new DivisionModel(munsigongspotname[i], munsigongdetails[i], munsigongimage[i]));
            }
        } else if (districtName.equals("টাঙ্গাইল")) {
            for (int i = 0; i < tangaildetails.length; i++) {
                spotlist.add(new DivisionModel(tangailspotname[i], tangaildetails[i], tangailimage[i]));
            }
        } else if (districtName.equals("ফরিদপুর")) {
            for (int i = 0; i < foridpurdetails.length; i++) {
                spotlist.add(new DivisionModel(foridpurspotname[i], foridpurdetails[i], foridputimage[i]));
            }
        } else if (districtName.equals("শরীয়তপুর")) {
            for (int i = 0; i < shoriotpurdetails.length; i++) {
                spotlist.add(new DivisionModel(shoriotpurspotname[i], shoriotpurdetails[i],shoriotpurimage[i]));
            }

            // Chittagong start and dhaka finished..............................


        } else if (districtName.equals("চট্টগ্রাম")) {
            for (int i = 0; i < chittagnogdetails.length; i++) {
                spotlist.add(new DivisionModel(chittagongspotname[i], chittagnogdetails[i],chittagongimage[i]));
            }
        } else if (districtName.equals("কক্সবাজার")) {
            for (int i = 0; i < coxsbazardetails.length; i++) {
                spotlist.add(new DivisionModel(coxsbazarspotname[i], coxsbazardetails[i], coxsbazarimage[i]));
            }
        } else if (districtName.equals("কুমিল্লা")) {
            for (int i = 0; i < cumilladetails.length; i++) {
                spotlist.add(new DivisionModel(cumillaspotname[i], cumilladetails[i],cumillaimage[i]));
            }
        } else if (districtName.equals("খাগড়াছড়ি")) {
            for (int i = 0; i < khagrachoridetails.length; i++) {
                spotlist.add(new DivisionModel(khagrachorispotname[i], khagrachoridetails[i], khagrachoriimage[i]));
            }
        } else if (districtName.equals("চাঁদপুর")) {
            for (int i = 0; i < chadpurdetails.length; i++) {
                spotlist.add(new DivisionModel(chadpurspotname[i], chapaidetails[i],chadpurimage[i]));
            }
        } else if (districtName.equals("নোয়াখালী")) {
            for (int i = 0; i < noyakhalidetails.length; i++) {
                spotlist.add(new DivisionModel(noakhalispotname[i], noyakhalidetails[i], nowakhaliimage[i]));
            }
        } else if (districtName.equals("ফেনী")) {
            for (int i = 0; i < fenidetails.length; i++) {
                spotlist.add(new DivisionModel(fenispotname[i], fenidetails[i],feniimage[i]));
            }
        } else if (districtName.equals("ব্রাহ্মণবাড়িয়া")) {
            for (int i = 0; i < brammonbariadetails.length; i++) {
                spotlist.add(new DivisionModel(brammonbarispotname[i], brammonbariadetails[i],brammonbariaimage[i]));
            }
        } else if (districtName.equals("রাঙ্গামাটি")) {
            for (int i = 0; i < rangamatidetails.length; i++) {
                spotlist.add(new DivisionModel(rangamatispotname[i], rangamatidetails[i], rangamatiiamge[i]));
            }
        } else if (districtName.equals("বান্দরবান")) {
            for (int i = 0; i < bandarbandetails.length; i++) {
                spotlist.add(new DivisionModel(bandarbanspotname[i], bandarbandetails[i], bandarbanimage[i]));
            }
        } else if (districtName.equals("লক্ষ্মীপুর")) {
            for (int i = 0; i < lakhmipurdetails.length; i++) {
                spotlist.add(new DivisionModel(lakmipurspotname[i], lakhmipurdetails[i], lakmipurimage[i]));
            }


        } else if (districtName.equals("খুলনা")) {
            for (int i = 0; i < khulnadetails.length; i++) {
                spotlist.add(new DivisionModel(khulnaspotname[i], khulnadetails[i], khulnaimage[i]));
            }
        } else if (districtName.equals("কুষ্টিয়া")) {
            for (int i = 0; i < kustiadetails.length; i++) {
                spotlist.add(new DivisionModel(kustiaspotname[i], kustiadetails[i], kustiaimage[i]));
            }
        } else if (districtName.equals("বাগেরহাট")) {
            for (int i = 0; i < bagerhatdetails.length; i++) {
                spotlist.add(new DivisionModel(bagerhatspotname[i], bagerhatdetails[i],bagerhatimage[i]));
            }
        } else if (districtName.equals("যশোর")) {
            for (int i = 0; i < joshoredetails.length; i++) {
                spotlist.add(new DivisionModel(joshorspotname[i], joshoredetails[i],jashoreimage[i]));
            }
        } else if (districtName.equals("মেহেরপুর")) {
            for (int i = 0; i < meherpurdetails.length; i++) {
                spotlist.add(new DivisionModel(meherpurspotname[i], meherpurdetails[i], meherpurimage[i]));
            }
        } else if (districtName.equals("মাগুরা")) {
            for (int i = 0; i < maguradetails.length; i++) {
                spotlist.add(new DivisionModel(maguraspotname[i], maguradetails[i], maguraimage[i]));
            }
        } else if (districtName.equals("সাতক্ষীরা")) {
            for (int i = 0; i < satkhiradetails.length; i++) {
                spotlist.add(new DivisionModel(satkhiraspotname[i], satkhiradetails[i], satkhiraimage[i]));
            }


        } else if (districtName.equals("রাজশাহী")) {
            for (int i = 0; i < rajshahidetails.length; i++) {
                spotlist.add(new DivisionModel(rajshahispotname[i], rajshahidetails[i], rajshahiimage[i]));
            }
        } else if (districtName.equals("চাঁপাইনবাবগঞ্জ")) {
            for (int i = 0; i < chapaidetails.length; i++) {
                spotlist.add(new DivisionModel(chapaispotname[i], chapaidetails[i], R.drawable.harivangamango));
            }
        } else if (districtName.equals("পাবনা")) {
            for (int i = 0; i < pabnadetails.length; i++) {
                spotlist.add(new DivisionModel(pabnaspotname[i], pabnadetails[i], R.drawable.lal));
            }
        } else if (districtName.equals("বগুড়া")) {
            for (int i = 0; i < boguradetails.length; i++) {
                spotlist.add(new DivisionModel(boguraspotname[i], boguradetails[i], R.drawable.lal));
            }
        } else if (districtName.equals("সিরাজগঞ্জ")) {
            for (int i = 0; i < sirajgongdetails.length; i++) {
                spotlist.add(new DivisionModel(sirajgongspotname[i], sirajgongdetails[i], R.drawable.lal));
            }
        } else if (districtName.equals("জয়পুরহাট")) {
            for (int i = 0; i < joipurhatdetails.length; i++) {
                spotlist.add(new DivisionModel(jaipurhatspotname[i], joipurhatdetails[i], R.drawable.lal));
            }
        } else if (districtName.equals("নাটোর")) {
            for (int i = 0; i < natoredetails.length; i++) {
                spotlist.add(new DivisionModel(natorespotname[i], natoredetails[i], R.drawable.lal));
            }
        } else if (districtName.equals("নওগাঁ")) {
            for (int i = 0; i < nougaondetils.length; i++) {
                spotlist.add(new DivisionModel(naugaspotname[i], nougaondetils[i], R.drawable.lal));
            }


        } else if (districtName.equals("রংপুর")) {
            for (int i = 0; i < rangpurdetails.length; i++) {
                spotlist.add(new DivisionModel(rangpurspotname[i], rangpurdetails[i], rangpurimage[i]));
            }
        } else if (districtName.equals("কুড়িগ্রাম")) {
            for (int i = 0; i < kurigramdetails.length; i++) {
                spotlist.add(new DivisionModel(kurigramspotname[i], kurigramdetails[i], kurigramimage[i]));
            }
        } else if (districtName.equals("দিনাজপুর")) {
            for (int i = 0; i < dinajpurdetails.length; i++) {
                spotlist.add(new DivisionModel(dinajpurspotname[i], dinajpurdetails[i],dinajpurimage[i]));
            }
        } else if (districtName.equals("নীলফামারী")) {
            for (int i = 0; i < nilfamaridetails.length; i++) {
                spotlist.add(new DivisionModel(nilfamarispotname[i], nilfamaridetails[i],nilfamariimage[i]));
            }
        } else if (districtName.equals("গাইবান্ধা")) {
            for (int i = 0; i < gaibandhadetails.length; i++) {
                spotlist.add(new DivisionModel(gaibandhaspotname[i], gaibandhadetails[i],gaibandhaimage[i]));
            }
        } else if (districtName.equals("লালমনিরহাট")) {
            for (int i = 0; i < lalmonirhatdetails.length; i++) {
                spotlist.add(new DivisionModel(lalmonirhatspotname[i], lalmonirhatdetails[i], lalmonirhatimage[i]));
            }
        } else if (districtName.equals("পঞ্চগড়")) {
            for (int i = 0; i < ponchogordetails.length; i++) {
                spotlist.add(new DivisionModel(ponchogorspotname[i], ponchogordetails[i], ponchogorimage[i]));
            }


        } else if (districtName.equals("ময়মনসিংহ")) {
            for (int i = 0; i < mymensinghdetails.length; i++) {
                spotlist.add(new DivisionModel(maymensinghspotname[i], mymensinghdetails[i], mymensinghimage[i]));
            }
        } else if (districtName.equals("শেরপুর")) {
            for (int i = 0; i < sherpurdetails.length; i++) {
                spotlist.add(new DivisionModel(sherpurspotname[i], sherpurdetails[i],sherpurimage[i]));
            }
        } else if (districtName.equals("নেত্রকোনা")) {
            for (int i = 0; i < netrokonadetails.length; i++) {
                spotlist.add(new DivisionModel(netrokonaspotname[i], netrokonadetails[i], netrokonaimage[i]));
            }
        } else if (districtName.equals("জামালপুর")) {
            for (int i = 0; i < jamalpurdetails.length; i++) {
                spotlist.add(new DivisionModel(jamalpurspotname[i], jamalpurdetails[i],jamalpurimage[i]));
            }


        } else if (districtName.equals("সিলেট")) {
            for (int i = 0; i < sylhetdetails.length; i++) {
                spotlist.add(new DivisionModel(sylhetspotname[i], sylhetdetails[i],sylhetimage[i] ));
            }
        } else if (districtName.equals("মৌলভীবাজার")) {
            for (int i = 0; i < moulovibazardetails.length; i++) {
                spotlist.add(new DivisionModel(moulovibazarspotname[i], moulovibazardetails[i],moulovibazarimage[i]));
            }
        } else if (districtName.equals("শ্রীমঙ্গল")) {
            for (int i = 0; i < srimangaldetails.length; i++) {
                spotlist.add(new DivisionModel(srimongolspotname[i], srimangaldetails[i], srimangalimage[i]));
            }
        } else if (districtName.equals("সুনামগঞ্জ")) {
            for (int i = 0; i < sunamgongdetails.length; i++) {
                spotlist.add(new DivisionModel(sunamgongspotname[i], sunamgongdetails[i], sunamgongimage[i]));
            }
        } else if (districtName.equals("হবিগঞ্জ")) {
            for (int i = 0; i < hobigongdetails.length; i++) {
                spotlist.add(new DivisionModel(hobigongspotname[i], hobigongdetails[i], hobigongimage[i]));
            }


        } else if (districtName.equals("বরিশাল")) {
            for (int i = 0; i < barishaldetails.length; i++) {
                spotlist.add(new DivisionModel(barishalspotname[i], barishaldetails[i], borishalimage[i]));
            }
        } else if (districtName.equals("পিরোজপুর")) {
            for (int i = 0; i < pirojpurdetails.length; i++) {
                spotlist.add(new DivisionModel(pirojpurspotname[i], pirojpurdetails[i], pirojpurimage[i]));
            }
        } else if (districtName.equals("ঝালকাঠি")) {
            for (int i = 0; i < jhalkathidetails.length; i++) {
                spotlist.add(new DivisionModel(jhalkathispotname[i], jhalkathidetails[i], jhalkathiimage[i]));
            }
        } else if (districtName.equals("পটুয়াখালী")) {
            for (int i = 0; i < potuakhalidetails.length; i++) {
                spotlist.add(new DivisionModel(potuakhalispotname[i], potuakhalidetails[i], potuakhaliimage[i]));
            }
        } else if (districtName.equals("ভোলা")) {
            for (int i = 0; i < bholadetails.length; i++) {
                spotlist.add(new DivisionModel(volaspotname[i], bholadetails[i], bholaimage[i]));
            }
        } else if (districtName.equals("বরগুনা")) {
            for (int i = 0; i < borgunadetails.length; i++) {
                spotlist.add(new DivisionModel(borgunaspotname[i], borgunadetails[i], borgunaimage[i]));
            }
        }
    }
}