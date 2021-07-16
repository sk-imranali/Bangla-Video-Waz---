package com.imran.banglawaz;

import androidx.annotation.NonNull;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    private void addVideos(){

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "R1Y857TEI6M");
        hashMap.put("vdo_title", "কুরবানী সম্পর্কে আব্দুর রাজ্জাক বিন ইউসুফ | qurbani abdur razzak bin yousuf\n");
        hashMap.put("vdo_desciption", "কুরবানী সম্পর্কে আব্দুর রাজ্জাক বিন ইউসুফ | qurbani abdur razzak bin yousuf\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "iI4meGOG5YE");
        hashMap.put("vdo_title", "2021 সালের প্রথম মাহফিল ঢাকার বুকে | abdur razzak bin yousuf new waz | আব্দুর রাজ্জাক বিন ইউসুফ ওয়াজ\n");
        hashMap.put("vdo_desciption", "2021 সালের প্রথম মাহফিল ঢাকার বুকে | abdur razzak bin yousuf new waz | আব্দুর রাজ্জাক বিন ইউসুফ ওয়াজ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "EglDyjyauH4");
        hashMap.put("vdo_title", "Bangla Waz Qurbani Kenar Bepare Ki Joruri by Abdur Razzak bin Yousuf\n");
        hashMap.put("vdo_desciption", "Bangla Waz Qurbani Kenar Bepare Ki Joruri by Abdur Razzak bin Yousuf\n");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "J1dt91JWGaM");
        hashMap.put("vdo_title", "জাহান্নামে যাবে কারা | abdur razzak bin yousuf,abdur razzak bin yousuf | abdur razzak bin yousuf");
        hashMap.put("vdo_desciption", "জাহান্নামে যাবে কারা | abdur razzak bin yousuf,abdur razzak bin yousuf | abdur razzak bin yousuf");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>


        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "288SQswIDnE");
        hashMap.put("vdo_title", "ছাত্র জীবনের ঘটনা || ওস্তাদ দের ভালোবাসা || শাইখ আব্দুর রাজ্জাক বিন ইউসুফ এর প্রতি\n");
        hashMap.put("vdo_desciption", "ছাত্র জীবনের ঘটনা || ওস্তাদ দের ভালোবাসা || শাইখ আব্দুর রাজ্জাক বিন ইউসুফ এর প্রতি\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>


        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "m8cMzbs9-i8");
        hashMap.put("vdo_title", "Khoma Koro Ami Valo Nei");
        hashMap.put("vdo_desciption", "ক্ষমা করো আমি ভালো নেই | Bangla Lyrics | Dev | Anupam Ray | Sad Song 2021");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>



        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6NIvNe17RnI");
        hashMap.put("vdo_title", "১০১ টি প্রশ্নের উত্তর | শায়খ আব্দুর রাজ্জাক বিন ইউসুফ প্রশ্নোত্তর | sheikh abdur razzak bin yousuf");
        hashMap.put("vdo_desciption", "১০১ টি প্রশ্নের উত্তর | শায়খ আব্দুর রাজ্জাক বিন ইউসুফ প্রশ্নোত্তর | sheikh abdur razzak bin yousuf");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1WbOrd79R9U");
        hashMap.put("vdo_title", "Something Difficult About Women | Abdur Razzak Bin Yousuf | Bangla Sort Waz | Nasir Media");
        hashMap.put("vdo_desciption", "Something Difficult About Women | Abdur Razzak Bin Yousuf | Bangla Sort Waz | Nasir Media");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "NMjYuyUams0");
        hashMap.put("vdo_title", "শায়েখ আবদুর রাজ্জাক বিন ইউসুফ নতুন ওয়াজ। আব্দুর রাজ্জাক বিন ইউসুফ। abdur rajjak bin yousuf new waz");
        hashMap.put("vdo_desciption", "শায়েখ আবদুর রাজ্জাক বিন ইউসুফ নতুন ওয়াজ। আব্দুর রাজ্জাক বিন ইউসুফ। abdur rajjak bin yousuf new waz");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KrJZmfiqAKk");
        hashMap.put("vdo_title", "হৃদয়ে কম্পন সৃষ্টিকারী ওয়াজ - আব্দুর রাজ্জাক বিন ইউসুফ | Abdur Razzak bin Yousuf Bangla Waz");
        hashMap.put("vdo_desciption", "হৃদয়ে কম্পন সৃষ্টিকারী ওয়াজ - আব্দুর রাজ্জাক বিন ইউসুফ | Abdur Razzak bin Yousuf Bangla Waz");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "dKxdf_OBfA0");
        hashMap.put("vdo_title", "যে পাপের কারনে দাম বেড়ে যাবে abdur razzak bin yousuf, abdur razzak bin yousuf waz");
        hashMap.put("vdo_desciption", "যে পাপের কারনে দাম বেড়ে যাবে abdur razzak bin yousuf, abdur razzak bin yousuf waz");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "psU1Mpx_AlA");
        hashMap.put("vdo_title", "কবিরাজ | Abdur razzak bin yousuf | Sheikh abdur razzak bin yousuf new waz");
        hashMap.put("vdo_desciption", "কবিরাজ | Abdur razzak bin yousuf | Sheikh abdur razzak bin yousuf new waz");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "eXawMSohb8Q");
        hashMap.put("vdo_title", "ভাগ্য যা লিখা আছে তাই হবে এটা কি সত্য | Abdullah bin abdur razzak new waz");
        hashMap.put("vdo_desciption", "ভাগ্য যা লিখা আছে তাই হবে এটা কি সত্য | Abdullah bin abdur razzak new waz");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Q_FYesRcmIw");
        hashMap.put("vdo_title", "ফরজ গোসলে যে ভুল করার কারণে বেশির ভাগ মানুষে ইবাদত কবুল হয়না│শায়খ আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "ফরজ গোসলে যে ভুল করার কারণে বেশির ভাগ মানুষে ইবাদত কবুল হয়না│শায়খ আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "eROC7zqyKm4");
        hashMap.put("vdo_title", "নামাজের পরে দোয়া করা হারাম! | বিদআতের তথ্য || Abdur Razzak Bin Yousuf আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "নামাজের পরে দোয়া করা হারাম! | বিদআতের তথ্য || Abdur Razzak Bin Yousuf আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "7pr8M4L0V2w");
        hashMap.put("vdo_title", "যে আমলে আল্লাহ বান্দার ভাগ্য পরিবর্তন কেন। আব্দুর রাজ্জাক বিন ইউসুফ।Abdur razzak bin yousuf\n");
        hashMap.put("vdo_desciption", "যে আমলে আল্লাহ বান্দার ভাগ্য পরিবর্তন করেন। আব্দুর রাজ্জাক বিন ইউসুফ।Abdur razzak bin yousuf\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "HA5azl7VPiI");
        hashMap.put("vdo_title", "এটি কি সত্যি? আপনার বিয়ে কোথায় হবে? জন্মের আগেই কি সেটি নির্ধারণ থাকে । আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "এটি কি সত্যি? আপনার বিয়ে কোথায় হবে? জন্মের আগেই কি সেটি নির্ধারণ থাকে । আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SdKvwfaoxQc");
        hashMap.put("vdo_title", "কীভাবে বুঝবো আমি একজন সৎ মানুষ ...।শাইখ আব্দুর রাজ্জাক বিন ইউসুফ । Abdur Razzak Bin Yousuf\n");
        hashMap.put("vdo_desciption", "কীভাবে বুঝবো আমি একজন সৎ মানুষ ...।শাইখ আব্দুর রাজ্জাক বিন ইউসুফ । Abdur Razzak Bin Yousuf\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8lFv0jXsOcw");
        hashMap.put("vdo_title", "ইমাম আবু হানীফা রহ. ১০০ বার আল্লাহকে দেখেছেন,একথা কি ঠিক? আবু আব্দুল্লাহ মুহাম্মদ বাশার বিন হায়াত,\n");
        hashMap.put("vdo_desciption", "ইমাম আবু হানীফা রহ. ১০০ বার আল্লাহকে দেখেছেন,একথা কি ঠিক? আবু আব্দুল্লাহ মুহাম্মদ বাশার বিন হায়াত,\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jd7DpSz4708");
        hashMap.put("vdo_title", "শায়খ আব্দুর রাজ্জাক বলেছেন আপনি নাকি কোরআন হাদিস বোঝেন না, প্রথম মাহফিলে এক কঠিন প্রশ্নের মুখো মুখি\n");
        hashMap.put("vdo_desciption", "শায়খ আব্দুর রাজ্জাক বলেছেন আপনি নাকি কোরআন হাদিস বোঝেন না, প্রথম মাহফিলে এক কঠিন প্রশ্নের মুখো মুখি\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3KiKmAkkuz8");
        hashMap.put("vdo_title", "abdur razzak bin yousuf full waz আব্দুর রাজ্জাক বিন ইউসুফ | আব্দুর রাযযাক বিন ইউসুফ | বাংলা ওয়াজ");
        hashMap.put("vdo_desciption", "abdur razzak bin yousuf full waz আব্দুর রাজ্জাক বিন ইউসুফ | আব্দুর রাযযাক বিন ইউসুফ | বাংলা ওয়াজ");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SYu4nLlP0lk");
        hashMap.put("vdo_title", "সাত ভাগে কুরবানী করা যাবে? আব্দুর রাজ্জাক বিন ইউসুফ | Qurbani | Abdur Razzak bin Yousuf Waz\n");
        hashMap.put("vdo_desciption", "সাত ভাগে কুরবানী করা যাবে? আব্দুর রাজ্জাক বিন ইউসুফ | Qurbani | Abdur Razzak bin Yousuf Waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3iCD_58vVaE");
        hashMap.put("vdo_title", "মাহে রমজান আব্দুর রাজ্জাক বিন ইসুউফ | Ramadan Month Abdur Razzak bin Yousuf | Bangla Waz\n");
        hashMap.put("vdo_desciption", "মাহে রমজান আব্দুর রাজ্জাক বিন ইসুউফ | Ramadan Month Abdur Razzak bin Yousuf | Bangla Waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "32GJ9f8OY8Y");
        hashMap.put("vdo_title", "দোয়া কবুল হবেই হবে ইনণশাআল্লাহ abdur razzak bin yousuf আব্দুর রাজ্জাক বিন ইউসুফ alor poth 1\n");
        hashMap.put("vdo_desciption", "দোয়া কবুল হবেই হবে ইনণশাআল্লাহ abdur razzak bin yousuf আব্দুর রাজ্জাক বিন ইউসুফ alor poth 1\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "eROC7zqyKm4");
        hashMap.put("vdo_title", "নামাজের পরে দোয়া করা হারাম! | বিদআতের তথ্য || Abdur Razzak Bin Yousuf আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "নামাজের পরে দোয়া করা হারাম! | বিদআতের তথ্য || Abdur Razzak Bin Yousuf আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "92uyEcSx440");
        hashMap.put("vdo_title", "সিরাজগঞ্জে দুই ছেলেকে পাশে বসিয়ে ইতিহাসের সেরা ওয়াজ | shaikh abdur razzak bin yousuf new waz\n");
        hashMap.put("vdo_desciption", "সিরাজগঞ্জে দুই ছেলেকে পাশে বসিয়ে ইতিহাসের সেরা ওয়াজ | shaikh abdur razzak bin yousuf new waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vAs_2knonhc");
        hashMap.put("vdo_title", "জরুরী কিছু কথা | আব্দুর রাজ্জাক বিন ইউসুফ | Abdur Razzak Bin Yousuf। আব্দুর রাজ্জাক ওয়াজ\n");
        hashMap.put("vdo_desciption", "জরুরী কিছু কথা | আব্দুর রাজ্জাক বিন ইউসুফ | Abdur Razzak Bin Yousuf। আব্দুর রাজ্জাক ওয়াজ\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "pwvpBsvvt1Y");
        hashMap.put("vdo_title", "পাঁচ টি বিশেষ আমল | shaikh abdur razzak bin yousuf | abdur razzak bin yousuf\n");
        hashMap.put("vdo_desciption", "পাঁচ টি বিশেষ আমল | shaikh abdur razzak bin yousuf | abdur razzak bin yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "64K8TnXQyPA");
        hashMap.put("vdo_title", "২০২১ সালের প্রথম মাহফিল মধুখালী, বাবুখালী | আব্দুর রাজ্জাক বিন ইউসুফ | Abdur Razzak Bin Yousuf |\n");
        hashMap.put("vdo_desciption", "২০২১ সালের প্রথম মাহফিল মধুখালী, বাবুখালী | আব্দুর রাজ্জাক বিন ইউসুফ | Abdur Razzak Bin Yousuf |\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "kWyERh1fsDM");
        hashMap.put("vdo_title", "এই ছোট পাপেই জাহান্নাম | Sheikh abdur razzak bin yousuf new waz | শায়েখ আব্দুর রাজ্জাক ওয়াজ\n");
        hashMap.put("vdo_desciption", "এই ছোট পাপেই জাহান্নাম | Sheikh abdur razzak bin yousuf new waz | শায়েখ আব্দুর রাজ্জাক ওয়াজ\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4eRL45jNjxM");
        hashMap.put("vdo_title", "কেয়ামতের মাঠের ভয়াবহতা | শায়খ আব্দুর রাজ্জাক বিন ইউসুফ | Sheikh Abdur Razzaq Bin Yusuf\n");
        hashMap.put("vdo_desciption", "কেয়ামতের মাঠের ভয়াবহতা | শায়খ আব্দুর রাজ্জাক বিন ইউসুফ | Sheikh Abdur Razzaq Bin Yusuf\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "WRSVfpFru2A");
        hashMap.put("vdo_title", "নতুন নতুন শিরিক গুনাহ | আব্দুর রাজ্জাক বিন ইউসুফ | abdur razzak bin yousuf new waz 2021\n");
        hashMap.put("vdo_desciption", "নতুন নতুন শিরিক গুনাহ | আব্দুর রাজ্জাক বিন ইউসুফ | abdur razzak bin yousuf new waz 2021\n");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4eRL45jNjxM");
        hashMap.put("vdo_title", "কেয়ামতের মাঠের ভয়াবহতা | শায়খ আব্দুর রাজ্জাক বিন ইউসুফ | Sheikh Abdur Razzaq Bin Yusuf\n");
        hashMap.put("vdo_desciption", "কেয়ামতের মাঠের ভয়াবহতা | শায়খ আব্দুর রাজ্জাক বিন ইউসুফ | Sheikh Abdur Razzaq Bin Yusuf\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "hCdo3WvY9kI");
        hashMap.put("vdo_title", "কয়েকটি জাল হাদীস শায়েখ আব্দুর রাজ্জাক বিন ইউসুফ । jal hadis । abdur razzak bin yousuf new waz\n");
        hashMap.put("vdo_desciption", "কয়েকটি জাল হাদীস শায়েখ আব্দুর রাজ্জাক বিন ইউসুফ । jal hadis । abdur razzak bin yousuf new waz\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "IY3oZpEUA9Y");
        hashMap.put("vdo_title", "কেমন নারীকে বিয়ে করা উচিত, কেমন নারীকে বিয়ে করা উচিত না? আব্দুর রাজ্জাক | Abdur Razzak bin Yousuf\n");
        hashMap.put("vdo_desciption", "কেমন নারীকে বিয়ে করা উচিত, কেমন নারীকে বিয়ে করা উচিত না? আব্দুর রাজ্জাক | Abdur Razzak bin Yousuf\n");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4oNDBoyS8y0");
        hashMap.put("vdo_title", "যে ৩ টি কারণে মানুষ ধ্বংস হয়ে যায় | আব্দুর রাযযাক বিন ইউসুফ | শায়খ আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "যে ৩ টি কারণে মানুষ ধ্বংস হয়ে যায় | আব্দুর রাযযাক বিন ইউসুফ | শায়খ আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3iCD_58vVaE");
        hashMap.put("vdo_title", "মাহে রমজান আব্দুর রাজ্জাক বিন ইসুউফ | Ramadan Month Abdur Razzak bin Yousuf | Bangla Waz\n");
        hashMap.put("vdo_desciption", "মাহে রমজান আব্দুর রাজ্জাক বিন ইসুউফ | Ramadan Month Abdur Razzak bin Yousuf | Bangla Waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ZIRrAdRGztk");
        hashMap.put("vdo_title", "মাগুরার ফুল ওয়াজ | আব্দুর রাজ্জাক বিন ইউসুফ | abdur razzak bin yousuf new waz\n");
        hashMap.put("vdo_desciption", "মাগুরার ফুল ওয়াজ | আব্দুর রাজ্জাক বিন ইউসুফ | abdur razzak bin yousuf new waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Ug22BwM1z2A");
        hashMap.put("vdo_title", "যে সময় স্ত্রী সহবাস করা নিষেধ খুব সতর্ক | Sheikh Abdur Razzaq Bin Yusuf 2021\n");
        hashMap.put("vdo_desciption", "যে সময় স্ত্রী সহবাস করা নিষেধ খুব সতর্ক | Sheikh Abdur Razzaq Bin Yusuf 2021\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Ip4wigxuWhE");
        hashMap.put("vdo_title", "যে ভাবে চুল কাঁটা হারাম | আব্দুর রাজ্জাক বিন ইউসুফ নিউ ওয়াজ | abdur razzak bin yousuf waz\n");
        hashMap.put("vdo_desciption", "যে ভাবে চুল কাঁটা হারাম | আব্দুর রাজ্জাক বিন ইউসুফ নিউ ওয়াজ | abdur razzak bin yousuf waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "QgRS9BP26lo");
        hashMap.put("vdo_title", "গান বাজনা শুনার ভয়াবহতা | শাইখ আব্দুর রাজ্জাক বিন ইউসুফ | abdur razzak bin yousuf | আব্দুর রাজ্জাক\n");
        hashMap.put("vdo_desciption", "গান বাজনা শুনার ভয়াবহতা | শাইখ আব্দুর রাজ্জাক বিন ইউসুফ | abdur razzak bin yousuf | আব্দুর রাজ্জাক\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "VmDL6Oay2Y4");
        hashMap.put("vdo_title", "জটিল জটিল পাপ | Sheikh abdur razzak bin yousuf | abdur razzak bin yousuf 2021 waz\n");
        hashMap.put("vdo_desciption", "জটিল জটিল পাপ | Sheikh abdur razzak bin yousuf | abdur razzak bin yousuf 2021 waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ZqaupROjWqA");
        hashMap.put("vdo_title", "Bangla Islamic Qustion And Answer | Shaikh Abdur Razzak Bin Yousuf\n");
        hashMap.put("vdo_desciption", "Bangla Islamic Qustion And Answer | Shaikh Abdur Razzak Bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "fiag_ssmt1I");
        hashMap.put("vdo_title", "Abdur razzak bin yousuf bangla waz কিয়ামতের ভয়ংকর বর্ণনা\n");
        hashMap.put("vdo_desciption", "Abdur razzak bin yousuf bangla waz কিয়ামতের ভয়ংকর বর্ণনা\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "VsDo26e2FGs");
        hashMap.put("vdo_title", "এবার মহিলাদের নিয়ে চ্যালেঞ্জিং বক্তব্য | শায়খ আব্দুর রাজ্জাক বিন ইউসুফ | abdur razzak bin yousuf\n");
        hashMap.put("vdo_desciption", "এবার মহিলাদের নিয়ে চ্যালেঞ্জিং বক্তব্য | শায়খ আব্দুর রাজ্জাক বিন ইউসুফ | abdur razzak bin yousuf\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "JGXPw9DN4dw");
        hashMap.put("vdo_title", "পর্নোগ্রাফি আসক্তি? কি করবেন জেনে নিন | আব্দুর রাজ্জাক বিন ইউসুফ | abdur razzak bin yousuf\n");
        hashMap.put("vdo_desciption", "পর্নোগ্রাফি আসক্তি? কি করবেন জেনে নিন | আব্দুর রাজ্জাক বিন ইউসুফ | abdur razzak bin yousuf\n");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "V0OOmY_rE2c");
        hashMap.put("vdo_title", "New Bnagla | Waz | Kurbani Sat Vager Kono Hadis Nei | Shaikh Abdur Razzak Bin Yousuf | 2017\n");
        hashMap.put("vdo_desciption", "New Bnagla | Waz | Kurbani Sat Vager Kono Hadis Nei | Shaikh Abdur Razzak Bin Yousuf | 2017\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ZtVfBmjiEEk");
        hashMap.put("vdo_title", "যে আমলে অতীতের সব পাপ ক্ষমা হয়ে যায় | sheikh abdur razzak bin yousuf | আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "যে আমলে অতীতের সব পাপ ক্ষমা হয়ে যায় | sheikh abdur razzak bin yousuf | আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Pt6zpbHpqRM");
        hashMap.put("vdo_title", "আদ-দাজ্জাল কে এবং কোথায় ? দাজ্জাল কবে আসবে? সে দেখতে কেমন? আব্দুর রাজ্জাক | Abdur Razzak bin Yousuf\n");
        hashMap.put("vdo_desciption", "আদ-দাজ্জাল কে এবং কোথায় ? দাজ্জাল কবে আসবে? সে দেখতে কেমন? আব্দুর রাজ্জাক | Abdur Razzak bin Yousuf\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "rKUAKypy490");
        hashMap.put("vdo_title", "বিচার দিবস।।শায়েখ আব্দুর রাজ্জাক বিন ইউসুফ।।Abdur Razzak Bin Yousuf Motivision\n");
        hashMap.put("vdo_desciption", "বিচার দিবস।।শায়েখ আব্দুর রাজ্জাক বিন ইউসুফ।।Abdur Razzak Bin Yousuf Motivision\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KepdYVj6oNA");
        hashMap.put("vdo_title", "হরতালের নামে সরকারী সম্পদ নষ্ট করা যাবে কি | abdur razzak bin yousuf | abdur razzaq bin yousuf waz\n");
        hashMap.put("vdo_desciption", "হরতালের নামে সরকারী সম্পদ নষ্ট করা যাবে কি | abdur razzak bin yousuf | abdur razzaq bin yousuf waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "N_SrBTLEzDE");
        hashMap.put("vdo_title", "সিয়াম রোজা নিয়ে অবাক করা ওয়াজ | abdur razzak bin yousuf | abdur razzak bin yousuf waz\n");
        hashMap.put("vdo_desciption", "সিয়াম রোজা নিয়ে অবাক করা ওয়াজ | abdur razzak bin yousuf | abdur razzak bin yousuf waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6g7W62H0ttI");
        hashMap.put("vdo_title", "শায়খ আব্দুর রাজ্জাকের ওপর হামলার বর্ণনা শুনুন/ Abdur Razzak bin Yousuf new waz 2021/ Razzak er hamla\n");
        hashMap.put("vdo_desciption", "শায়খ আব্দুর রাজ্জাকের ওপর হামলার বর্ণনা শুনুন/ Abdur Razzak bin Yousuf new waz 2021/ Razzak er hamla\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6g7W62H0ttI");
        hashMap.put("vdo_title", "শায়খ আব্দুর রাজ্জাকের ওপর হামলার বর্ণনা শুনুন/ Abdur Razzak bin Yousuf new waz 2021/ Razzak er hamla\n");
        hashMap.put("vdo_desciption", "শায়খ আব্দুর রাজ্জাকের ওপর হামলার বর্ণনা শুনুন/ Abdur Razzak bin Yousuf new waz 2021/ Razzak er hamla\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "NMjYuyUams0");
        hashMap.put("vdo_title", "শায়েখ আবদুর রাজ্জাক বিন ইউসুফ নতুন ওয়াজ। আব্দুর রাজ্জাক বিন ইউসুফ। abdur rajjak bin yousuf new waz\n");
        hashMap.put("vdo_desciption", "শায়েখ আবদুর রাজ্জাক বিন ইউসুফ নতুন ওয়াজ। আব্দুর রাজ্জাক বিন ইউসুফ। abdur rajjak bin yousuf new waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "D0JVc4URFug");
        hashMap.put("vdo_title", "১০ মিনিটে ২১ টি প্রশ্নের উত্তর | আব্দুর রাজ্জাক বিন ইউসুফ | abdur razzak bin yousuf\n");
        hashMap.put("vdo_desciption", "১০ মিনিটে ২১ টি প্রশ্নের উত্তর | আব্দুর রাজ্জাক বিন ইউসুফ | abdur razzak bin yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "NYg7upUO9gE");
        hashMap.put("vdo_title", "জুমার খুতবা | jumar khutba sheikh abdur razzak bin yousuf | শাইখ আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "জুমার খুতবা | jumar khutba sheikh abdur razzak bin yousuf | শাইখ আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "hzKUAIWylMg");
        hashMap.put("vdo_title", "Pohela Boishakh Palon Korle Shirk Hoy! | Abdur Razzak Bin Yousuf | Bangla Waaz | 4K | Nasir Media\n");
        hashMap.put("vdo_desciption", "Pohela Boishakh Palon Korle Shirk Hoy! | Abdur Razzak Bin Yousuf | Bangla Waaz | 4K | Nasir Media\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3oZdT1UNia0");
        hashMap.put("vdo_title", "ধোকা | abdur razzak bin yousuf new waz | abdur razzak bin yousuf | শাইখ আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "ধোকা | abdur razzak bin yousuf new waz | abdur razzak bin yousuf | শাইখ আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Ip4wigxuWhE");
        hashMap.put("vdo_title", "যে ভাবে চুল কাঁটা হারাম | আব্দুর রাজ্জাক বিন ইউসুফ নিউ ওয়াজ | abdur razzak bin yousuf waz\n");
        hashMap.put("vdo_desciption", "যে ভাবে চুল কাঁটা হারাম | আব্দুর রাজ্জাক বিন ইউসুফ নিউ ওয়াজ | abdur razzak bin yousuf waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9vhgp8CWsEo");
        hashMap.put("vdo_title", "কি কি থাকলে যাকাত দিতে হবে? Abdur Razzak Bin Yousuf | Zakat I New Lecture\n");
        hashMap.put("vdo_desciption", "কি কি থাকলে যাকাত দিতে হবে? Abdur Razzak Bin Yousuf | Zakat I New Lecture\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "EDCM6kGbTT8");
        hashMap.put("vdo_title", "অপরাধীর হাত কেন বাধা হয় | শাইখ আব্দুর রাজ্জাক বিন ইউসুফ | আব্দুর রাজ্জাক বিন ইউসুফ নতুন বক্তব্য\n");
        hashMap.put("vdo_desciption", "অপরাধীর হাত কেন বাধা হয় | শাইখ আব্দুর রাজ্জাক বিন ইউসুফ | আব্দুর রাজ্জাক বিন ইউসুফ নতুন বক্তব্য\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "y59pNLlDM9o");
        hashMap.put("vdo_title", "পেটে বাচ্ছা আসলে কি করবেন। শায়েখ আব্দুর রাজ্জাক বিন ইউসুফ।\n");
        hashMap.put("vdo_desciption", "পেটে বাচ্ছা আসলে কি করবেন। শায়েখ আব্দুর রাজ্জাক বিন ইউসুফ।\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "YeNRuAQcA2A");
        hashMap.put("vdo_title", "#abdurrazzakbinyousuf আযানের জবাবের সাওয়াব শুনুন | Abdur Razzak Bin Yousuf | 2018 [FHD]\n");
        hashMap.put("vdo_desciption", "#abdurrazzakbinyousuf আযানের জবাবের সাওয়াব শুনুন | Abdur Razzak Bin Yousuf | 2018 [FHD]\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tmmimpeIMHY");
        hashMap.put("vdo_title", "দেখুন কীভাবে শিক্ষা উঠে গেছে | Short Waz | Sheikh Abdur Razzak Bin Yousuf | 2018\n");
        hashMap.put("vdo_desciption", "দেখুন কীভাবে শিক্ষা উঠে গেছে | Short Waz | Sheikh Abdur Razzak Bin Yousuf | 2018\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8goZGrUamFo");
        hashMap.put("vdo_title", "আকিকা (Akika) সম্পর্কে বিস্তারিত জেনে নিন - শাইখ আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "আকিকা (Akika) সম্পর্কে বিস্তারিত জেনে নিন - শাইখ আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "NpUEoqPonbc");
        hashMap.put("vdo_title", "আমাদের বাসায় যখন র0্যাব পুলিশ আসলো | sheikh abdur razzak bin yousuf | শাইখ আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "আমাদের বাসায় যখন র0্যাব পুলিশ আসলো | sheikh abdur razzak bin yousuf | শাইখ আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ViQKebNPAaY");
        hashMap.put("vdo_title", "অসৎ আমল | Sheikh abdur razzak bin yousuf new waz 2021 | abdur razzak bin yousuf\n");
        hashMap.put("vdo_desciption", "অসৎ আমল | Sheikh abdur razzak bin yousuf new waz 2021 | abdur razzak bin yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "sk5yJwEBPXI");
        hashMap.put("vdo_title", "অল্প সময়ে অভাব দুর হবে, বাড়বে ধন-সম্পদ যে আমলে । আব্দুর রাজ্জাক বিন ইউসুফ । Abdur Razzak Bin Yousuf\n");
        hashMap.put("vdo_desciption", "অল্প সময়ে অভাব দুর হবে, বাড়বে ধন-সম্পদ যে আমলে । আব্দুর রাজ্জাক বিন ইউসুফ । Abdur Razzak Bin Yousuf\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1VyXTgMxC5g");
        hashMap.put("vdo_title", "মরণকে স্মরণ | আব্দুর রাজ্জাক বিন ইউসুফ | Moron Charbena Abdur Razzak bin Yousuf\n");
        hashMap.put("vdo_desciption", "মরণকে স্মরণ | আব্দুর রাজ্জাক বিন ইউসুফ | Moron Charbena Abdur Razzak bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Vz2fNJJe6ow");
        hashMap.put("vdo_title", "জান্নাতের রাইয়ান দরজা । আব্দুর রাজ্জাক বিন ইউসুফ । ramadan 2021 abdur razzak bin yousuf\n");
        hashMap.put("vdo_desciption", "জান্নাতের রাইয়ান দরজা । আব্দুর রাজ্জাক বিন ইউসুফ । ramadan 2021 abdur razzak bin yousuf\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "zIl7KIYfiUE");
        hashMap.put("vdo_title", "ঈদের দিন কোলাকুলি করা যাবে? আব্দুর রাজ্জাক বিন ইউসুফ | eid abdur razzak bin yousuf\n");
        hashMap.put("vdo_desciption", "ঈদের দিন কোলাকুলি করা যাবে? আব্দুর রাজ্জাক বিন ইউসুফ | eid abdur razzak bin yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "zY5ek3d_9oc");
        hashMap.put("vdo_title", "সিলেট গ্রামের পর গ্রাম নতুন একটা বিদআত চালু করেছে আজানের সময় ।আব্দুর রাজ্জাক বিন ইউসুফ । আজানে বিদআত\n");
        hashMap.put("vdo_desciption", "সিলেট গ্রামের পর গ্রাম নতুন একটা বিদআত চালু করেছে আজানের সময় ।আব্দুর রাজ্জাক বিন ইউসুফ । আজানে বিদআত\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5s6HRmgh_XA");
        hashMap.put("vdo_title", "Bangla Waz 2018 Abdur Razzak Bin Yousuf(Salat / Namaj Na Porle Ki Hoy) | Islamic Waz 2018 | New Waz\n");
        hashMap.put("vdo_desciption", "Bangla Waz 2018 Abdur Razzak Bin Yousuf(Salat / Namaj Na Porle Ki Hoy) | Islamic Waz 2018 | New Waz\n");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3NnX_ucOM24");
        hashMap.put("vdo_title", "হারামের তথ্য || Abdur Razzak Bin Yousuf আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "হারামের তথ্য || Abdur Razzak Bin Yousuf আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "BEc8eY00Hi8");
        hashMap.put("vdo_title", "Bangla Waz 2017 Apnake O Apnar Stri K Bolchi by Abdur Razzak bin Yousuf| Free Bangla Waz|Islamic Waz\n");
        hashMap.put("vdo_desciption", "Bangla Waz 2017 Apnake O Apnar Stri K Bolchi by Abdur Razzak bin Yousuf| Free Bangla Waz|Islamic Waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "maJLpMKskKo");
        hashMap.put("vdo_title", "শায়খ আব্দুর রাজ্জক বিন ইউসুফ আজকের জুমার খুতবা | sheikh abdur razzak bin yousuf new jumar khutba\n");
        hashMap.put("vdo_desciption", "শায়খ আব্দুর রাজ্জক বিন ইউসুফ আজকের জুমার খুতবা | sheikh abdur razzak bin yousuf new jumar khutba\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "eb6UzlHjpp8");
        hashMap.put("vdo_title", "গোসলের নিয়ম bangla waz 2017 Abdur Razzak bin Yousuf || new bangla lecture 2018 - Islamic Jalsa - 30\n");
        hashMap.put("vdo_desciption", "গোসলের নিয়ম bangla waz 2017 Abdur Razzak bin Yousuf || new bangla lecture 2018 - Islamic Jalsa - 30\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "qDhn8g7Rjxs");
        hashMap.put("vdo_title", "এরাই জাহান্নামী মহিলা | আব্দুর রাজ্জাক বিন ইউসুফ | Erai Jahannami Mohila | Abdur Razzak bin Yousuf\n");
        hashMap.put("vdo_desciption", "এরাই জাহান্নামী মহিলা | আব্দুর রাজ্জাক বিন ইউসুফ | Erai Jahannami Mohila | Abdur Razzak bin Yousuf\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "eMmlN9Cjvzk");
        hashMap.put("vdo_title", "কয়েকটি মানুষের বানানো জাল হাদিস | abdur razzak bin yousuf | Sheikh abdur razzak bin yousuf new waz\n");
        hashMap.put("vdo_desciption", "কয়েকটি মানুষের বানানো জাল হাদিস | abdur razzak bin yousuf | Sheikh abdur razzak bin yousuf new waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "q8Tmakipsaw");
        hashMap.put("vdo_title", "Bangla Waz 2017 Qurbani Goshto Bontoner Poddhoti by Abdur Razzak bin Yousuf | Free Bangla Waz\n");
        hashMap.put("vdo_desciption", "Bangla Waz 2017 Qurbani Goshto Bontoner Poddhoti by Abdur Razzak bin Yousuf | Free Bangla Waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1DKGDEV7cFo");
        hashMap.put("vdo_title", "গীবত ও পরনিন্দা আব্দুর রাজ্জাক বিন ইউসুফ | Gibot o Poroninda Abdur Razzak Bin Yousuf Bangla Waz\n");
        hashMap.put("vdo_desciption", "গীবত ও পরনিন্দা আব্দুর রাজ্জাক বিন ইউসুফ | Gibot o Poroninda Abdur Razzak Bin Yousuf Bangla Waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Av2P86fUJOk");
        hashMap.put("vdo_title", "Islamic Short Lecture │Good Manners│New Bangla Waz │Abdur Razzak Bin Yousuf Short Waz 2017\n");
        hashMap.put("vdo_desciption", "Islamic Short Lecture │Good Manners│New Bangla Waz │Abdur Razzak Bin Yousuf Short Waz 2017\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "XWxCvTckn8I");
        hashMap.put("vdo_title", "শেষ পর্যন্ত মুখ খুললেন আব্দুর রাজ্জাক বিন ইউসুফ abdur razzak bin yousuf আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "শেষ পর্যন্ত মুখ খুললেন আব্দুর রাজ্জাক বিন ইউসুফ abdur razzak bin yousuf আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3taM6wMqLHg");
        hashMap.put("vdo_title", "New Bangla Waz.Abdur Razzak Bin Yousuf.\n");
        hashMap.put("vdo_desciption", "New Bangla Waz.Abdur Razzak Bin Yousuf.\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "CEybSc5RM74");
        hashMap.put("vdo_title", "সবচেয়ে উত্তম দোয়া !! | আব্দুর রাজ্জাক বিন ইউসুফ | Dua | Abdur Razzak bin Yousuf\n");
        hashMap.put("vdo_desciption", "সবচেয়ে উত্তম দোয়া !! | আব্দুর রাজ্জাক বিন ইউসুফ | Dua | Abdur Razzak bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "nbtQWdfjXUA");
        hashMap.put("vdo_title", "Happy New Year/Thirty First Night | Abdur Razzak Bin Yousuf | Nasir Media\n");
        hashMap.put("vdo_desciption", "Happy New Year/Thirty First Night | Abdur Razzak Bin Yousuf | Nasir Media\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "k2xyEfnTcj4");
        hashMap.put("vdo_title", "মা কাকে বলে দেখুন একটু । শায়খ আব্দুর রাজ্জাক বিন ইউসুফ নতুন ওয়াজ । abdur razzak bin yousuf new waz\n");
        hashMap.put("vdo_desciption", "মা কাকে বলে দেখুন একটু । শায়খ আব্দুর রাজ্জাক বিন ইউসুফ নতুন ওয়াজ । abdur razzak bin yousuf new waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vZ3ZTQyClyw");
        hashMap.put("vdo_title", "প্রধানমন্ত্রীকে উদ্দেশ্য করে দুঃসাহসী বক্তব্য || Sheikh Abdur Razzak bin Yousuf ||\n");
        hashMap.put("vdo_desciption", "প্রধানমন্ত্রীকে উদ্দেশ্য করে দুঃসাহসী বক্তব্য || Sheikh Abdur Razzak bin Yousuf ||\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "WJC7Gxva_Og");
        hashMap.put("vdo_title", "চুড়ান্ত ঘোষণা ইনশাআল্লাহ আমি সফল হবই হব abdur razzak bin yousuf আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "চুড়ান্ত ঘোষণা ইনশাআল্লাহ আমি সফল হবই হব abdur razzak bin yousuf আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "7WfjFxWcdJQ");
        hashMap.put("vdo_title", "সূরা ইখলাস এর ফজিলত শুনে কলিজা ঠান্ডা | আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "সূরা ইখলাস এর ফজিলত শুনে কলিজা ঠান্ডা | আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "IdlArFTH3XM");
        hashMap.put("vdo_title", "আল্লাহকে ভয় করার ফজীলত । by Sheikh Abdur Razzak Bin Yousuf\n");
        hashMap.put("vdo_desciption", "আল্লাহকে ভয় করার ফজীলত । by Sheikh Abdur Razzak Bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SICFpDyjf9c");
        hashMap.put("vdo_title", "How to Use Sutra ? abdur razzaj bin yousuf | shikh abdur razzak bin yousuf new was | abdur razzak 20\n");
        hashMap.put("vdo_desciption", "How to Use Sutra ? abdur razzaj bin yousuf | shikh abdur razzak bin yousuf new was | abdur razzak 20\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "rjhAQ0xgjek");
        hashMap.put("vdo_title", "জাহান্নামের ভয়াবহ শাস্তি, আজাব, আগুন নিয়ে ওয়াজ | Bangla Waz | Abdur Razzak Bin Yousuf - Jahannam\n");
        hashMap.put("vdo_desciption", "জাহান্নামের ভয়াবহ শাস্তি, আজাব, আগুন নিয়ে ওয়াজ | Bangla Waz | Abdur Razzak Bin Yousuf - Jahannam\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "HBKfZfu9rAk");
        hashMap.put("vdo_title", "নারীদের নিয়ে বিশেষ সতর্কতা বাণী | আব্দুর রাজ্জাক বিন ইউসুফ | Nari by Sheikh Abdur Razzak bin Yousuf\n");
        hashMap.put("vdo_desciption", "নারীদের নিয়ে বিশেষ সতর্কতা বাণী | আব্দুর রাজ্জাক বিন ইউসুফ | Nari by Sheikh Abdur Razzak bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "k2xyEfnTcj4");
        hashMap.put("vdo_title", "মা কাকে বলে দেখুন একটু । শায়খ আব্দুর রাজ্জাক বিন ইউসুফ নতুন ওয়াজ । abdur razzak bin yousuf new waz\n");
        hashMap.put("vdo_desciption", "মা কাকে বলে দেখুন একটু । শায়খ আব্দুর রাজ্জাক বিন ইউসুফ নতুন ওয়াজ । abdur razzak bin yousuf new waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "PBOBmgmQNtI");
        hashMap.put("vdo_title", "জাহান্নামীরা দেখতে কেমন? | জাহান্নামের তথ্য || Abdur Razzak Bin Yousuf আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "জাহান্নামীরা দেখতে কেমন? | জাহান্নামের তথ্য || Abdur Razzak Bin Yousuf আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "2OvtrJ6DITg");
        hashMap.put("vdo_title", "বেপর্দা মেয়ে কেমন! মেয়েদের সচেতন করুন┇Bangla Best Waz┇Abdur Razzak Bin Yousuf\n");
        hashMap.put("vdo_desciption", "বেপর্দা মেয়ে কেমন! মেয়েদের সচেতন করুন┇Bangla Best Waz┇Abdur Razzak Bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Ig_vwDTNeKM");
        hashMap.put("vdo_title", "শাইখ আব্দুর রাজ্জাক বিন ইউসুফের জীবন কাহিনী শুনুন তার মুখেই\n");
        hashMap.put("vdo_desciption", "শাইখ আব্দুর রাজ্জাক বিন ইউসুফের জীবন কাহিনী শুনুন তার মুখেই\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "pCKVD3sab78");
        hashMap.put("vdo_title", "Can Fasting Without Eating Sahri? | Abdur Razzak Bin Yousuf | Nasir Media\n");
        hashMap.put("vdo_desciption", "Can Fasting Without Eating Sahri? | Abdur Razzak Bin Yousuf | Nasir Media\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "E_TrhSRZmgk");
        hashMap.put("vdo_title", "মা বোনদের জন্য ২০২১ সালের সেরা ওয়াজ | শায়েখ আব্দুর রাজ্জাক বিন ইউসুফ | abdur razzak bin yousuf\n");
        hashMap.put("vdo_desciption", "মা বোনদের জন্য ২০২১ সালের সেরা ওয়াজ | শায়েখ আব্দুর রাজ্জাক বিন ইউসুফ | abdur razzak bin yousuf\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tPnPxFy0WGQ");
        hashMap.put("vdo_title", "সিয়াম | তারাবি | ইফতার | লাইলাতুল কদরের গুরুত্ব এবং কিভাবে পালন করবো | আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "সিয়াম | তারাবি | ইফতার | লাইলাতুল কদরের গুরুত্ব এবং কিভাবে পালন করবো | আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "EyMvHJv0474");
        hashMap.put("vdo_title", "Six Siam Of Shawwal Month | Abdur Razzak Bin Yousuf\n");
        hashMap.put("vdo_desciption", "Six Siam Of Shawwal Month | Abdur Razzak Bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "L4I4doh7LS8");
        hashMap.put("vdo_title", "ভাগ্য নিয়ে সুন্দর আলোচনা করলেন ।আব্দুর রাজ্জাক বিন ইউসুফ। Abdur Razzak Bin Yousuf\n");
        hashMap.put("vdo_desciption", "ভাগ্য নিয়ে সুন্দর আলোচনা করলেন ।আব্দুর রাজ্জাক বিন ইউসুফ। Abdur Razzak Bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "W7Et2TwZKmU");
        hashMap.put("vdo_title", "Borjatri | বরযাত্রী | আব্দুর রাজ্জাক বিন ইউসুফ | Abdur Razzak bin Yousuf\n");
        hashMap.put("vdo_desciption", "Borjatri | বরযাত্রী | আব্দুর রাজ্জাক বিন ইউসুফ | Abdur Razzak bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "thVf9_FULag");
        hashMap.put("vdo_title", "Virus a Contagious Disease? | Shaikh Abdur Razzaq Bin Yusuf | Nasir Media\n");
        hashMap.put("vdo_desciption", "Virus a Contagious Disease? | Shaikh Abdur Razzaq Bin Yusuf | Nasir Media\n");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "NAJTc3YhVbQ");
        hashMap.put("vdo_title", "abdur razzak bin yousuf 2021 new | abdur razzak bin yousuf |\n");
        hashMap.put("vdo_desciption", "abdur razzak bin yousuf 2021 new | abdur razzak bin yousuf |\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "dfzs1Ylmafk");
        hashMap.put("vdo_title", "New Bangla Short Waz | আত্মহত্যা থেকে সাবধান | Abdur Razzak BIn Yousuf | 2018\n");
        hashMap.put("vdo_desciption", "New Bangla Short Waz | আত্মহত্যা থেকে সাবধান | Abdur Razzak BIn Yousuf | 2018\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "DoiUUi5hAjU");
        hashMap.put("vdo_title", "Bangla new waz ║ Abdur Razzak Bin Yousuf║Islamic media bangla waz\n");
        hashMap.put("vdo_desciption", "Bangla new waz ║ Abdur Razzak Bin Yousuf║Islamic media bangla waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3o4PEkUjnFs");
        hashMap.put("vdo_title", "New Bnagla Waz | Shirk Er Voyabohota | Sheikh Abdur Razzak Bin Yousuf | 2017\n");
        hashMap.put("vdo_desciption", "New Bnagla Waz | Shirk Er Voyabohota | Sheikh Abdur Razzak Bin Yousuf | 2017\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1cCwiFI_tcE");
        hashMap.put("vdo_title", "Salafi Conferance 2021 , Abdur razzak bin yousuf jumer khutba 2021 | Shikh ABdur Razzak 2021\n");
        hashMap.put("vdo_desciption", "Salafi Conferance 2021 , Abdur razzak bin yousuf jumer khutba 2021 | Shikh ABdur Razzak 2021\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SV33i8XVNWo");
        hashMap.put("vdo_title", "আকিকা দেওয়ার নিয়ম | Rules of Akika | Shaikh Abdur Razzak Bin Yousuf\n");
        hashMap.put("vdo_desciption", "আকিকা দেওয়ার নিয়ম | Rules of Akika | Shaikh Abdur Razzak Bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "u4svg7I3Z9U");
        hashMap.put("vdo_title", "অবৈধ জিনিস | shaikh abdur razzak bin yousuf | abdur razzak bin yousuf | আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "অবৈধ জিনিস | shaikh abdur razzak bin yousuf | abdur razzak bin yousuf | আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "pSCN2elrXkA");
        hashMap.put("vdo_title", "সতর্কবাণী | আব্দুর রাজ্জাক বিন ইউসুফ | Abdur Razzak bin Yousuf\n");
        hashMap.put("vdo_desciption", "সতর্কবাণী | আব্দুর রাজ্জাক বিন ইউসুফ | Abdur Razzak bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "C1niIuUnkyg");
        hashMap.put("vdo_title", "Mrittor Age Theke kobor Porjonto 241 ti Bidath | By Abdur Razzak Bin Yousuf | Salat Kayem Koro\n");
        hashMap.put("vdo_desciption", "Mrittor Age Theke kobor Porjonto 241 ti Bidath | By Abdur Razzak Bin Yousuf | Salat Kayem Koro\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3sUD_mJgOHE");
        hashMap.put("vdo_title", "তারাবি ৮ না ২০ সরাসরি সহী হাদিস থেকে প্রমান | আব্দুর রাজ্জাক বিন ইউসুফ | abdur ruzzak bin yousuf\n");
        hashMap.put("vdo_desciption", "তারাবি ৮ না ২০ সরাসরি সহী হাদিস থেকে প্রমান | আব্দুর রাজ্জাক বিন ইউসুফ | abdur ruzzak bin yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "2YcJZVeGPdY");
        hashMap.put("vdo_title", "New Bangla Sort Waz | Dhormer Nam A Mitha Kotha | Abdur Razzak Bin Yousuf | 2017\n");
        hashMap.put("vdo_desciption", "New Bangla Sort Waz | Dhormer Nam A Mitha Kotha | Abdur Razzak Bin Yousuf | 2017\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "TRlsdsONqA0");
        hashMap.put("vdo_title", "ইসলামে যে প্রশ্নের উত্তর নেই ।। আব্দুর রাজ্জাক বিন ইউসুফ ।। Abdur Razzak Bin Yousuf\n");
        hashMap.put("vdo_desciption", "ইসলামে যে প্রশ্নের উত্তর নেই ।। আব্দুর রাজ্জাক বিন ইউসুফ ।। Abdur Razzak Bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "u63T5fHNoY8");
        hashMap.put("vdo_title", "আল্লাহ তা'য়ালার কাছে তাওবা ও ইস্তেগফার করার পদ্ধতি বা দো'আ | আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "আল্লাহ তা'য়ালার কাছে তাওবা ও ইস্তেগফার করার পদ্ধতি বা দো'আ | আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "gOMHZW4PXBE");
        hashMap.put("vdo_title", "ব্যাঙ,কাঁকড়া,কচ্ছপ,অক্টোপাস, শামুক খাওয়া কি হালাল?আব্দুর রাজ্জাক বিন ইউসুফ।Abdur Razzak Bin Yousuf\n");
        hashMap.put("vdo_desciption", "ব্যাঙ,কাঁকড়া,কচ্ছপ,অক্টোপাস, শামুক খাওয়া কি হালাল?আব্দুর রাজ্জাক বিন ইউসুফ।Abdur Razzak Bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "k6LGNxkPPow");
        hashMap.put("vdo_title", "কত টাকা থাকলে যাকাত দিতে হবে ? কখন ফরজ হয় । How much money to pay Zakat? Abdur Razzak bin Yousuf\n");
        hashMap.put("vdo_desciption", "কত টাকা থাকলে যাকাত দিতে হবে ? কখন ফরজ হয় । How much money to pay Zakat? Abdur Razzak bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "TrxisRTw_Lo");
        hashMap.put("vdo_title", "ভুলেও যে কথা গুলো স্ত্রী কে বলবেন না | আব্দুর রাজ্জাক বিন ইউসুফ | বাংলা ওয়াজ|Abdur Razzak bin Yousuf\n");
        hashMap.put("vdo_desciption", "ভুলেও যে কথা গুলো স্ত্রী কে বলবেন না | আব্দুর রাজ্জাক বিন ইউসুফ | বাংলা ওয়াজ|Abdur Razzak bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_KN_oHFwhdI");
        hashMap.put("vdo_title", "Abdullah Bin Abdur Razzak new waz 2021 | Abdullah bin abdur razzak | sheikh abdullah\n");
        hashMap.put("vdo_desciption", "Abdullah Bin Abdur Razzak new waz 2021 | Abdullah bin abdur razzak | sheikh abdullah\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1AW6V3veXYo");
        hashMap.put("vdo_title", "দীর্ঘ দিন পরে অগ্নি ঝরা ওয়াজ | Abdullah bin abdur razzak new waz | abdullah bin abdur razzaq waz\n");
        hashMap.put("vdo_desciption", "দীর্ঘ দিন পরে অগ্নি ঝরা ওয়াজ | Abdullah bin abdur razzak new waz | abdullah bin abdur razzaq waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "PrfEpnCSu7I");
        hashMap.put("vdo_title", "ঈমান বাচাতে যা করতে হবে | আব্দুল্লাহ বিন আব্দুর রাজ্জাক Abdullah bin abdur Razzak\n");
        hashMap.put("vdo_desciption", "ঈমান বাচাতে যা করতে হবে | আব্দুল্লাহ বিন আব্দুর রাজ্জাক Abdullah bin abdur Razzak\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1OWv7fxC7gM");
        hashMap.put("vdo_title", "বাপের দেওয়া ফতোয়া ছেলে ও ছেরে কথা বললেন না, আব্দুল্লাহ বিন আব্দুর রাজ্জাক, abdullah bin abdur ..\n");
        hashMap.put("vdo_desciption", "বাপের দেওয়া ফতোয়া ছেলে ও ছেরে কথা বললেন না, আব্দুল্লাহ বিন আব্দুর রাজ্জাক, abdullah bin abdur ..\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vl26RjueRqU");
        hashMap.put("vdo_title", "সবচেয়ে বড় বুদ্ধিমান কে | Abdullah bin abdur razzak waz | শায়েখ আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        hashMap.put("vdo_desciption", "সবচেয়ে বড় বুদ্ধিমান কে | Abdullah bin abdur razzak waz | শায়েখ আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ByyxTGOCpR8");
        hashMap.put("vdo_title", "দেশে এতো কিছু হচ্ছে আহলে হাদিসরা চুপ কেন | Abdullah bin abdur razzak new waz | শায়খ আব্দুল্লাহ ওয়াজ\n");
        hashMap.put("vdo_desciption", "দেশে এতো কিছু হচ্ছে আহলে হাদিসরা চুপ কেন | Abdullah bin abdur razzak new waz | শায়খ আব্দুল্লাহ ওয়াজ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "epe9qYmCOGw");
        hashMap.put("vdo_title", "বড় সফল ব্যাক্তি হবেন কিভাবে | abdullah bin abdur razzak new waz | আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        hashMap.put("vdo_desciption", "বড় সফল ব্যাক্তি হবেন কিভাবে | abdullah bin abdur razzak new waz | আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8Q4uld7DJ4I");
        hashMap.put("vdo_title", "পুরো পৃথিবী নাড়িয়ে দিল শত করা ৯৯% মুসলিম জানে না abdullah bin abdur razzak\n");
        hashMap.put("vdo_desciption", "পুরো পৃথিবী নাড়িয়ে দিল শত করা ৯৯% মুসলিম জানে না abdullah bin abdur razzak\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "64VoLnFf0aA");
        hashMap.put("vdo_title", "অন্তর ঠিক তো সব ঠিক | আব্দুল্লাহ বিন আব্দুর রাজ্জাক নতুন ওয়াজ | abdullah bin abdur razzak\n");
        hashMap.put("vdo_desciption", "অন্তর ঠিক তো সব ঠিক | আব্দুল্লাহ বিন আব্দুর রাজ্জাক নতুন ওয়াজ | abdullah bin abdur razzak\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "LPNvgWM4ylw");
        hashMap.put("vdo_title", "একেই বলে বাপের বেটা - আব্দুল্লাহ বিন আব্দুর রাজ্জাক - Abdullah Bin Abdur Razzak\n");
        hashMap.put("vdo_desciption", "একেই বলে বাপের বেটা - আব্দুল্লাহ বিন আব্দুর রাজ্জাক - Abdullah Bin Abdur Razzak\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "E8B3gc89MrY");
        hashMap.put("vdo_title", "রুহের জগৎ থেকে শুরু | Abdullah bin abdur razzak waz | শায়েখ আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        hashMap.put("vdo_desciption", "রুহের জগৎ থেকে শুরু | Abdullah bin abdur razzak waz | শায়েখ আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "oiPwHhhFie4");
        hashMap.put("vdo_title", "জারজ রাহুল তুই আমাকে এই ভাবে দিলি || আব্দুর রাজ্জাক বিন ইউছুফ\n");
        hashMap.put("vdo_desciption", "জারজ রাহুল তুই আমাকে এই ভাবে দিলি || আব্দুর রাজ্জাক বিন ইউছুফ\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Zz2m1zNsNcg");
        hashMap.put("vdo_title", "প্রশ্নের উত্তর দিতে পারলে ইসলাম গ্রহন করবো। ব্রাদার রাহুল হোসেন রুহুল আমিন। Brother rahul hossain\n");
        hashMap.put("vdo_desciption", "প্রশ্নের উত্তর দিতে পারলে ইসলাম গ্রহন করবো। ব্রাদার রাহুল হোসেন রুহুল আমিন। Brother rahul hossain\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "HSr5xWCfXLI");
        hashMap.put("vdo_title", "যে কাজ করলে সফলতা আসবেই | abdullah bin abdur razzak new waz | আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        hashMap.put("vdo_desciption", "যে কাজ করলে সফলতা আসবেই | abdullah bin abdur razzak new waz | আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5PC1gASwxN4");
        hashMap.put("vdo_title", "ক্ষমতা | Abdullah bin abdur razzak new waz | শায়খ আব্দুল্লাহ বিন আব্দুর রাজ্জাক ওয়াজ\n");
        hashMap.put("vdo_desciption", "ক্ষমতা | Abdullah bin abdur razzak new waz | শায়খ আব্দুল্লাহ বিন আব্দুর রাজ্জাক ওয়াজ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "MlArvz9hJnw");
        hashMap.put("vdo_title", "Abdullah Bin Abdur Razzak। ফিলিস্তানির ইতিহাস ৩য় অংশ । আল আকসা মসজিদ\n");
        hashMap.put("vdo_desciption", "Abdullah Bin Abdur Razzak। ফিলিস্তানির ইতিহাস ৩য় অংশ । আল আকসা মসজিদ\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "JzyntEIdyXc");
        hashMap.put("vdo_title", "যুবক তুমি প্রেম করে কেনো বিবাহ করতে গেলে | abdullah bin abdur razzak | আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        hashMap.put("vdo_desciption", "যুবক তুমি প্রেম করে কেনো বিবাহ করতে গেলে | abdullah bin abdur razzak | আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "W7mFoV7LLzI");
        hashMap.put("vdo_title", "মাশাহআল্লাহ! বাপ বেটা এক মঞ্চে প্রশ্ন উত্তর ।আব্দুল্লাহ বিন আব্দুর রাজ্জাক।Abdur Razzak Bin Yousuf\n");
        hashMap.put("vdo_desciption", "মাশাহআল্লাহ! বাপ বেটা এক মঞ্চে প্রশ্ন উত্তর ।আব্দুল্লাহ বিন আব্দুর রাজ্জাক।Abdur Razzak Bin Yousuf\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Oy68f5Co5pU");
        hashMap.put("vdo_title", "আবদুল্লাহ বিন আব্দুর রজ্জাক, ২০/০১/২১। Abdullah Bin Abdur Razzak new waz 2021\n");
        hashMap.put("vdo_desciption", "আবদুল্লাহ বিন আব্দুর রজ্জাক, ২০/০১/২১। Abdullah Bin Abdur Razzak new waz 2021\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lkKRUK5l8PA");
        hashMap.put("vdo_title", "Abdullah bin abdur razzak new waz 2020|মাস্ক পরে নামাজ পড়া যাবে না।\n");
        hashMap.put("vdo_desciption", "Abdullah bin abdur razzak new waz 2020|মাস্ক পরে নামাজ পড়া যাবে না।\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "UhxRlXQYwgw");
        hashMap.put("vdo_title", "যারা বউয়ের কাজ করে আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "যারা বউয়ের কাজ করে আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "AZIVOfh4c9k");
        hashMap.put("vdo_title", "Masik al itisam channel. Abdur Rajjak Bin Yousuf.\n");
        hashMap.put("vdo_desciption", "Masik al itisam channel. Abdur Rajjak Bin Yousuf.\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "wAvn0C2Qsck");
        hashMap.put("vdo_title", "প্রত্যেকটি কথা কোটি টাকার চেয়ে দামী | abdullah bin abdur razzak waz | আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        hashMap.put("vdo_desciption", "প্রত্যেকটি কথা কোটি টাকার চেয়ে দামী | abdullah bin abdur razzak waz | আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3IWWwOv7OeY");
        hashMap.put("vdo_title", "৩১ টি জটিল প্রশ্নের উত্তর সবাই শুনুন | আব্দুল্লাহ বিন আব্দুর রাজ্জাক | abdullah bin abdur razzak\n");
        hashMap.put("vdo_desciption", "৩১ টি জটিল প্রশ্নের উত্তর সবাই শুনুন | আব্দুল্লাহ বিন আব্দুর রাজ্জাক | abdullah bin abdur razzak\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xk1dgx2Kkqo");
        hashMap.put("vdo_title", "মেয়েদের যে কথাগুলো শুনতেই হবে - শায়খ আব্দুল্লাহ বিন আব্দুর রাযযাক - Abdullah Bin abdur Razzak\n");
        hashMap.put("vdo_desciption", "মেয়েদের যে কথাগুলো শুনতেই হবে - শায়খ আব্দুল্লাহ বিন আব্দুর রাযযাক - Abdullah Bin abdur Razzak\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "2QGuOd2kemI");
        hashMap.put("vdo_title", "কাবা ঘরের উপর আসমানে কি আছে ? অজানা তথ্য। আব্দুল্লাহ বিন আব্দুর রাজ্জাক।abdullah bin abdur razzak\n");
        hashMap.put("vdo_desciption", "কাবা ঘরের উপর আসমানে কি আছে ? অজানা তথ্য। আব্দুল্লাহ বিন আব্দুর রাজ্জাক।abdullah bin abdur razzak\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "0FyLtdYYHxs");
        hashMap.put("vdo_title", "আদমজাতের জীবনের অর্ধেক সময় শেষ কর্মের জন্য।আব্দুল্লাহ বিন আব্দুর রাজ্জাক। abdullah bin abdur razzak\n");
        hashMap.put("vdo_desciption", "আদমজাতের জীবনের অর্ধেক সময় শেষ কর্মের জন্য।আব্দুল্লাহ বিন আব্দুর রাজ্জাক। abdullah bin abdur razzak\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "L57xMy1eijQ");
        hashMap.put("vdo_title", "আজিব প্রশ্ন করে বসলো শায়খ আব্দুল্লাহকে | 17 টি প্রশ্নের উত্তর | প্রশ্নোত্তর পর্ব আব্দুল্লাহ\n");
        hashMap.put("vdo_desciption", "আজিব প্রশ্ন করে বসলো শায়খ আব্দুল্লাহকে | 17 টি প্রশ্নের উত্তর | প্রশ্নোত্তর পর্ব আব্দুল্লাহ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_D3MADox4mM");
        hashMap.put("vdo_title", "তিন ছেলে নিয়ে যে স্বপ্ন দেখেন || Sheikh Abdur Razzak Bin Yousuf\n");
        hashMap.put("vdo_desciption", "তিন ছেলে নিয়ে যে স্বপ্ন দেখেন || Sheikh Abdur Razzak Bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vh6SVPSZUmY");
        hashMap.put("vdo_title", "Abdullah Bin Abdur Razzak ।Jumar kutba । 11 06 2021\n");
        hashMap.put("vdo_desciption", "Abdullah Bin Abdur Razzak ।Jumar kutba । 11 06 2021\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "e38QzMMTZTc");
        hashMap.put("vdo_title", "ভারতের বর্তমান পরিস্থিতির জন্যে কে দায়ী? ১৪০০ বছর আগে মুহাম্মদ (সাঃ) কি বলেছিলেন। আব্দুল্লাহ বিন আব.\n");
        hashMap.put("vdo_desciption", "ভারতের বর্তমান পরিস্থিতির জন্যে কে দায়ী? ১৪০০ বছর আগে মুহাম্মদ (সাঃ) কি বলেছিলেন। আব্দুল্লাহ বিন আব.\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jOQXdowNYRY");
        hashMap.put("vdo_title", "সালাত নিয়ে এ বছরের শ্রেষ্ট ওয়াজ | আব্দুল্লাহ বিন আব্দুর রাযযাক | আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        hashMap.put("vdo_desciption", "সালাত নিয়ে এ বছরের শ্রেষ্ট ওয়াজ | আব্দুল্লাহ বিন আব্দুর রাযযাক | আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Du5qP1MkH4A");
        hashMap.put("vdo_title", "অন্যের দোষ গোপন রাখার ফজিলত | sheikh abdur razzak bin yousuf | শাইখ আব্দুর রাজ্জাক বিন ইউসুফ\n");
        hashMap.put("vdo_desciption", "অন্যের দোষ গোপন রাখার ফজিলত | sheikh abdur razzak bin yousuf | শাইখ আব্দুর রাজ্জাক বিন ইউসুফ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "m26WzQ8tIB4");
        hashMap.put("vdo_title", "ছেলের যে ওয়াজ শুনে অবাক পিতা | আব্দুর রহমান বিন আব্দুর রাজ্জাক নতুন ওয়াজ | abdur rahman bin razzak\n");
        hashMap.put("vdo_desciption", "ছেলের যে ওয়াজ শুনে অবাক পিতা | আব্দুর রহমান বিন আব্দুর রাজ্জাক নতুন ওয়াজ | abdur rahman bin razzak\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "T1iTG0soblU");
        hashMap.put("vdo_title", "He cried himself   Abdur Rahman bin Abdur Razzak.September 9, 2019\n");
        hashMap.put("vdo_desciption", "He cried himself   Abdur Rahman bin Abdur Razzak.September 9, 2019\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ApRvKZTnzZ0");
        hashMap.put("vdo_title", "আব্দুর রহমান বিন আব্দুর রাজ্জাক | Abdur Rahman Bin Abdur Razzak | waz 2020 | islamic waz 2020\n");
        hashMap.put("vdo_desciption", "আব্দুর রহমান বিন আব্দুর রাজ্জাক | Abdur Rahman Bin Abdur Razzak | waz 2020 | islamic waz 2020\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6lzASTWjvlc");
        hashMap.put("vdo_title", "সন্তানের মুখে নতুন ওয়াজ শুনে অবাক পিতা। abdur rahman bin abdur razzak । abdur razzak bin yousuf\n");
        hashMap.put("vdo_desciption", "সন্তানের মুখে নতুন ওয়াজ শুনে অবাক পিতা। abdur rahman bin abdur razzak । abdur razzak bin yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ykK0jmFY_Wc");
        hashMap.put("vdo_title", "আব্দুর রহমান বিন আব্দুর রাজ্জাক । আব্দুর রহমান বিন আব্দুর রাযযাক ।abdur rahman bin abdur razzak\n");
        hashMap.put("vdo_desciption", "আব্দুর রহমান বিন আব্দুর রাজ্জাক । আব্দুর রহমান বিন আব্দুর রাযযাক ।abdur rahman bin abdur razzak\n");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "oUaUig1jNHE");
        hashMap.put("vdo_title", "তিন শায়খ সম্পর্কে আব্দুর রাজ্জাক বিন ইউসুফ একি বললেন | Abdur Razzak Bin Yousuf\n");
        hashMap.put("vdo_desciption", "তিন শায়খ সম্পর্কে আব্দুর রাজ্জাক বিন ইউসুফ একি বললেন | Abdur Razzak Bin Yousuf\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_Gczk5IXUmk");
        hashMap.put("vdo_title", "কথাগুলো বিশ্বাস করবেন না | আব্দুল্লাহ বিন আব্দুর রাজ্জাক | abdullah bin abdur razzak waz\n");
        hashMap.put("vdo_desciption", "কথাগুলো বিশ্বাস করবেন না | আব্দুল্লাহ বিন আব্দুর রাজ্জাক | abdullah bin abdur razzak waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "LGOZUnFZcsg");
        hashMap.put("vdo_title", "ইস্তেগফার পড়ার গুরুত্ব ও ফজিলত। দোয়া ইস্তেগফার । গোনাহ মাপের দোয়া। আব্দুর রহমান বিন আব্দুর রাযযাক\n");
        hashMap.put("vdo_desciption", "ইস্তেগফার পড়ার গুরুত্ব ও ফজিলত। দোয়া ইস্তেগফার । গোনাহ মাপের দোয়া। আব্দুর রহমান বিন আব্দুর রাযযাক\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "y2apNEZSkuI");
        hashMap.put("vdo_title", "পারলে এই চ্যালেঞ্জ কেউ গ্রহণ কর I Abdur Rahman Bin Abdur Razzak I আব্দুর রহমান বিন আব্দুর রাজ্জাক\n");
        hashMap.put("vdo_desciption", "পারলে এই চ্যালেঞ্জ কেউ গ্রহণ কর I Abdur Rahman Bin Abdur Razzak I আব্দুর রহমান বিন আব্দুর রাজ্জাক\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jVe9N9iL9lY");
        hashMap.put("vdo_title", "ABDUR RAHAMAN BIN ABDUR RAZZAK (ARABIC)\n");
        hashMap.put("vdo_desciption", "ABDUR RAHAMAN BIN ABDUR RAZZAK (ARABIC)\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "mgsFJ0Qu9bk");
        hashMap.put("vdo_title", "Abdur Rahman bin Abdur Razzak | আব্দুর রহমান বিন আব্দুর রাজ্জাক | Abdur Rahman bin Abdur Razzak\n");
        hashMap.put("vdo_desciption", "Abdur Rahman bin Abdur Razzak | আব্দুর রহমান বিন আব্দুর রাজ্জাক | Abdur Rahman bin Abdur Razzak\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Dk5gsE00yKw");
        hashMap.put("vdo_title", "গাজীপুরে তথ্যবহুল বিজ্ঞান ভিত্তিক ওয়াজ | আব্দুর রহমান বিন আব্দুর রাজ্জাক নতুন ওয়াজ | abdur rahman\n");
        hashMap.put("vdo_desciption", "গাজীপুরে তথ্যবহুল বিজ্ঞান ভিত্তিক ওয়াজ | আব্দুর রহমান বিন আব্দুর রাজ্জাক নতুন ওয়াজ | abdur rahman\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_Tk1WtCjVLw");
        hashMap.put("vdo_title", "বাপকে সামনে রেখে বক্তিতা করলেন শাইখ আব্দুরহমান বিন আব্দুরাজ্জাক / Shaykh Abdurrahman bin Abdurazak\n");
        hashMap.put("vdo_desciption", "বাপকে সামনে রেখে বক্তিতা করলেন শাইখ আব্দুরহমান বিন আব্দুরাজ্জাক / Shaykh Abdurrahman bin Abdurazak\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "7zlmIYab4xw");
        hashMap.put("vdo_title", "অবাক পিতা | আব্দুর রহমান বিন আব্দুর রাজ্জাক নতুন ওয়াজ | abdur rahman bin razzak\n");
        hashMap.put("vdo_desciption", "অবাক পিতা | আব্দুর রহমান বিন আব্দুর রাজ্জাক নতুন ওয়াজ | abdur rahman bin razzak\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "CUqarDZlZQM");
        hashMap.put("vdo_title", "ছেলেও কাঁদলেন বাবাও কাঁদলেন।Abdur Rahaman Bin Abdur Razzak\n");
        hashMap.put("vdo_desciption", "ছেলেও কাঁদলেন বাবাও কাঁদলেন।Abdur Rahaman Bin Abdur Razzak\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "yVlwxQoK6sg");
        hashMap.put("vdo_title", "কবরের ভয়াবহ শাস্তি | koborer ajab | আব্দুর রাজ্জাক বিন ইউসুফ ওয়াজ | abdur razzak bin yousuf waz\n");
        hashMap.put("vdo_desciption", "কবরের ভয়াবহ শাস্তি | koborer ajab | আব্দুর রাজ্জাক বিন ইউসুফ ওয়াজ | abdur razzak bin yousuf waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "nphjdRz5tlY");
        hashMap.put("vdo_title", "কুরআন নিয়ে দলাদলি | Abdullah Bin Abdur Razzak new waz 2021 | Abdullah bin abdur razzak\n");
        hashMap.put("vdo_desciption", "কুরআন নিয়ে দলাদলি | Abdullah Bin Abdur Razzak new waz 2021 | Abdullah bin abdur razzak\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3oscWVBskkA");
        hashMap.put("vdo_title", "লোম দাড়িয়ে যাবে কথাগুলো শুনে | Abdur Rahman Bin Abdur Razzak\n");
        hashMap.put("vdo_desciption", "লোম দাড়িয়ে যাবে কথাগুলো শুনে | Abdur Rahman Bin Abdur Razzak\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "fDhqH35CexE");
        hashMap.put("vdo_title", "Maulk Mut is at your door. Abdur Rahman bin Abdur Razzak September 7, 2019\n");
        hashMap.put("vdo_desciption", "Maulk Mut is at your door. Abdur Rahman bin Abdur Razzak September 7, 2019\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "iwh91LTd6NI");
        hashMap.put("vdo_title", "Dr.Mujaffor bin Mohsin full bangla waz | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        hashMap.put("vdo_desciption", "Dr.Mujaffor bin Mohsin full bangla waz | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4ujHwAICB_w");
        hashMap.put("vdo_title", "কয়েকটি ভয়াবহ জাল হাদিস | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        hashMap.put("vdo_desciption", "কয়েকটি ভয়াবহ জাল হাদিস | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "YPAQFrK0Q7E");
        hashMap.put("vdo_title", "সরাসরি কেয়ামতের আলামত দেখুন ড মুজাফফর বিন মহসিন Shaikh Dr. Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "সরাসরি কেয়ামতের আলামত দেখুন ড মুজাফফর বিন মহসিন Shaikh Dr. Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "QctGeOE0JQ0");
        hashMap.put("vdo_title", "মিথ্যা অপবাদ দেওয়ায় কঠোর জবাব দিলেন রেজাউল করিম আবরার কে | Dr. Muzaffar Bin Mohsin, islamer pothe\n");
        hashMap.put("vdo_desciption", "মিথ্যা অপবাদ দেওয়ায় কঠোর জবাব দিলেন রেজাউল করিম আবরার কে | Dr. Muzaffar Bin Mohsin, islamer pothe\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "d5HU4YrajfY");
        hashMap.put("vdo_title", "অবাক কথা বিস্তারিত জানুন || ড.মুজাফফর বিন মহসিন || dr muzaffar bin mohsin 2021 || Bangla waz bd ||\n");
        hashMap.put("vdo_desciption", "অবাক কথা বিস্তারিত জানুন || ড.মুজাফফর বিন মহসিন || dr muzaffar bin mohsin 2021 || Bangla waz bd ||\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "wG0994estPg");
        hashMap.put("vdo_title", "মিজানুর রহমান আজহারির ভ্রান্ত ফতোয়ার জবাব দিলেন মুজাফফর বিন মহসিন ~ Mujaffor Bin Mohsin Q&A 2020\n");
        hashMap.put("vdo_desciption", "মিজানুর রহমান আজহারির ভ্রান্ত ফতোয়ার জবাব দিলেন মুজাফফর বিন মহসিন ~ Mujaffor Bin Mohsin Q&A 2020\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "NKmS93q9iak");
        hashMap.put("vdo_title", "ড: মুজাফফর বিন মহসিন এবার মাজহাবি হয়ে গেলো | muzaffar bin mohsin new waz 2021\n");
        hashMap.put("vdo_desciption", "ড: মুজাফফর বিন মহসিন এবার মাজহাবি হয়ে গেলো | muzaffar bin mohsin new waz 2021\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "QKuy678D3KI");
        hashMap.put("vdo_title", "যুবক যুবতি সাবধান | muzaffar bin mohsin new waz 2021 | dr mujaffor bin mohsin | মুজাফফর বিন মহসিন\n");
        hashMap.put("vdo_desciption", "যুবক যুবতি সাবধান | muzaffar bin mohsin new waz 2021 | dr mujaffor bin mohsin | মুজাফফর বিন মহসিন\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "UP2ra_FpUH8");
        hashMap.put("vdo_title", "Mojaffor Bin Mohsin waz অন্তর কাঁপানো একটি ওয়াজ\n");
        hashMap.put("vdo_desciption", "Mojaffor Bin Mohsin waz অন্তর কাঁপানো একটি ওয়াজ\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "sP0HoaBhYig");
        hashMap.put("vdo_title", "যে পরিবার ধ্বংস হবেই | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        hashMap.put("vdo_desciption", "যে পরিবার ধ্বংস হবেই | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "dyr1PcEnWNs");
        hashMap.put("vdo_title", "সহিহ আকিদার আলেমদের মাঝে এত সমস্যা কেন │শায়খ ড.মুজাফফর বিন মুহসিন\n");
        hashMap.put("vdo_desciption", "সহিহ আকিদার আলেমদের মাঝে এত সমস্যা কেন │শায়খ ড.মুজাফফর বিন মুহসিন\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "R_xMBNG7ikc");
        hashMap.put("vdo_title", "প্রশ্ন দেখে ছিঁড়ে ফেললেন | শাইখ ডঃ মুযাফফর বিন মুহসিন | 2019 New [Full HD]\n");
        hashMap.put("vdo_desciption", "প্রশ্ন দেখে ছিঁড়ে ফেললেন | শাইখ ডঃ মুযাফফর বিন মুহসিন | 2019 New [Full HD]\n");
        arrayList.add(hashMap);//------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "nP30vfU2B_A");
        hashMap.put("vdo_title", "Dr.Mujaffor bin Mohsin full bangla waz | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        hashMap.put("vdo_desciption", "Dr.Mujaffor bin Mohsin full bangla waz | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "M1QCQFiLCak");
        hashMap.put("vdo_title", "AbdurRazzakBinYousuf JumarKhutba 04 06 2021 । জুমার খুতবাহ আব্দুর রাজ্জাক বিন ইউসুফ ।\n");
        hashMap.put("vdo_desciption", "AbdurRazzakBinYousuf JumarKhutba 04 06 2021 । জুমার খুতবাহ আব্দুর রাজ্জাক বিন ইউসুফ ।\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Yfa9CgxbOg4");
        hashMap.put("vdo_title", "Dr.Mujaffor bin Mohsin full bangla waz | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        hashMap.put("vdo_desciption", "Dr.Mujaffor bin Mohsin full bangla waz | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        arrayList.add(hashMap);//------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "fVMuSq0H9oI");
        hashMap.put("vdo_title", "সালাত/নামাজ Mojaffor Bin Mohsin\n");
        hashMap.put("vdo_desciption", "সালাত/নামাজ Mojaffor Bin Mohsin\n");
        arrayList.add(hashMap);//------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "FVCyHIy0AJA");
        hashMap.put("vdo_title", "জান্নাতের হুরের থুথু - D. Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "জান্নাতের হুরের থুথু - D. Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "XvtT6Vtd6iU");
        hashMap.put("vdo_title", "হাসবি রাব্বি জাল্লাল্লাহ গজলটি শির্ক Mujaffor Bin Mohsin মুযাফফর বিন মুহসিন \u200Dalor poth 1\n");
        hashMap.put("vdo_desciption", "হাসবি রাব্বি জাল্লাল্লাহ গজলটি শির্ক Mujaffor Bin Mohsin মুযাফফর বিন মুহসিন \u200Dalor poth 1\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "JSFqrS1Qmc0");
        hashMap.put("vdo_title", "প্রধানমন্ত্রীকে এ কি বললেন sheikh dr muzaffar bin mohsin শাইখ ড. মুজাফ্ফর বিন মহসিন\n");
        hashMap.put("vdo_desciption", "প্রধানমন্ত্রীকে এ কি বললেন sheikh dr muzaffar bin mohsin শাইখ ড. মুজাফ্ফর বিন মহসিন\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_1KJ9Im32_s");
        hashMap.put("vdo_title", "সাহসিকতার সাথে একবিংশ শতাব্দীর সকল নোংরামি তুলে ধরলেন । ড.মুজাফফর বিন মহসিন । Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "সাহসিকতার সাথে একবিংশ শতাব্দীর সকল নোংরামি তুলে ধরলেন । ড.মুজাফফর বিন মহসিন । Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "LAlqjcCxo0k");
        hashMap.put("vdo_title", "তাওহীদ ও তাগুদ একই সাথে মানা! Dr. Muzaffar Bin Mohsin Lecture\n");
        hashMap.put("vdo_desciption", "তাওহীদ ও তাগুদ একই সাথে মানা! Dr. Muzaffar Bin Mohsin Lecture\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "wbIjLLSYJSo");
        hashMap.put("vdo_title", "বেনামাজি || মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        hashMap.put("vdo_desciption", "বেনামাজি || মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "W7A93lSLjP4");
        hashMap.put("vdo_title", "শিরকযুক্ত দাওয়াত ও তাবলীগ।।ড. মুজাফফর বিন মহসিন ।।Mojaffor Bin Mohsin ।।\n");
        hashMap.put("vdo_desciption", "শিরকযুক্ত দাওয়াত ও তাবলীগ।।ড. মুজাফফর বিন মহসিন ।।Mojaffor Bin Mohsin ।।\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jLEBAnPG4eM");
        hashMap.put("vdo_title", "DEDLIVE WAZএই কাজ করে মরলেই জান্নাত┇Dr.Mujaffor Bin Mohsin ♦️লাইভ ওয়াজ মাহফিল♦️\n");
        hashMap.put("vdo_desciption", "এই কাজ করে মরলেই জান্নাত┇Dr.Mujaffor Bin Mohsin ♦️লাইভ ওয়াজ মাহফিল♦️\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "MvQYt8vMaM4");
        hashMap.put("vdo_title", "এখনও নামাজ পরেন না (বেনামাজি কেমন) - Shaikh Dr. Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "এখনও নামাজ পরেন না (বেনামাজি কেমন) - Shaikh Dr. Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "gasbPnm6VPs");
        hashMap.put("vdo_title", "এক মুরুব্বীর কাণ্ড দেখুন -Murubbi's deeds - D. Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "এক মুরুব্বীর কাণ্ড দেখুন -Murubbi's deeds - D. Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);//------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "K1hy_90qYYY");
        hashMap.put("vdo_title", "ফাজায়েলে জিকির দেখুন | Shaikh Dr Muzaffor Bin Mohsin | 2019 New [Full HD]\n");
        hashMap.put("vdo_desciption", "ফাজায়েলে জিকির দেখুন | Shaikh Dr Muzaffor Bin Mohsin | 2019 New [Full HD]\n");
        arrayList.add(hashMap);//------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "7ynsp1NP6Gw");
        hashMap.put("vdo_title", "Bangla Waz Tarabi o Tahajjud Ki Alada Salat by Mujaffor bin Mohsin | Free Bangla Waz\n");
        hashMap.put("vdo_desciption", "Bangla Waz Tarabi o Tahajjud Ki Alada Salat by Mujaffor bin Mohsin | Free Bangla Waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "I0RdNpWa42w");
        hashMap.put("vdo_title", "করা জবাব দিলেন স্বরাষ্ট্রমন্ত্রীকে / ড. মুজাফ্ফর বিন মহসিন Dr Muzaffar Bin Mohsin - 2019\n");
        hashMap.put("vdo_desciption", "করা জবাব দিলেন স্বরাষ্ট্রমন্ত্রীকে / ড. মুজাফ্ফর বিন মহসিন Dr Muzaffar Bin Mohsin - 2019\n");
        arrayList.add(hashMap);//------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "mjxnbHnVbkw");
        hashMap.put("vdo_title", "New Bangla Waz তাওহীদের মূল্যায়ন এবং গুরুত্ব | Tawhid by Mujaffor bin Mohsin | BD Islamic Waz Video\n");
        hashMap.put("vdo_desciption", "New Bangla Waz তাওহীদের মূল্যায়ন এবং গুরুত্ব | Tawhid by Mujaffor bin Mohsin | BD Islamic Waz Video\n");
        arrayList.add(hashMap);//------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "JaT6DMlvb6s");
        hashMap.put("vdo_title", "এই কাজ না করে কেউ মরবেন না - Dr Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "এই কাজ না করে কেউ মরবেন না - Dr Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "CxQ1PEjZgfQ");
        hashMap.put("vdo_title", "কথাগুলো মন ছুয়ে গেল - ডঃ মুযাফফর বিন মুহসিন - Dr. Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "কথাগুলো মন ছুয়ে গেল - ডঃ মুযাফফর বিন মুহসিন - Dr. Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3XQV2EQ3rCE");
        hashMap.put("vdo_title", "Dr. Mujaffor Bin Mohsin Best Bangla Waz | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin waz\n");
        hashMap.put("vdo_desciption", "Dr. Mujaffor Bin Mohsin Best Bangla Waz | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "2kblrGqfcsw");
        hashMap.put("vdo_title", "বিবাহ বিভ্রান্তি কেন জানুন-//-Why Marriage is Confusing - Dr Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "বিবাহ বিভ্রান্তি কেন জানুন-//-Why Marriage is Confusing - Dr Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_M0Bz7oB0RE");
        hashMap.put("vdo_title", "বাশার বিন হায়াত আলীর ভবিষ্যৎ | শায়খ ডঃ মুজাফফর বিন মহসিন | sheikh muzaffar bin mohsin\n");
        hashMap.put("vdo_desciption", "বাশার বিন হায়াত আলীর ভবিষ্যৎ | শায়খ ডঃ মুজাফফর বিন মহসিন | sheikh muzaffar bin mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "iK8IaUffUx8");
        hashMap.put("vdo_title", "জাহেলিয়াত | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        hashMap.put("vdo_desciption", "জাহেলিয়াত | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "36DYQFP0Suk");
        hashMap.put("vdo_title", "শিরক সম্পর্কে মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin waz\n");
        hashMap.put("vdo_desciption", "শিরক সম্পর্কে মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin waz\n");
        arrayList.add(hashMap);

       //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "36DYQFP0Suk");
        hashMap.put("vdo_title", "শিরক সম্পর্কে মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin waz\n");
        hashMap.put("vdo_desciption", "শিরক সম্পর্কে মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KDRe4TSV3lo");
        hashMap.put("vdo_title", "গরু দিয়ে আকীকা চলবে কি? || ড.মুযাফফর বিন মুহসিন || D.Muzaffar bin Mohosin\n");
        hashMap.put("vdo_desciption", "গরু দিয়ে আকীকা চলবে কি? || ড.মুযাফফর বিন মুহসিন || D.Muzaffar bin Mohosin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xobwefnr6sg");
        hashMap.put("vdo_title", "বহাসে খবর , shayekh mojaffor bin mohsin.শাইখ মুজাফফর বিন মহসিন\n");
        hashMap.put("vdo_desciption", "বহাসে খবর , shayekh mojaffor bin mohsin.শাইখ মুজাফফর বিন মহসিন\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "NNZKpuUXKOA");
        hashMap.put("vdo_title", "আল্লাহ কেন ইহুদীদের ধ্বংস করছেন না ? | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        hashMap.put("vdo_desciption", "আল্লাহ কেন ইহুদীদের ধ্বংস করছেন না ? | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "CWumpzDgJlE");
        hashMap.put("vdo_title", "কাদের জন্য দোয়া করা ইসলামে নিষেধdr mojaffor bin mohsin\n");
        hashMap.put("vdo_desciption", "কাদের জন্য দোয়া করা ইসলামে নিষেধdr mojaffor bin mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "a2DJ41OGHhA");
        hashMap.put("vdo_title", "আহলে হাদিসরা করলে ! সব ঠিক - D. Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "আহলে হাদিসরা করলে ! সব ঠিক - D. Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "s_r0UYmxrMQ");
        hashMap.put("vdo_title", "জুমার খুৎবা মুসলিম জাতির ঘুম ভাঙ্গালো ড. মুজাফফর বিন মহসিন Shaikh Dr. Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "জুমার খুৎবা মুসলিম জাতির ঘুম ভাঙ্গালো ড. মুজাফফর বিন মহসিন Shaikh Dr. Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "zBh05myGb1I");
        hashMap.put("vdo_title", "New Bangla Short Waz | Taknor Nice Pant Keno ? | Sheikh Dr Muzaffar Bin Mohsin | 2018 [FHD]\n");
        hashMap.put("vdo_desciption", "New Bangla Short Waz | Taknor Nice Pant Keno ? | Sheikh Dr Muzaffar Bin Mohsin | 2018 [FHD]\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "UNjNztAyOkA");
        hashMap.put("vdo_title", "বিতর নামাজ পড়ার নিয়ম বিস্তারিত। Dr. muzaffar bin mohsin,islamer pothe\n");
        hashMap.put("vdo_desciption", "বিতর নামাজ পড়ার নিয়ম বিস্তারিত। Dr. muzaffar bin mohsin,islamer pothe\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "HyphAPmk244");
        hashMap.put("vdo_title", "এই প্রথম মুখখুললেন মুজাফফর বিন মহসিন dr muzaffar bin mohsin\n");
        hashMap.put("vdo_desciption", "এই প্রথম মুখখুললেন মুজাফফর বিন মহসিন dr muzaffar bin mohsin\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "NeTkNaDYLjk");
        hashMap.put("vdo_title", "Omar RA. er Bepare Egulo Janle Obak Hoben■Mujaffor Bin Mohsin Islamic Bangla Waz Mahfil");
        hashMap.put("vdo_desciption", "Omar RA. er Bepare Egulo Janle Obak Hoben■Mujaffor Bin Mohsin Islamic Bangla Waz Mahfil");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "MWuhwjxX0xE");
        hashMap.put("vdo_title", "দান সদকাহ করার ফজিলত ও পদ্ধতি_অার না করার পরিনাম_Dr muzaffar bin mohsin | new bangla waz | waz 2020\n");
        hashMap.put("vdo_desciption", "দান সদকাহ করার ফজিলত ও পদ্ধতি_অার না করার পরিনাম_Dr muzaffar bin mohsin | new bangla waz | waz 2020\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "MWuhwjxX0xE");
        hashMap.put("vdo_title", "দান সদকাহ করার ফজিলত ও পদ্ধতি_অার না করার পরিনাম_Dr muzaffar bin mohsin | new bangla waz | waz 2020\n");
        hashMap.put("vdo_desciption", "দান সদকাহ করার ফজিলত ও পদ্ধতি_অার না করার পরিনাম_Dr muzaffar bin mohsin | new bangla waz | waz 2020\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "qO5FHf8Z2jA");
        hashMap.put("vdo_title", "এত ভয়ানক কথা - D. Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "এত ভয়ানক কথা - D. Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8683uoR6w2Q");
        hashMap.put("vdo_title", "মুকাররম বিন মহসিন | Mukarram bin Mohsin | শাইখ মুকাররম বিন মহসিন | Sheikh Mukarram Bin Mohsin\n");
        hashMap.put("vdo_desciption", "মুকাররম বিন মহসিন | Mukarram bin Mohsin | শাইখ মুকাররম বিন মহসিন | Sheikh Mukarram Bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "wb8XF8zTlSg");
        hashMap.put("vdo_title", "আখেরি বিদ-আত-//-Akheri Bid-At - Dr Muzaffor Bin Mohsin\n");
        hashMap.put("vdo_desciption", "আখেরি বিদ-আত-//-Akheri Bid-At - Dr Muzaffor Bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Bad1gDGlOG4");
        hashMap.put("vdo_title", "কয়েকটি ভয়াবহ জাল হাদিস | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin waz\n");
        hashMap.put("vdo_desciption", "কয়েকটি ভয়াবহ জাল হাদিস | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "udTdjf_5vTw");
        hashMap.put("vdo_title", "এবার চরমোনাই পীরকে শয়তান বললেন | ড. মুজাফফর বিন মহসিন ~ Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "এবার চরমোনাই পীরকে শয়তান বললেন | ড. মুজাফফর বিন মহসিন ~ Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "EQ4be4N40eU");
        hashMap.put("vdo_title", "ফাজায়েলে আমল জাতীকে শেষ করে দিয়েছে - D. Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "ফাজায়েলে আমল জাতীকে শেষ করে দিয়েছে - D. Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Zu5gcU71AoA");
        hashMap.put("vdo_title", "নগত ফযিলত শুনলে অবাক হবেন - Fazilat - D. Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "নগত ফযিলত শুনলে অবাক হবেন - Fazilat - D. Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1SOdXf3OY2M");
        hashMap.put("vdo_title", "কয়েকটি প্রসিদ্ধ জাল হাদীস। Shaikh Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "কয়েকটি প্রসিদ্ধ জাল হাদীস। Shaikh Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "WC5FMIw_3Eo");
        hashMap.put("vdo_title", "কোন সূরার কি ফজিলত বিস্তারিত জানুন | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        hashMap.put("vdo_desciption", "কোন সূরার কি ফজিলত বিস্তারিত জানুন | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ft5DFekMjfo");
        hashMap.put("vdo_title", "আল্লাহর ক্ষমার কথা শুনুন | শাইখ মুজাফফর বিন মহসিন | Dr Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "আল্লাহর ক্ষমার কথা শুনুন | শাইখ মুজাফফর বিন মহসিন | Dr Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "XuGAjjumYNs");
        hashMap.put("vdo_title", "আল্লাহ্র দাবী জানেন কি - D. Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "আল্লাহ্র দাবী জানেন কি - D. Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lTYwBpsqOHo");
        hashMap.put("vdo_title", "হঠাৎ রেগে গিয়ে করা কথা বললেন - D. Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "হঠাৎ রেগে গিয়ে করা কথা বললেন - D. Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "JgI4HU5e_UY");
        hashMap.put("vdo_title", "উস্তাদজীর ঘটনা নিয়ে মুখ খুললেন ডঃ মোজাফফর বিন মহসিন | Dr muzaffar bin mohsin new waz\n");
        hashMap.put("vdo_desciption", "উস্তাদজীর ঘটনা নিয়ে মুখ খুললেন ডঃ মোজাফফর বিন মহসিন | Dr muzaffar bin mohsin new waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "d_g_1B_ow90");
        hashMap.put("vdo_title", "কেয়ামতের অন্যতম আলামত Dr.Mojaffor Bin Mohsin\n");
        hashMap.put("vdo_desciption", "কেয়ামতের অন্যতম আলামত Dr.Mojaffor Bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "N7PK9mBBock");
        hashMap.put("vdo_title", "ড বিলাল ফিলিপস সম্পর্কে মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        hashMap.put("vdo_desciption", "ড বিলাল ফিলিপস সম্পর্কে মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Jtuyo1MgHhA");
        hashMap.put("vdo_title", "ওযুর দুয়া যদি এমন হয় | Shaikh Dr Muzaffor Bin Mohsin New | 2019 [Full HD]\n");
        hashMap.put("vdo_desciption", "ওযুর দুয়া যদি এমন হয় | Shaikh Dr Muzaffor Bin Mohsin New | 2019 [Full HD]\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ZYx9GHFsYzU");
        hashMap.put("vdo_title", "আমাকে বক্তব্য দিতে দেয়নি | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        hashMap.put("vdo_desciption", "আমাকে বক্তব্য দিতে দেয়নি | মুজাফফর বিন মহসিন ওয়াজ | muzaffar bin mohsin new waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "0VrQwFiU5CI");
        hashMap.put("vdo_title", "রমজানের খুৎবা | মুজাফফর বিন মহসিন ওয়াজ | ramadan khutba muzaffar bin mohsin waz\n");
        hashMap.put("vdo_desciption", "রমজানের খুৎবা | মুজাফফর বিন মহসিন ওয়াজ | ramadan khutba muzaffar bin mohsin waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "cPoLitxrSiI");
        hashMap.put("vdo_title", "আহালে হাদিসদের উপর মিথ্যাচার dr mojaffor bin mohsin\n");
        hashMap.put("vdo_desciption", "আহালে হাদিসদের উপর মিথ্যাচার dr mojaffor bin mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Czr73XbgIIc");
        hashMap.put("vdo_title", "বিষয়ঃ মানব জীবনে নামাজের প্রভাব-//- D. Muzaffar Bin Mohsin [Bangla Full Waz]\n");
        hashMap.put("vdo_desciption", "বিষয়ঃ মানব জীবনে নামাজের প্রভাব-//- D. Muzaffar Bin Mohsin [Bangla Full Waz]\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "o0DBdRHyjCw");
        hashMap.put("vdo_title", "শেষ পর্যন্ত চরমোনাই ধরা খেল Shaikh Muzaffar Bin Mohsin মুজাফফর বিন মহসিন এ\n");
        hashMap.put("vdo_desciption", "শেষ পর্যন্ত চরমোনাই ধরা খেল Shaikh Muzaffar Bin Mohsin মুজাফফর বিন মহসিন এ\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SVECoU3sWYk");
        hashMap.put("vdo_title", "শয়তানের কাছে বুড়া মানুষ কেনো এত সম্মানিত..? Shayekh Muzafafor bin Mohsin\n");
        hashMap.put("vdo_desciption", "শয়তানের কাছে বুড়া মানুষ কেনো এত সম্মানিত..? Shayekh Muzafafor bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6YEZkPjK4c0");
        hashMap.put("vdo_title", "শিয়াদের ধর্মীয় বিশ্বাস সম্পর্কে জানার পর আপনি চমকে যাবেন মুজাফফর বিন মহসিন Dr Mujaffor Bin Mohsin\n");
        hashMap.put("vdo_desciption", "শিয়াদের ধর্মীয় বিশ্বাস সম্পর্কে জানার পর আপনি চমকে যাবেন মুজাফফর বিন মহসিন Dr Mujaffor Bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "OBvSRpOL6jo");
        hashMap.put("vdo_title", "নিউ বাংলা ওয়াজ মুজাফফর বিন মহসিন ওয়াজ , Mozaffor Bin Mohsin , muzaffar bin mohsin new waz\n");
        hashMap.put("vdo_desciption", "নিউ বাংলা ওয়াজ মুজাফফর বিন মহসিন ওয়াজ , Mozaffor Bin Mohsin , muzaffar bin mohsin new waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "7tie5CQh8l4");
        hashMap.put("vdo_title", "Dr.Mojaffor Bin Mohsin বিদআত কাকে বলে। হাউজে কাউসার থেকে কাদের তাড়িয়ে দেয়া হবে?\n");
        hashMap.put("vdo_desciption", "Dr.Mojaffor Bin Mohsin বিদআত কাকে বলে। হাউজে কাউসার থেকে কাদের তাড়িয়ে দেয়া হবে?\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "r1Jf9Dg8l60");
        hashMap.put("vdo_title", "মুসলিম ঐক্যের মানদন্ড । by Sheikh Muzaffar Bin Mohsin\n");
        hashMap.put("vdo_desciption", "মুসলিম ঐক্যের মানদন্ড । by Sheikh Muzaffar Bin Mohsin\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "7nGeahAMf9Y");
        hashMap.put("vdo_title", "যে জ্ঞান শত শত মুফতির কাছে নেই | বাসার বিন হায়াত আলী | Basar bin Hayat Ali | tafsire basar\n");
        hashMap.put("vdo_desciption", "যে জ্ঞান শত শত মুফতির কাছে নেই | বাসার বিন হায়াত আলী | Basar bin Hayat Ali | tafsire basar\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ezWImJ79t24");
        hashMap.put("vdo_title", "এরা ভণ্ড হানাফি | বাসার বিন হায়াত আলী | Basar bin Hayat Ali new waz\n");
        hashMap.put("vdo_desciption", "এরা ভণ্ড হানাফি | বাসার বিন হায়াত আলী | Basar bin Hayat Ali new waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8KVc0wB0Cr0");
        hashMap.put("vdo_title", "বাশার বিন হায়াত আলী নতুন ওয়াজ | Basar bin hayat ali new waz | Basar bin hayat ali bangla waz 2021\n");
        hashMap.put("vdo_desciption", "বাশার বিন হায়াত আলী নতুন ওয়াজ | Basar bin hayat ali new waz | Basar bin hayat ali bangla waz 2021\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "TlDk1Kqt2TQ");
        hashMap.put("vdo_title", "কুমিল্লাতে নতুন ইতিহাস গড়লেন | বাশার বিন হায়াত আলী | Basar bin Hayat Ali new waz\n");
        hashMap.put("vdo_desciption", "কুমিল্লাতে নতুন ইতিহাস গড়লেন | বাশার বিন হায়াত আলী | Basar bin Hayat Ali new waz\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "r3b_vf0arVk");
        hashMap.put("vdo_title", "21 সালের মাহফিল । সেরা বক্তব্য । মুহাম্মদ বাশার বিন হায়াত আলী । basher bin hayer bew waz 2021\n");
        hashMap.put("vdo_desciption", "21 সালের মাহফিল । সেরা বক্তব্য । মুহাম্মদ বাশার বিন হায়াত আলী । basher bin hayer bew waz 2021\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "DIXrOzF8_1s");
        hashMap.put("vdo_title", "যে ওয়াজে মঞ্চ তোলপাড় | বাসার বিন হায়াত আলী | muhammad bashar bin hayat ali new waz\n");
        hashMap.put("vdo_desciption", "যে ওয়াজে মঞ্চ তোলপাড় | বাসার বিন হায়াত আলী | muhammad bashar bin hayat ali new waz\n");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3mi985zbhz4");
        hashMap.put("vdo_title", "নষ্ট অন্তর | Basar bin Hayat Ali 2021 | বাসার বিন হায়াত আলী\n");
        hashMap.put("vdo_desciption", "নষ্ট অন্তর | Basar bin Hayat Ali 2021 | বাসার বিন হায়াত আলী\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ihKH_xb_SZE");
        hashMap.put("vdo_title", "রাজশাহীতে নতুন ইতিহাস গড়লেন | বাশার বিন হায়াত আলী | Basar bin Hayat Ali new waz 24-02-2021\n");
        hashMap.put("vdo_desciption", "রাজশাহীতে নতুন ইতিহাস গড়লেন | বাশার বিন হায়াত আলী | Basar bin Hayat Ali new waz 24-02-2021\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "kdSfq7c63Kk");
        hashMap.put("vdo_title", "Abdullah Muhammad Basar | Abu Abdullah Muhammad Basar | Basher Bin Hayat | আব্দুল্লাহ মোহাম্মদ বাশার\n");
        hashMap.put("vdo_desciption", "Abdullah Muhammad Basar | Abu Abdullah Muhammad Basar | Basher Bin Hayat | আব্দুল্লাহ মোহাম্মদ বাশার\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "0gUgRB5MN8w");
        hashMap.put("vdo_title", "২৫০ খন্ডের তাফসীরে বাশারী নিয়ে অবাক করা তথ্য দিলেন Mufti Mohammad Ali মুফতি মোহাম্মদ আলী\n");
        hashMap.put("vdo_desciption", "২৫০ খন্ডের তাফসীরে বাশারী নিয়ে অবাক করা তথ্য দিলেন Mufti Mohammad Ali মুফতি মোহাম্মদ আলী\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "v1JyJyoWxcY");
        hashMap.put("vdo_title", "বাশার বিন হায়াত আলী ২০২১ । বাশার বিন হায়াত আলী ওয়াজ ২০২১ । bashar bin hayat 2021\n");
        hashMap.put("vdo_desciption", "বাশার বিন হায়াত আলী ২০২১ । বাশার বিন হায়াত আলী ওয়াজ ২০২১ । bashar bin hayat 2021\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "FZba2RAWw6Y");
        hashMap.put("vdo_title", "বাশারকে আটক কিন্তু কেন❓আবু আব্দুল্লাহ মোঃ বাশার বিন হায়াত আলী || Basar Bin Hayat Ali New Waz 2020\n");
        hashMap.put("vdo_desciption", "বাশারকে আটক কিন্তু কেন❓আবু আব্দুল্লাহ মোঃ বাশার বিন হায়াত আলী || Basar Bin Hayat Ali New Waz 2020\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KZzGs0LKNS8");
        hashMap.put("vdo_title", "কথা শুনে অন্তরটা কেঁপে ওঠে।আবু আব্দুল্লাহ মুহাম্মদ বাশার।Abu Abdullah Muhammad Basar।তাফসীরে বাশারী\n");
        hashMap.put("vdo_desciption", "কথা শুনে অন্তরটা কেঁপে ওঠে।আবু আব্দুল্লাহ মুহাম্মদ বাশার।Abu Abdullah Muhammad Basar।তাফসীরে বাশারী\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_E68xxrQ_OU");
        hashMap.put("vdo_title", "জুমার সালাত আদায় করার পর ও জুমা বাতিল বলেছেন মুহাম্মাদ (সা:) কি সেই কারন।আবুল বাশার বিন হায়াত আলী\n");
        hashMap.put("vdo_desciption", "জুমার সালাত আদায় করার পর ও জুমা বাতিল বলেছেন মুহাম্মাদ (সা:) কি সেই কারন।আবুল বাশার বিন হায়াত আলী\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "0lv1JoSNSL8");
        hashMap.put("vdo_title", "শত শত মুফতি লুকিয়ে রেখেছে ইসলামের যে বিষয়গুলো । বাসার বিন হায়াত আলী | Basar bin Hayat Ali\n");
        hashMap.put("vdo_desciption", "শত শত মুফতি লুকিয়ে রেখেছে ইসলামের যে বিষয়গুলো । বাসার বিন হায়াত আলী | Basar bin Hayat Ali\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "PHoGmjEuKBM");
        hashMap.put("vdo_title", "যে ওয়াজ করতে কান্না করে দিলেন বাসার বিন হায়াত আলী\n");
        hashMap.put("vdo_desciption", "যে ওয়াজ করতে কান্না করে দিলেন বাসার বিন হায়াত আলী\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "PHoGmjEuKBM");
        hashMap.put("vdo_title", "যে ওয়াজ করতে কান্না করে দিলেন বাসার বিন হায়াত আলী\n");
        hashMap.put("vdo_desciption", "যে ওয়াজ করতে কান্না করে দিলেন বাসার বিন হায়াত আলী\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "c6E3fwxqzxY");
        hashMap.put("vdo_title", "যুবক ভাই বোন একটু শুনুন | abdullah bin abdur razzak new waz | আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        hashMap.put("vdo_desciption", "যুবক ভাই বোন একটু শুনুন | abdullah bin abdur razzak new waz | আব্দুল্লাহ বিন আব্দুর রাজ্জাক\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "GC96LUEkOt4");
        hashMap.put("vdo_title", "বেহেশতী জেওর’ এর লেখক কি আশরাফ আলী থানবী (রহ)- নয় ? Br Rahul Hossain\n");
        hashMap.put("vdo_desciption", "বেহেশতী জেওর’ এর লেখক কি আশরাফ আলী থানবী (রহ)- নয় ? Br Rahul Hossain\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "T2uGBmkjsrQ");
        hashMap.put("vdo_title", "ফেইস দা পিপ্যুল অনৈক্যের কারণ বিতর্কের রিভিউ Br Rahul Hossain\n");
        hashMap.put("vdo_desciption", "ফেইস দা পিপ্যুল অনৈক্যের কারণ বিতর্কের রিভিউ Br Rahul Hossain\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xsWPSxf9iko");
        hashMap.put("vdo_title", "খ্রিষ্টান সিরিজ-৪০II বাইবেলের ১ টি ভার্সে ১২ টি ভুল Br Rahul Hossain\n");
        hashMap.put("vdo_desciption", "খ্রিষ্টান সিরিজ-৪০II বাইবেলের ১ টি ভার্সে ১২ টি ভুল Br Rahul Hossain\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "curFPI75DVw");
        hashMap.put("vdo_title", "হানাফি মুকাল্লিদের বাঁধা | ব্রাদার রাহুল হোসাইন | brother rahul hossain ruhul amin\n");
        hashMap.put("vdo_desciption", "হানাফি মুকাল্লিদের বাঁধা | ব্রাদার রাহুল হোসাইন | brother rahul hossain ruhul amin\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "7W1QJtfEAoA");
        hashMap.put("vdo_title", "আমরা আহলে হাদিস নাকি ফিতনা বাজ ? হক কথা বললে অনেকেরই গা জ্বলে | brother rahul hossain ruhul\n");
        hashMap.put("vdo_desciption", "আমরা আহলে হাদিস নাকি ফিতনা বাজ ? হক কথা বললে অনেকেরই গা জ্বলে | brother rahul hossain ruhul\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Xvt5Dez2Nxo");
        hashMap.put("vdo_title", "প্রশ্নের উত্তর দিতে পারলে পুরুস্কার দিবো prosno uttor porbo, Brother rahul hossain, bangla lecture\n");
        hashMap.put("vdo_desciption", "প্রশ্নের উত্তর দিতে পারলে পুরুস্কার দিবো prosno uttor porbo, Brother rahul hossain, bangla lecture\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Cy5UMT_v1vw");
        hashMap.put("vdo_title", "ব্রাদার রাহুল হোসেন এর পরিচিতি তার নিজের মুখে শুনুন | Who is Br. Rahul Hossain Ruhul Amin?\n");
        hashMap.put("vdo_desciption", "ব্রাদার রাহুল হোসেন এর পরিচিতি তার নিজের মুখে শুনুন | Who is Br. Rahul Hossain Ruhul Amin?\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "pWrKCyMGO9M");
        hashMap.put("vdo_title", "প্রশ্ন ও উত্তর | চরমোনাই পীরের ভন্ডামী সমগ্র | ব্রাদার রাহুল হোসেন রুহুল আমিন | Br Rahul Hossain\n");
        hashMap.put("vdo_desciption", "প্রশ্ন ও উত্তর | চরমোনাই পীরের ভন্ডামী সমগ্র | ব্রাদার রাহুল হোসেন রুহুল আমিন | Br Rahul Hossain\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_rqpXsdS7yU");
        hashMap.put("vdo_title", "ব্রাদার রাহুল হোসেন এর পড়াশোনার ধরন তার নিজের মুখে শুনুন | Br. Rahul Hossain Ruhul Amin\n");
        hashMap.put("vdo_desciption", "ব্রাদার রাহুল হোসেন এর পড়াশোনার ধরন তার নিজের মুখে শুনুন | Br. Rahul Hossain Ruhul Amin\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "YKF_rDyTNYs");
        hashMap.put("vdo_title", "বিদআত সম্পর্কে স্পষ্ট ধারনা রাখুন - ব্রাদার রাহুল হোসেন (Learn Bidat - Br. Rahul Hossain Ruhul Amin)\n");
        hashMap.put("vdo_desciption", "বিদআত সম্পর্কে স্পষ্ট ধারনা রাখুন - ব্রাদার রাহুল হোসেন (Learn Bidat - Br. Rahul Hossain Ruhul Amin)\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "FGEkjx1S178");
        hashMap.put("vdo_title", "একই মাহফিলে রফিকুল ভাই কে নিয়ে একি বললেন রাহুল ভাই। Brother Rahul Hossain, islamer pothe\n");
        hashMap.put("vdo_desciption", "একই মাহফিলে রফিকুল ভাই কে নিয়ে একি বললেন রাহুল ভাই। Brother Rahul Hossain, islamer pothe\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "g3Tmd13ZmA4");
        hashMap.put("vdo_title", "বাংলার জাকির নায়েক Brother rahul hossain ওয়াজ ২০২০ ব্রাদার রাহুল হোসেন রুহুল আমিন, মুর্শিদাবাদ(ভারত)\n");
        hashMap.put("vdo_desciption", "বাংলার জাকির নায়েক Brother rahul hossain ওয়াজ ২০২০ ব্রাদার রাহুল হোসেন রুহুল আমিন, মুর্শিদাবাদ(ভারত)\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jmBOee3aNhE");
        hashMap.put("vdo_title", "Ami Dekhini Tomay | Bangla Islamic Song | Kalarab Shilpigosthi 2018 | Naat Shareef\n");
        hashMap.put("vdo_desciption", "Ami Dekhini Tomay | Bangla Islamic Song | Kalarab Shilpigosthi 2018 | Naat Shareef\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "GqHT7VeUjC8");
        hashMap.put("vdo_title", "আবু রায়হানের বাছাইকৃত সেরা গজল | Top Islamic Song By Abu Rayhan Kalarab | Best Bangla Gojol\n");
        hashMap.put("vdo_desciption", "আবু রায়হানের বাছাইকৃত সেরা গজল | Top Islamic Song By Abu Rayhan Kalarab | Best Bangla Gojol\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "knkNy_LHtlo");
        hashMap.put("vdo_title", "Ayisha Abdul Basith | Muhammad Nabina\n");
        hashMap.put("vdo_desciption", "Ayisha Abdul Basith | Muhammad Nabina\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jmBOee3aNhE");
        hashMap.put("vdo_title", "Ami Dekhini Tomay | Bangla Islamic Song | Kalarab Shilpigosthi 2018 | Naat Shareef\n");
        hashMap.put("vdo_desciption", "Ami Dekhini Tomay | Bangla Islamic Song | Kalarab Shilpigosthi 2018 | Naat Shareef\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "MgorLU6b6sI");
        hashMap.put("vdo_title", "হৃদয়স্পর্শী বাছাইকৃত গজল । Hujaifa Islam । Best Selected Islamic Song\n");
        hashMap.put("vdo_desciption", "হৃদয়স্পর্শী বাছাইকৃত গজল । Hujaifa Islam । Best Selected Islamic Song\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "GvWIgHeg5Aw");
        hashMap.put("vdo_title", "Maher Zain - The Power | ماهر زين (Music Video & On-Screen Lyrics)\n");
        hashMap.put("vdo_desciption", "Maher Zain - The Power | ماهر زين (Music Video & On-Screen Lyrics)\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lIQNPWskjuk");
        hashMap.put("vdo_title", "Bangla Islamic Song | Ami Dekhini Tomay by Kalarab Shilpigosthi 2018 | Naate Rasul Sallallah\n");
        hashMap.put("vdo_desciption", "Bangla Islamic Song | Ami Dekhini Tomay by Kalarab Shilpigosthi 2018 | Naate Rasul Sallallah\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "GK2ippphNnM");
        hashMap.put("vdo_title", "হৃদয়স্পর্শী মরমি গজল | Hariye Jabo Ekdin | হারিয়ে যাবো একদিন | Qari Abu Rayhan\n");
        hashMap.put("vdo_desciption", "হৃদয়স্পর্শী মরমি গজল | Hariye Jabo Ekdin | হারিয়ে যাবো একদিন | Qari Abu Rayhan\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>

        //------------->>>>>>>>>>>>>>>>>

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "RAcpNiACUpQ");
        hashMap.put("vdo_title", "Hasbi Rabbi (2021) | Ayisha Abdul Basith\n");
        hashMap.put("vdo_desciption", "Hasbi Rabbi (2021) | Ayisha Abdul Basith\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "b9kSKlxY3_8");
        hashMap.put("vdo_title", "বাবা মানে হাজার বিকেল | যে গান কাঁদালো সকল বাবাদের | Baba Mane Hajar Bikel | Jaima Noor | baba song\n");
        hashMap.put("vdo_desciption", "বাবা মানে হাজার বিকেল | যে গান কাঁদালো সকল বাবাদের | Baba Mane Hajar Bikel | Jaima Noor | baba song\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "b4SU4U_uEl4");
        hashMap.put("vdo_title", "Allahu Allahu | আল্লাহু আল্লাহু | Ayisha Abdul Basith | Ishrak Hussain | Bangladesh, India (4K)\n");
        hashMap.put("vdo_desciption", "Allahu Allahu | আল্লাহু আল্লাহু | Ayisha Abdul Basith | Ishrak Hussain | Bangladesh, India (4K)\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "BdKSSFS3vXM");
        hashMap.put("vdo_title", "Nabi Un Nabi | Ayisha Abdul Basith\n");
        hashMap.put("vdo_desciption", " Nabi Un Nabi | Ayisha Abdul Basith\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "wtEKXRs_xac");
        hashMap.put("vdo_title", "2021 New Heart Touching Beautiful Naat Sharif - Hasbi Rabbi - Huda Sisters - Hi-Tech Islamic Naats\n");
        hashMap.put("vdo_desciption", "2021 New Heart Touching Beautiful Naat Sharif - Hasbi Rabbi - Huda Sisters - Hi-Tech Islamic Naats\n");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "qndO_Xk4ryY");
        hashMap.put("vdo_title", "Sami Yusuf - Mawlana (Live in New Delhi, INDIA)\n");
        hashMap.put("vdo_desciption", "Sami Yusuf - Mawlana (Live in New Delhi, INDIA)\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "e2FKXPzsT7E");
        hashMap.put("vdo_title", "Mesut Kurtis - Burdah Maula ya Salli Official video مسعود كُرتِس البردة مولاي صلِ وسلم\n");
        hashMap.put("vdo_desciption", "Mesut Kurtis - Burdah Maula ya Salli Official video مسعود كُرتِس البردة مولاي صلِ وسلم\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "uuN0bf4rhT0");
        hashMap.put("vdo_title", "Sami Yusuf - Madad (Nasimi Arabic Version) | Live at the Fes Festival of World Sacred Music\n");
        hashMap.put("vdo_desciption", "Sami Yusuf - Madad (Nasimi Arabic Version) | Live at the Fes Festival of World Sacred Music\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "wAvvq9UL5EM");
        hashMap.put("vdo_title", "Sami Yusuf - عرفت الهوى مذ عرفت هواك (Live in Morocco)\n");
        hashMap.put("vdo_desciption", "Sami Yusuf - عرفت الهوى مذ عرفت هواك (Live in Morocco)\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Nipm5KVLlFU");
        hashMap.put("vdo_title", "Sami Yusuf – Ya Rasul Allah (Part I) | یا رسول الله\n");
        hashMap.put("vdo_desciption", "Sami Yusuf – Ya Rasul Allah (Part I) | یا رسول الله\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "XcikV4gcPzo");
        hashMap.put("vdo_title", "Sami Yusuf – Ya Rasul Allah (Part II) | صلوا عليه شفيع الأمة\n");
        hashMap.put("vdo_desciption", "Sami Yusuf – Ya Rasul Allah (Part II) | صلوا عليه شفيع الأمة\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "HKMGxvJCivU");
        hashMap.put("vdo_title", "Mohamed Tarek & Mohamed Youssef - nasheed 2018 Medly sholawat | محمد طارق و محمد يوسف - ميدلي اناشيد\n");
        hashMap.put("vdo_desciption", "Mohamed Tarek & Mohamed Youssef - nasheed 2018 Medly sholawat | محمد طارق و محمد يوسف - ميدلي اناشيد\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "FKV2oeS4vw8");
        hashMap.put("vdo_title", "Sami Yusuf - Forgotten Promises\n");
        hashMap.put("vdo_desciption", "Sami Yusuf - Forgotten Promises\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "qSjpu9sE330");
        hashMap.put("vdo_title", "Sami Yusuf - A Dancing Heart\n");
        hashMap.put("vdo_desciption", "Sami Yusuf - A Dancing Heart\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Tug63dI4MEY");
        hashMap.put("vdo_title", "Sami Yusuf - Healing\n");
        hashMap.put("vdo_desciption", "Sami Yusuf - Healing\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Aev9pEb35D8");
        hashMap.put("vdo_title", "Sami Yusuf - Sari Gelin (Lyric Video)\n");
        hashMap.put("vdo_desciption", "Sami Yusuf - Sari Gelin (Lyric Video)\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>


        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Sbm8uzwyi40");
        hashMap.put("vdo_title", "Ma Song || Bangla Islamic Song 2018 || Ma Gojol || Abu Rayhan\n");
        hashMap.put("vdo_desciption", "Ma Song || Bangla Islamic Song 2018 || Ma Gojol || Abu Rayhan\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>

        //------------->>>>>>>>>>>>>>>>>

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Bn0_NPoRNns");
        hashMap.put("vdo_title", "আলোড়ন সৃষ্টিকারী ইসলামী সংগীত | Tumi Asmane Thako Provu | Kamrul Hasan Abir\n");
        hashMap.put("vdo_desciption", "আলোড়ন সৃষ্টিকারী ইসলামী সংগীত | Tumi Asmane Thako Provu | Kamrul Hasan Abir\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "qTaqRXw_2S0");
        hashMap.put("vdo_title", "হৃদয় ছোঁয়া গজল । হৃদয় মাঝে মালা গাঁথি । Hridoy Majhe Mala Gathi\n");
        hashMap.put("vdo_desciption", "হৃদয় ছোঁয়া গজল । হৃদয় মাঝে মালা গাঁথি । Hridoy Majhe Mala Gathi\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "PaUILNzhJkw");
        hashMap.put("vdo_title", "Nobi Mor Porosh Moni | নবী মোর পরশ মনি Ayisha Abdul Basith & Ishrak Hussain | Bangla Gojol\n");
        hashMap.put("vdo_desciption", "Nobi Mor Porosh Moni | নবী মোর পরশ মনি Ayisha Abdul Basith & Ishrak Hussain | Bangla Gojol\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>

        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "sxPTg8yuJoY");
        hashMap.put("vdo_title", "Nam Muhammad Bol Re Mon | নাম মোহাম্মদ বোল রে মন | Ishrak Hussain | নজরুলগীতি | Bangla Islamic Song\n");
        hashMap.put("vdo_desciption", "Nam Muhammad Bol Re Mon | নাম মোহাম্মদ বোল রে মন | Ishrak Hussain | নজরুলগীতি | Bangla Islamic Song\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "16GxtAyuGqI");
        hashMap.put("vdo_title", "হৃদয় শীতলকরা কণ্ঠে আল্লাহু আল্লাহু গজল || Muhammad Ibrahim || Mahmud Huzaifa || Allahu Allahu Gojol\n");
        hashMap.put("vdo_desciption", "হৃদয় শীতলকরা কণ্ঠে আল্লাহু আল্লাহু গজল || Muhammad Ibrahim || Mahmud Huzaifa || Allahu Allahu Gojol\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ZbJoVJ2xY8Q");
        hashMap.put("vdo_title", "O The Greatest Guide | ত্রিভুবনের প্রিয় মুহাম্মদ ইংরেজি ভার্সন | Ishrak Hussain | Nasheed 2020\n");
        hashMap.put("vdo_desciption", "O The Greatest Guide | ত্রিভুবনের প্রিয় মুহাম্মদ ইংরেজি ভার্সন | Ishrak Hussain | Nasheed 2020\n");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>


    }

    //=======================================================
    //====================================================================
    //====================================================================

    TextView tvDate;
    LinearLayout layoutContainer;
    FloatingActionButton fabButton;
    RelativeLayout _rootLay;
    AdView mAdView;
    InterstitialAd mInterstitialAd;
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer myYoutubePlayer;
    MyPlaybackEventListener myPlaybackEventListener;
    LinearLayout layPlayer;
    ImageView imngClosePlayer, imgPlayPause, imgPrevious, imgNext;

    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;
    int PLAYING_NOW = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        tvDate = findViewById(R.id.tvDate);
        layoutContainer = findViewById(R.id.layoutContainer);
        fabButton = findViewById(R.id.fabButton);
        mAdView = findViewById(R.id.mAdView);
        _rootLay = findViewById(R.id._rootLay);
        youTubePlayerView = findViewById(R.id.youTubePlayerView);
        layPlayer = findViewById(R.id.layPlayer);
        imngClosePlayer = findViewById(R.id.imngClosePlayer);
        imgPlayPause = findViewById(R.id.imgPlayPause);
        imgNext = findViewById(R.id.imgNext);
        imgPrevious = findViewById(R.id.imgPrevious);

        // Load Admob Ads
        loadBannerAd();
        loadFullscreenAd();


        //init Youtube Player View
        youTubePlayerView.initialize("ABCD", MainActivity.this);
        myPlaybackEventListener = new MyPlaybackEventListener();


        //Set Date For Cover Section
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd, YYYY", Locale.US);
        formatter.setTimeZone(TimeZone.getDefault());
        Date date1 = new Date();
        String s_date = formatter.format(date1);
        tvDate.setText(s_date);


        //Calling addVideos method by which we will make a video list
        addVideos();
        makeListView();






        //Fab Button onClick
        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Check "+getString(R.string.app_name)+" app ♥ It's awesome! \n" + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }
        });

        imngClosePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closePlayer();
            }
        });

        imgPlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (v!=null && v.getTag()!=null){
                    String tag = v.getTag().toString();
                    if (tag.contains("PLAYING")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.pause();
                        else Toast.makeText(MainActivity.this, "Please wait...", Toast.LENGTH_LONG).show();

                    }else if (tag.contains("PAUSED")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.play();
                        else Toast.makeText(MainActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
                    }
                }


            }
        });

        imgNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playNextVideo();
            }
        });

        imgPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playPreviousVideo();
            }
        });





    } // End of onCreate Bundle





    private void makeListView(){

        ListView listView = new ListView( MainActivity.this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(150, 10);
        layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
        listView.setBackgroundColor(Color.WHITE);
        listView.setLayoutParams(layoutParams);

        //Adding ListView into our view
        layoutContainer.addView(listView);
        //------------
        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);
        //-----------


        try{
            setListViewHeightBasedOnChildren(listView);
        } catch(Exception e ){
            e.printStackTrace();
        }

        layoutContainer.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in));

    }

    ///==============================================
    ///==============================================



    ///==============================================
    ///==============================================


    private void loadBannerAd(){
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
                loadBannerAd();
            }
        });

    }
    ///==============================================
    ///==============================================


    //==============================================
    private void showInterstitial() {
        // Show the ad if it's ready.
        if (mInterstitialAd != null ) {
            mInterstitialAd.show(this);
        }
    }
    //============================================


    // loadFullscreenAd method starts here.....
    private void loadFullscreenAd(){

        //Requesting for a fullscreen Ad
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,getString(R.string.admob_INTERSTITIAL_UNIT_ID), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

                //Fullscreen callback || Requesting again when an ad is shown already
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        //User dismissed the previous ad. So we are requesting a new ad here
                        loadFullscreenAd();
                    }

                }); // FullScreen Callback Ends here


            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }

        });

    }

    // loadFullscreenAd method ENDS  here..... >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    ///==============================================
    ///==============================================


    ///==============================================
    ///==============================================










    ///==============================================
    ///==============================================


    private class MyAdapter extends BaseAdapter {
        private LayoutInflater inflater;

        public MyAdapter(){
            this.inflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.video_item, parent, false);

            TextView tvTitle = convertView.findViewById(R.id.tvTitle);
            TextView tvDescription = convertView.findViewById(R.id.tvDescription);
            ImageView imgThumb = convertView.findViewById(R.id.imgThumb);
            RelativeLayout layItem = convertView.findViewById(R.id.layItem);

            HashMap<String, String> hashMap = arrayList.get(position);
            String vdo_id = hashMap.get("vdo_id");
            String vdo_title = hashMap.get("vdo_title");
            String vdo_desciption = hashMap.get("vdo_desciption");

            tvTitle.setText(vdo_title);
            tvDescription.setText(vdo_desciption);

            // Youtube thumnail link is like
            //https://i.ytimg.com/vi/<VIDEO ID>/0.jpg
            String thumb_link = "https://i.ytimg.com/vi/"+vdo_id+"/0.jpg";
            Picasso.get().
                    load(""+thumb_link)
                    .placeholder(R.mipmap.ic_launcher)
                    .into(imgThumb);

            layItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //Play Video
                    PLAYING_NOW = position;
                    playVideo(vdo_id);

                    //Show Fullscreen ad
                    showInterstitial();

                }
            });




            return convertView;
        }
    }



    //================================================
    private void playVideo(String video_id){

        if(myYoutubePlayer!=null){
            layPlayer.setVisibility(View.VISIBLE);
            layPlayer.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in));
            myYoutubePlayer.loadVideo(video_id);
            myYoutubePlayer.play();
        }else{
            Toast.makeText(MainActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
        }
    }
    //================================================
    private void closePlayer(){
        if(myYoutubePlayer!=null && myYoutubePlayer.isPlaying()) myYoutubePlayer.pause();
        layPlayer.setVisibility(View.GONE);
        layPlayer.clearAnimation();
    }







    //==============================================
    private final class MyPlaybackEventListener implements YouTubePlayer.PlaybackEventListener {
        public void onBuffering(boolean arg0) {
            //updateLog("onBuffering(): " + String.valueOf(arg0));
            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.buffer);
                imgPlayPause.setTag("BUFFERING");
            }
        }

        public void onPaused() {
            //updateLog("onPaused()");

            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.icon_play);
                imgPlayPause.setTag("PAUSED");
            }

            //Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_SHORT).show();
        }

        public void onPlaying() {
            //updateLog("onPlaying()");
            // Toast.makeText(getApplicationContext(), "Paying", Toast.LENGTH_SHORT).show();

            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.icon_pause);
                imgPlayPause.setTag("PLAYING");
            }

        }

        public void onSeekTo(int arg0) {
            //updateLog("onSeekTo(): " + String.valueOf(arg0));
        }

        public void onStopped() {

            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.icon_play);
            }

        }

    }

    //*******************************************************************



    //=================================================================




    private final class MyPlayerStateChangeListener implements YouTubePlayer.PlayerStateChangeListener {

        public void onAdStarted() {
            //updateLog("onAdStarted()");
        }

        public void onError(
                com.google.android.youtube.player.YouTubePlayer.ErrorReason arg0) {
            //updateLog("onError(): " + arg0.toString());
            Toast.makeText(getApplicationContext(), ""+arg0.toString(), Toast.LENGTH_SHORT).show();
            //Log.d("loveRana", ""+arg0.ordinal());

            /*
            if (arg0.toString().contains("NOT_PLAYABLE") && YOUTUBE_PLAYER ){
                webViewPlayer();
            }
            else if (arg0.toString().contains("INTERNAL_ERROR") && YOUTUBE_PLAYER ){
                webViewPlayer();
            }

             */



        }

        public void onLoaded(String arg0) {
            //updateLog("onLoaded(): " + arg0);
        }

        public void onLoading() {
            //updateLog("onLoading()");
        }

        public void onVideoEnded() {
            // Toast.makeText(getApplicationContext(), "ended", Toast.LENGTH_LONG).show();
            playNextVideo();


        }


        public void onVideoStarted() {
            //updateLog("onVideoStarted()");
        }

    }
    //==============================================================



//=================================================
    private void playNextVideo(){
        if(PLAYING_NOW >= (arrayList.size()-1))
            PLAYING_NOW = 0;
        else PLAYING_NOW++;

        HashMap<String, String> hashMap = arrayList.get(PLAYING_NOW);
        String vdo_id = hashMap.get("vdo_id");
        playVideo(vdo_id);
    }


    private void playPreviousVideo(){
        if(PLAYING_NOW > 0){
            PLAYING_NOW--;
            HashMap<String, String> hashMap = arrayList.get(PLAYING_NOW);
            String vdo_id = hashMap.get("vdo_id");
            playVideo(vdo_id);
        }else{
            Toast.makeText(MainActivity.this, "Playing the first video", Toast.LENGTH_LONG).show();
        }

    }






    ///==============================================
    ///==============================================
    //===================================================

    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;
        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(),
                View.MeasureSpec.AT_MOST);
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }

    //==========================================================================
//==========================================================================





    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        myYoutubePlayer = youTubePlayer;
        myYoutubePlayer.setPlaybackEventListener(myPlaybackEventListener);

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        myYoutubePlayer = null;
    }




    ///====================================================
    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired
    private long mBackPressed;

    // When user click bakpress button this method is called
    @Override
    public void onBackPressed() {
        // When user press back button

        if (layPlayer.getVisibility()==View.GONE) {

            if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            } else {

                Toast.makeText(getBaseContext(), "Press again to exit",
                        Toast.LENGTH_SHORT).show();
            }

            mBackPressed = System.currentTimeMillis();

        } else{
            closePlayer();
        }


    } // end of onBackpressed method

    //#############################################################################################




    ///==============================================
}