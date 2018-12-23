package com.github.android.aleson.sloggerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.android.aleson.slogger.SLogger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SLogger.init(true);
        SLogger.defaulTag("TAG");
        SLogger.e(new NullPointerException());
        SLogger.e(new java.security.KeyStoreException());
        SLogger.w("w");
        SLogger.d("d");
        SLogger.i("i");
        SLogger.e("TAG", "i");
        SLogger.w("TAG", "d");
        SLogger.d("TAG", "d");
        SLogger.i("TAG", "i");
        SLogger.e("TAG", null);
        SLogger.w("TAG", null);
        SLogger.d("TAG", null);
        SLogger.i("TAG", null);
        SLogger.e("TAG", null);
        SLogger.w("TAG", null);
        SLogger.d("TAG", null);
        SLogger.i("TAG", null);
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<statuses type=\"array\">\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:42:10 +0000 2012</created_at>\n" +
                "    <id>222505965281488898</id>\n" +
                "    <text>We will be performing #D3 maintenance Tuesday, July 10 beginning at 5am PDT: http://t.co/2jr91xDu</text>\n" +
                "    <source>&lt;a href=&quot;http://www.radian6.com&quot; rel=&quot;nofollow&quot;&gt;Radian6 &lt;/a&gt;</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <possibly_sensitive>false</possibly_sensitive>\n" +
                "    <user>\n" +
                "      <id>174307074</id>\n" +
                "      <name>BlizzardCS</name>\n" +
                "      <screen_name>BlizzardCS</screen_name>\n" +
                "      <location>Irvine CA and Austin TX</location>\n" +
                "      <description>Blizzard Entertainment North America Customer Support</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/1094734715/BlizzLogo_normal.jpg</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/1094734715/BlizzLogo_normal.jpg</profile_image_url_https>\n" +
                "      <url>http://blizzard.com/support/</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>220560</followers_count>\n" +
                "      <profile_background_color>C0DEED</profile_background_color>\n" +
                "      <profile_text_color>333333</profile_text_color>\n" +
                "      <profile_link_color>0084B4</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>DDEEF6</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>C0DEED</profile_sidebar_border_color>\n" +
                "      <friends_count>32</friends_count>\n" +
                "      <created_at>Tue Aug 03 16:26:52 +0000 2010</created_at>\n" +
                "      <favourites_count>0</favourites_count>\n" +
                "      <utc_offset>-28800</utc_offset>\n" +
                "      <time_zone>Pacific Time (US &amp; Canada)</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/profile_background_images/168329781/Twitter-BG-cs.jpg</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/profile_background_images/168329781/Twitter-BG-cs.jpg</profile_background_image_url_https>\n" +
                "      <profile_background_tile>false</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>true</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>12121</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>2008</listed_count>\n" +
                "      <show_all_inline_media>false</show_all_inline_media>\n" +
                "      <default_profile>false</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>3</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:39:37 +0000 2012</created_at>\n" +
                "    <id>222505324337303554</id>\n" +
                "    <text>&#8220;@alexey_r: A better way to store password hashes? http://t.co/kH15mexw&#8221; [Interesting concept.] via @mjdominus</text>\n" +
                "    <source>&lt;a href=&quot;http://itunes.apple.com/us/app/twitter/id409789998?mt=12&quot; rel=&quot;nofollow&quot;&gt;Twitter for Mac&lt;/a&gt;</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <possibly_sensitive>false</possibly_sensitive>\n" +
                "    <user>\n" +
                "      <id>14498554</id>\n" +
                "      <name>Jorj Bauer</name>\n" +
                "      <screen_name>bozoskeleton</screen_name>\n" +
                "      <location>Philadelphia, PA</location>\n" +
                "      <description>Geek, photographic artist, dad.</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/1615724109/2011-halloween-2-small_normal.jpg</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/1615724109/2011-halloween-2-small_normal.jpg</profile_image_url_https>\n" +
                "      <url>http://www.jorj.org</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>274</followers_count>\n" +
                "      <profile_background_color>C0DEED</profile_background_color>\n" +
                "      <profile_text_color>333333</profile_text_color>\n" +
                "      <profile_link_color>0084B4</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>DDEEF6</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>C0DEED</profile_sidebar_border_color>\n" +
                "      <friends_count>218</friends_count>\n" +
                "      <created_at>Wed Apr 23 18:36:04 +0000 2008</created_at>\n" +
                "      <favourites_count>191</favourites_count>\n" +
                "      <utc_offset>-18000</utc_offset>\n" +
                "      <time_zone>Eastern Time (US &amp; Canada)</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/profile_background_images/2522082/All-Good-People-4.jpg</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/profile_background_images/2522082/All-Good-People-4.jpg</profile_background_image_url_https>\n" +
                "      <profile_background_tile>true</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>false</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>4332</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>15</listed_count>\n" +
                "      <show_all_inline_media>false</show_all_inline_media>\n" +
                "      <default_profile>false</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>0</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:38:42 +0000 2012</created_at>\n" +
                "    <id>222505092136435713</id>\n" +
                "    <text>RT @fleurishing: awesome quote, originally shared by @sarakatestudios...love. http://t.co/pq5v1x9F</text>\n" +
                "    <source>web</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <possibly_sensitive>false</possibly_sensitive>\n" +
                "    <user>\n" +
                "      <id>761153</id>\n" +
                "      <name>roz duffy</name>\n" +
                "      <screen_name>stellargirl</screen_name>\n" +
                "      <location>Philadelphia, PA</location>\n" +
                "      <description>fan of happiness, dark chocolate &amp; leafy greens. i wrangle code, UX, &amp; words. let's make something awesome together: http://wearethegamut.com</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/2376204016/yiwc7jxxs97jx2bi5x0a_normal.jpeg</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/2376204016/yiwc7jxxs97jx2bi5x0a_normal.jpeg</profile_image_url_https>\n" +
                "      <url>http://stellargirl.com/</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>3000</followers_count>\n" +
                "      <profile_background_color>030203</profile_background_color>\n" +
                "      <profile_text_color>8F8D96</profile_text_color>\n" +
                "      <profile_link_color>992595</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>3F4257</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>DED5D3</profile_sidebar_border_color>\n" +
                "      <friends_count>1083</friends_count>\n" +
                "      <created_at>Fri Feb 09 19:22:09 +0000 2007</created_at>\n" +
                "      <favourites_count>77</favourites_count>\n" +
                "      <utc_offset>-18000</utc_offset>\n" +
                "      <time_zone>Eastern Time (US &amp; Canada)</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/profile_background_images/594125887/tizpb57nclw0pyb9bk36.jpeg</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/profile_background_images/594125887/tizpb57nclw0pyb9bk36.jpeg</profile_background_image_url_https>\n" +
                "      <profile_background_tile>true</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>false</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>14957</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>222</listed_count>\n" +
                "      <show_all_inline_media>true</show_all_inline_media>\n" +
                "      <default_profile>false</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweeted_status>\n" +
                "      <created_at>Tue Jul 10 01:38:11 +0000 2012</created_at>\n" +
                "      <id>222504963740409856</id>\n" +
                "      <text>awesome quote, originally shared by @sarakatestudios...love. http://t.co/pq5v1x9F</text>\n" +
                "      <source>&lt;a href=&quot;http://instagr.am&quot; rel=&quot;nofollow&quot;&gt;Instagram&lt;/a&gt;</source>\n" +
                "      <truncated>false</truncated>\n" +
                "      <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "      <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "      <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "      <possibly_sensitive>false</possibly_sensitive>\n" +
                "      <user>\n" +
                "        <id>53668114</id>\n" +
                "        <name>susan hutchinson</name>\n" +
                "        <screen_name>fleurishing</screen_name>\n" +
                "        <location>PA...ris?</location>\n" +
                "        <description>francophile, designer, entrepreneur... \n" +
                "my biz is @nestingllc</description>\n" +
                "        <profile_image_url>http://a0.twimg.com/profile_images/1542634122/smile_normal.png</profile_image_url>\n" +
                "        <profile_image_url_https>https://si0.twimg.com/profile_images/1542634122/smile_normal.png</profile_image_url_https>\n" +
                "        <url>http://www.fleurishingblog.com</url>\n" +
                "        <protected>false</protected>\n" +
                "        <followers_count>1371</followers_count>\n" +
                "        <profile_background_color>9AE4E8</profile_background_color>\n" +
                "        <profile_text_color>333333</profile_text_color>\n" +
                "        <profile_link_color>B88B54</profile_link_color>\n" +
                "        <profile_sidebar_fill_color>FAFAFA</profile_sidebar_fill_color>\n" +
                "        <profile_sidebar_border_color>696262</profile_sidebar_border_color>\n" +
                "        <friends_count>457</friends_count>\n" +
                "        <created_at>Sat Jul 04 13:26:29 +0000 2009</created_at>\n" +
                "        <favourites_count>8</favourites_count>\n" +
                "        <utc_offset>-18000</utc_offset>\n" +
                "        <time_zone>Quito</time_zone>\n" +
                "        <profile_background_image_url>http://a0.twimg.com/profile_background_images/349264414/fleurishing_twitter_rev3.jpg</profile_background_image_url>\n" +
                "        <profile_background_image_url_https>https://si0.twimg.com/profile_background_images/349264414/fleurishing_twitter_rev3.jpg</profile_background_image_url_https>\n" +
                "        <profile_background_tile>true</profile_background_tile>\n" +
                "        <profile_use_background_image>true</profile_use_background_image>\n" +
                "        <geo_enabled>false</geo_enabled>\n" +
                "        <verified>false</verified>\n" +
                "        <statuses_count>13883</statuses_count>\n" +
                "        <lang>en</lang>\n" +
                "        <contributors_enabled>false</contributors_enabled>\n" +
                "        <is_translator>false</is_translator>\n" +
                "        <listed_count>99</listed_count>\n" +
                "        <show_all_inline_media>true</show_all_inline_media>\n" +
                "        <default_profile>false</default_profile>\n" +
                "        <default_profile_image>false</default_profile_image>\n" +
                "        <following></following>\n" +
                "        <follow_request_sent></follow_request_sent>\n" +
                "        <notifications></notifications>\n" +
                "      </user>\n" +
                "      <geo/>\n" +
                "      <coordinates/>\n" +
                "      <place/>\n" +
                "      <contributors/>\n" +
                "      <retweet_count>1</retweet_count>\n" +
                "      <favorited>false</favorited>\n" +
                "      <retweeted>false</retweeted>\n" +
                "    </retweeted_status>\n" +
                "    <retweet_count>1</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:37:20 +0000 2012</created_at>\n" +
                "    <id>222504748434210818</id>\n" +
                "    <text>@mjdominus that's worth a second viewing. thanks.</text>\n" +
                "    <source>&lt;a href=&quot;http://www.echofon.com/&quot; rel=&quot;nofollow&quot;&gt;Echofon&lt;/a&gt;</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id>222467775543779329</in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id>212280974</in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name>mjdominus</in_reply_to_screen_name>\n" +
                "    <user>\n" +
                "      <id>9497752</id>\n" +
                "      <name>John P. Speno</name>\n" +
                "      <screen_name>speno</screen_name>\n" +
                "      <location>South Jersey, USA</location>\n" +
                "      <description>gritty pioneer woman</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/1321077452/spenojumpface_normal.jpg</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/1321077452/spenojumpface_normal.jpg</profile_image_url_https>\n" +
                "      <url>http://speno.blogspot.com/</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>261</followers_count>\n" +
                "      <profile_background_color>642D8B</profile_background_color>\n" +
                "      <profile_text_color>3D1957</profile_text_color>\n" +
                "      <profile_link_color>90148D</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>AFEE7A</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>7BDA65</profile_sidebar_border_color>\n" +
                "      <friends_count>436</friends_count>\n" +
                "      <created_at>Wed Oct 17 12:24:17 +0000 2007</created_at>\n" +
                "      <favourites_count>95</favourites_count>\n" +
                "      <utc_offset>-18000</utc_offset>\n" +
                "      <time_zone>Eastern Time (US &amp; Canada)</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/images/themes/theme10/bg.gif</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/images/themes/theme10/bg.gif</profile_background_image_url_https>\n" +
                "      <profile_background_tile>true</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>true</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>5197</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>9</listed_count>\n" +
                "      <show_all_inline_media>false</show_all_inline_media>\n" +
                "      <default_profile>false</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>0</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:31:28 +0000 2012</created_at>\n" +
                "    <id>222503273242968064</id>\n" +
                "    <text>I wish I was smart enough to blog on Higgs boson, but I'm not so I'll probably blog on 7&quot; tablets on Tuesday.</text>\n" +
                "    <source>web</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <user>\n" +
                "      <id>14855780</id>\n" +
                "      <name>Deke Kassabian</name>\n" +
                "      <screen_name>dkassabian</screen_name>\n" +
                "      <location>Erdenheim, Pennsylvania</location>\n" +
                "      <description>Blogging at RapidGroove.com</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/1311860597/Deke197_normal.jpg</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/1311860597/Deke197_normal.jpg</profile_image_url_https>\n" +
                "      <url>http://kassabian.org/</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>101</followers_count>\n" +
                "      <profile_background_color>642D8B</profile_background_color>\n" +
                "      <profile_text_color>3D1957</profile_text_color>\n" +
                "      <profile_link_color>6600FF</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>7AC3EE</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>65B0DA</profile_sidebar_border_color>\n" +
                "      <friends_count>256</friends_count>\n" +
                "      <created_at>Wed May 21 12:36:53 +0000 2008</created_at>\n" +
                "      <favourites_count>1</favourites_count>\n" +
                "      <utc_offset>-18000</utc_offset>\n" +
                "      <time_zone>Quito</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/images/themes/theme10/bg.gif</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/images/themes/theme10/bg.gif</profile_background_image_url_https>\n" +
                "      <profile_background_tile>true</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>true</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>910</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>2</listed_count>\n" +
                "      <show_all_inline_media>false</show_all_inline_media>\n" +
                "      <default_profile>false</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>0</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:30:13 +0000 2012</created_at>\n" +
                "    <id>222502955427958784</id>\n" +
                "    <text>Went android today. The only app I miss from iPhone so far: @spg. Totally wish they had an android version. #spglife</text>\n" +
                "    <source>&lt;a href=&quot;http://sites.google.com/site/yorufukurou/&quot; rel=&quot;nofollow&quot;&gt;YoruFukurou&lt;/a&gt;</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <user>\n" +
                "      <id>9580822</id>\n" +
                "      <name>Theo Schlossnagle</name>\n" +
                "      <screen_name>postwait</screen_name>\n" +
                "      <location>iPhone: 39.138283,-76.813156</location>\n" +
                "      <description>CEO of OmniTI,\n" +
                "Founder at Message Systems, Fontdeck, Circonus,\n" +
                "Entrepreneur/Visionary/Engineer</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/55579290/theo_gravatar_normal.png</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/55579290/theo_gravatar_normal.png</profile_image_url_https>\n" +
                "      <url>http://omniti.com/</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>2041</followers_count>\n" +
                "      <profile_background_color>F2EEEF</profile_background_color>\n" +
                "      <profile_text_color>E6E6E6</profile_text_color>\n" +
                "      <profile_link_color>F08A5B</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>3B3A3B</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>808080</profile_sidebar_border_color>\n" +
                "      <friends_count>64</friends_count>\n" +
                "      <created_at>Sun Oct 21 15:32:43 +0000 2007</created_at>\n" +
                "      <favourites_count>5</favourites_count>\n" +
                "      <utc_offset>-18000</utc_offset>\n" +
                "      <time_zone>Eastern Time (US &amp; Canada)</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/profile_background_images/284711510/spiral-small.jpg</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/profile_background_images/284711510/spiral-small.jpg</profile_background_image_url_https>\n" +
                "      <profile_background_tile>false</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>true</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>2319</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>147</listed_count>\n" +
                "      <show_all_inline_media>false</show_all_inline_media>\n" +
                "      <default_profile>false</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>0</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:28:38 +0000 2012</created_at>\n" +
                "    <id>222502559817023488</id>\n" +
                "    <text>Beats Audio is pure genius. How to turn an EQ setting into a $500m business. Makes stupidly fat speaker cables look like child's play.</text>\n" +
                "    <source>&lt;a href=&quot;http://twitter.com/download/iphone&quot; rel=&quot;nofollow&quot;&gt;Twitter for iPhone&lt;/a&gt;</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <user>\n" +
                "      <id>7377552</id>\n" +
                "      <name>Jim Stogdill</name>\n" +
                "      <screen_name>jstogdill</screen_name>\n" +
                "      <location>Philly'ish, PA</location>\n" +
                "      <description>Irrepressible over sharer / Policurious / Looking back, leaning forward, but present here and now. Free time usually involves silver halides.</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/2269143957/lk5ahj9rnrg8n6lsek19_normal.jpeg</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/2269143957/lk5ahj9rnrg8n6lsek19_normal.jpeg</profile_image_url_https>\n" +
                "      <url>http://www.jimstogdill.com</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>1565</followers_count>\n" +
                "      <profile_background_color>7C7F80</profile_background_color>\n" +
                "      <profile_text_color>000000</profile_text_color>\n" +
                "      <profile_link_color>0000FF</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>C6CDB5</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>82857F</profile_sidebar_border_color>\n" +
                "      <friends_count>995</friends_count>\n" +
                "      <created_at>Tue Jul 10 17:00:38 +0000 2007</created_at>\n" +
                "      <favourites_count>667</favourites_count>\n" +
                "      <utc_offset>12600</utc_offset>\n" +
                "      <time_zone>Tehran</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/profile_background_images/93372412/Building.jpg</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/profile_background_images/93372412/Building.jpg</profile_background_image_url_https>\n" +
                "      <profile_background_tile>true</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>false</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>18309</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>103</listed_count>\n" +
                "      <show_all_inline_media>false</show_all_inline_media>\n" +
                "      <default_profile>false</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>0</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:28:09 +0000 2012</created_at>\n" +
                "    <id>222502433232924673</id>\n" +
                "    <text>Stage one of cat bed project complete. Big thanks to @maggieci for showing me how to use the sewing machine! http://t.co/FG9GJU0Q</text>\n" +
                "    <source>&lt;a href=&quot;http://twitter.com/download/android&quot; rel=&quot;nofollow&quot;&gt;Twitter for Android&lt;/a&gt;</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <possibly_sensitive>false</possibly_sensitive>\n" +
                "    <user>\n" +
                "      <id>16487505</id>\n" +
                "      <name>Corey Leigh Latislaw</name>\n" +
                "      <screen_name>corey_latislaw</screen_name>\n" +
                "      <location>Philadelphia, PA</location>\n" +
                "      <description>Geeky eco-minded outdoor-loving software engineer. International speaker, #Android maven, founder of @androidphilly, and mobile architect at @ChariotSolution.</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/1484593749/me_smaller_normal.jpg</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/1484593749/me_smaller_normal.jpg</profile_image_url_https>\n" +
                "      <url>http://www.coreylatislaw.com</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>2559</followers_count>\n" +
                "      <profile_background_color>B2DFDA</profile_background_color>\n" +
                "      <profile_text_color>333333</profile_text_color>\n" +
                "      <profile_link_color>93A644</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>FFFFFF</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>EEEEEE</profile_sidebar_border_color>\n" +
                "      <friends_count>2744</friends_count>\n" +
                "      <created_at>Sat Sep 27 16:59:53 +0000 2008</created_at>\n" +
                "      <favourites_count>28</favourites_count>\n" +
                "      <utc_offset>-18000</utc_offset>\n" +
                "      <time_zone>Eastern Time (US &amp; Canada)</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/images/themes/theme13/bg.gif</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/images/themes/theme13/bg.gif</profile_background_image_url_https>\n" +
                "      <profile_background_tile>false</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>true</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>7463</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>131</listed_count>\n" +
                "      <show_all_inline_media>false</show_all_inline_media>\n" +
                "      <default_profile>false</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>0</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:28:04 +0000 2012</created_at>\n" +
                "    <id>222502416212434945</id>\n" +
                "    <text>Interesting article on working for startups.  Not sure I agree with everything, but worth the read.  http://t.co/kt24WWCB</text>\n" +
                "    <source>web</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <possibly_sensitive>false</possibly_sensitive>\n" +
                "    <user>\n" +
                "      <id>12684522</id>\n" +
                "      <name>John McCann</name>\n" +
                "      <screen_name>dangermccann</screen_name>\n" +
                "      <location>New York, NY</location>\n" +
                "      <description></description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/848532703/profile_normal.jpg</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/848532703/profile_normal.jpg</profile_image_url_https>\n" +
                "      <url></url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>91</followers_count>\n" +
                "      <profile_background_color>C0DEED</profile_background_color>\n" +
                "      <profile_text_color>333333</profile_text_color>\n" +
                "      <profile_link_color>0084B4</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>DDEEF6</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>C0DEED</profile_sidebar_border_color>\n" +
                "      <friends_count>73</friends_count>\n" +
                "      <created_at>Fri Jan 25 14:53:09 +0000 2008</created_at>\n" +
                "      <favourites_count>0</favourites_count>\n" +
                "      <utc_offset>-18000</utc_offset>\n" +
                "      <time_zone>Eastern Time (US &amp; Canada)</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/images/themes/theme1/bg.png</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/images/themes/theme1/bg.png</profile_background_image_url_https>\n" +
                "      <profile_background_tile>false</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>false</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>880</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>2</listed_count>\n" +
                "      <show_all_inline_media>false</show_all_inline_media>\n" +
                "      <default_profile>true</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>0</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:27:28 +0000 2012</created_at>\n" +
                "    <id>222502263455875072</id>\n" +
                "    <text>For understand devops terminology you need of replace 'continuous' with 'half ass automated'.</text>\n" +
                "    <source>&lt;a href=&quot;http://twitter.com/download/android&quot; rel=&quot;nofollow&quot;&gt;Twitter for Android&lt;/a&gt;</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <user>\n" +
                "      <id>167499429</id>\n" +
                "      <name>DevOps Borat</name>\n" +
                "      <screen_name>DEVOPS_BORAT</screen_name>\n" +
                "      <location>Kazakhstan</location>\n" +
                "      <description>Cultural Learnings of DevOps for Make Benefit Glorious Teams of Devs and Ops.</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/1079908235/borat_855_18535194_0_0_12672_300_normal.jpg</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/1079908235/borat_855_18535194_0_0_12672_300_normal.jpg</profile_image_url_https>\n" +
                "      <url>http://www.imdb.com/title/tt0443453/</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>27020</followers_count>\n" +
                "      <profile_background_color>C0DEED</profile_background_color>\n" +
                "      <profile_text_color>333333</profile_text_color>\n" +
                "      <profile_link_color>0084B4</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>DDEEF6</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>C0DEED</profile_sidebar_border_color>\n" +
                "      <friends_count>553</friends_count>\n" +
                "      <created_at>Fri Jul 16 19:05:43 +0000 2010</created_at>\n" +
                "      <favourites_count>0</favourites_count>\n" +
                "      <utc_offset></utc_offset>\n" +
                "      <time_zone></time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/images/themes/theme1/bg.png</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/images/themes/theme1/bg.png</profile_background_image_url_https>\n" +
                "      <profile_background_tile>false</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>false</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>2432</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>768</listed_count>\n" +
                "      <show_all_inline_media>false</show_all_inline_media>\n" +
                "      <default_profile>true</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>45</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:25:54 +0000 2012</created_at>\n" +
                "    <id>222501869963055105</id>\n" +
                "    <text>RT @tsantero: Protip: when quoting a price don&#8217;t immediately follow with a statement that you&#8217;re flexible on price</text>\n" +
                "    <source>&lt;a href=&quot;http://twitter.com/download/iphone&quot; rel=&quot;nofollow&quot;&gt;Twitter for iPhone&lt;/a&gt;</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <user>\n" +
                "      <id>29777587</id>\n" +
                "      <name>Mark Phillips</name>\n" +
                "      <screen_name>pharkmillups</screen_name>\n" +
                "      <location>San Francisco</location>\n" +
                "      <description>Director of Community and Developer Evangelism at Basho Technologies. Basho and our community make Riak, the best database you will ever deploy. </description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/2165345096/pharksplosion_normal.jpg</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/2165345096/pharksplosion_normal.jpg</profile_image_url_https>\n" +
                "      <url>http://themarkphillips.com</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>1304</followers_count>\n" +
                "      <profile_background_color>B2DFDA</profile_background_color>\n" +
                "      <profile_text_color>333333</profile_text_color>\n" +
                "      <profile_link_color>93A644</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>FFFFFF</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>EEEEEE</profile_sidebar_border_color>\n" +
                "      <friends_count>262</friends_count>\n" +
                "      <created_at>Wed Apr 08 18:07:52 +0000 2009</created_at>\n" +
                "      <favourites_count>312</favourites_count>\n" +
                "      <utc_offset>-28800</utc_offset>\n" +
                "      <time_zone>Pacific Time (US &amp; Canada)</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/profile_background_images/85485614/riak-fluid.png</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/profile_background_images/85485614/riak-fluid.png</profile_background_image_url_https>\n" +
                "      <profile_background_tile>false</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>true</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>8383</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>75</listed_count>\n" +
                "      <show_all_inline_media>false</show_all_inline_media>\n" +
                "      <default_profile>false</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweeted_status>\n" +
                "      <created_at>Tue Jul 10 01:24:06 +0000 2012</created_at>\n" +
                "      <id>222501417921945600</id>\n" +
                "      <text>Protip: when quoting a price don&#8217;t immediately follow with a statement that you&#8217;re flexible on price</text>\n" +
                "      <source>&lt;a href=&quot;http://tapbots.com/tweetbot&quot; rel=&quot;nofollow&quot;&gt;Tweetbot for iOS&lt;/a&gt;</source>\n" +
                "      <truncated>false</truncated>\n" +
                "      <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "      <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "      <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "      <user>\n" +
                "        <id>28828401</id>\n" +
                "        <name>Tom Santero</name>\n" +
                "        <screen_name>tsantero</screen_name>\n" +
                "        <location>New York, NY</location>\n" +
                "        <description>Technical Evangelist at Basho Technologies (@basho)</description>\n" +
                "        <profile_image_url>http://a0.twimg.com/profile_images/1609792063/profilepic_normal.JPG</profile_image_url>\n" +
                "        <profile_image_url_https>https://si0.twimg.com/profile_images/1609792063/profilepic_normal.JPG</profile_image_url_https>\n" +
                "        <url>http://tsantero.tumblr.com</url>\n" +
                "        <protected>false</protected>\n" +
                "        <followers_count>209</followers_count>\n" +
                "        <profile_background_color>131516</profile_background_color>\n" +
                "        <profile_text_color>333333</profile_text_color>\n" +
                "        <profile_link_color>009999</profile_link_color>\n" +
                "        <profile_sidebar_fill_color>EFEFEF</profile_sidebar_fill_color>\n" +
                "        <profile_sidebar_border_color>EEEEEE</profile_sidebar_border_color>\n" +
                "        <friends_count>303</friends_count>\n" +
                "        <created_at>Sat Apr 04 17:03:47 +0000 2009</created_at>\n" +
                "        <favourites_count>67</favourites_count>\n" +
                "        <utc_offset></utc_offset>\n" +
                "        <time_zone></time_zone>\n" +
                "        <profile_background_image_url>http://a0.twimg.com/images/themes/theme14/bg.gif</profile_background_image_url>\n" +
                "        <profile_background_image_url_https>https://si0.twimg.com/images/themes/theme14/bg.gif</profile_background_image_url_https>\n" +
                "        <profile_background_tile>true</profile_background_tile>\n" +
                "        <profile_use_background_image>true</profile_use_background_image>\n" +
                "        <geo_enabled>true</geo_enabled>\n" +
                "        <verified>false</verified>\n" +
                "        <statuses_count>901</statuses_count>\n" +
                "        <lang>en</lang>\n" +
                "        <contributors_enabled>false</contributors_enabled>\n" +
                "        <is_translator>false</is_translator>\n" +
                "        <listed_count>7</listed_count>\n" +
                "        <show_all_inline_media>false</show_all_inline_media>\n" +
                "        <default_profile>false</default_profile>\n" +
                "        <default_profile_image>false</default_profile_image>\n" +
                "        <following></following>\n" +
                "        <follow_request_sent></follow_request_sent>\n" +
                "        <notifications></notifications>\n" +
                "      </user>\n" +
                "      <geo/>\n" +
                "      <coordinates/>\n" +
                "      <place/>\n" +
                "      <contributors/>\n" +
                "      <retweet_count>3</retweet_count>\n" +
                "      <favorited>false</favorited>\n" +
                "      <retweeted>false</retweeted>\n" +
                "    </retweeted_status>\n" +
                "    <retweet_count>3</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:23:03 +0000 2012</created_at>\n" +
                "    <id>222501154704195585</id>\n" +
                "    <text>. @SaraJChipps Actually I think a bigger lie is software/tool/platform vendors pretending that building software with their tools is easy.</text>\n" +
                "    <source>web</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id>222499797070905344</in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id>15524875</in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name>SaraJChipps</in_reply_to_screen_name>\n" +
                "    <user>\n" +
                "      <id>171268338</id>\n" +
                "      <name>Darrel Miller</name>\n" +
                "      <screen_name>darrel_miller</screen_name>\n" +
                "      <location>Montreal, QC</location>\n" +
                "      <description>Web APIs, Hypermedia APIs, REST based systems, that's my thing. Using that to build business apps is my job. Microsoft Connected Systems Developer MVP.</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/1106367504/Darrel_headshot1_normal.png</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/1106367504/Darrel_headshot1_normal.png</profile_image_url_https>\n" +
                "      <url>http://www.bizcoder.com</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>947</followers_count>\n" +
                "      <profile_background_color>C0DEED</profile_background_color>\n" +
                "      <profile_text_color>333333</profile_text_color>\n" +
                "      <profile_link_color>0084B4</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>DDEEF6</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>C0DEED</profile_sidebar_border_color>\n" +
                "      <friends_count>705</friends_count>\n" +
                "      <created_at>Mon Jul 26 23:44:37 +0000 2010</created_at>\n" +
                "      <favourites_count>135</favourites_count>\n" +
                "      <utc_offset>-18000</utc_offset>\n" +
                "      <time_zone>Eastern Time (US &amp; Canada)</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/images/themes/theme1/bg.png</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/images/themes/theme1/bg.png</profile_background_image_url_https>\n" +
                "      <profile_background_tile>false</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>false</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>5484</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>71</listed_count>\n" +
                "      <show_all_inline_media>false</show_all_inline_media>\n" +
                "      <default_profile>true</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>0</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:21:41 +0000 2012</created_at>\n" +
                "    <id>222500809882087424</id>\n" +
                "    <text>Why I give: &#8220;We can pull ourselves out of this recession by doing what we do best.&quot; http://t.co/iMWRDhwT</text>\n" +
                "    <source>web</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <possibly_sensitive>false</possibly_sensitive>\n" +
                "    <user>\n" +
                "      <id>813286</id>\n" +
                "      <name>Barack Obama</name>\n" +
                "      <screen_name>BarackObama</screen_name>\n" +
                "      <location>Washington, DC</location>\n" +
                "      <description>This account is run by #Obama2012 campaign staff. Tweets from the President are signed -bo.</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/2325704772/wrrmef61i6jl91kwkmzq_normal.png</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/2325704772/wrrmef61i6jl91kwkmzq_normal.png</profile_image_url_https>\n" +
                "      <url>http://www.barackobama.com</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>17350379</followers_count>\n" +
                "      <profile_background_color>77B0DC</profile_background_color>\n" +
                "      <profile_text_color>333333</profile_text_color>\n" +
                "      <profile_link_color>2574AD</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>C2E0F6</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>C2E0F6</profile_sidebar_border_color>\n" +
                "      <friends_count>675930</friends_count>\n" +
                "      <created_at>Mon Mar 05 22:08:25 +0000 2007</created_at>\n" +
                "      <favourites_count>0</favourites_count>\n" +
                "      <utc_offset>-18000</utc_offset>\n" +
                "      <time_zone>Eastern Time (US &amp; Canada)</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/profile_background_images/584034019/tkwyaf768hs9bylnus1k.jpeg</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/profile_background_images/584034019/tkwyaf768hs9bylnus1k.jpeg</profile_background_image_url_https>\n" +
                "      <profile_background_tile>false</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>false</geo_enabled>\n" +
                "      <verified>true</verified>\n" +
                "      <statuses_count>4714</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>true</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>171879</listed_count>\n" +
                "      <show_all_inline_media>false</show_all_inline_media>\n" +
                "      <default_profile>false</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>175</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:18:11 +0000 2012</created_at>\n" +
                "    <id>222499930135199744</id>\n" +
                "    <text>I just stopped at Whole Foods for a week's worth of organic heavy cream from grass fed cows. I feel crunchy.</text>\n" +
                "    <source>&lt;a href=&quot;http://twitter.com/download/iphone&quot; rel=&quot;nofollow&quot;&gt;Twitter for iPhone&lt;/a&gt;</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <user>\n" +
                "      <id>7377552</id>\n" +
                "      <name>Jim Stogdill</name>\n" +
                "      <screen_name>jstogdill</screen_name>\n" +
                "      <location>Philly'ish, PA</location>\n" +
                "      <description>Irrepressible over sharer / Policurious / Looking back, leaning forward, but present here and now. Free time usually involves silver halides.</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/2269143957/lk5ahj9rnrg8n6lsek19_normal.jpeg</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/2269143957/lk5ahj9rnrg8n6lsek19_normal.jpeg</profile_image_url_https>\n" +
                "      <url>http://www.jimstogdill.com</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>1565</followers_count>\n" +
                "      <profile_background_color>7C7F80</profile_background_color>\n" +
                "      <profile_text_color>000000</profile_text_color>\n" +
                "      <profile_link_color>0000FF</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>C6CDB5</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>82857F</profile_sidebar_border_color>\n" +
                "      <friends_count>995</friends_count>\n" +
                "      <created_at>Tue Jul 10 17:00:38 +0000 2007</created_at>\n" +
                "      <favourites_count>667</favourites_count>\n" +
                "      <utc_offset>12600</utc_offset>\n" +
                "      <time_zone>Tehran</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/profile_background_images/93372412/Building.jpg</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/profile_background_images/93372412/Building.jpg</profile_background_image_url_https>\n" +
                "      <profile_background_tile>true</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>false</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>18309</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>103</listed_count>\n" +
                "      <show_all_inline_media>false</show_all_inline_media>\n" +
                "      <default_profile>false</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>0</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:17:51 +0000 2012</created_at>\n" +
                "    <id>222499844995026944</id>\n" +
                "    <text>RT @mrtazz: Metrics rule everything around me.</text>\n" +
                "    <source>&lt;a href=&quot;http://twitter.com/download/iphone&quot; rel=&quot;nofollow&quot;&gt;Twitter for iPhone&lt;/a&gt;</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <user>\n" +
                "      <id>13378422</id>\n" +
                "      <name>John Allspaw</name>\n" +
                "      <screen_name>allspaw</screen_name>\n" +
                "      <location>Brooklyn</location>\n" +
                "      <description>SVP Ops, Etsy. Dad. Author. Guitarist. Terrible bio-writer.</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/48760222/2146466719_c829bee569_m_normal.jpg</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/48760222/2146466719_c829bee569_m_normal.jpg</profile_image_url_https>\n" +
                "      <url>http://kitchensoap.com</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>4543</followers_count>\n" +
                "      <profile_background_color>C0DEED</profile_background_color>\n" +
                "      <profile_text_color>333333</profile_text_color>\n" +
                "      <profile_link_color>0084B4</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>DDEEF6</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>C0DEED</profile_sidebar_border_color>\n" +
                "      <friends_count>338</friends_count>\n" +
                "      <created_at>Tue Feb 12 05:36:43 +0000 2008</created_at>\n" +
                "      <favourites_count>308</favourites_count>\n" +
                "      <utc_offset>-28800</utc_offset>\n" +
                "      <time_zone>Pacific Time (US &amp; Canada)</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/images/themes/theme1/bg.png</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/images/themes/theme1/bg.png</profile_background_image_url_https>\n" +
                "      <profile_background_tile>false</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>false</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>4103</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>371</listed_count>\n" +
                "      <show_all_inline_media>true</show_all_inline_media>\n" +
                "      <default_profile>true</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweeted_status>\n" +
                "      <created_at>Mon Jul 09 23:01:04 +0000 2012</created_at>\n" +
                "      <id>222465421943635968</id>\n" +
                "      <text>Metrics rule everything around me.</text>\n" +
                "      <source>&lt;a href=&quot;http://www.osfoora.com/mac&quot; rel=&quot;nofollow&quot;&gt;Osfoora for Mac&lt;/a&gt;</source>\n" +
                "      <truncated>false</truncated>\n" +
                "      <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "      <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "      <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "      <user>\n" +
                "        <id>810781</id>\n" +
                "        <name>Daniel Schauenberg</name>\n" +
                "        <screen_name>mrtazz</screen_name>\n" +
                "        <location>Brooklyn</location>\n" +
                "        <description>Infrastructure Toolsmith at Etsy.\n" +
                "You can't be a non-conformist, if you don't drink coffee.</description>\n" +
                "        <profile_image_url>http://a0.twimg.com/profile_images/2362591791/s99doy01iybe3q4kdoag_normal.jpeg</profile_image_url>\n" +
                "        <profile_image_url_https>https://si0.twimg.com/profile_images/2362591791/s99doy01iybe3q4kdoag_normal.jpeg</profile_image_url_https>\n" +
                "        <url>http://unwiredcouch.com</url>\n" +
                "        <protected>false</protected>\n" +
                "        <followers_count>259</followers_count>\n" +
                "        <profile_background_color>FFF04D</profile_background_color>\n" +
                "        <profile_text_color>333333</profile_text_color>\n" +
                "        <profile_link_color>0099CC</profile_link_color>\n" +
                "        <profile_sidebar_fill_color>F6FFD1</profile_sidebar_fill_color>\n" +
                "        <profile_sidebar_border_color>FFF8AD</profile_sidebar_border_color>\n" +
                "        <friends_count>195</friends_count>\n" +
                "        <created_at>Sun Mar 04 21:17:02 +0000 2007</created_at>\n" +
                "        <favourites_count>83</favourites_count>\n" +
                "        <utc_offset>-18000</utc_offset>\n" +
                "        <time_zone>Eastern Time (US &amp; Canada)</time_zone>\n" +
                "        <profile_background_image_url>http://a0.twimg.com/images/themes/theme19/bg.gif</profile_background_image_url>\n" +
                "        <profile_background_image_url_https>https://si0.twimg.com/images/themes/theme19/bg.gif</profile_background_image_url_https>\n" +
                "        <profile_background_tile>false</profile_background_tile>\n" +
                "        <profile_use_background_image>true</profile_use_background_image>\n" +
                "        <geo_enabled>false</geo_enabled>\n" +
                "        <verified>false</verified>\n" +
                "        <statuses_count>3424</statuses_count>\n" +
                "        <lang>en</lang>\n" +
                "        <contributors_enabled>false</contributors_enabled>\n" +
                "        <is_translator>false</is_translator>\n" +
                "        <listed_count>6</listed_count>\n" +
                "        <show_all_inline_media>false</show_all_inline_media>\n" +
                "        <default_profile>false</default_profile>\n" +
                "        <default_profile_image>false</default_profile_image>\n" +
                "        <following></following>\n" +
                "        <follow_request_sent></follow_request_sent>\n" +
                "        <notifications></notifications>\n" +
                "      </user>\n" +
                "      <geo/>\n" +
                "      <coordinates/>\n" +
                "      <place/>\n" +
                "      <contributors/>\n" +
                "      <retweet_count>4</retweet_count>\n" +
                "      <favorited>false</favorited>\n" +
                "      <retweeted>false</retweeted>\n" +
                "    </retweeted_status>\n" +
                "    <retweet_count>4</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:17:39 +0000 2012</created_at>\n" +
                "    <id>222499793644158976</id>\n" +
                "    <text>RT @tostaypuft San Francisco - http://t.co/PqSAWefv &amp;lt; Another Sunday driver</text>\n" +
                "    <source>web</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id>222493991072051201</in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id>14111395</in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name>tostaypuft</in_reply_to_screen_name>\n" +
                "    <possibly_sensitive>false</possibly_sensitive>\n" +
                "    <user>\n" +
                "      <id>25472251</id>\n" +
                "      <name>Neil Gunther</name>\n" +
                "      <screen_name>DrQz</screen_name>\n" +
                "      <location>The Other Hills, California</location>\n" +
                "      <description>Computer performance, capacity planning, mathematician, physicist, hireable-Gun, author, instructor: the nexus being information (and &#9836;) http://goo.gl/3tScr</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/1348042873/njgThumb_normal.png</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/1348042873/njgThumb_normal.png</profile_image_url_https>\n" +
                "      <url>http://www.perfdynamics.com</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>928</followers_count>\n" +
                "      <profile_background_color>9AE4E8</profile_background_color>\n" +
                "      <profile_text_color>333333</profile_text_color>\n" +
                "      <profile_link_color>0084B4</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>F0B7B8</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>BDDCAD</profile_sidebar_border_color>\n" +
                "      <friends_count>268</friends_count>\n" +
                "      <created_at>Fri Mar 20 06:35:59 +0000 2009</created_at>\n" +
                "      <favourites_count>308</favourites_count>\n" +
                "      <utc_offset>-28800</utc_offset>\n" +
                "      <time_zone>Pacific Time (US &amp; Canada)</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/profile_background_images/105746564/cvalley2.jpg</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/profile_background_images/105746564/cvalley2.jpg</profile_background_image_url_https>\n" +
                "      <profile_background_tile>false</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>false</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>4586</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>81</listed_count>\n" +
                "      <show_all_inline_media>true</show_all_inline_media>\n" +
                "      <default_profile>false</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>0</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:15:46 +0000 2012</created_at>\n" +
                "    <id>222499318580510720</id>\n" +
                "    <text>Stir bar apparently went down through the trap. Ah well&#8230; time to order new ones, I suppose. And water balloons. #whyNot</text>\n" +
                "    <source>&lt;a href=&quot;http://itunes.apple.com/us/app/twitter/id409789998?mt=12&quot; rel=&quot;nofollow&quot;&gt;Twitter for Mac&lt;/a&gt;</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <user>\n" +
                "      <id>14498554</id>\n" +
                "      <name>Jorj Bauer</name>\n" +
                "      <screen_name>bozoskeleton</screen_name>\n" +
                "      <location>Philadelphia, PA</location>\n" +
                "      <description>Geek, photographic artist, dad.</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/1615724109/2011-halloween-2-small_normal.jpg</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/1615724109/2011-halloween-2-small_normal.jpg</profile_image_url_https>\n" +
                "      <url>http://www.jorj.org</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>274</followers_count>\n" +
                "      <profile_background_color>C0DEED</profile_background_color>\n" +
                "      <profile_text_color>333333</profile_text_color>\n" +
                "      <profile_link_color>0084B4</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>DDEEF6</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>C0DEED</profile_sidebar_border_color>\n" +
                "      <friends_count>218</friends_count>\n" +
                "      <created_at>Wed Apr 23 18:36:04 +0000 2008</created_at>\n" +
                "      <favourites_count>191</favourites_count>\n" +
                "      <utc_offset>-18000</utc_offset>\n" +
                "      <time_zone>Eastern Time (US &amp; Canada)</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/profile_background_images/2522082/All-Good-People-4.jpg</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/profile_background_images/2522082/All-Good-People-4.jpg</profile_background_image_url_https>\n" +
                "      <profile_background_tile>true</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>false</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>4332</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>15</listed_count>\n" +
                "      <show_all_inline_media>false</show_all_inline_media>\n" +
                "      <default_profile>false</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>0</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:07:00 +0000 2012</created_at>\n" +
                "    <id>222497109771943936</id>\n" +
                "    <text>This looks promising http://t.co/bdfceM1S</text>\n" +
                "    <source>&lt;a href=&quot;http://twitter.com/download/iphone&quot; rel=&quot;nofollow&quot;&gt;Twitter for iPhone&lt;/a&gt;</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <possibly_sensitive>false</possibly_sensitive>\n" +
                "    <user>\n" +
                "      <id>29777587</id>\n" +
                "      <name>Mark Phillips</name>\n" +
                "      <screen_name>pharkmillups</screen_name>\n" +
                "      <location>San Francisco</location>\n" +
                "      <description>Director of Community and Developer Evangelism at Basho Technologies. Basho and our community make Riak, the best database you will ever deploy. </description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/2165345096/pharksplosion_normal.jpg</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/2165345096/pharksplosion_normal.jpg</profile_image_url_https>\n" +
                "      <url>http://themarkphillips.com</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>1304</followers_count>\n" +
                "      <profile_background_color>B2DFDA</profile_background_color>\n" +
                "      <profile_text_color>333333</profile_text_color>\n" +
                "      <profile_link_color>93A644</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>FFFFFF</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>EEEEEE</profile_sidebar_border_color>\n" +
                "      <friends_count>262</friends_count>\n" +
                "      <created_at>Wed Apr 08 18:07:52 +0000 2009</created_at>\n" +
                "      <favourites_count>312</favourites_count>\n" +
                "      <utc_offset>-28800</utc_offset>\n" +
                "      <time_zone>Pacific Time (US &amp; Canada)</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/profile_background_images/85485614/riak-fluid.png</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/profile_background_images/85485614/riak-fluid.png</profile_background_image_url_https>\n" +
                "      <profile_background_tile>false</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>true</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>8383</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>75</listed_count>\n" +
                "      <show_all_inline_media>false</show_all_inline_media>\n" +
                "      <default_profile>false</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>0</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "  <status>\n" +
                "    <created_at>Tue Jul 10 01:06:46 +0000 2012</created_at>\n" +
                "    <id>222497054952402944</id>\n" +
                "    <text>There is apparently a show on NBC called &quot;American Ninja Warrior.&quot; Culturally, have we just become a parody of ourselves?</text>\n" +
                "    <source>&lt;a href=&quot;http://www.hootsuite.com&quot; rel=&quot;nofollow&quot;&gt;HootSuite&lt;/a&gt;</source>\n" +
                "    <truncated>false</truncated>\n" +
                "    <in_reply_to_status_id></in_reply_to_status_id>\n" +
                "    <in_reply_to_user_id></in_reply_to_user_id>\n" +
                "    <in_reply_to_screen_name></in_reply_to_screen_name>\n" +
                "    <user>\n" +
                "      <id>7108702</id>\n" +
                "      <name>Chris Lehmann</name>\n" +
                "      <screen_name>chrislehmann</screen_name>\n" +
                "      <location>Philadelphia, PA</location>\n" +
                "      <description>Principal of the Science Leadership Academy\n" +
                "Co-Chair - EduCon</description>\n" +
                "      <profile_image_url>http://a0.twimg.com/profile_images/1454937609/image_normal.jpg</profile_image_url>\n" +
                "      <profile_image_url_https>https://si0.twimg.com/profile_images/1454937609/image_normal.jpg</profile_image_url_https>\n" +
                "      <url>http://www.practicaltheory.org/serendipity</url>\n" +
                "      <protected>false</protected>\n" +
                "      <followers_count>12990</followers_count>\n" +
                "      <profile_background_color>9AE4E8</profile_background_color>\n" +
                "      <profile_text_color>000000</profile_text_color>\n" +
                "      <profile_link_color>0000FF</profile_link_color>\n" +
                "      <profile_sidebar_fill_color>E0FF92</profile_sidebar_fill_color>\n" +
                "      <profile_sidebar_border_color>87BC44</profile_sidebar_border_color>\n" +
                "      <friends_count>3747</friends_count>\n" +
                "      <created_at>Wed Jun 27 13:01:33 +0000 2007</created_at>\n" +
                "      <favourites_count>656</favourites_count>\n" +
                "      <utc_offset>-18000</utc_offset>\n" +
                "      <time_zone>Eastern Time (US &amp; Canada)</time_zone>\n" +
                "      <profile_background_image_url>http://a0.twimg.com/profile_background_images/59815091/new_fake_large_1476-4.jpg</profile_background_image_url>\n" +
                "      <profile_background_image_url_https>https://si0.twimg.com/profile_background_images/59815091/new_fake_large_1476-4.jpg</profile_background_image_url_https>\n" +
                "      <profile_background_tile>false</profile_background_tile>\n" +
                "      <profile_use_background_image>true</profile_use_background_image>\n" +
                "      <geo_enabled>true</geo_enabled>\n" +
                "      <verified>false</verified>\n" +
                "      <statuses_count>20917</statuses_count>\n" +
                "      <lang>en</lang>\n" +
                "      <contributors_enabled>false</contributors_enabled>\n" +
                "      <is_translator>false</is_translator>\n" +
                "      <listed_count>998</listed_count>\n" +
                "      <show_all_inline_media>true</show_all_inline_media>\n" +
                "      <default_profile>false</default_profile>\n" +
                "      <default_profile_image>false</default_profile_image>\n" +
                "      <following>true</following>\n" +
                "      <follow_request_sent></follow_request_sent>\n" +
                "      <notifications></notifications>\n" +
                "    </user>\n" +
                "    <geo/>\n" +
                "    <coordinates/>\n" +
                "    <place/>\n" +
                "    <contributors/>\n" +
                "    <retweet_count>3</retweet_count>\n" +
                "    <favorited>false</favorited>\n" +
                "    <retweeted>false</retweeted>\n" +
                "  </status>\n" +
                "</statuses>\n";

        SLogger.r("http://url.com", "Methdo", xml);

     }
}
