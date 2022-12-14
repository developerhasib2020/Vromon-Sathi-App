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

public class DistrictActivity extends AppCompatActivity {
    RecyclerView districtRV;
    DivisionAdapter districtAdapter;
    ArrayList<DivisionModel> districtlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district);

        districtRV = findViewById(R.id.districtRv);

        int divisionPosition = getIntent().getIntExtra("division_position", 0);

        if (divisionPosition == 0) {
            setDhakaDistrictlist();
        } else if (divisionPosition == 1) {
            setChittagongDistrictlist();
        } else if (divisionPosition == 2) {
            setKhulnaDistrictlist();
        } else if (divisionPosition == 3) {
            setSylhetDistrictlist();
        } else if (divisionPosition == 4) {
            setRajshahiDistrictlist();
        } else if (divisionPosition == 5) {
            setMymensinghDistrictlist();
        } else if (divisionPosition == 6) {
            setRangpurDistrictlist();
        } else if (divisionPosition == 7) {
            setBarishalDistrictlist();
        } else if (divisionPosition == 8) {
            setIndiaRajjo();
        }


        districtAdapter = new DivisionAdapter(this, districtlist);
        districtRV.setAdapter(districtAdapter);
        districtRV.setLayoutManager(new LinearLayoutManager(this));
        districtRV.setHasFixedSize(true);
        districtRV.addOnItemTouchListener(new RecyclerTouchListener(this, districtRV, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                startActivity(new Intent(DistrictActivity.this, SpotlistActivity.class)
                        .putExtra("Districtname",districtlist.get(position).getName())
                );
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


    }

    private void setDhakaDistrictlist() {
        districtlist.add(new DivisionModel("ঢাকা", "দর্শনীয় স্থান ঃ ৩৭টি", R.drawable.ahsanmanjil));
        districtlist.add(new DivisionModel("কিশোরগঞ্জ", "দর্শনীয় স্থান ঃ ০৭টি", R.drawable.coxsbazar));
        districtlist.add(new DivisionModel("গাজীপুর", "দর্শনীয় স্থান ঃ ১২টি", R.drawable.gazipurbangabandhusafaripark));
        districtlist.add(new DivisionModel("নারায়ণগঞ্জ", "দর্শনীয় স্থান ঃ ১৬টি", R.drawable.panamcitysonargaonnarayanganj));
        districtlist.add(new DivisionModel("নরসিংদী", "দর্শনীয় স্থান ঃ ১৩টি", R.drawable.dreamholidayparknarsingdi));
        districtlist.add(new DivisionModel("মাদারিপুর", "দর্শনীয় স্থান ঃ ০৫টি", R.drawable.mithapurzamindarbari));
        districtlist.add(new DivisionModel("মানিকগঞ্জ", "দর্শনীয় স্থান ঃ ০৪টি", R.drawable.teotajamidarbarimanikganj));
        districtlist.add(new DivisionModel("মুন্সিগঞ্জ", "দর্শনীয় স্থান ঃ ১০টি", R.drawable.idrakpurfort));
        districtlist.add(new DivisionModel("টাঙ্গাইল", "দর্শনীয় স্থান ঃ ০৯টি", R.drawable.jamunaresort));
        districtlist.add(new DivisionModel("ফরিদপুর", "দর্শনীয় স্থান ঃ ০৩টি", R.drawable.mathurapurdeulfaridpur));
        districtlist.add(new DivisionModel("শরীয়তপুর", "দর্শনীয় স্থান ঃ ০১টি", R.drawable.alexandarcastle));

    }

    private void setChittagongDistrictlist() {
        districtlist.add(new DivisionModel("চট্টগ্রাম", "দর্শনীয় স্থান ঃ ৩৫টি", R.drawable.suptodharajhornasitakunda));
        districtlist.add(new DivisionModel("কক্সবাজার", "দর্শনীয় স্থান ঃ ১৭টি", R.drawable.coxsbazar));
        districtlist.add(new DivisionModel("কুমিল্লা", "দর্শনীয় স্থান ঃ ০৬টি", R.drawable.shalbanviharacomilla));
        districtlist.add(new DivisionModel("খাগড়াছড়ি", "দর্শনীয় স্থান ঃ ০৯টি", R.drawable.alutilacave));
        districtlist.add(new DivisionModel("চাঁদপুর", "দর্শনীয় স্থান ঃ ০২টি", R.drawable.hilsafishchandpur));
        districtlist.add(new DivisionModel("নোয়াখালী", "দর্শনীয় স্থান ঃ ০৪টি", R.drawable.nijhumdwip));
        districtlist.add(new DivisionModel("ফেনী", "দর্শনীয় স্থান ঃ ০৫টি", R.drawable.muhuriprojectfeni));
        districtlist.add(new DivisionModel("ব্রাহ্মণবাড়িয়া", "দর্শনীয় স্থান ঃ ০৫টি", R.drawable.sandwipchittagong));
        districtlist.add(new DivisionModel("রাঙ্গামাটি", "দর্শনীয় স্থান ঃ ২০টি", R.drawable.furomonpaharangamati));
        districtlist.add(new DivisionModel("বান্দরবান", "দর্শনীয় স্থান ঃ ৫১টি", R.drawable.nilgiribandarban));
        districtlist.add(new DivisionModel("লক্ষ্মীপুর", "দর্শনীয় স্থান ঃ ০১টি", R.drawable.choralexander));
    }


    private void setKhulnaDistrictlist() {
        districtlist.add(new DivisionModel("খুলনা", "দর্শনীয় স্থান ঃ ০৮টি", R.drawable.monglaportbagerhat));
        districtlist.add(new DivisionModel("কুষ্টিয়া", "দর্শনীয় স্থান ঃ ০২টি", R.drawable.lalonmelakushtia));
        districtlist.add(new DivisionModel("বাগেরহাট", "দর্শনীয় স্থান ঃ ১৬টি", R.drawable.sundarban));
        districtlist.add(new DivisionModel("যশোর", "দর্শনীয় স্থান ঃ ০৪টি", R.drawable.jessoregodkhaliflowermarket));
        districtlist.add(new DivisionModel("মেহেরপুর", "দর্শনীয় স্থান ঃ ০৩টি", R.drawable.meherpurmujibnagar));
        districtlist.add(new DivisionModel("মাগুরা", "দর্শনীয় স্থান ঃ ০৩টি", R.drawable.maguravatervita));
        districtlist.add(new DivisionModel("সাতক্ষীরা", "দর্শনীয় স্থান ঃ ০৩টি", R.drawable.mandarbariaseabeachsatkhira));
    }

    private void setRajshahiDistrictlist() {
        districtlist.add(new DivisionModel("রাজশাহী", "দর্শনীয় স্থান ঃ ০৩টি", R.drawable.varendraresearchmuseumrajshahi));
        districtlist.add(new DivisionModel("চাঁপাইনবাবগঞ্জ", "দর্শনীয় স্থান ঃ ০৫টি", R.drawable.harivangamango));
        districtlist.add(new DivisionModel("পাবনা", "দর্শনীয় স্থান ঃ ০৬টি", R.drawable.coxsbazar));
        districtlist.add(new DivisionModel("বগুড়া", "দর্শনীয় স্থান ঃ ০২টি", R.drawable.coxsbazar));
        districtlist.add(new DivisionModel("সিরাজগঞ্জ", "দর্শনীয় স্থান ঃ ০৩টি", R.drawable.coxsbazar));
        districtlist.add(new DivisionModel("জয়পুরহাট", "দর্শনীয় স্থান ঃ ০২টি", R.drawable.coxsbazar));
        districtlist.add(new DivisionModel("নাটোর", "দর্শনীয় স্থান ঃ ০৩টি", R.drawable.coxsbazar));
        districtlist.add(new DivisionModel("নওগাঁ", "দর্শনীয় স্থান ঃ ০৭টি", R.drawable.coxsbazar));
    }

    private void setRangpurDistrictlist() {
        districtlist.add(new DivisionModel("রংপুর", "দর্শনীয় স্থান ঃ ০৪টি", R.drawable.tajhatpalacerangpur));
        districtlist.add(new DivisionModel("কুড়িগ্রাম", "দর্শনীয় স্থান ঃ ০৩টি", R.drawable.ochingachkurigram));
        districtlist.add(new DivisionModel("দিনাজপুর", "দর্শনীয় স্থান ঃ ০৯টি", R.drawable.shopnopuripicnicspotdinajpur));
        districtlist.add(new DivisionModel("নীলফামারী", "দর্শনীয় স্থান ঃ ০৫টি", R.drawable.teestabarrage));
        districtlist.add(new DivisionModel("গাইবান্ধা", "দর্শনীয় স্থান ঃ ০১টি", R.drawable.friendshipcentergaibandha));
        districtlist.add(new DivisionModel("লালমনিরহাট", "দর্শনীয় স্থান ঃ ০২টি", R.drawable.nidariamasjidlalmonirhat));
        districtlist.add(new DivisionModel("পঞ্চগড়", "দর্শনীয় স্থান ঃ ০৮টি", R.drawable.coxsbazar));
    }

    private void setMymensinghDistrictlist() {
        districtlist.add(new DivisionModel("ময়মনসিংহ", "দর্শনীয় স্থান ঃ ০৫টি", R.drawable.mymensinghshoshilodge));
        districtlist.add(new DivisionModel("শেরপুর", "দর্শনীয় স্থান ঃ ০৫টি", R.drawable.sherpurchildrenspark));
        districtlist.add(new DivisionModel("নেত্রকোনা", "দর্শনীয় স্থান ঃ ০৩টি", R.drawable.dingapotahaornetrokona));
        districtlist.add(new DivisionModel("জামালপুর", "দর্শনীয় স্থান ঃ ০৩টি", R.drawable.gandhiashramjamalpur));
    }

    private void setSylhetDistrictlist() {
        districtlist.add(new DivisionModel("সিলেট", "দর্শনীয় স্থান ঃ ২০টি", R.drawable.hazratshahjalalmazarsylhet));
        districtlist.add(new DivisionModel("মৌলভীবাজার", "দর্শনীয় স্থান ঃ ০৯টি", R.drawable.adampurbitrajkandmoulovibazar));
        districtlist.add(new DivisionModel("শ্রীমঙ্গল", "দর্শনীয় স্থান ঃ ১১টি", R.drawable.sylhetteastate));
        districtlist.add(new DivisionModel("সুনামগঞ্জ", "দর্শনীয় স্থান ঃ ০৮টি", R.drawable.tanguarhaorsunamganj));
        districtlist.add(new DivisionModel("হবিগঞ্জ", "দর্শনীয় স্থান ঃ ০৪টি", R.drawable.greenlandparkchunarughathabiganj));
    }

    private void setBarishalDistrictlist() {
        districtlist.add(new DivisionModel("বরিশাল", "দর্শনীয় স্থান ঃ ০৬টি", R.drawable.guthiamosque));
        districtlist.add(new DivisionModel("পিরোজপুর", "দর্শনীয় স্থান ঃ ০১টি", R.drawable.guavafloatingmarket));
        districtlist.add(new DivisionModel("ঝালকাঠি", "দর্শনীয় স্থান ঃ ০৩টি", R.drawable.guavafloatingmarket));
        districtlist.add(new DivisionModel("পটুয়াখালী", "দর্শনীয় স্থান ঃ ০৬টি", R.drawable.kuakatapatuakhai));
        districtlist.add(new DivisionModel("ভোলা", "দর্শনীয় স্থান ঃ ০৩টি", R.drawable.charkukrimukri));
        districtlist.add(new DivisionModel("বরগুনা", "দর্শনীয় স্থান ঃ ০২টি", R.drawable.haringhatabarguna));
    }
    private void setIndiaRajjo() {
        districtlist.add(new DivisionModel("দার্জিলিং", "দর্শনীয় স্থান ঃ ০৬টি", R.drawable.darjeelingindia));
        districtlist.add(new DivisionModel("সিকিম", "দর্শনীয় স্থান ঃ ০১টি", R.drawable.sikkimteagarden));
        districtlist.add(new DivisionModel("হিমাচল", "দর্শনীয় স্থান ঃ ০৩টি", R.drawable.dharamsalahimachalindia));
        districtlist.add(new DivisionModel("কাশ্মীর", "দর্শনীয় স্থান ঃ ০৬টি", R.drawable.sonamargkashmir));
        districtlist.add(new DivisionModel("মেঘালয়", "দর্শনীয় স্থান ঃ ০৩টি", R.drawable.kongthongmeghalaya));
        districtlist.add(new DivisionModel("উত্তরাখান্ড", "দর্শনীয় স্থান ঃ ০২টি", R.drawable.auliuttarakhand));
    }

}