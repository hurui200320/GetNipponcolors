# Description

This program can download nippon colors from 4 different webiste.

Every website has a different statement with Nippon colors, not only nipponcolors.com, but also irocore.com and colordic.org. So I wrote this program to catch different colors from their website.

# How to use

This program need Gson 2.8.5 to work. But you needn't run it when you need. This program use some simple tricks to split data. Once the website change, it won't work well.

And since it single-thread, it will take a lot of time to run it. So I run it at 1404(UTC) on 2018 June 19th. Here is the table I collected. ```---```means no data or data broken.

## NipponColors

|Name|Roma|C|M|Y|K|RGB|View|
|:----:|:----:|:----:|:----:|:----:|:----:|:----:|:----:|
|<font color="#DC9FB4">撫子</font>|NADESHIKO|002|043|003|000| \#DC9FB4|<font color="#DC9FB4>■■■</font>|
|<font color="#E16B8C">紅梅</font>|KOHBAI|000|073|024|000| \#E16B8C|<font color="#E16B8C>■■■</font>|
|<font color="#8E354A">蘇芳</font>|SUOH|051|093|058|010| \#8E354A|<font color="#8E354A>■■■</font>|
|<font color="#F8C3CD">退紅</font>|TAIKOH|000|031|009|000| \#F8C3CD|<font color="#F8C3CD>■■■</font>|
|<font color="#F4A7B9">一斥染</font>|IKKONZOME|000|048|015|000| \#F4A7B9|<font color="#F4A7B9>■■■</font>|
|<font color="#64363C">桑染</font>|KUWAZOME|069|086|065|035| \#64363C|<font color="#64363C>■■■</font>|
|<font color="#F596AA">桃</font>|MOMO|000|055|019|000| \#F596AA|<font color="#F596AA>■■■</font>|
|<font color="#B5495B">苺</font>|ICHIGO|002|070|038|030| \#B5495B|<font color="#B5495B>■■■</font>|
|<font color="#E87A90">薄紅</font>|USUBENI|000|064|026|000| \#E87A90|<font color="#E87A90>■■■</font>|
|<font color="#D05A6E">今様</font>|IMAYOH|000|075|038|020| \#D05A6E|<font color="#D05A6E>■■■</font>|
|<font color="#DB4D6D">中紅</font>|NAKABENI|005|083|040|000| \#DB4D6D|<font color="#DB4D6D>■■■</font>|
|<font color="#FEDFE1">桜</font>|SAKURA|000|017|006|000| \#FEDFE1|<font color="#FEDFE1>■■■</font>|
|<font color="#9E7A7A">梅鼠</font>|UMENEZUMI|048|059|049|000| \#9E7A7A|<font color="#9E7A7A>■■■</font>|
|<font color="#D0104C">韓紅花</font>|KARAKURENAI|015|098|061|000| \#D0104C|<font color="#D0104C>■■■</font>|
|<font color="#9F353A">燕脂</font>|ENJI|042|093|068|006| \#9F353A|<font color="#9F353A>■■■</font>|
|<font color="#CB1B45">紅</font>|KURENAI|000|100|065|010| \#CB1B45|<font color="#CB1B45>■■■</font>|
|<font color="#EEA9A9">鴇</font>|TOKI|002|045|027|000| \#EEA9A9|<font color="#EEA9A9>■■■</font>|
|<font color="#BF6766">長春</font>|CYOHSYUN|025|070|053|000| \#BF6766|<font color="#BF6766>■■■</font>|
|<font color="#86473F">深緋</font>|KOKIAKE|054|075|065|014| \#86473F|<font color="#86473F>■■■</font>|
|<font color="#B19693">桜鼠</font>|SAKURANEZUMI|034|046|039|000| \#B19693|<font color="#B19693>■■■</font>|
|<font color="#EB7A77">甚三紅</font>|JINZAMOMI|000|065|046|000| \#EB7A77|<font color="#EB7A77>■■■</font>|
|<font color="#954A45">小豆</font>|AZUKI|048|078|066|010| \#954A45|<font color="#954A45>■■■</font>|
|<font color="#A96360">蘇芳香</font>|SUOHKOH|042|070|058|001| \#A96360|<font color="#A96360>■■■</font>|
|<font color="#CB4042">赤紅</font>|AKABENI|015|085|068|000| \#CB4042|<font color="#CB4042>■■■</font>|
|<font color="#AB3B3A">真朱</font>|SHINSYU|035|085|070|002| \#AB3B3A|<font color="#AB3B3A>■■■</font>|
|<font color="#D7C4BB">灰桜</font>|HAIZAKURA|002|012|012|010| \#D7C4BB|<font color="#D7C4BB>■■■</font>|
|<font color="#904840">栗梅</font>|KURIUME|050|078|068|013| \#904840|<font color="#904840>■■■</font>|
|<font color="#734338">海老茶</font>|EBICHA|055|077|068|027| \#734338|<font color="#734338>■■■</font>|
|<font color="#C73E3A">銀朱</font>|GINSYU|016|086|070|000| \#C73E3A|<font color="#C73E3A>■■■</font>|
|<font color="#554236">黒鳶</font>|KUROTOBI|071|074|069|041| \#554236|<font color="#554236>■■■</font>|
|<font color="#994639">紅鳶</font>|BENITOBI|045|082|072|011| \#994639|<font color="#994639>■■■</font>|
|<font color="#F19483">曙</font>|AKEBONO|000|057|047|000| \#F19483|<font color="#F19483>■■■</font>|
|<font color="#B54434">紅樺</font>|BENIKABA|035|087|079|001| \#B54434|<font color="#B54434>■■■</font>|
|<font color="#B9887D">水がき</font>|MIZUGAKI|030|054|046|000| \#B9887D|<font color="#B9887D>■■■</font>|
|<font color="#F17C67">珊瑚朱</font>|SANGOSYU|000|065|058|000| \#F17C67|<font color="#F17C67>■■■</font>|
|<font color="#884C3A">紅檜皮</font>|BENIHIWADA|052|074|070|018| \#884C3A|<font color="#884C3A>■■■</font>|
|<font color="#E83015">猩猩緋</font>|SYOJYOHI|000|089|079|000| \#E83015|<font color="#E83015>■■■</font>|
|<font color="#D75455">鉛丹</font>|ENTAN|000|072|063|007| \#D75455|<font color="#D75455>■■■</font>|
|<font color="#B55D4C">芝翫茶</font>|SHIKANCHA|037|072|068|000| \#B55D4C|<font color="#B55D4C>■■■</font>|
|<font color="#854836">檜皮</font>|HIWADA|049|073|070|018| \#854836|<font color="#854836>■■■</font>|
|<font color="#A35E47">柿渋</font>|KAKISHIBU|043|072|071|004| \#A35E47|<font color="#A35E47>■■■</font>|
|<font color="#CC543A">緋</font>|AKE|017|079|074|000| \#CC543A|<font color="#CC543A>■■■</font>|
|<font color="#724832">鳶</font>|TOBI|058|073|070|026| \#724832|<font color="#724832>■■■</font>|
|<font color="#F75C2F">紅緋</font>|BENIHI|000|075|074|000| \#F75C2F|<font color="#F75C2F>■■■</font>|
|<font color="#6A4028">栗皮茶</font>|KURIKAWACHA|058|074|072|030| \#6A4028|<font color="#6A4028>■■■</font>|
|<font color="#9A5034">弁柄</font>|BENGARA|044|074|075|012| \#9A5034|<font color="#9A5034>■■■</font>|
|<font color="#C46243">照柿</font>|TERIGAKI|024|072|072|000| \#C46243|<font color="#C46243>■■■</font>|
|<font color="#AF5F3C">江戸茶</font>|EDOCHA|038|070|071|003| \#AF5F3C|<font color="#AF5F3C>■■■</font>|
|<font color="#FB966E">洗朱</font>|ARAISYU|000|054|056|000| \#FB966E|<font color="#FB966E>■■■</font>|
|<font color="#724938">百塩茶</font>|MOMOSHIOCHA|061|070|068|025| \#724938|<font color="#724938>■■■</font>|
|<font color="#B47157">唐茶</font>|KARACHA|038|064|065|000| \#B47157|<font color="#B47157>■■■</font>|
|<font color="#DB8E71">ときがら茶</font>|TOKIGARACHA|010|055|057|000| \#DB8E71|<font color="#DB8E71>■■■</font>|
|<font color="#F05E1C">黄丹</font>|OHNI|000|072|090|000| \#F05E1C|<font color="#F05E1C>■■■</font>|
|<font color="#ED784A">纁</font>|SOHI|000|065|073|000| \#ED784A|<font color="#ED784A>■■■</font>|
|<font color="#CA7853">遠州茶</font>|ENSYUCHA|021|064|067|000| \#CA7853|<font color="#CA7853>■■■</font>|
|<font color="#B35C37">樺茶</font>|KABACHA|036|072|076|002| \#B35C37|<font color="#B35C37>■■■</font>|
|<font color="#563F2E">焦茶</font>|KOGECHA|068|073|071|040| \#563F2E|<font color="#563F2E>■■■</font>|
|<font color="#E3916E">赤香</font>|AKAKOH|005|055|060|000| \#E3916E|<font color="#E3916E>■■■</font>|
|<font color="#8F5A3C">雀茶</font>|SUZUMECHA|052|069|073|015| \#8F5A3C|<font color="#8F5A3C>■■■</font>|
|<font color="#F0A986">宍</font>|SHISHI|000|047|050|000| \#F0A986|<font color="#F0A986>■■■</font>|
|<font color="#A0674B">宗伝唐茶</font>|SODENKARACHA|048|066|070|006| \#A0674B|<font color="#A0674B>■■■</font>|
|<font color="#C1693C">樺</font>|KABA|026|070|078|000| \#C1693C|<font color="#C1693C>■■■</font>|
|<font color="#FB9966">深支子</font>|KOKIKUCHINASHI|000|053|065|000| \#FB9966|<font color="#FB9966>■■■</font>|
|<font color="#947A6D">胡桃</font>|KURUMI|051|056|057|001| \#947A6D|<font color="#947A6D>■■■</font>|
|<font color="#A36336">代赭</font>|TAISYA|038|067|082|003| \#A36336|<font color="#A36336>■■■</font>|
|<font color="#E79460">洗柿</font>|ARAIGAKI|000|053|067|000| \#E79460|<font color="#E79460>■■■</font>|
|<font color="#7D532C">黄櫨染</font>|KOHROZEN|055|068|078|023| \#7D532C|<font color="#7D532C>■■■</font>|
|<font color="#C78550">赤朽葉</font>|AKAKUCHIBA|005|052|070|014| \#C78550|<font color="#C78550>■■■</font>|
|<font color="#985F2A">礪茶</font>|TONOCHA|048|066|079|007| \#985F2A|<font color="#985F2A>■■■</font>|
|<font color="#E1A679">赤白橡</font>|AKASHIROTSURUBAMI|006|042|055|000| \#E1A679|<font color="#E1A679>■■■</font>|
|<font color="#855B32">煎茶</font>|SENCHA|055|066|075|014| \#855B32|<font color="#855B32>■■■</font>|
|<font color="#FC9F4D">萱草</font>|KANZO|000|049|072|000| \#FC9F4D|<font color="#FC9F4D>■■■</font>|
|<font color="#FFBA84">洒落柿</font>|SHAREGAKI|000|036|053|000| \#FFBA84|<font color="#FFBA84>■■■</font>|
|<font color="#E98B2A">紅鬱金</font>|BENIUKON|000|052|080|000| \#E98B2A|<font color="#E98B2A>■■■</font>|
|<font color="#E9A368">梅染</font>|UMEZOME|003|045|062|000| \#E9A368|<font color="#E9A368>■■■</font>|
|<font color="#B17844">枇杷茶</font>|BIWACHA|035|058|075|000| \#B17844|<font color="#B17844>■■■</font>|
|<font color="#96632E">丁子茶</font>|CHOJICHA|050|061|076|009| \#96632E|<font color="#96632E>■■■</font>|
|<font color="#43341B">憲法染</font>|KENPOHZOME|076|071|073|047| \#43341B|<font color="#43341B>■■■</font>|
|<font color="#CA7A2C">琥珀</font>|KOHAKU|020|058|085|000| \#CA7A2C|<font color="#CA7A2C>■■■</font>|
|<font color="#ECB88A">薄柿</font>|USUGAKI|000|034|052|000| \#ECB88A|<font color="#ECB88A>■■■</font>|
|<font color="#78552B">伽羅</font>|KYARA|058|062|072|016| \#78552B|<font color="#78552B>■■■</font>|
|<font color="#B07736">丁子染</font>|CHOJIZOME|036|057|079|000| \#B07736|<font color="#B07736>■■■</font>|
|<font color="#967249">柴染</font>|FUSHIZOME|050|056|071|005| \#967249|<font color="#967249>■■■</font>|
|<font color="#E2943B">朽葉</font>|KUCHIBA|007|049|080|000| \#E2943B|<font color="#E2943B>■■■</font>|
|<font color="#C7802D">金茶</font>|KINCHA|020|056|089|000| \#C7802D|<font color="#C7802D>■■■</font>|
|<font color="#9B6E23">狐</font>|KITSUNE|046|057|080|004| \#9B6E23|<font color="#9B6E23>■■■</font>|
|<font color="#6E552F">煤竹</font>|SUSUTAKE|062|063|073|021| \#6E552F|<font color="#6E552F>■■■</font>|
|<font color="#EBB471">薄香</font>|USUKOH|000|034|060|000| \#EBB471|<font color="#EBB471>■■■</font>|
|<font color="#D7B98E">砥粉</font>|TONOKO|005|020|038|015| \#D7B98E|<font color="#D7B98E>■■■</font>|
|<font color="#82663A">銀煤竹</font>|GINSUSUTAKE|054|058|076|010| \#82663A|<font color="#82663A>■■■</font>|
|<font color="#B68E55">黄土</font>|OHDO|031|045|066|000| \#B68E55|<font color="#B68E55>■■■</font>|
|<font color="#BC9F77">白茶</font>|SHIRACHA|032|040|057|000| \#BC9F77|<font color="#BC9F77>■■■</font>|
|<font color="#876633">媚茶</font>|KOBICHA|058|059|078|014| \#876633|<font color="#876633>■■■</font>|
|<font color="#C18A26">黄唐茶</font>|KIGARACHA|028|048|083|000| \#C18A26|<font color="#C18A26>■■■</font>|
|<font color="#FFB11B">山吹</font>|YAMABUKI|000|037|087|000| \#FFB11B|<font color="#FFB11B>■■■</font>|
|<font color="#D19826">山吹茶</font>|YAMABUKICHA|017|044|089|000| \#D19826|<font color="#D19826>■■■</font>|
|<font color="#DDA52D">櫨染</font>|HAJIZOME|008|040|083|000| \#DDA52D|<font color="#DDA52D>■■■</font>|
|<font color="#C99833">桑茶</font>|KUWACHA|025|044|083|000| \#C99833|<font color="#C99833>■■■</font>|
|<font color="#F9BF45">玉子</font>|TAMAGO|000|029|074|000| \#F9BF45|<font color="#F9BF45>■■■</font>|
|<font color="#DCB879">白橡</font>|SHIROTSURUBAMI|016|030|060|000| \#DCB879|<font color="#DCB879>■■■</font>|
|<font color="#BA9132">黄橡</font>|KITSURUBAMI|031|044|077|000| \#BA9132|<font color="#BA9132>■■■</font>|
|<font color="#E8B647">玉蜀黍</font>|TAMAMOROKOSHI|004|029|071|000| \#E8B647|<font color="#E8B647>■■■</font>|
|<font color="#F7C242">花葉</font>|HANABA|000|025|072|000| \#F7C242|<font color="#F7C242>■■■</font>|
|<font color="#7D6C46">生壁</font>|NAMAKABE|058|056|070|008| \#7D6C46|<font color="#7D6C46>■■■</font>|
|<font color="#DAC9A6">鳥の子</font>|TORINOKO|014|020|039|000| \#DAC9A6|<font color="#DAC9A6>■■■</font>|
|<font color="#FAD689">浅黄</font>|USUKI|000|017|053|000| \#FAD689|<font color="#FAD689>■■■</font>|
|<font color="#D9AB42">黄朽葉</font>|KIKUCHIBA|014|033|075|000| \#D9AB42|<font color="#D9AB42>■■■</font>|
|<font color="#F6C555">梔子</font>|KUCHINASHI|000|025|070|000| \#F6C555|<font color="#F6C555>■■■</font>|
|<font color="#FFC408">籐黄</font>|TOHOH|000|025|086|000| \#FFC408|<font color="#FFC408>■■■</font>|
|<font color="#EFBB24">鬱金</font>|UKON|003|029|088|000| \#EFBB24|<font color="#EFBB24>■■■</font>|
|<font color="#CAAD5F">芥子</font>|KARASHI|000|016|070|027| \#CAAD5F|<font color="#CAAD5F>■■■</font>|
|<font color="#8D742A">肥後煤竹</font>|HIGOSUSUTAKE|055|053|082|007| \#8D742A|<font color="#8D742A>■■■</font>|
|<font color="#B4A582">利休白茶</font>|RIKYUSHIRACHA|036|033|054|000| \#B4A582|<font color="#B4A582>■■■</font>|
|<font color="#877F6C">灰汁</font>|AKU|058|051|060|001| \#877F6C|<font color="#877F6C>■■■</font>|
|<font color="#897D55">利休茶</font>|RIKYUCHA|057|050|070|003| \#897D55|<font color="#897D55>■■■</font>|
|<font color="#74673E">路考茶</font>|ROKOHCHA|064|057|073|010| \#74673E|<font color="#74673E>■■■</font>|
|<font color="#A28C37">菜種油</font>|NATANEYU|046|042|084|000| \#A28C37|<font color="#A28C37>■■■</font>|
|<font color="#6C6024">鶯茶</font>|UGUISUCHA|064|056|078|016| \#6C6024|<font color="#6C6024>■■■</font>|
|<font color="#867835">黄海松茶</font>|KIMIRUCHA|057|048|078|006| \#867835|<font color="#867835>■■■</font>|
|<font color="#62592C">海松茶</font>|MIRUCHA|068|059|075|022| \#62592C|<font color="#62592C>■■■</font>|
|<font color="#E9CD4C">刈安</font>|KARIYASU|007|015|074|000| \#E9CD4C|<font color="#E9CD4C>■■■</font>|
|<font color="#F7D94C">菜の花</font>|NANOHANA|002|011|075|000| \#F7D94C|<font color="#F7D94C>■■■</font>|
|<font color="#FBE251">黄蘗</font>|KIHADA|000|005|073|000| \#FBE251|<font color="#FBE251>■■■</font>|
|<font color="#D9CD90">蒸栗</font>|MUSHIKURI|016|015|052|000| \#D9CD90|<font color="#D9CD90>■■■</font>|
|<font color="#ADA142">青朽葉</font>|AOKUCHIBA|038|031|076|000| \#ADA142|<font color="#ADA142>■■■</font>|
|<font color="#DDD23B">女郎花</font>|OMINAESHI|016|009|082|000| \#DDD23B|<font color="#DDD23B>■■■</font>|
|<font color="#A5A051">鶸茶</font>|HIWACHA|045|033|076|000| \#A5A051|<font color="#A5A051>■■■</font>|
|<font color="#BEC23F">鶸</font>|HIWA|032|015|085|000| \#BEC23F|<font color="#BEC23F>■■■</font>|
|<font color="#6C6A2D">鶯</font>|UGUISU|067|054|084|014| \#6C6A2D|<font color="#6C6A2D>■■■</font>|
|<font color="#939650">柳茶</font>|YANAGICHA|052|037|073|000| \#939650|<font color="#939650>■■■</font>|
|<font color="#838A2D">苔</font>|KOKE|062|041|083|002| \#838A2D|<font color="#838A2D>■■■</font>|
|<font color="#B1B479">麹塵</font>|KIKUJIN|037|023|063|000| \#B1B479|<font color="#B1B479>■■■</font>|
|<font color="#616138">璃寛茶</font>|RIKANCHA|072|058|073|019| \#616138|<font color="#616138>■■■</font>|
|<font color="#4B4E2A">藍媚茶</font>|AIKOBICHA|076|061|074|030| \#4B4E2A|<font color="#4B4E2A>■■■</font>|
|<font color="#5B622E">海松</font>|MIRU|072|056|078|020| \#5B622E|<font color="#5B622E>■■■</font>|
|<font color="#4D5139">千歳茶</font>|SENSAICHA|077|061|070|030| \#4D5139|<font color="#4D5139>■■■</font>|
|<font color="#89916B">梅幸茶</font>|BAIKOCHA|057|038|063|000| \#89916B|<font color="#89916B>■■■</font>|
|<font color="#90B44B">鶸萌黄</font>|HIWAMOEGI|056|013|077|000| \#90B44B|<font color="#90B44B>■■■</font>|
|<font color="#91AD70">柳染</font>|YANAGIZOME|056|024|065|000| \#91AD70|<font color="#91AD70>■■■</font>|
|<font color="#B5CAA0">裏柳</font>|URAYANAGI|036|010|045|000| \#B5CAA0|<font color="#B5CAA0>■■■</font>|
|<font color="#646A58">岩井茶</font>|IWAICHA|069|052|063|007| \#646A58|<font color="#646A58>■■■</font>|
|<font color="#7BA23F">萌黄</font>|MOEGI|070|023|086|000| \#7BA23F|<font color="#7BA23F>■■■</font>|
|<font color="#86C166">苗</font>|NAE|057|001|072|000| \#86C166|<font color="#86C166>■■■</font>|
|<font color="#4A593D">柳煤竹</font>|YANAGISUSUTAKE|076|057|070|017| \#4A593D|<font color="#4A593D>■■■</font>|
|<font color="#42602D">松葉</font>|MATSUBA|080|055|079|020| \#42602D|<font color="#42602D>■■■</font>|
|<font color="#516E41">青丹</font>|AONI|076|051|075|012| \#516E41|<font color="#516E41>■■■</font>|
|<font color="#91B493">薄青</font>|USUAO|057|019|052|000| \#91B493|<font color="#91B493>■■■</font>|
|<font color="#808F7C">柳鼠</font>|YANAGINEZUMI|061|041|053|000| \#808F7C|<font color="#808F7C>■■■</font>|
|<font color="#1B813E">常磐</font>|TOKIWA|082|000|078|040| \#1B813E|<font color="#1B813E>■■■</font>|
|<font color="#5DAC81">若竹</font>|WAKATAKE|068|013|059|000| \#5DAC81|<font color="#5DAC81>■■■</font>|
|<font color="#36563C">千歳緑</font>|CHITOSEMIDORI|083|055|069|022| \#36563C|<font color="#36563C>■■■</font>|
|<font color="#227D51">緑</font>|MIDORI|086|036|070|000| \#227D51|<font color="#227D51>■■■</font>|
|<font color="#A8D8B9">白緑</font>|BYAKUROKU|044|000|037|000| \#A8D8B9|<font color="#A8D8B9>■■■</font>|
|<font color="#6A8372">老竹</font>|OITAKE|071|046|060|002| \#6A8372|<font color="#6A8372>■■■</font>|
|<font color="#2D6D4B">木賊</font>|TOKUSA|086|046|070|008| \#2D6D4B|<font color="#2D6D4B>■■■</font>|
|<font color="#465D4C">御納戸茶</font>|ONANDOCHA|081|060|068|022| \#465D4C|<font color="#465D4C>■■■</font>|
|<font color="#24936E">緑青</font>|ROKUSYOH|083|023|063|000| \#24936E|<font color="#24936E>■■■</font>|
|<font color="#86A697">錆青磁</font>|SABISEIJI|058|030|045|000| \#86A697|<font color="#86A697>■■■</font>|
|<font color="#00896C">青竹</font>|AOTAKE|092|028|067|000| \#00896C|<font color="#00896C>■■■</font>|
|<font color="#096148">ビロード</font>|VELUDO|093|054|071|020| \#096148|<font color="#096148>■■■</font>|
|<font color="#20604F">虫襖</font>|MUSHIAO|089|055|067|017| \#20604F|<font color="#20604F>■■■</font>|
|<font color="#0F4C3A">藍海松茶</font>|AIMIRUCHA|089|060|067|030| \#0F4C3A|<font color="#0F4C3A>■■■</font>|
|<font color="#4F726C">沈香茶</font>|TONOCHA2|077|050|057|004| \#4F726C|<font color="#4F726C>■■■</font>|
|<font color="#00AA90">青緑</font>|AOMIDORI|088|000|053|000| \#00AA90|<font color="#00AA90>■■■</font>|
|<font color="#69B0AC">青磁</font>|SEIJI|061|014|034|000| \#69B0AC|<font color="#69B0AC>■■■</font>|
|<font color="#26453D">鉄</font>|TETSU|090|063|066|030| \#26453D|<font color="#26453D>■■■</font>|
|<font color="#66BAB7">水浅葱</font>|MIZUASAGI|068|010|033|000| \#66BAB7|<font color="#66BAB7>■■■</font>|
|<font color="#268785">青碧</font>|SEIHEKI|085|035|050|000| \#268785|<font color="#268785>■■■</font>|
|<font color="#405B55">錆鉄御納戸</font>|SABITETSUONANDO|083|059|060|013| \#405B55|<font color="#405B55>■■■</font>|
|<font color="#305A56">高麗納戸</font>|KORAINANDO|088|058|061|015| \#305A56|<font color="#305A56>■■■</font>|
|<font color="#78C2C4">白群</font>|BYAKUGUN|052|000|020|000| \#78C2C4|<font color="#78C2C4>■■■</font>|
|<font color="#376B6D">御召茶</font>|OMESHICHA|087|054|054|005| \#376B6D|<font color="#376B6D>■■■</font>|
|<font color="#A5DEE4">瓶覗</font>|KAMENOZOKI|042|000|011|000| \#A5DEE4|<font color="#A5DEE4>■■■</font>|
|<font color="#77969A">深川鼠</font>|FUKAGAWANEZUMI|063|038|040|000| \#77969A|<font color="#77969A>■■■</font>|
|<font color="#6699A1">錆浅葱</font>|SABIASAGI|066|030|034|000| \#6699A1|<font color="#6699A1>■■■</font>|
|<font color="#81C7D4">水</font>|MIZU|055|006|017|000| \#81C7D4|<font color="#81C7D4>■■■</font>|
|<font color="#33A6B8">浅葱</font>|ASAGI|082|018|027|000| \#33A6B8|<font color="#33A6B8>■■■</font>|
|<font color="#0C4842">御納戸</font>|ONANDO|092|065|062|025| \#0C4842|<font color="#0C4842>■■■</font>|
|<font color="#0D5661">藍</font>|AI|095|063|056|017| \#0D5661|<font color="#0D5661>■■■</font>|
|<font color="#0089A7">新橋</font>|SHINBASHI|095|031|030|000| \#0089A7|<font color="#0089A7>■■■</font>|
|<font color="#336774">錆御納戸</font>|SABIONANDO|087|056|052|006| \#336774|<font color="#336774>■■■</font>|
|<font color="#255359">鉄御納戸</font>|TETSUONANDO|090|063|059|021| \#255359|<font color="#255359>■■■</font>|
|<font color="#1E88A8">花浅葱</font>|HANAASAGI|090|032|023|000| \#1E88A8|<font color="#1E88A8>■■■</font>|
|<font color="#566C73">藍鼠</font>|AINEZUMI|078|057|052|007| \#566C73|<font color="#566C73>■■■</font>|
|<font color="#577C8A">舛花</font>|MASUHANA|078|048|042|000| \#577C8A|<font color="#577C8A>■■■</font>|
|<font color="#58B2DC">空</font>|SORA|072|013|007|000| \#58B2DC|<font color="#58B2DC>■■■</font>|
|<font color="#2B5F75">熨斗目花</font>|NOSHIMEHANA|092|060|047|004| \#2B5F75|<font color="#2B5F75>■■■</font>|
|<font color="#3A8FB7">千草</font>|CHIGUSA|083|031|017|000| \#3A8FB7|<font color="#3A8FB7>■■■</font>|
|<font color="#2E5C6E">御召御納戸</font>|OMESHIONANDO|090|063|051|007| \#2E5C6E|<font color="#2E5C6E>■■■</font>|
|<font color="#006284">縹</font>|HANADA|100|060|041|002| \#006284|<font color="#006284>■■■</font>|
|<font color="#7DB9DE">勿忘草</font>|WASURENAGUSA|052|010|000|000| \#7DB9DE|<font color="#7DB9DE>■■■</font>|
|<font color="#51A8DD">群青</font>|GUNJYO|067|021|000|000| \#51A8DD|<font color="#51A8DD>■■■</font>|
|<font color="#2EA9DF">露草</font>|TSUYUKUSA|073|020|000|000| \#2EA9DF|<font color="#2EA9DF>■■■</font>|
|<font color="#0B1013">黒橡</font>|KUROTSURUBAMI|092|078|064|048| \#0B1013|<font color="#0B1013>■■■</font>|
|<font color="#0F2540">紺</font>|KON|100|085|050|024| \#0F2540|<font color="#0F2540>■■■</font>|
|<font color="#08192D">褐</font>|KACHI|100|086|060|045| \#08192D|<font color="#08192D>■■■</font>|
|<font color="#005CAF">瑠璃</font>|RURI|097|065|000|000| \#005CAF|<font color="#005CAF>■■■</font>|
|<font color="#0B346E">瑠璃紺</font>|RURIKON|100|085|039|004| \#0B346E|<font color="#0B346E>■■■</font>|
|<font color="#7B90D2">紅碧</font>|BENIMIDORI|064|044|000|000| \#7B90D2|<font color="#7B90D2>■■■</font>|
|<font color="#6E75A4">藤鼠</font>|FUJINEZUMI|069|056|017|000| \#6E75A4|<font color="#6E75A4>■■■</font>|
|<font color="#261E47">鉄紺</font>|TETSUKON|080|065|000|077| \#261E47|<font color="#261E47>■■■</font>|
|<font color="#113285">紺青</font>|KONJYO|100|085|015|000| \#113285|<font color="#113285>■■■</font>|
|<font color="#4E4F97">紅掛花</font>|BENIKAKEHANA|082|070|014|000| \#4E4F97|<font color="#4E4F97>■■■</font>|
|<font color="#211E55">紺桔梗</font>|KONKIKYO|100|090|042|012| \#211E55|<font color="#211E55>■■■</font>|
|<font color="#8B81C3">藤</font>|FUJI|058|052|000|000| \#8B81C3|<font color="#8B81C3>■■■</font>|
|<font color="#70649A">二藍</font>|FUTAAI|072|067|021|000| \#70649A|<font color="#70649A>■■■</font>|
|<font color="#9B90C2">楝</font>|OUCHI|042|042|000|000| \#9B90C2|<font color="#9B90C2>■■■</font>|
|<font color="#8A6BBE">藤紫</font>|FUJIMURASAKI|058|060|000|000| \#8A6BBE|<font color="#8A6BBE>■■■</font>|
|<font color="#6A4C9C">桔梗</font>|KIKYO|075|075|010|000| \#6A4C9C|<font color="#6A4C9C>■■■</font>|
|<font color="#8F77B5">紫苑</font>|SHION|055|058|001|000| \#8F77B5|<font color="#8F77B5>■■■</font>|
|<font color="#533D5B">滅紫</font>|MESSHI|082|080|048|015| \#533D5B|<font color="#533D5B>■■■</font>|
|<font color="#B28FCE">薄</font>|USU|043|051|000|000| \#B28FCE|<font color="#B28FCE>■■■</font>|
|<font color="#986DB2">半</font>|HASHITA|055|063|000|000| \#986DB2|<font color="#986DB2>■■■</font>|
|<font color="#77428D">江戸紫</font>|EDOMURASAKI|060|074|000|014| \#77428D|<font color="#77428D>■■■</font>|
|<font color="#3C2F41">紫紺</font>|SHIKON|088|084|060|045| \#3C2F41|<font color="#3C2F41>■■■</font>|
|<font color="#4A225D">深紫</font>|KOKIMURASAKI|090|093|043|016| \#4A225D|<font color="#4A225D>■■■</font>|
|<font color="#66327C">菫</font>|SUMIRE|074|083|022|000| \#66327C|<font color="#66327C>■■■</font>|
|<font color="#592C63">紫</font>|MURASAKI|081|087|040|007| \#592C63|<font color="#592C63>■■■</font>|
|<font color="#6F3381">菖蒲</font>|AYAME|071|087|014|000| \#6F3381|<font color="#6F3381>■■■</font>|
|<font color="#574C57">藤煤竹</font>|FUJISUSUTAKE|075|070|057|025| \#574C57|<font color="#574C57>■■■</font>|
|<font color="#B481BB">紅藤</font>|BENIFUJI|038|060|000|000| \#B481BB|<font color="#B481BB>■■■</font>|
|<font color="#3F2B36">黒紅</font>|KUROBENI|086|085|064|050| \#3F2B36|<font color="#3F2B36>■■■</font>|
|<font color="#572A3F">茄子紺</font>|NASUKON|040|073|010|073| \#572A3F|<font color="#572A3F>■■■</font>|
|<font color="#5E3D50">葡萄鼠</font>|BUDOHNEZUMI|073|077|054|017| \#5E3D50|<font color="#5E3D50>■■■</font>|
|<font color="#72636E">鳩羽鼠</font>|HATOBANEZUMI|068|064|051|006| \#72636E|<font color="#72636E>■■■</font>|
|<font color="#622954">杜若</font>|KAKITSUBATA|077|092|048|021| \#622954|<font color="#622954>■■■</font>|
|<font color="#6D2E5B">蒲葡</font>|EBIZOME|071|089|048|012| \#6D2E5B|<font color="#6D2E5B>■■■</font>|
|<font color="#C1328E">牡丹</font>|BOTAN|025|091|008|000| \#C1328E|<font color="#C1328E>■■■</font>|
|<font color="#A8497A">梅紫</font>|UMEMURASAKI|045|080|037|000| \#A8497A|<font color="#A8497A>■■■</font>|
|<font color="#562E37">似紫</font>|NISEMURASAKI|075|084|062|042| \#562E37|<font color="#562E37>■■■</font>|
|<font color="#E03C8A">躑躅</font>|TSUTSUJI|000|080|003|000| \#E03C8A|<font color="#E03C8A>■■■</font>|
|<font color="#60373E">紫鳶</font>|MURASAKITOBI|070|078|061|030| \#60373E|<font color="#60373E>■■■</font>|
|<font color="#FCFAF2">白練</font>|SHIRONERI|000|003|011|000| \#FCFAF2|<font color="#FCFAF2>■■■</font>|
|<font color="#FFFFFB">胡粉</font>|GOFUN|000|000|002|000| \#FFFFFB|<font color="#FFFFFB>■■■</font>|
|<font color="#BDC0BA">白鼠</font>|SHIRONEZUMI|031|023|028|000| \#BDC0BA|<font color="#BDC0BA>■■■</font>|
|<font color="#91989F">銀鼠</font>|GINNEZUMI|052|039|036|000| \#91989F|<font color="#91989F>■■■</font>|
|<font color="#787878">鉛</font>|NAMARI|008|000|000|073| \#787878|<font color="#787878>■■■</font>|
|<font color="#828282">灰</font>|HAI|000|000|000|070| \#828282|<font color="#828282>■■■</font>|
|<font color="#787D7B">素鼠</font>|SUNEZUMI|065|053|053|000| \#787D7B|<font color="#787D7B>■■■</font>|
|<font color="#707C74">利休鼠</font>|RIKYUNEZUMI|066|050|054|001| \#707C74|<font color="#707C74>■■■</font>|
|<font color="#656765">鈍</font>|NIBI|005|000|000|080| \#656765|<font color="#656765>■■■</font>|
|<font color="#535953">青鈍</font>|AONIBI|078|063|062|020| \#535953|<font color="#535953>■■■</font>|
|<font color="#4F4F48">溝鼠</font>|DOBUNEZUMI|078|065|065|030| \#4F4F48|<font color="#4F4F48>■■■</font>|
|<font color="#52433D">紅消鼠</font>|BENIKESHINEZUMI|073|069|063|030| \#52433D|<font color="#52433D>■■■</font>|
|<font color="#373C38">藍墨茶</font>|AISUMICHA|086|072|068|047| \#373C38|<font color="#373C38>■■■</font>|
|<font color="#3A3226">檳榔子染</font>|BINROJIZOME|079|072|072|050| \#3A3226|<font color="#3A3226>■■■</font>|
|<font color="#434343">消炭</font>|KESHIZUMI|000|000|000|088| \#434343|<font color="#434343>■■■</font>|
|<font color="#1C1C1C">墨</font>|SUMI|092|078|073|066| \#1C1C1C|<font color="#1C1C1C>■■■</font>|
|<font color="#080808">黒</font>|KURO|091|084|074|071| \#080808|<font color="#080808>■■■</font>|
|<font color="#0C0C0C">呂</font>|RO|000|000|000|100| \#0C0C0C|<font color="#0C0C0C>■■■</font>|



## Colordic
Colors from [www.colordic.org](https://www.colordic.org/w/) :
|                  Name                   |        Roma        |  C   |  M   |  Y   |  K   |   RGB    |              View               |
| :-------------------------------------: | :----------------: | :--: | :--: | :--: | :--: | :------: | :-----------------------------: |
|    <font color="#FEF4F4">桜色</font>    |     さくらいろ     | ---  | ---  | ---  | ---  | \#FEF4F4 | <font color="#FEF4F4>■■■</font> |
|   <font color="#96514D">小豆色</font>   |     あずきいろ     | ---  | ---  | ---  | ---  | \#96514D | <font color="#96514D>■■■</font> |
|    <font color="#E6B422">黄金</font>    |       こがね       | ---  | ---  | ---  | ---  | \#E6B422 | <font color="#E6B422>■■■</font> |
|   <font color="#006E54">萌葱色</font>   |     もえぎいろ     | ---  | ---  | ---  | ---  | \#006E54 | <font color="#006E54>■■■</font> |
|   <font color="#895B8A">古代紫</font>   |   こだいむらさき   | ---  | ---  | ---  | ---  | \#895B8A | <font color="#895B8A>■■■</font> |
|    <font color="#FDEFF2">薄桜</font>    |     うすざくら     | ---  | ---  | ---  | ---  | \#FDEFF2 | <font color="#FDEFF2>■■■</font> |
|    <font color="#8D6449">枯茶</font>    |      からちゃ      | ---  | ---  | ---  | ---  | \#8D6449 | <font color="#8D6449>■■■</font> |
|    <font color="#D9A62E">櫨染</font>    |      はじぞめ      | ---  | ---  | ---  | ---  | \#D9A62E | <font color="#D9A62E>■■■</font> |
|   <font color="#00A381">花緑青</font>   |   はなろくしょう   | ---  | ---  | ---  | ---  | \#00A381 | <font color="#00A381>■■■</font> |
|   <font color="#824880">茄子紺</font>   |      なすこん      | ---  | ---  | ---  | ---  | \#824880 | <font color="#824880>■■■</font> |
|    <font color="#E9DFE5">桜鼠</font>    |     さくらねず     | ---  | ---  | ---  | ---  | \#E9DFE5 | <font color="#E9DFE5>■■■</font> |
|    <font color="#DEB068">飴色</font>    |      あめいろ      | ---  | ---  | ---  | ---  | \#DEB068 | <font color="#DEB068>■■■</font> |
|  <font color="#D3A243">黄朽葉色</font>  |    きくちばいろ    | ---  | ---  | ---  | ---  | \#D3A243 | <font color="#D3A243>■■■</font> |
|   <font color="#38B48B">翡翠色</font>   |     ひすいいろ     | ---  | ---  | ---  | ---  | \#38B48B | <font color="#38B48B>■■■</font> |
|    <font color="#915C8B">二藍</font>    |      ふたあい      | ---  | ---  | ---  | ---  | \#915C8B | <font color="#915C8B>■■■</font> |
|    <font color="#E4D2D8">鴇鼠</font>    |      ときねず      | ---  | ---  | ---  | ---  | \#E4D2D8 | <font color="#E4D2D8>■■■</font> |
|   <font color="#BF794E">駱駝色</font>   |     らくだいろ     | ---  | ---  | ---  | ---  | \#BF794E | <font color="#BF794E>■■■</font> |
|   <font color="#C89932">山吹茶</font>   |    やまぶきちゃ    | ---  | ---  | ---  | ---  | \#C89932 | <font color="#C89932>■■■</font> |
|    <font color="#00A497">青緑</font>    |     あおみどり     | ---  | ---  | ---  | ---  | \#00A497 | <font color="#00A497>■■■</font> |
|    <font color="#9D5B8B">京紫</font>    |   きょうむらさき   | ---  | ---  | ---  | ---  | \#9D5B8B | <font color="#9D5B8B>■■■</font> |
|    <font color="#F6BFBC">虹色</font>    |      にじいろ      | ---  | ---  | ---  | ---  | \#F6BFBC | <font color="#F6BFBC>■■■</font> |
|    <font color="#BC763C">土色</font>    |      つちいろ      | ---  | ---  | ---  | ---  | \#BC763C | <font color="#BC763C>■■■</font> |
|   <font color="#D0AF4C">芥子色</font>   |     からしいろ     | ---  | ---  | ---  | ---  | \#D0AF4C | <font color="#D0AF4C>■■■</font> |
|   <font color="#80ABA9">水浅葱</font>   |     みずあさぎ     | ---  | ---  | ---  | ---  | \#80ABA9 | <font color="#80ABA9>■■■</font> |
|    <font color="#7A4171">蒲葡</font>    |      えびぞめ      | ---  | ---  | ---  | ---  | \#7A4171 | <font color="#7A4171>■■■</font> |
|   <font color="#F5B1AA">珊瑚色</font>   |     さんごいろ     | ---  | ---  | ---  | ---  | \#F5B1AA | <font color="#F5B1AA>■■■</font> |
|   <font color="#B98C46">黄唐茶</font>   |     きがらちゃ     | ---  | ---  | ---  | ---  | \#B98C46 | <font color="#B98C46>■■■</font> |
|  <font color="#8B968D">豆がら茶</font>  |    まめがらちゃ    | ---  | ---  | ---  | ---  | \#8B968D | <font color="#8B968D>■■■</font> |
|   <font color="#5C9291">錆浅葱</font>   |     さびあさぎ     | ---  | ---  | ---  | ---  | \#5C9291 | <font color="#5C9291>■■■</font> |
|    <font color="#BC64A4">若紫</font>    |    わかむらさき    | ---  | ---  | ---  | ---  | \#BC64A4 | <font color="#BC64A4>■■■</font> |
|   <font color="#F5B199">一斤染</font>   |    いっこんぞめ    | ---  | ---  | ---  | ---  | \#F5B199 | <font color="#F5B199>■■■</font> |
|    <font color="#B79B5B">桑染</font>    |      くわぞめ      | ---  | ---  | ---  | ---  | \#B79B5B | <font color="#B79B5B>■■■</font> |
|    <font color="#6E7955">麹塵</font>    |      きくじん      | ---  | ---  | ---  | ---  | \#6E7955 | <font color="#6E7955>■■■</font> |
|    <font color="#478384">青碧</font>    |      せいへき      | ---  | ---  | ---  | ---  | \#478384 | <font color="#478384>■■■</font> |
|    <font color="#B44C97">紅紫</font>    |    べにむらさき    | ---  | ---  | ---  | ---  | \#B44C97 | <font color="#B44C97>■■■</font> |
|    <font color="#EFAB93">宍色</font>    |      ししいろ      | ---  | ---  | ---  | ---  | \#EFAB93 | <font color="#EFAB93>■■■</font> |
|    <font color="#B77B57">櫨色</font>    |      はじいろ      | ---  | ---  | ---  | ---  | \#B77B57 | <font color="#B77B57>■■■</font> |
|   <font color="#767C6B">山鳩色</font>   |    やまばといろ    | ---  | ---  | ---  | ---  | \#767C6B | <font color="#767C6B>■■■</font> |
|   <font color="#43676B">御召茶</font>   |     おめしちゃ     | ---  | ---  | ---  | ---  | \#43676B | <font color="#43676B>■■■</font> |
|    <font color="#AA4C8F">梅紫</font>    |    うめむらさき    | ---  | ---  | ---  | ---  | \#AA4C8F | <font color="#AA4C8F>■■■</font> |
|   <font color="#F2A0A1">紅梅色</font>   |    こうばいいろ    | ---  | ---  | ---  | ---  | \#F2A0A1 | <font color="#F2A0A1>■■■</font> |
|    <font color="#B68D4C">黄橡</font>    |     きつるばみ     | ---  | ---  | ---  | ---  | \#B68D4C | <font color="#B68D4C>■■■</font> |
|   <font color="#888E7E">利休鼠</font>   |   りきゅうねずみ   | ---  | ---  | ---  | ---  | \#888E7E | <font color="#888E7E>■■■</font> |
|    <font color="#80989B">湊鼠</font>    |    みなとねずみ    | ---  | ---  | ---  | ---  | \#80989B | <font color="#80989B>■■■</font> |
|  <font color="#CC7EB1"> 菖蒲色</font>   |     あやめいろ     | ---  | ---  | ---  | ---  | \#CC7EB1 | <font color="#CC7EB1>■■■</font> |
|    <font color="#F0908D">薄紅</font>    |      うすべに      | ---  | ---  | ---  | ---  | \#F0908D | <font color="#F0908D>■■■</font> |
|   <font color="#AD7D4C">丁字染</font>   |    ちょうじぞめ    | ---  | ---  | ---  | ---  | \#AD7D4C | <font color="#AD7D4C>■■■</font> |
|   <font color="#5A544B">海松茶</font>   |      みるちゃ      | ---  | ---  | ---  | ---  | \#5A544B | <font color="#5A544B>■■■</font> |
|  <font color="#2C4F54">高麗納戸</font>  |   こうらいなんど   | ---  | ---  | ---  | ---  | \#2C4F54 | <font color="#2C4F54>■■■</font> |
|   <font color="#CCA6BF">紅藤色</font>   |    べにふじいろ    | ---  | ---  | ---  | ---  | \#CCA6BF | <font color="#CCA6BF>■■■</font> |
|   <font color="#EE827C">甚三紅</font>   |     じんざもみ     | ---  | ---  | ---  | ---  | \#EE827C | <font color="#EE827C>■■■</font> |
|    <font color="#AD7D4C">香染</font>    |      こうぞめ      | ---  | ---  | ---  | ---  | \#AD7D4C | <font color="#AD7D4C>■■■</font> |
|  <font color="#56564B">藍海松茶</font>  |    あいみるちゃ    | ---  | ---  | ---  | ---  | \#56564B | <font color="#56564B>■■■</font> |
|   <font color="#1F3134">百入茶</font>   |    ももしおちゃ    | ---  | ---  | ---  | ---  | \#1F3134 | <font color="#1F3134>■■■</font> |
|    <font color="#C4A3BF">浅紫</font>    |    あさむらさき    | ---  | ---  | ---  | ---  | \#C4A3BF | <font color="#C4A3BF>■■■</font> |
|    <font color="#F09199">桃色</font>    |      ももいろ      | ---  | ---  | ---  | ---  | \#F09199 | <font color="#F09199>■■■</font> |
|   <font color="#AE7C4F">枇杷茶</font>   |      びわちゃ      | ---  | ---  | ---  | ---  | \#AE7C4F | <font color="#AE7C4F>■■■</font> |
|   <font color="#555647">藍媚茶</font>   |    あいこびちゃ    | ---  | ---  | ---  | ---  | \#555647 | <font color="#555647>■■■</font> |
|    <font color="#47585C">錆鼠</font>    |      さびねず      | ---  | ---  | ---  | ---  | \#47585C | <font color="#47585C>■■■</font> |
|   <font color="#E7E7EB">紫水晶</font>   | むらさきすいしょう | ---  | ---  | ---  | ---  | \#E7E7EB | <font color="#E7E7EB>■■■</font> |
|    <font color="#F4B3C2">鴇色</font>    |      ときいろ      | ---  | ---  | ---  | ---  | \#F4B3C2 | <font color="#F4B3C2>■■■</font> |
|   <font color="#AD7E4E">芝翫茶</font>   |     しかんちゃ     | ---  | ---  | ---  | ---  | \#AD7E4E | <font color="#AD7E4E>■■■</font> |
|   <font color="#494A41">千歳茶</font>   |    せんさいちゃ    | ---  | ---  | ---  | ---  | \#494A41 | <font color="#494A41>■■■</font> |
| <font color="#485859">錆鉄御納戸</font> |  さびてつおなんど  | ---  | ---  | ---  | ---  | \#485859 | <font color="#485859>■■■</font> |
|   <font color="#DCD6D9">薄梅鼠</font>   |    うすうめねず    | ---  | ---  | ---  | ---  | \#DCD6D9 | <font color="#DCD6D9>■■■</font> |
|   <font color="#EEBBCB">撫子色</font>   |    なでしこいろ    | ---  | ---  | ---  | ---  | \#EEBBCB | <font color="#EEBBCB>■■■</font> |
|    <font color="#AE7C58">焦香</font>    |     こがれこう     | ---  | ---  | ---  | ---  | \#AE7C58 | <font color="#AE7C58>■■■</font> |
|   <font color="#6B6F59">岩井茶</font>   |     いわいちゃ     | ---  | ---  | ---  | ---  | \#6B6F59 | <font color="#6B6F59>■■■</font> |
|    <font color="#6C848D">藍鼠</font>    |      あいねず      | ---  | ---  | ---  | ---  | \#6C848D | <font color="#6C848D>■■■</font> |
|    <font color="#D3CFD9">暁鼠</font>    |    あかつきねず    | ---  | ---  | ---  | ---  | \#D3CFD9 | <font color="#D3CFD9>■■■</font> |
|    <font color="#E8D3C7">灰梅</font>    |      はいうめ      | ---  | ---  | ---  | ---  | \#E8D3C7 | <font color="#E8D3C7>■■■</font> |
|   <font color="#A86F4C">胡桃色</font>   |     くるみいろ     | ---  | ---  | ---  | ---  | \#A86F4C | <font color="#A86F4C>■■■</font> |
|   <font color="#474B42">仙斎茶</font>   |    せんさいちゃ    | ---  | ---  | ---  | ---  | \#474B42 | <font color="#474B42>■■■</font> |
|  <font color="#53727D">錆御納戸</font>  |    さびおなんど    | ---  | ---  | ---  | ---  | \#53727D | <font color="#53727D>■■■</font> |
|   <font color="#D3CCD6">牡丹鼠</font>   |     ぼたんねず     | ---  | ---  | ---  | ---  | \#D3CCD6 | <font color="#D3CCD6>■■■</font> |
|    <font color="#E8D3D1">灰桜</font>    |     はいざくら     | ---  | ---  | ---  | ---  | \#E8D3D1 | <font color="#E8D3D1>■■■</font> |
|   <font color="#946243">渋紙色</font>   |    しぶかみいろ    | ---  | ---  | ---  | ---  | \#946243 | <font color="#946243>■■■</font> |
|    <font color="#333631">黒緑</font>    |     くろみどり     | ---  | ---  | ---  | ---  | \#333631 | <font color="#333631>■■■</font> |
|   <font color="#5B7E91">舛花色</font>   |    ますはないろ    | ---  | ---  | ---  | ---  | \#5B7E91 | <font color="#5B7E91>■■■</font> |
|    <font color="#C8C2C6">霞色</font>    |     かすみいろ     | ---  | ---  | ---  | ---  | \#C8C2C6 | <font color="#C8C2C6>■■■</font> |
|   <font color="#E6CDE3">淡紅藤</font>   |    あわべにふじ    | ---  | ---  | ---  | ---  | \#E6CDE3 | <font color="#E6CDE3>■■■</font> |
|   <font color="#917347">朽葉色</font>   |     くちばいろ     | ---  | ---  | ---  | ---  | \#917347 | <font color="#917347>■■■</font> |
|   <font color="#5B6356">柳煤竹</font>   |   やなぎすすたけ   | ---  | ---  | ---  | ---  | \#5B6356 | <font color="#5B6356>■■■</font> |
| <font color="#426579">熨斗目花色</font> |   のしめはないろ   | ---  | ---  | ---  | ---  | \#426579 | <font color="#426579>■■■</font> |
|    <font color="#A6A5C4">藤鼠</font>    |      ふじねず      | ---  | ---  | ---  | ---  | \#A6A5C4 | <font color="#A6A5C4>■■■</font> |
|   <font color="#E5ABBE">石竹色</font>   |    せきちくいろ    | ---  | ---  | ---  | ---  | \#E5ABBE | <font color="#E5ABBE>■■■</font> |
|    <font color="#956F29">桑茶</font>    |      くわちゃ      | ---  | ---  | ---  | ---  | \#956F29 | <font color="#956F29>■■■</font> |
|   <font color="#726250">樺茶色</font>   |    かばちゃいろ    | ---  | ---  | ---  | ---  | \#726250 | <font color="#726250>■■■</font> |
| <font color="#4C6473">御召御納戸</font> |   おめしおなんど   | ---  | ---  | ---  | ---  | \#4C6473 | <font color="#4C6473>■■■</font> |
|    <font color="#A69ABD">半色</font>    |     はしたいろ     | ---  | ---  | ---  | ---  | \#A69ABD | <font color="#A69ABD>■■■</font> |
|   <font color="#E597B2">薄紅梅</font>   |    うすこうばい    | ---  | ---  | ---  | ---  | \#E597B2 | <font color="#E597B2>■■■</font> |
|   <font color="#8C7042">路考茶</font>   |     ろこうちゃ     | ---  | ---  | ---  | ---  | \#8C7042 | <font color="#8C7042>■■■</font> |
| <font color="#9D896C">空五倍子色</font> |    うつぶしいろ    | ---  | ---  | ---  | ---  | \#9D896C | <font color="#9D896C>■■■</font> |
|  <font color="#455765">鉄御納戸</font>  |    てつおなんど    | ---  | ---  | ---  | ---  | \#455765 | <font color="#455765>■■■</font> |
|    <font color="#A89DAC">薄色</font>    |      うすいろ      | ---  | ---  | ---  | ---  | \#A89DAC | <font color="#A89DAC>■■■</font> |
|   <font color="#E198B4">桃花色</font>   |    ももはないろ    | ---  | ---  | ---  | ---  | \#E198B4 | <font color="#E198B4>■■■</font> |
|   <font color="#7B6C3E">国防色</font>   |   こくぼうしょく   | ---  | ---  | ---  | ---  | \#7B6C3E | <font color="#7B6C3E>■■■</font> |
|   <font color="#94846A">生壁色</font>   |    なまかべいろ    | ---  | ---  | ---  | ---  | \#94846A | <font color="#94846A>■■■</font> |
|    <font color="#44617B">紺鼠</font>    |      こんねず      | ---  | ---  | ---  | ---  | \#44617B | <font color="#44617B>■■■</font> |
|    <font color="#9790A4">薄鼠</font>    |      うすねず      | ---  | ---  | ---  | ---  | \#9790A4 | <font color="#9790A4>■■■</font> |
|    <font color="#E4AB9B">水柿</font>    |      みずがき      | ---  | ---  | ---  | ---  | \#E4AB9B | <font color="#E4AB9B>■■■</font> |
|   <font color="#D8A373">伽羅色</font>   |     きゃらいろ     | ---  | ---  | ---  | ---  | \#D8A373 | <font color="#D8A373>■■■</font> |
|  <font color="#897858">肥後煤竹</font>  |    ひごすすたけ    | ---  | ---  | ---  | ---  | \#897858 | <font color="#897858>■■■</font> |
|    <font color="#393F4C">藍鉄</font>    |      あいてつ      | ---  | ---  | ---  | ---  | \#393F4C | <font color="#393F4C>■■■</font> |
|   <font color="#9E8B8E">鳩羽鼠</font>   |    はとばねずみ    | ---  | ---  | ---  | ---  | \#9E8B8E | <font color="#9E8B8E>■■■</font> |
| <font color="#E09E87">ときがら茶</font> |    ときがらちゃ    | ---  | ---  | ---  | ---  | \#E09E87 | <font color="#E09E87>■■■</font> |
|   <font color="#CD8C5C">江戸茶</font>   |      えどちゃ      | ---  | ---  | ---  | ---  | \#CD8C5C | <font color="#CD8C5C>■■■</font> |
|    <font color="#716246">媚茶</font>    |      こびちゃ      | ---  | ---  | ---  | ---  | \#716246 | <font color="#716246>■■■</font> |
|    <font color="#393E4F">青褐</font>    |      あおかち      | ---  | ---  | ---  | ---  | \#393E4F | <font color="#393E4F>■■■</font> |
|   <font color="#95859C">鳩羽色</font>   |     はとばいろ     | ---  | ---  | ---  | ---  | \#95859C | <font color="#95859C>■■■</font> |
|    <font color="#D69090">退紅</font>    |      あらぞめ      | ---  | ---  | ---  | ---  | \#D69090 | <font color="#D69090>■■■</font> |
|    <font color="#CD5E3C">樺色</font>    |      かばいろ      | ---  | ---  | ---  | ---  | \#CD5E3C | <font color="#CD5E3C>■■■</font> |
|    <font color="#CBB994">白橡</font>    |    しろつるばみ    | ---  | ---  | ---  | ---  | \#CBB994 | <font color="#CBB994>■■■</font> |
|    <font color="#203744">褐返</font>    |     かちかえし     | ---  | ---  | ---  | ---  | \#203744 | <font color="#203744>■■■</font> |
|   <font color="#95949A">桔梗鼠</font>   |    ききょうねず    | ---  | ---  | ---  | ---  | \#95949A | <font color="#95949A>■■■</font> |
|    <font color="#D4ACAD">薄柿</font>    |      うすがき      | ---  | ---  | ---  | ---  | \#D4ACAD | <font color="#D4ACAD>■■■</font> |
|   <font color="#CB8347">紅鬱金</font>   |     べにうこん     | ---  | ---  | ---  | ---  | \#CB8347 | <font color="#CB8347>■■■</font> |
|   <font color="#D6C6AF">亜麻色</font>   |      あまいろ      | ---  | ---  | ---  | ---  | \#D6C6AF | <font color="#D6C6AF>■■■</font> |
|    <font color="#4D4C61">褐色</font>    |      かちいろ      | ---  | ---  | ---  | ---  | \#4D4C61 | <font color="#4D4C61>■■■</font> |
|    <font color="#71686C">紫鼠</font>    |    むらさきねず    | ---  | ---  | ---  | ---  | \#71686C | <font color="#71686C>■■■</font> |
|   <font color="#C97586">長春色</font>   |  ちょうしゅんいろ  | ---  | ---  | ---  | ---  | \#C97586 | <font color="#C97586>■■■</font> |
|   <font color="#C37854">土器色</font>   |    かわらけいろ    | ---  | ---  | ---  | ---  | \#C37854 | <font color="#C37854>■■■</font> |
|    <font color="#BFA46F">榛色</font>    |    はしばみいろ    | ---  | ---  | ---  | ---  | \#BFA46F | <font color="#BFA46F>■■■</font> |
|    <font color="#EAF4FC">月白</font>    |      げっぱく      | ---  | ---  | ---  | ---  | \#EAF4FC | <font color="#EAF4FC>■■■</font> |
|   <font color="#705B67">葡萄鼠</font>   |    ぶどうねずみ    | ---  | ---  | ---  | ---  | \#705B67 | <font color="#705B67>■■■</font> |
|    <font color="#C099A0">梅鼠</font>    |      うめねず      | ---  | ---  | ---  | ---  | \#C099A0 | <font color="#C099A0>■■■</font> |
|    <font color="#C38743">狐色</font>    |     きつねいろ     | ---  | ---  | ---  | ---  | \#C38743 | <font color="#C38743>■■■</font> |
|   <font color="#9E9478">灰汁色</font>   |      あくいろ      | ---  | ---  | ---  | ---  | \#9E9478 | <font color="#9E9478>■■■</font> |
|   <font color="#EAEDF7">白菫色</font>   |   しろすみれいろ   | ---  | ---  | ---  | ---  | \#EAEDF7 | <font color="#EAEDF7>■■■</font> |
|    <font color="#634950">濃色</font>    |      こきいろ      | ---  | ---  | ---  | ---  | \#634950 | <font color="#634950>■■■</font> |
|   <font color="#B88884">鴇浅葱</font>   |     ときあさぎ     | ---  | ---  | ---  | ---  | \#B88884 | <font color="#B88884>■■■</font> |
|   <font color="#C39143">黄土色</font>   |     おうどいろ     | ---  | ---  | ---  | ---  | \#C39143 | <font color="#C39143>■■■</font> |
|   <font color="#A59564">利休茶</font>   |    りきゅうちゃ    | ---  | ---  | ---  | ---  | \#A59564 | <font color="#A59564>■■■</font> |
|   <font color="#E8ECEF">白花色</font>   |    しらはないろ    | ---  | ---  | ---  | ---  | \#E8ECEF | <font color="#E8ECEF>■■■</font> |
|    <font color="#5F414B">紫鳶</font>    |    むらさきとび    | ---  | ---  | ---  | ---  | \#5F414B | <font color="#5F414B>■■■</font> |
|    <font color="#B48A76">梅染</font>    |      うめぞめ      | ---  | ---  | ---  | ---  | \#B48A76 | <font color="#B48A76>■■■</font> |
|   <font color="#BF783A">琥珀色</font>   |     こはくいろ     | ---  | ---  | ---  | ---  | \#BF783A | <font color="#BF783A>■■■</font> |
|    <font color="#715C1F">鶯茶</font>    |    うぐいすちゃ    | ---  | ---  | ---  | ---  | \#715C1F | <font color="#715C1F>■■■</font> |
|    <font color="#EBF6F7">藍白</font>    |      あいじろ      | ---  | ---  | ---  | ---  | \#EBF6F7 | <font color="#EBF6F7>■■■</font> |
|    <font color="#4F455C">濃鼠</font>    |      こいねず      | ---  | ---  | ---  | ---  | \#4F455C | <font color="#4F455C>■■■</font> |
|   <font color="#A86965">蘇芳香</font>   |     すおうこう     | ---  | ---  | ---  | ---  | \#A86965 | <font color="#A86965>■■■</font> |
|    <font color="#BB5535">赤茶</font>    |      あかちゃ      | ---  | ---  | ---  | ---  | \#BB5535 | <font color="#BB5535>■■■</font> |
|   <font color="#C7B370">木蘭色</font>   |    もくらんじき    | ---  | ---  | ---  | ---  | \#C7B370 | <font color="#C7B370>■■■</font> |
|    <font color="#C1E4E9">白藍</font>    |      しらあい      | ---  | ---  | ---  | ---  | \#C1E4E9 | <font color="#C1E4E9>■■■</font> |
|   <font color="#5A5359">藤煤竹</font>   |    ふじすすたけ    | ---  | ---  | ---  | ---  | \#5A5359 | <font color="#5A5359>■■■</font> |
|   <font color="#A25768">浅蘇芳</font>   |     あさすおう     | ---  | ---  | ---  | ---  | \#A25768 | <font color="#A25768>■■■</font> |
|    <font color="#BB5520">代赭</font>    |      たいしゃ      | ---  | ---  | ---  | ---  | \#BB5520 | <font color="#BB5520>■■■</font> |
|    <font color="#DCD3B2">砂色</font>    |      すないろ      | ---  | ---  | ---  | ---  | \#DCD3B2 | <font color="#DCD3B2>■■■</font> |
|    <font color="#BCE2E8">水色</font>    |      みずいろ      | ---  | ---  | ---  | ---  | \#BCE2E8 | <font color="#BCE2E8>■■■</font> |
|    <font color="#594255">滅紫</font>    |    けしむらさき    | ---  | ---  | ---  | ---  | \#594255 | <font color="#594255>■■■</font> |
|    <font color="#EC6D71">真朱</font>    |       まそお       | ---  | ---  | ---  | ---  | \#EC6D71 | <font color="#EC6D71>■■■</font> |
|   <font color="#B55233">煉瓦色</font>   |     れんがいろ     | ---  | ---  | ---  | ---  | \#B55233 | <font color="#B55233>■■■</font> |
|    <font color="#A19361">油色</font>    |     あぶらいろ     | ---  | ---  | ---  | ---  | \#A19361 | <font color="#A19361>■■■</font> |
|    <font color="#A2D7DD">瓶覗</font>    |     かめのぞき     | ---  | ---  | ---  | ---  | \#A2D7DD | <font color="#A2D7DD>■■■</font> |
|   <font color="#524748">紅消鼠</font>   |   べにけしねずみ   | ---  | ---  | ---  | ---  | \#524748 | <font color="#524748>■■■</font> |
|    <font color="#EB6EA5">赤紫</font>    |    あかむらさき    | ---  | ---  | ---  | ---  | \#EB6EA5 | <font color="#EB6EA5>■■■</font> |
|    <font color="#AA4F37">雀茶</font>    |     すずめちゃ     | ---  | ---  | ---  | ---  | \#AA4F37 | <font color="#AA4F37>■■■</font> |
|   <font color="#8F8667">利休色</font>   |    りきゅういろ    | ---  | ---  | ---  | ---  | \#8F8667 | <font color="#8F8667>■■■</font> |
|   <font color="#ABCED8">秘色色</font>   |     ひそくいろ     | ---  | ---  | ---  | ---  | \#ABCED8 | <font color="#ABCED8>■■■</font> |
|   <font color="#513743">似せ紫</font>   |    にせむらさき    | ---  | ---  | ---  | ---  | \#513743 | <font color="#513743>■■■</font> |
|   <font color="#E95295">躑躅色</font>   |     つつじいろ     | ---  | ---  | ---  | ---  | \#E95295 | <font color="#E95295>■■■</font> |
|  <font color="#9F563A">団十郎茶</font>  | だんじゅうろうちゃ | ---  | ---  | ---  | ---  | \#9F563A | <font color="#9F563A>■■■</font> |
|   <font color="#887938">梅幸茶</font>   |    ばいこうちゃ    | ---  | ---  | ---  | ---  | \#887938 | <font color="#887938>■■■</font> |
|    <font color="#A0D8EF">空色</font>    |      そらいろ      | ---  | ---  | ---  | ---  | \#A0D8EF | <font color="#A0D8EF>■■■</font> |
|   <font color="#E6EAE3">灰黄緑</font>   |    はいきみどり    | ---  | ---  | ---  | ---  | \#E6EAE3 | <font color="#E6EAE3>■■■</font> |
|   <font color="#E7609E">牡丹色</font>   |     ぼたんいろ     | ---  | ---  | ---  | ---  | \#E7609E | <font color="#E7609E>■■■</font> |
|   <font color="#9F563A">柿渋色</font>   |    かきしぶいろ    | ---  | ---  | ---  | ---  | \#9F563A | <font color="#9F563A>■■■</font> |
|   <font color="#6A5D21">璃寛茶</font>   |     りかんちゃ     | ---  | ---  | ---  | ---  | \#6A5D21 | <font color="#6A5D21>■■■</font> |
|  <font color="#89C3EB">勿忘草色</font>  |  わすれなぐさいろ  | ---  | ---  | ---  | ---  | \#89C3EB | <font color="#89C3EB>■■■</font> |
|  <font color="#D4DCD6">蕎麦切色</font>  |    そばきりいろ    | ---  | ---  | ---  | ---  | \#D4DCD6 | <font color="#D4DCD6>■■■</font> |
|   <font color="#D0576B">今様色</font>   |    いまよういろ    | ---  | ---  | ---  | ---  | \#D0576B | <font color="#D0576B>■■■</font> |
|    <font color="#9A493F">紅鳶</font>    |      べにとび      | ---  | ---  | ---  | ---  | \#9A493F | <font color="#9A493F>■■■</font> |
|  <font color="#918754">黄海松茶</font>  |     きみるちゃ     | ---  | ---  | ---  | ---  | \#918754 | <font color="#918754>■■■</font> |
|   <font color="#84A2D4">青藤色</font>   |    あおふじいろ    | ---  | ---  | ---  | ---  | \#84A2D4 | <font color="#84A2D4>■■■</font> |
|   <font color="#D4DCDA">薄雲鼠</font>   |    うすくもねず    | ---  | ---  | ---  | ---  | \#D4DCDA | <font color="#D4DCDA>■■■</font> |
|    <font color="#C85179">中紅</font>    |      なかべに      | ---  | ---  | ---  | ---  | \#C85179 | <font color="#C85179>■■■</font> |
|    <font color="#98623C">灰茶</font>    |      はいちゃ      | ---  | ---  | ---  | ---  | \#98623C | <font color="#98623C>■■■</font> |
|  <font color="#A69425">菜種油色</font>  |    なたねゆいろ    | ---  | ---  | ---  | ---  | \#A69425 | <font color="#A69425>■■■</font> |
|    <font color="#83CCD2">白群</font>    |     びゃくぐん     | ---  | ---  | ---  | ---  | \#83CCD2 | <font color="#83CCD2>■■■</font> |
|   <font color="#D3CBC6">枯野色</font>   |     かれのいろ     | ---  | ---  | ---  | ---  | \#D3CBC6 | <font color="#D3CBC6>■■■</font> |
|   <font color="#E9546B">薔薇色</font>   |      ばらいろ      | ---  | ---  | ---  | ---  | \#E9546B | <font color="#E9546B>■■■</font> |
|    <font color="#965042">茶色</font>    |      ちゃいろ      | ---  | ---  | ---  | ---  | \#965042 | <font color="#965042>■■■</font> |
|   <font color="#ADA250">青朽葉</font>   |     あおくちば     | ---  | ---  | ---  | ---  | \#ADA250 | <font color="#ADA250>■■■</font> |
|    <font color="#84B9CB">浅縹</font>    |     あさはなだ     | ---  | ---  | ---  | ---  | \#84B9CB | <font color="#84B9CB>■■■</font> |
|    <font color="#C8C2BE">潤色</font>    |     うるみいろ     | ---  | ---  | ---  | ---  | \#C8C2BE | <font color="#C8C2BE>■■■</font> |
|    <font color="#E95464">韓紅</font>    |    からくれない    | ---  | ---  | ---  | ---  | \#E95464 | <font color="#E95464>■■■</font> |
|   <font color="#965036">檜皮色</font>   |     ひわだいろ     | ---  | ---  | ---  | ---  | \#965036 | <font color="#965036>■■■</font> |
|   <font color="#938B4B">根岸色</font>   |     ねぎしいろ     | ---  | ---  | ---  | ---  | \#938B4B | <font color="#938B4B>■■■</font> |
|   <font color="#698AAB">薄花色</font>   |    うすはないろ    | ---  | ---  | ---  | ---  | \#698AAB | <font color="#698AAB>■■■</font> |
|  <font color="#B3ADA0">利休白茶</font>  |  りきゅうしろちゃ  | ---  | ---  | ---  | ---  | \#B3ADA0 | <font color="#B3ADA0>■■■</font> |
|    <font color="#C85554">銀朱</font>    |      ぎんしゅ      | ---  | ---  | ---  | ---  | \#C85554 | <font color="#C85554>■■■</font> |
|    <font color="#95483F">鳶色</font>    |      とびいろ      | ---  | ---  | ---  | ---  | \#95483F | <font color="#95483F>■■■</font> |
|    <font color="#8C8861">鶸茶</font>    |      ひわちゃ      | ---  | ---  | ---  | ---  | \#8C8861 | <font color="#8C8861>■■■</font> |
|   <font color="#008899">納戸色</font>   |     なんどいろ     | ---  | ---  | ---  | ---  | \#008899 | <font color="#008899>■■■</font> |
|    <font color="#A99E93">茶鼠</font>    |     ちゃねずみ     | ---  | ---  | ---  | ---  | \#A99E93 | <font color="#A99E93>■■■</font> |
|    <font color="#C53D43">赤紅</font>    |      あかべに      | ---  | ---  | ---  | ---  | \#C53D43 | <font color="#C53D43>■■■</font> |
|    <font color="#954E2A">柿茶</font>    |      かきちゃ      | ---  | ---  | ---  | ---  | \#954E2A | <font color="#954E2A>■■■</font> |
|    <font color="#A1A46D">柳茶</font>    |     やなぎちゃ     | ---  | ---  | ---  | ---  | \#A1A46D | <font color="#A1A46D>■■■</font> |
|   <font color="#00A3AF">浅葱色</font>   |     あさぎいろ     | ---  | ---  | ---  | ---  | \#00A3AF | <font color="#00A3AF>■■■</font> |
|   <font color="#A58F86">胡桃染</font>   |     くるみぞめ     | ---  | ---  | ---  | ---  | \#A58F86 | <font color="#A58F86>■■■</font> |
|    <font color="#E83929">紅緋</font>    |       べにひ       | ---  | ---  | ---  | ---  | \#E83929 | <font color="#E83929>■■■</font> |
|   <font color="#8F2E14">弁柄色</font>   |    べんがらいろ    | ---  | ---  | ---  | ---  | \#8F2E14 | <font color="#8F2E14>■■■</font> |
|   <font color="#726D40">海松色</font>   |      みるいろ      | ---  | ---  | ---  | ---  | \#726D40 | <font color="#726D40>■■■</font> |
|   <font color="#2A83A2">花浅葱</font>   |     はなあさぎ     | ---  | ---  | ---  | ---  | \#2A83A2 | <font color="#2A83A2>■■■</font> |
|   <font color="#928178">江戸鼠</font>   |      えどねず      | ---  | ---  | ---  | ---  | \#928178 | <font color="#928178>■■■</font> |
|     <font color="#E60033">赤</font>     |        あか        | ---  | ---  | ---  | ---  | \#E60033 | <font color="#E60033>■■■</font> |
|   <font color="#8A3319">赤錆色</font>   |    あかさびいろ    | ---  | ---  | ---  | ---  | \#8A3319 | <font color="#8A3319>■■■</font> |
|    <font color="#928C36">鶯色</font>    |    うぐいすいろ    | ---  | ---  | ---  | ---  | \#928C36 | <font color="#928C36>■■■</font> |
|   <font color="#59B9C6">新橋色</font>   |    しんばしいろ    | ---  | ---  | ---  | ---  | \#59B9C6 | <font color="#59B9C6>■■■</font> |
|    <font color="#887F7A">煤色</font>    |      すすいろ      | ---  | ---  | ---  | ---  | \#887F7A | <font color="#887F7A>■■■</font> |
|   <font color="#E2041B">猩々緋</font>   |   しょうじょうひ   | ---  | ---  | ---  | ---  | \#E2041B | <font color="#E2041B>■■■</font> |
|   <font color="#8A3B00"> 褐色</font>    |     かっしょく     | ---  | ---  | ---  | ---  | \#8A3B00 | <font color="#8A3B00>■■■</font> |
|   <font color="#DCCB18">緑黄色</font>   |  りょくおうしょく  | ---  | ---  | ---  | ---  | \#DCCB18 | <font color="#DCCB18>■■■</font> |
|    <font color="#2CA9E1">天色</font>    |      あまいろ      | ---  | ---  | ---  | ---  | \#2CA9E1 | <font color="#2CA9E1>■■■</font> |
|   <font color="#B4866B">丁子茶</font>   |    ちょうじちゃ    | ---  | ---  | ---  | ---  | \#B4866B | <font color="#B4866B>■■■</font> |
|     <font color="#D7003A">紅</font>     |      くれない      | ---  | ---  | ---  | ---  | \#D7003A | <font color="#D7003A>■■■</font> |
|    <font color="#852E19">栗梅</font>    |      くりうめ      | ---  | ---  | ---  | ---  | \#852E19 | <font color="#852E19>■■■</font> |
|    <font color="#D7CF3A">鶸色</font>    |      ひわいろ      | ---  | ---  | ---  | ---  | \#D7CF3A | <font color="#D7CF3A>■■■</font> |
|   <font color="#38A1DB">露草色</font>   |    つゆくさいろ    | ---  | ---  | ---  | ---  | \#38A1DB | <font color="#38A1DB>■■■</font> |
|    <font color="#B28C6E">柴染</font>    |      ふしぞめ      | ---  | ---  | ---  | ---  | \#B28C6E | <font color="#B28C6E>■■■</font> |
|    <font color="#C9171E">深緋</font>    |       こきひ       | ---  | ---  | ---  | ---  | \#C9171E | <font color="#C9171E>■■■</font> |
|   <font color="#7B4741">紅檜皮</font>   |     べにひはだ     | ---  | ---  | ---  | ---  | \#7B4741 | <font color="#7B4741>■■■</font> |
|   <font color="#C5C56A">抹茶色</font>   |    まっちゃいろ    | ---  | ---  | ---  | ---  | \#C5C56A | <font color="#C5C56A>■■■</font> |
|     <font color="#0095D9">青</font>     |        あお        | ---  | ---  | ---  | ---  | \#0095D9 | <font color="#0095D9>■■■</font> |
|  <font color="#A16D5D">宗伝唐茶</font>  |  そうでんからちゃ  | ---  | ---  | ---  | ---  | \#A16D5D | <font color="#A16D5D>■■■</font> |
|    <font color="#D3381C">緋色</font>    |       ひいろ       | ---  | ---  | ---  | ---  | \#D3381C | <font color="#D3381C>■■■</font> |
|   <font color="#773C30">海老茶</font>   |      えびちゃ      | ---  | ---  | ---  | ---  | \#773C30 | <font color="#773C30>■■■</font> |
|   <font color="#C3D825">若草色</font>   |    わかくさいろ    | ---  | ---  | ---  | ---  | \#C3D825 | <font color="#C3D825>■■■</font> |
|    <font color="#0094C8">薄藍</font>    |      うすあい      | ---  | ---  | ---  | ---  | \#0094C8 | <font color="#0094C8>■■■</font> |
|    <font color="#9F6F55">砺茶</font>    |      とのちゃ      | ---  | ---  | ---  | ---  | \#9F6F55 | <font color="#9F6F55>■■■</font> |
|    <font color="#CE5242">赤丹</font>    |       あかに       | ---  | ---  | ---  | ---  | \#CE5242 | <font color="#CE5242>■■■</font> |
|    <font color="#783C1D">唐茶</font>    |      からちゃ      | ---  | ---  | ---  | ---  | \#783C1D | <font color="#783C1D>■■■</font> |
|    <font color="#B8D200">黄緑</font>    |      きみどり      | ---  | ---  | ---  | ---  | \#B8D200 | <font color="#B8D200>■■■</font> |
|    <font color="#2792C3">縹色</font>    |     はなだいろ     | ---  | ---  | ---  | ---  | \#2792C3 | <font color="#2792C3>■■■</font> |
|   <font color="#8C6450">煎茶色</font>   |    せんちゃいろ    | ---  | ---  | ---  | ---  | \#8C6450 | <font color="#8C6450>■■■</font> |
|    <font color="#D9333F">紅赤</font>    |      べにあか      | ---  | ---  | ---  | ---  | \#D9333F | <font color="#D9333F>■■■</font> |
|    <font color="#762F07">栗色</font>    |      くりいろ      | ---  | ---  | ---  | ---  | \#762F07 | <font color="#762F07>■■■</font> |
|   <font color="#E0EBAF">若芽色</font>   |     わかめいろ     | ---  | ---  | ---  | ---  | \#E0EBAF | <font color="#E0EBAF>■■■</font> |
|    <font color="#007BBB">紺碧</font>    |      こんぺき      | ---  | ---  | ---  | ---  | \#007BBB | <font color="#007BBB>■■■</font> |
|   <font color="#856859">銀煤竹</font>   |    ぎんすすだけ    | ---  | ---  | ---  | ---  | \#856859 | <font color="#856859>■■■</font> |
|    <font color="#B94047">臙脂</font>    |       えんじ       | ---  | ---  | ---  | ---  | \#B94047 | <font color="#B94047>■■■</font> |
|   <font color="#752100">赤銅色</font>   |   しゃくどういろ   | ---  | ---  | ---  | ---  | \#752100 | <font color="#752100>■■■</font> |
|   <font color="#D8E698">若菜色</font>   |     わかないろ     | ---  | ---  | ---  | ---  | \#D8E698 | <font color="#D8E698>■■■</font> |
|   <font color="#5383C3">薄群青</font>   |   うすぐんじょう   | ---  | ---  | ---  | ---  | \#5383C3 | <font color="#5383C3>■■■</font> |
|   <font color="#765C47">黄枯茶</font>   |     きがらちゃ     | ---  | ---  | ---  | ---  | \#765C47 | <font color="#765C47>■■■</font> |
|   <font color="#BA2636">朱・緋</font>   |        あけ        | ---  | ---  | ---  | ---  | \#BA2636 | <font color="#BA2636>■■■</font> |
|    <font color="#6C3524">錆色</font>    |      さびいろ      | ---  | ---  | ---  | ---  | \#6C3524 | <font color="#6C3524>■■■</font> |
|   <font color="#C7DC68">若苗色</font>   |    わかなえいろ    | ---  | ---  | ---  | ---  | \#C7DC68 | <font color="#C7DC68>■■■</font> |
|   <font color="#5A79BA">薄花桜</font>   |   うすはなざくら   | ---  | ---  | ---  | ---  | \#5A79BA | <font color="#5A79BA>■■■</font> |
|   <font color="#6F514C">煤竹色</font>   |    すすたけいろ    | ---  | ---  | ---  | ---  | \#6F514C | <font color="#6F514C>■■■</font> |
|    <font color="#B7282E">茜色</font>    |     あかねいろ     | ---  | ---  | ---  | ---  | \#B7282E | <font color="#B7282E>■■■</font> |
|   <font color="#683F36">赤褐色</font>   |   せっかっしょく   | ---  | ---  | ---  | ---  | \#683F36 | <font color="#683F36>■■■</font> |
|    <font color="#99AB4E">青丹</font>    |       あおに       | ---  | ---  | ---  | ---  | \#99AB4E | <font color="#99AB4E>■■■</font> |
|   <font color="#4C6CB3">群青色</font>   |   ぐんじょういろ   | ---  | ---  | ---  | ---  | \#4C6CB3 | <font color="#4C6CB3>■■■</font> |
|    <font color="#6F4B3E">焦茶</font>    |      こげちゃ      | ---  | ---  | ---  | ---  | \#6F4B3E | <font color="#6F4B3E>■■■</font> |
|  <font color="#A73836">紅海老茶</font>  |    べにえびちゃ    | ---  | ---  | ---  | ---  | \#A73836 | <font color="#A73836>■■■</font> |
|   <font color="#664032">茶褐色</font>   |   ちゃかっしょく   | ---  | ---  | ---  | ---  | \#664032 | <font color="#664032>■■■</font> |
|    <font color="#7B8D42">草色</font>    |      くさいろ      | ---  | ---  | ---  | ---  | \#7B8D42 | <font color="#7B8D42>■■■</font> |
|   <font color="#3E62AD">杜若色</font>   |   かきつばたいろ   | ---  | ---  | ---  | ---  | \#3E62AD | <font color="#3E62AD>■■■</font> |
|    <font color="#544A47">黒橡</font>    |    くろつるばみ    | ---  | ---  | ---  | ---  | \#544A47 | <font color="#544A47>■■■</font> |
|    <font color="#9E3D3F">蘇芳</font>    |       すおう       | ---  | ---  | ---  | ---  | \#9E3D3F | <font color="#9E3D3F>■■■</font> |
|   <font color="#6D3C32">栗皮茶</font>   |    くりかわちゃ    | ---  | ---  | ---  | ---  | \#6D3C32 | <font color="#6D3C32>■■■</font> |
|    <font color="#69821B">苔色</font>    |      こけいろ      | ---  | ---  | ---  | ---  | \#69821B | <font color="#69821B>■■■</font> |
|   <font color="#1E50A2">瑠璃色</font>   |      るりいろ      | ---  | ---  | ---  | ---  | \#1E50A2 | <font color="#1E50A2>■■■</font> |
|   <font color="#543F32">憲法色</font>   |    けんぽういろ    | ---  | ---  | ---  | ---  | \#543F32 | <font color="#543F32>■■■</font> |
|    <font color="#A22041">真紅</font>    |       しんく       | ---  | ---  | ---  | ---  | \#A22041 | <font color="#A22041>■■■</font> |
|    <font color="#583822">黒茶</font>    |      くろちゃ      | ---  | ---  | ---  | ---  | \#583822 | <font color="#583822>■■■</font> |
|    <font color="#AACF53">萌黄</font>    |       もえぎ       | ---  | ---  | ---  | ---  | \#AACF53 | <font color="#AACF53>■■■</font> |
|    <font color="#507EA4">薄縹</font>    |     うすはなだ     | ---  | ---  | ---  | ---  | \#507EA4 | <font color="#507EA4>■■■</font> |
|    <font color="#554738">涅色</font>    |      くりいろ      | ---  | ---  | ---  | ---  | \#554738 | <font color="#554738>■■■</font> |
|    <font color="#A22041">濃紅</font>    |    こいくれない    | ---  | ---  | ---  | ---  | \#A22041 | <font color="#A22041>■■■</font> |
|   <font color="#6C2C2F">葡萄茶</font>   |      えびちゃ      | ---  | ---  | ---  | ---  | \#6C2C2F | <font color="#6C2C2F>■■■</font> |
|    <font color="#B0CA71">苗色</font>    |      なえいろ      | ---  | ---  | ---  | ---  | \#B0CA71 | <font color="#B0CA71>■■■</font> |
|   <font color="#19448E">瑠璃紺</font>   |      るりこん      | ---  | ---  | ---  | ---  | \#19448E | <font color="#19448E>■■■</font> |
|  <font color="#433D3C">檳榔子染</font>  |   びんろうじぞめ   | ---  | ---  | ---  | ---  | \#433D3C | <font color="#433D3C>■■■</font> |
|   <font color="#F8F4E6">象牙色</font>   |     ぞうげいろ     | ---  | ---  | ---  | ---  | \#F8F4E6 | <font color="#F8F4E6>■■■</font> |
|   <font color="#640125">葡萄色</font>   |      えびいろ      | ---  | ---  | ---  | ---  | \#640125 | <font color="#640125>■■■</font> |
|   <font color="#B9D08B">若葉色</font>   |     わかばいろ     | ---  | ---  | ---  | ---  | \#B9D08B | <font color="#B9D08B>■■■</font> |
|   <font color="#164A84">紺瑠璃</font>   |      こんるり      | ---  | ---  | ---  | ---  | \#164A84 | <font color="#164A84>■■■</font> |
|    <font color="#432F2F">黒鳶</font>    |      くろとび      | ---  | ---  | ---  | ---  | \#432F2F | <font color="#432F2F>■■■</font> |
|    <font color="#EDE4CD">練色</font>    |      ねりいろ      | ---  | ---  | ---  | ---  | \#EDE4CD | <font color="#EDE4CD>■■■</font> |
|   <font color="#F8B862">萱草色</font>   |    かんぞういろ    | ---  | ---  | ---  | ---  | \#F8B862 | <font color="#F8B862>■■■</font> |
|   <font color="#839B5C">松葉色</font>   |     まつばいろ     | ---  | ---  | ---  | ---  | \#839B5C | <font color="#839B5C>■■■</font> |
|    <font color="#165E83">藍色</font>    |      あいいろ      | ---  | ---  | ---  | ---  | \#165E83 | <font color="#165E83>■■■</font> |
|    <font color="#3F312B">赤墨</font>    |      あかすみ      | ---  | ---  | ---  | ---  | \#3F312B | <font color="#3F312B>■■■</font> |
|   <font color="#E9E4D4">灰白色</font>   |   かいはくしょく   | ---  | ---  | ---  | ---  | \#E9E4D4 | <font color="#E9E4D4>■■■</font> |
|   <font color="#F6AD49">柑子色</font>   |     こうじいろ     | ---  | ---  | ---  | ---  | \#F6AD49 | <font color="#F6AD49>■■■</font> |
|   <font color="#CEE4AE">夏虫色</font>   |    なつむしいろ    | ---  | ---  | ---  | ---  | \#CEE4AE | <font color="#CEE4AE>■■■</font> |
|    <font color="#274A78">青藍</font>    |      せいらん      | ---  | ---  | ---  | ---  | \#274A78 | <font color="#274A78>■■■</font> |
|    <font color="#302833">黒紅</font>    |      くろべに      | ---  | ---  | ---  | ---  | \#302833 | <font color="#302833>■■■</font> |
|   <font color="#EBE1A9">蒸栗色</font>   |    むしぐりいろ    | ---  | ---  | ---  | ---  | \#EBE1A9 | <font color="#EBE1A9>■■■</font> |
|    <font color="#F39800">金茶</font>    |      きんちゃ      | ---  | ---  | ---  | ---  | \#F39800 | <font color="#F39800>■■■</font> |
|   <font color="#82AE46">鶸萌黄</font>   |     ひわもえぎ     | ---  | ---  | ---  | ---  | \#82AE46 | <font color="#82AE46>■■■</font> |
|    <font color="#2A4073">深縹</font>    |     こきはなだ     | ---  | ---  | ---  | ---  | \#2A4073 | <font color="#2A4073>■■■</font> |
|     <font color="#FFFFFF">白</font>     |        しろ        | ---  | ---  | ---  | ---  | \#FFFFFF | <font color="#FFFFFF>■■■</font> |
|   <font color="#F2F2B0">女郎花</font>   |     おみなえし     | ---  | ---  | ---  | ---  | \#F2F2B0 | <font color="#F2F2B0>■■■</font> |
|   <font color="#F08300">蜜柑色</font>   |     みかんいろ     | ---  | ---  | ---  | ---  | \#F08300 | <font color="#F08300>■■■</font> |
|    <font color="#A8C97F">柳色</font>    |     やなぎいろ     | ---  | ---  | ---  | ---  | \#A8C97F | <font color="#A8C97F>■■■</font> |
|    <font color="#223A70">紺色</font>    |      こんいろ      | ---  | ---  | ---  | ---  | \#223A70 | <font color="#223A70>■■■</font> |
|   <font color="#FFFFFC">胡粉色</font>   |     ごふんいろ     | ---  | ---  | ---  | ---  | \#FFFFFC | <font color="#FFFFFC>■■■</font> |
|   <font color="#E4DC8A">枯草色</font>   |    かれくさいろ    | ---  | ---  | ---  | ---  | \#E4DC8A | <font color="#E4DC8A>■■■</font> |
|   <font color="#EC6D51">鉛丹色</font>   |    えんたんいろ    | ---  | ---  | ---  | ---  | \#EC6D51 | <font color="#EC6D51>■■■</font> |
|   <font color="#9BA88D">青白橡</font>   |  あおしろつるばみ  | ---  | ---  | ---  | ---  | \#9BA88D | <font color="#9BA88D>■■■</font> |
|    <font color="#192F60">紺青</font>    |     こんじょう     | ---  | ---  | ---  | ---  | \#192F60 | <font color="#192F60>■■■</font> |
|  <font color="#F7FCFE">卯の花色</font>  |    うのはないろ    | ---  | ---  | ---  | ---  | \#F7FCFE | <font color="#F7FCFE>■■■</font> |
|    <font color="#F8E58C">淡黄</font>    |      たんこう      | ---  | ---  | ---  | ---  | \#F8E58C | <font color="#F8E58C>■■■</font> |
|    <font color="#EE7948">黄丹</font>    |       おうに       | ---  | ---  | ---  | ---  | \#EE7948 | <font color="#EE7948>■■■</font> |
|    <font color="#C8D5BB">柳鼠</font>    |     やなぎねず     | ---  | ---  | ---  | ---  | \#C8D5BB | <font color="#C8D5BB>■■■</font> |
|    <font color="#1C305C">留紺</font>    |      とめこん      | ---  | ---  | ---  | ---  | \#1C305C | <font color="#1C305C>■■■</font> |
|    <font color="#F8FBF8">白磁</font>    |       はくじ       | ---  | ---  | ---  | ---  | \#F8FBF8 | <font color="#F8FBF8>■■■</font> |
|    <font color="#DDBB99">白茶</font>    |      しらちゃ      | ---  | ---  | ---  | ---  | \#DDBB99 | <font color="#DDBB99>■■■</font> |
|    <font color="#ED6D3D">柿色</font>    |      かきいろ      | ---  | ---  | ---  | ---  | \#ED6D3D | <font color="#ED6D3D>■■■</font> |
|   <font color="#C1D8AC">裏葉柳</font>   |    うらはやなぎ    | ---  | ---  | ---  | ---  | \#C1D8AC | <font color="#C1D8AC>■■■</font> |
|    <font color="#0F2350">濃藍</font>    |      こいあい      | ---  | ---  | ---  | ---  | \#0F2350 | <font color="#0F2350>■■■</font> |
|  <font color="#FBFAF5">生成り色</font>  |     きなりいろ     | ---  | ---  | ---  | ---  | \#FBFAF5 | <font color="#FBFAF5>■■■</font> |
|   <font color="#D7A98C">赤白橡</font>   |  あかしろつるばみ  | ---  | ---  | ---  | ---  | \#D7A98C | <font color="#D7A98C>■■■</font> |
|    <font color="#EC6800">黄赤</font>    |       きあか       | ---  | ---  | ---  | ---  | \#EC6800 | <font color="#EC6800>■■■</font> |
|   <font color="#A8BF93">山葵色</font>   |     わさびいろ     | ---  | ---  | ---  | ---  | \#A8BF93 | <font color="#A8BF93>■■■</font> |
|    <font color="#17184B">鉄紺</font>    |      てつこん      | ---  | ---  | ---  | ---  | \#17184B | <font color="#17184B>■■■</font> |
|   <font color="#F3F3F3">乳白色</font>   |  にゅうはくしょく  | ---  | ---  | ---  | ---  | \#F3F3F3 | <font color="#F3F3F3>■■■</font> |
|    <font color="#F2C9AC">洗柿</font>    |     あらいがき     | ---  | ---  | ---  | ---  | \#F2C9AC | <font color="#F2C9AC>■■■</font> |
|   <font color="#EC6800">人参色</font>   |    にんじんいろ    | ---  | ---  | ---  | ---  | \#EC6800 | <font color="#EC6800>■■■</font> |
|   <font color="#769164">老竹色</font>   |    おいたけいろ    | ---  | ---  | ---  | ---  | \#769164 | <font color="#769164>■■■</font> |
|    <font color="#0D0015">漆黒</font>    |      しっこく      | ---  | ---  | ---  | ---  | \#0D0015 | <font color="#0D0015>■■■</font> |
|    <font color="#F3F3F2">白練</font>    |      しろねり      | ---  | ---  | ---  | ---  | \#F3F3F2 | <font color="#F3F3F2>■■■</font> |
|  <font color="#FFF1CF">鳥の子色</font>  |    とりのこいろ    | ---  | ---  | ---  | ---  | \#FFF1CF | <font color="#FFF1CF>■■■</font> |
|    <font color="#EE7800">橙色</font>    |    だいだいいろ    | ---  | ---  | ---  | ---  | \#EE7800 | <font color="#EE7800>■■■</font> |
|    <font color="#D6E9CA">白緑</font>    |     びゃくろく     | ---  | ---  | ---  | ---  | \#D6E9CA | <font color="#D6E9CA>■■■</font> |
|   <font color="#BBC8E6">淡藤色</font>   |    あわふじいろ    | ---  | ---  | ---  | ---  | \#BBC8E6 | <font color="#BBC8E6>■■■</font> |
|    <font color="#EAE5E3">素色</font>    |      そしょく      | ---  | ---  | ---  | ---  | \#EAE5E3 | <font color="#EAE5E3>■■■</font> |
|   <font color="#FDDEA5">蜂蜜色</font>   |    はちみついろ    | ---  | ---  | ---  | ---  | \#FDDEA5 | <font color="#FDDEA5>■■■</font> |
|    <font color="#EB6238">照柿</font>    |      てりがき      | ---  | ---  | ---  | ---  | \#EB6238 | <font color="#EB6238>■■■</font> |
|   <font color="#93CA76">淡萌黄</font>   |     うすもえぎ     | ---  | ---  | ---  | ---  | \#93CA76 | <font color="#93CA76>■■■</font> |
|    <font color="#BBBCDE">藤色</font>    |      ふじいろ      | ---  | ---  | ---  | ---  | \#BBBCDE | <font color="#BBBCDE>■■■</font> |
|   <font color="#E5E4E6">白梅鼠</font>   |    しらうめねず    | ---  | ---  | ---  | ---  | \#E5E4E6 | <font color="#E5E4E6>■■■</font> |
|    <font color="#FCE2C4">肌色</font>    |      はだいろ      | ---  | ---  | ---  | ---  | \#FCE2C4 | <font color="#FCE2C4>■■■</font> |
|    <font color="#EA5506">赤橙</font>    |    あかだいだい    | ---  | ---  | ---  | ---  | \#EA5506 | <font color="#EA5506>■■■</font> |
|    <font color="#93B881">柳染</font>    |     やなぎぞめ     | ---  | ---  | ---  | ---  | \#93B881 | <font color="#93B881>■■■</font> |
|  <font color="#8491C3">紅掛空色</font>  |  べにかけそらいろ  | ---  | ---  | ---  | ---  | \#8491C3 | <font color="#8491C3>■■■</font> |
|    <font color="#DCDDDD">白鼠</font>    |      しろねず      | ---  | ---  | ---  | ---  | \#DCDDDD | <font color="#DCDDDD>■■■</font> |
|   <font color="#FDE8D0">薄卵色</font>   |   うすたまごいろ   | ---  | ---  | ---  | ---  | \#FDE8D0 | <font color="#FDE8D0>■■■</font> |
|    <font color="#EA5506">金赤</font>    |      きんあか      | ---  | ---  | ---  | ---  | \#EA5506 | <font color="#EA5506>■■■</font> |
|   <font color="#BADCAD">薄萌葱</font>   |     うすもえぎ     | ---  | ---  | ---  | ---  | \#BADCAD | <font color="#BADCAD>■■■</font> |
|    <font color="#8491C3">紅碧</font>    |     べにみどり     | ---  | ---  | ---  | ---  | \#8491C3 | <font color="#8491C3>■■■</font> |
|    <font color="#DDDCD6">絹鼠</font>    |      きぬねず      | ---  | ---  | ---  | ---  | \#DDDCD6 | <font color="#DDDCD6>■■■</font> |
|    <font color="#F9C89B">雄黄</font>    |      ゆうおう      | ---  | ---  | ---  | ---  | \#F9C89B | <font color="#F9C89B>■■■</font> |
|    <font color="#EB6101">朱色</font>    |      しゅいろ      | ---  | ---  | ---  | ---  | \#EB6101 | <font color="#EB6101>■■■</font> |
|   <font color="#97A791">深川鼠</font>   |   ふかがわねずみ   | ---  | ---  | ---  | ---  | \#97A791 | <font color="#97A791>■■■</font> |
|   <font color="#4D5AAF">紺桔梗</font>   |    こんききょう    | ---  | ---  | ---  | ---  | \#4D5AAF | <font color="#4D5AAF>■■■</font> |
|    <font color="#C0C6C9">灰青</font>    |      はいあお      | ---  | ---  | ---  | ---  | \#C0C6C9 | <font color="#C0C6C9>■■■</font> |
|   <font color="#F7BD8F">洒落柿</font>   |     しゃれがき     | ---  | ---  | ---  | ---  | \#F7BD8F | <font color="#F7BD8F>■■■</font> |
|   <font color="#E49E61">小麦色</font>   |     こむぎいろ     | ---  | ---  | ---  | ---  | \#E49E61 | <font color="#E49E61>■■■</font> |
|    <font color="#98D98E">若緑</font>    |     わかみどり     | ---  | ---  | ---  | ---  | \#98D98E | <font color="#98D98E>■■■</font> |
|    <font color="#4D5AAF">花色</font>    |      はないろ      | ---  | ---  | ---  | ---  | \#4D5AAF | <font color="#4D5AAF>■■■</font> |
|    <font color="#AFAFB0">銀鼠</font>    |      ぎんねず      | ---  | ---  | ---  | ---  | \#AFAFB0 | <font color="#AFAFB0>■■■</font> |
|    <font color="#F6B894">赤香</font>    |      あかこう      | ---  | ---  | ---  | ---  | \#F6B894 | <font color="#F6B894>■■■</font> |
|    <font color="#E45E32">丹色</font>    |       にいろ       | ---  | ---  | ---  | ---  | \#E45E32 | <font color="#E45E32>■■■</font> |
|    <font color="#88CB7F">浅緑</font>    |     あさみどり     | ---  | ---  | ---  | ---  | \#88CB7F | <font color="#88CB7F>■■■</font> |
|    <font color="#4A488E">紺藍</font>    |      こんあい      | ---  | ---  | ---  | ---  | \#4A488E | <font color="#4A488E>■■■</font> |
|    <font color="#ADADAD">薄鈍</font>    |      うすにび      | ---  | ---  | ---  | ---  | \#ADADAD | <font color="#ADADAD>■■■</font> |
|   <font color="#F4DDA5">砥粉色</font>   |     とのこいろ     | ---  | ---  | ---  | ---  | \#F4DDA5 | <font color="#F4DDA5>■■■</font> |
|    <font color="#E17B34">黄茶</font>    |       きちゃ       | ---  | ---  | ---  | ---  | \#E17B34 | <font color="#E17B34>■■■</font> |
|    <font color="#69B076">薄緑</font>    |     うすみどり     | ---  | ---  | ---  | ---  | \#69B076 | <font color="#69B076>■■■</font> |
|   <font color="#4D4398">紅桔梗</font>   |    べにききょう    | ---  | ---  | ---  | ---  | \#4D4398 | <font color="#4D4398>■■■</font> |
|   <font color="#A3A3A2">薄墨色</font>   |    うすずみいろ    | ---  | ---  | ---  | ---  | \#A3A3A2 | <font color="#A3A3A2>■■■</font> |
|    <font color="#F1BF99">肉色</font>    |      にくいろ      | ---  | ---  | ---  | ---  | \#F1BF99 | <font color="#F1BF99>■■■</font> |
|   <font color="#DD7A56">肉桂色</font>   |    にっけいいろ    | ---  | ---  | ---  | ---  | \#DD7A56 | <font color="#DD7A56>■■■</font> |
|    <font color="#6B7B6E">青鈍</font>    |      あおにび      | ---  | ---  | ---  | ---  | \#6B7B6E | <font color="#6B7B6E>■■■</font> |
|   <font color="#5654A2">桔梗色</font>   |    ききょういろ    | ---  | ---  | ---  | ---  | \#5654A2 | <font color="#5654A2>■■■</font> |
|    <font color="#9EA1A3">錫色</font>    |      すずいろ      | ---  | ---  | ---  | ---  | \#9EA1A3 | <font color="#9EA1A3>■■■</font> |
|    <font color="#F1BF99">人色</font>    |      ひといろ      | ---  | ---  | ---  | ---  | \#F1BF99 | <font color="#F1BF99>■■■</font> |
|  <font color="#DB8449">赤朽葉色</font>  |   あかくちばいろ   | ---  | ---  | ---  | ---  | \#DB8449 | <font color="#DB8449>■■■</font> |
|   <font color="#BED2C3">青磁鼠</font>   |     せいじねず     | ---  | ---  | ---  | ---  | \#BED2C3 | <font color="#BED2C3>■■■</font> |
|   <font color="#706CAA">藤納戸</font>   |     ふじなんど     | ---  | ---  | ---  | ---  | \#706CAA | <font color="#706CAA>■■■</font> |
|    <font color="#9FA0A0">素鼠</font>    |      すねずみ      | ---  | ---  | ---  | ---  | \#9FA0A0 | <font color="#9FA0A0>■■■</font> |
|   <font color="#EFCD9A">丁子色</font>   |    ちょうじいろ    | ---  | ---  | ---  | ---  | \#EFCD9A | <font color="#EFCD9A>■■■</font> |
|   <font color="#D66A35">黄櫨染</font>   |     こうろぜん     | ---  | ---  | ---  | ---  | \#D66A35 | <font color="#D66A35>■■■</font> |
|    <font color="#93B69C">薄青</font>    |      うすあお      | ---  | ---  | ---  | ---  | \#93B69C | <font color="#93B69C>■■■</font> |
|  <font color="#68699B">紅掛花色</font>  |  べにかけはないろ  | ---  | ---  | ---  | ---  | \#68699B | <font color="#68699B>■■■</font> |
|    <font color="#949495">鼠色</font>    |     ねずみいろ     | ---  | ---  | ---  | ---  | \#949495 | <font color="#949495>■■■</font> |
|    <font color="#EFCD9A">香色</font>    |      こういろ      | ---  | ---  | ---  | ---  | \#EFCD9A | <font color="#EFCD9A>■■■</font> |
|  <font color="#FFD900">蒲公英色</font>  |    たんぽぽいろ    | ---  | ---  | ---  | ---  | \#FFD900 | <font color="#FFD900>■■■</font> |
|   <font color="#A6C8B2">錆青磁</font>   |     さびせいじ     | ---  | ---  | ---  | ---  | \#A6C8B2 | <font color="#A6C8B2>■■■</font> |
|   <font color="#867BA9">紫苑色</font>   |     しおんいろ     | ---  | ---  | ---  | ---  | \#867BA9 | <font color="#867BA9>■■■</font> |
|   <font color="#888084">源氏鼠</font>   |     げんじねず     | ---  | ---  | ---  | ---  | \#888084 | <font color="#888084>■■■</font> |
|    <font color="#F0CFA0">薄香</font>    |      うすこう      | ---  | ---  | ---  | ---  | \#F0CFA0 | <font color="#F0CFA0>■■■</font> |
|    <font color="#FFD900">黄色</font>    |       きいろ       | ---  | ---  | ---  | ---  | \#FFD900 | <font color="#FFD900>■■■</font> |
|   <font color="#47885E">緑青色</font>   |   ろくしょういろ   | ---  | ---  | ---  | ---  | \#47885E | <font color="#47885E>■■■</font> |
|   <font color="#DBD0E6">白藤色</font>   |    しらふじいろ    | ---  | ---  | ---  | ---  | \#DBD0E6 | <font color="#DBD0E6>■■■</font> |
|    <font color="#7D7D7D">灰色</font>    |      はいいろ      | ---  | ---  | ---  | ---  | \#7D7D7D | <font color="#7D7D7D>■■■</font> |
|    <font color="#EDD3A1">浅黄</font>    |       うすき       | ---  | ---  | ---  | ---  | \#EDD3A1 | <font color="#EDD3A1>■■■</font> |
|    <font color="#FFEA00">中黄</font>    |      ちゅうき      | ---  | ---  | ---  | ---  | \#FFEA00 | <font color="#FFEA00>■■■</font> |
|   <font color="#316745">千歳緑</font>   |    ちとせみどり    | ---  | ---  | ---  | ---  | \#316745 | <font color="#316745>■■■</font> |
|    <font color="#A59ACA">藤紫</font>    |    ふじむらさき    | ---  | ---  | ---  | ---  | \#A59ACA | <font color="#A59ACA>■■■</font> |
|    <font color="#7B7C7D">鉛色</font>    |     なまりいろ     | ---  | ---  | ---  | ---  | \#7B7C7D | <font color="#7B7C7D>■■■</font> |
|    <font color="#E0C38C">枯色</font>    |      かれいろ      | ---  | ---  | ---  | ---  | \#E0C38C | <font color="#E0C38C>■■■</font> |
|  <font color="#FFEC47">菜の花色</font>  |    なのはないろ    | ---  | ---  | ---  | ---  | \#FFEC47 | <font color="#FFEC47>■■■</font> |
|   <font color="#68BE8D">若竹色</font>   |    わかたけいろ    | ---  | ---  | ---  | ---  | \#68BE8D | <font color="#68BE8D>■■■</font> |
|    <font color="#7058A3">菫色</font>    |     すみれいろ     | ---  | ---  | ---  | ---  | \#7058A3 | <font color="#7058A3>■■■</font> |
|    <font color="#727171">鈍色</font>    |      にびいろ      | ---  | ---  | ---  | ---  | \#727171 | <font color="#727171>■■■</font> |
|    <font color="#F3BF88">淡香</font>    |      うすこう      | ---  | ---  | ---  | ---  | \#F3BF88 | <font color="#F3BF88>■■■</font> |
|   <font color="#FEF263">黄檗色</font>   |     きはだいろ     | ---  | ---  | ---  | ---  | \#FEF263 | <font color="#FEF263>■■■</font> |
|     <font color="#3EB370">緑</font>     |       みどり       | ---  | ---  | ---  | ---  | \#3EB370 | <font color="#3EB370>■■■</font> |
|    <font color="#674598">青紫</font>    |    あおむらさき    | ---  | ---  | ---  | ---  | \#674598 | <font color="#674598>■■■</font> |
|     <font color="#595857">墨</font>     |        すみ        | ---  | ---  | ---  | ---  | \#595857 | <font color="#595857>■■■</font> |
|    <font color="#F7B977">杏色</font>    |     あんずいろ     | ---  | ---  | ---  | ---  | \#F7B977 | <font color="#F7B977>■■■</font> |
|    <font color="#FCD575">卵色</font>    |     たまごいろ     | ---  | ---  | ---  | ---  | \#FCD575 | <font color="#FCD575>■■■</font> |
|   <font color="#007B43">常磐色</font>   |     ときわいろ     | ---  | ---  | ---  | ---  | \#007B43 | <font color="#007B43>■■■</font> |
|   <font color="#674196">菖蒲色</font>   |    しょうぶいろ    | ---  | ---  | ---  | ---  | \#674196 | <font color="#674196>■■■</font> |
|    <font color="#595455">丼鼠</font>    |     どぶねずみ     | ---  | ---  | ---  | ---  | \#595455 | <font color="#595455>■■■</font> |
|   <font color="#F19072">東雲色</font>   |    しののめいろ    | ---  | ---  | ---  | ---  | \#F19072 | <font color="#F19072>■■■</font> |
|   <font color="#FBD26B">花葉色</font>   |     はなばいろ     | ---  | ---  | ---  | ---  | \#FBD26B | <font color="#FBD26B>■■■</font> |
|   <font color="#BED3CA">千草鼠</font>   |     ちぐさねず     | ---  | ---  | ---  | ---  | \#BED3CA | <font color="#BED3CA>■■■</font> |
|   <font color="#9079AD">竜胆色</font>   |    りんどういろ    | ---  | ---  | ---  | ---  | \#9079AD | <font color="#9079AD>■■■</font> |
|   <font color="#524E4D">消炭色</font>   |    けしずみいろ    | ---  | ---  | ---  | ---  | \#524E4D | <font color="#524E4D>■■■</font> |
|    <font color="#F19072">曙色</font>    |    あけぼのいろ    | ---  | ---  | ---  | ---  | \#F19072 | <font color="#F19072>■■■</font> |
|   <font color="#F5E56B">刈安色</font>   |    かりやすいろ    | ---  | ---  | ---  | ---  | \#F5E56B | <font color="#F5E56B>■■■</font> |
|   <font color="#92B5A9">千草色</font>   |     ちぐさいろ     | ---  | ---  | ---  | ---  | \#92B5A9 | <font color="#92B5A9>■■■</font> |
|   <font color="#745399">江戸紫</font>   |    えどむらさき    | ---  | ---  | ---  | ---  | \#745399 | <font color="#745399>■■■</font> |
|   <font color="#474A4D">藍墨茶</font>   |    あいすみちゃ    | ---  | ---  | ---  | ---  | \#474A4D | <font color="#474A4D>■■■</font> |
|  <font color="#EE836F">珊瑚朱色</font>  |   さんごしゅいろ   | ---  | ---  | ---  | ---  | \#EE836F | <font color="#EE836F>■■■</font> |
|  <font color="#EEC362">玉蜀黍色</font>  |  とうもろこしいろ  | ---  | ---  | ---  | ---  | \#EEC362 | <font color="#EEC362>■■■</font> |
|   <font color="#7EBEA5">青磁色</font>   |     せいじいろ     | ---  | ---  | ---  | ---  | \#7EBEA5 | <font color="#7EBEA5>■■■</font> |
|    <font color="#65318E">本紫</font>    |    ほんむらさき    | ---  | ---  | ---  | ---  | \#65318E | <font color="#65318E>■■■</font> |
|   <font color="#383C3C">羊羹色</font>   |    ようかんいろ    | ---  | ---  | ---  | ---  | \#383C3C | <font color="#383C3C>■■■</font> |
|   <font color="#EB9B6F">深支子</font>   |    こきくちなし    | ---  | ---  | ---  | ---  | \#EB9B6F | <font color="#EB9B6F>■■■</font> |
|  <font color="#EBD842">金糸雀色</font>  |    かなりあいろ    | ---  | ---  | ---  | ---  | \#EBD842 | <font color="#EBD842>■■■</font> |
|   <font color="#7EBEAB">青竹色</font>   |    あおたけいろ    | ---  | ---  | ---  | ---  | \#7EBEAB | <font color="#7EBEAB>■■■</font> |
|  <font color="#522F60"> 葡萄色</font>   |     ぶどういろ     | ---  | ---  | ---  | ---  | \#522F60 | <font color="#522F60>■■■</font> |
|    <font color="#2B2B2B">蝋色</font>    |      ろういろ      | ---  | ---  | ---  | ---  | \#2B2B2B | <font color="#2B2B2B>■■■</font> |
|     <font color="#E0815E">纁</font>     |        そひ        | ---  | ---  | ---  | ---  | \#E0815E | <font color="#E0815E>■■■</font> |
|  <font color="#FFDB4F">黄支子色</font>  |   きくちなしいろ   | ---  | ---  | ---  | ---  | \#FFDB4F | <font color="#FFDB4F>■■■</font> |
|   <font color="#028760">常磐緑</font>   |    ときわみどり    | ---  | ---  | ---  | ---  | \#028760 | <font color="#028760>■■■</font> |
|    <font color="#493759">深紫</font>    |    ふかむらさき    | ---  | ---  | ---  | ---  | \#493759 | <font color="#493759>■■■</font> |
|     <font color="#2B2B2B">黒</font>     |        くろ        | ---  | ---  | ---  | ---  | \#2B2B2B | <font color="#2B2B2B>■■■</font> |
|    <font color="#DF7163">浅緋</font>    |      うすきひ      | ---  | ---  | ---  | ---  | \#DF7163 | <font color="#DF7163>■■■</font> |
|   <font color="#FBCA4D">支子色</font>   |    くちなしいろ    | ---  | ---  | ---  | ---  | \#FBCA4D | <font color="#FBCA4D>■■■</font> |
|   <font color="#3B7960">木賊色</font>   |     とくさいろ     | ---  | ---  | ---  | ---  | \#3B7960 | <font color="#3B7960>■■■</font> |
|    <font color="#2E2930">紫黒</font>    |       しこく       | ---  | ---  | ---  | ---  | \#2E2930 | <font color="#2E2930>■■■</font> |
|   <font color="#180614">烏羽色</font>   |    からすばいろ    | ---  | ---  | ---  | ---  | \#180614 | <font color="#180614>■■■</font> |
|    <font color="#D57C6B">真赭</font>    |       まそほ       | ---  | ---  | ---  | ---  | \#D57C6B | <font color="#D57C6B>■■■</font> |
|  <font color="#FCC800">向日葵色</font>  |    ひまわりいろ    | ---  | ---  | ---  | ---  | \#FCC800 | <font color="#FCC800>■■■</font> |
|   <font color="#2F5D50">天鵞絨</font>   |      びろうど      | ---  | ---  | ---  | ---  | \#2F5D50 | <font color="#2F5D50>■■■</font> |
|     <font color="#884898">紫</font>     |      むらさき      | ---  | ---  | ---  | ---  | \#884898 | <font color="#884898>■■■</font> |
|    <font color="#281A14">鉄黒</font>    |      てつぐろ      | ---  | ---  | ---  | ---  | \#281A14 | <font color="#281A14>■■■</font> |
|    <font color="#D0826C">洗朱</font>    |     あらいしゅ     | ---  | ---  | ---  | ---  | \#D0826C | <font color="#D0826C>■■■</font> |
|   <font color="#F8B500">山吹色</font>   |    やまぶきいろ    | ---  | ---  | ---  | ---  | \#F8B500 | <font color="#F8B500>■■■</font> |
|    <font color="#3A5B52">虫襖</font>    |      むしあお      | ---  | ---  | ---  | ---  | \#3A5B52 | <font color="#3A5B52>■■■</font> |
|   <font color="#C0A2C7">薄葡萄</font>   |     うすぶどう     | ---  | ---  | ---  | ---  | \#C0A2C7 | <font color="#C0A2C7>■■■</font> |
|   <font color="#000B00">濡羽色</font>   |     ぬればいろ     | ---  | ---  | ---  | ---  | \#000B00 | <font color="#000B00>■■■</font> |
|   <font color="#CA8269">遠州茶</font>   |   えんしゅうちゃ   | ---  | ---  | ---  | ---  | \#CA8269 | <font color="#CA8269>■■■</font> |
|   <font color="#FABF14">鬱金色</font>   |     うこんいろ     | ---  | ---  | ---  | ---  | \#FABF14 | <font color="#FABF14>■■■</font> |
|    <font color="#475950">革色</font>    |      かわいろ      | ---  | ---  | ---  | ---  | \#475950 | <font color="#475950>■■■</font> |
|    <font color="#460E44">紫紺</font>    |       しこん       | ---  | ---  | ---  | ---  | \#460E44 | <font color="#460E44>■■■</font> |
|    <font color="#250D00">黒檀</font>    |      こくたん      | ---  | ---  | ---  | ---  | \#250D00 | <font color="#250D00>■■■</font> |
|   <font color="#BB5548">紅樺色</font>   |    べにかばいろ    | ---  | ---  | ---  | ---  | \#BB5548 | <font color="#BB5548>■■■</font> |
|    <font color="#F7C114">藤黄</font>    |      とうおう      | ---  | ---  | ---  | ---  | \#F7C114 | <font color="#F7C114>■■■</font> |
|    <font color="#00552E">深緑</font>    |     ふかみどり     | ---  | ---  | ---  | ---  | \#00552E | <font color="#00552E>■■■</font> |
|   <font color="#74325C">暗紅色</font>   |   あんこうしょく   | ---  | ---  | ---  | ---  | \#74325C | <font color="#74325C>■■■</font> |
|  <font color="#241A08">憲法黒茶</font>  |  けんぽうくろちゃ  | ---  | ---  | ---  | ---  | \#241A08 | <font color="#241A08>■■■</font> |
|     <font color="#AB6953">赭</font>     |        そほ        | ---  | ---  | ---  | ---  | \#AB6953 | <font color="#AB6953>■■■</font> |
|    <font color="#E6B422">金色</font>    |      こんじき      | ---  | ---  | ---  | ---  | \#E6B422 | <font color="#E6B422>■■■</font> |
|    <font color="#005243">鉄色</font>    |      てついろ      | ---  | ---  | ---  | ---  | \#005243 | <font color="#005243>■■■</font> |
|  <font color="#55295B">桑の実色</font>  |    くわのみいろ    | ---  | ---  | ---  | ---  | \#55295B | <font color="#55295B>■■■</font> |
|   <font color="#16160E">暗黒色</font>   |   あんこくしょく   | ---  | ---  | ---  | ---  | \#16160E | <font color="#16160E>■■■</font> |

## irocore
Colors from [irocore.com](https://irocore.com) :
|                   Name                    |       Roma        |  C   |  M   |  Y   |  K   |    RGB    |               View               |
| :---------------------------------------: | :---------------: | :--: | :--: | :--: | :--: | :-------: | :------------------------------: |
|     <font color="#105779">藍色</font>     |      Ai-iro       | 070  | 020  | 000  | 060  | \#105779  | <font color="#105779>■■■</font>  |
|   <font color="#756D91">藍色鳩羽</font>   |    Aiirohatoba    | 040  | 040  | 000  | 040  | \#756D91  | <font color="#756D91>■■■</font>  |
|    <font color="#555647">藍媚茶</font>    |     Aikobicha     | 055  | 040  | 052  | 028  | \#555647  | <font color="#555647>■■■</font>  |
|    <font color="#373C38">藍墨茶</font>    |     Aisumicha     | 086  | 072  | 068  | 047  | \#373C38  | <font color="#373C38>■■■</font>  |
|    <font color="#373C38">相済茶</font>    |     Aisumicha     | 086  | 072  | 068  | 047  | \#373C38  | <font color="#373C38>■■■</font>  |
|    <font color="#003A47">藍鉄色</font>    |    Aitetsu-iro    | 090  | 000  | 023  | 080  | \#003A47  | <font color="#003A47>■■■</font>  |
|     <font color="#6B818E">藍鼠</font>     |      Ainezu       | 070  | 050  | 040  | 000  | \#6B818E  | <font color="#6B818E>■■■</font>  |
|   <font color="#56564B">藍海松茶</font>   |     Aimirucha     | 000  | 000  | 013  | 066  | \#56564B  | <font color="#56564B>■■■</font>  |
|      <font color="#0095D9">青</font>      |        Ao         | 010  | 031  | 000  | 015  | \#0095D9  | <font color="#0095D9>■■■</font>  |
|    <font color="#AA89BD"">葵色</font>     |      Aoi-iro      | 038  | 050  | 000  | 000  | \#AA89BD" | <font color="#AA89BD">■■■</font> |
|    <font color="#ADA250">青朽葉</font>    |     Aokuchiba     | 000  | 006  | 054  | 032  | \#ADA250  | <font color="#ADA250>■■■</font>  |
|    <font color="#85916D">青白橡</font>    | Aoshirotsurubami  | 035  | 017  | 040  | 020  | \#85916D  | <font color="#85916D>■■■</font>  |
|    <font color="#7EBEAB">青竹色</font>    |    Aotake-iro     | 034  | 000  | 010  | 025  | \#7EBEAB  | <font color="#7EBEAB>■■■</font>  |
|     <font color="#858954">青丹</font>     |       Aoni        | 056  | 043  | 076  | 000  | \#858954  | <font color="#858954>■■■</font>  |
|     <font color="#324356">青鈍</font>     |      Aonibi       | 090  | 080  | 060  | 015  | \#324356  | <font color="#324356>■■■</font>  |
|    <font color="#8AA2D3"">青藤</font>     |      Aofuji       | 050  | 031  | 000  | 000  | \#8AA2D3" | <font color="#8AA2D3">■■■</font> |
|     <font color="#00A497">青緑</font>     |     Aomidori      | 010  | 000  | 008  | 036  | \#00A497  | <font color="#00A497>■■■</font>  |
|     <font color="#6846A5">青紫</font>     |    Aomurasaki     | 072  | 080  | 000  | 000  | \#6846A5  | <font color="#6846A5>■■■</font>  |
|      <font color="#F20000">赤</font>      |        Aka        | 000  | 095  | 083  | 005  | \#F20000  | <font color="#F20000>■■■</font>  |
|    <font color="#F2934E">赤支子</font>    |  Akaikuchinashi   | 010  | 032  | 090  | 000  | \#F2934E  | <font color="#F2934E>■■■</font>  |
|    <font color="#db8449">赤朽葉</font>    |    Akakuchiba     | 000  | 040  | 067  | 014  | \#DB8449  | <font color="#db8449>■■■</font>  |
|   <font color="#F6B894"">赤香色</font>    |     Akakō-iro     | 000  | 025  | 040  | 004  | \#F6B894" | <font color="#F6B894">■■■</font> |
|   <font color="#FED2AE"">赤白橡</font>    | Akashirotsurubami | 000  | 025  | 035  | 000  | \#FED2AE" | <font color="#FED2AE">■■■</font> |
|     <font color="#EA5506">赤橙</font>     |     AkaDaidai     | 000  | 064  | 097  | 008  | \#EA5506  | <font color="#EA5506>■■■</font>  |
|     <font color="#B7282E">茜色</font>     |     Akane-iro     | 000  | 078  | 075  | 028  | \#B7282E  | <font color="#B7282E>■■■</font>  |
|     <font color="#D81F35">赤紅</font>     |      Akabeni      | 000  | 095  | 071  | 010  | \#D81F35  | <font color="#D81F35>■■■</font>  |
|     <font color="#EB6EA5">赤紫</font>     |    Akamurasaki    | 010  | 070  | 008  | 000  | \#EB6EA5  | <font color="#EB6EA5>■■■</font>  |
|   <font color="#BCB09C"">灰汁色</font>    |      Aku-iro      | 035  | 032  | 042  | 000  | \#BCB09C" | <font color="#BCB09C">■■■</font> |
|      <font color="#BA2636">緋</font>      |        Ake        | 034  | 097  | 082  | 003  | \#BA2636  | <font color="#BA2636>■■■</font>  |
|    <font color="#F9A383"">曙色</font>     |    Akebono-iro    | 000  | 050  | 050  | 000  | \#F9A383" | <font color="#F9A383">■■■</font> |
|     <font color="#DF7163">浅緋</font>     |      Asaake       | 000  | 049  | 056  | 013  | \#DF7163  | <font color="#DF7163>■■■</font>  |
|    <font color="#00A5BF">浅葱色</font>    |     Asagi-iro     | 076  | 020  | 026  | 000  | \#00A5BF  | <font color="#00A5BF>■■■</font>  |
|   <font color="#94A8B0"">浅葱鼠</font>    |     Asaginezu     | 030  | 000  | 011  | 030  | \#94A8B0" | <font color="#94A8B0">■■■</font> |
|    <font color="#84B9CB"">浅縹</font>     |     Asahanada     | 035  | 009  | 000  | 020  | \#84B9CB" | <font color="#84B9CB">■■■</font> |
|    <font color="#9BCF97"">浅緑</font>     |     Asamidori     | 044  | 000  | 050  | 000  | \#9BCF97" | <font color="#9BCF97">■■■</font> |
|    <font color="#C4A3BF"">浅紫</font>     |    Asamurasaki    | 000  | 017  | 003  | 023  | \#C4A3BF" | <font color="#C4A3BF">■■■</font> |
|    <font color="#A04940">小豆色</font>    |     Azuki-iro     | 050  | 085  | 080  | 000  | \#A04940  | <font color="#A04940>■■■</font>  |
|    <font color="#715454">小豆鼠</font>    |     Azukinezu     | 062  | 069  | 069  | 014  | \#715454  | <font color="#715454>■■■</font>  |
|     <font color="#0086CC">天色</font>     |      Ama-iro      | 085  | 032  | 000  | 000  | \#0086CC  | <font color="#0086CC>■■■</font>  |
|   <font color="#C7B897"">亜麻色</font>    |      Ama-iro      | 000  | 011  | 030  | 030  | \#C7B897" | <font color="#C7B897">■■■</font> |
|     <font color="#CD6118">飴色</font>     |      Ame-iro      | 000  | 068  | 090  | 020  | \#CD6118  | <font color="#CD6118>■■■</font>  |
|    <font color="#B168A8">菖蒲色</font>    |     Ayame-iro     | 030  | 055  | 005  | 000  | \#B168A8  | <font color="#B168A8>■■■</font>  |
|    <font color="#F0B694"">洗柿</font>     |     Araigaki      | 000  | 025  | 030  | 005  | \#F0B694" | <font color="#F0B694">■■■</font> |
|     <font color="#D0826C">洗朱</font>     |      Araishu      | 000  | 038  | 048  | 018  | \#D0826C  | <font color="#D0826C>■■■</font>  |
|    <font color="#FFB3A7"">退紅</font>     |      Arazome      | 000  | 030  | 020  | 010  | \#FFB3A7" | <font color="#FFB3A7">■■■</font> |
|   <font color="#D2D0E8"">淡藤色</font>    |    Awafuji-iro    | 020  | 018  | 000  | 000  | \#D2D0E8" | <font color="#D2D0E8">■■■</font> |
|     <font color="#F4A466">杏色</font>     |     Anzu-iro      | 000  | 045  | 060  | 000  | \#F4A466  | <font color="#F4A466>■■■</font>  |
|    <font color="#A8A256">威光茶</font>    |      Ikoucha      | 034  | 036  | 066  | 000  | \#A8A256  | <font color="#A8A256>■■■</font>  |
|     <font color="#bb5561">苺色</font>     |    Ichigo-iro     | 034  | 078  | 052  | 000  | \#BB5561  | <font color="#bb5561>■■■</font>  |
|   <font color="#FCD4D5"">一斤染</font>    |     Ikkonzome     | 001  | 020  | 009  | 000  | \#FCD4D5" | <font color="#FCD4D5">■■■</font> |
|     <font color="#563779">今紫</font>     |    Imamurasaki    | 029  | 055  | 000  | 053  | \#563779  | <font color="#563779>■■■</font>  |
|    <font color="#D0576B">今様色</font>    |    Imayou-iro     | 023  | 078  | 045  | 000  | \#D0576B  | <font color="#D0576B>■■■</font>  |
|    <font color="#6F6F43">岩井茶</font>    |      Iwaicha      | 071  | 060  | 085  | 000  | \#6F6F43  | <font color="#6F6F43>■■■</font>  |
|   <font color="#FFD768"">不言色</font>    |     Iwanu-iro     | 000  | 018  | 060  | 000  | \#FFD768" | <font color="#FFD768">■■■</font> |
|     <font color="#838B0D">鶯色</font>     |    Uguisu-iro     | 023  | 000  | 090  | 050  | \#838B0D  | <font color="#838B0D>■■■</font>  |
|     <font color="#715C1F">鶯茶</font>     |     Uguisucha     | 000  | 019  | 073  | 056  | \#715C1F  | <font color="#715C1F>■■■</font>  |
|    <font color="#F7C229">鬱金色</font>    |     Ukon-iro      | 000  | 019  | 095  | 000  | \#F7C229  | <font color="#F7C229>■■■</font>  |
|    <font color="#A0CEA8"">薄青</font>     |       Usuao       | 040  | 000  | 040  | 005  | \#A0CEA8" | <font color="#A0CEA8">■■■</font> |
|   <font color="#A2D7DD"">薄浅葱</font>    |     Usuasagi      | 040  | 000  | 015  | 000  | \#A2D7DD" | <font color="#A2D7DD">■■■</font> |
|    <font color="#CEB4B9"">薄色</font>     |      Usu-iro      | 025  | 035  | 020  | 000  | \#CEB4B9" | <font color="#CEB4B9">■■■</font> |
|    <font color="#D4ACAD"">薄柿</font>     |      Usugaki      | 000  | 019  | 018  | 017  | \#D4ACAD" | <font color="#D4ACAD">■■■</font> |
|    <font color="#EDD3A1"">浅黄</font>     |       Usuki       | 000  | 011  | 032  | 007  | \#EDD3A1" | <font color="#EDD3A1">■■■</font> |
|   <font color="#F9F1C0"">淡黄蘗</font>    |     Usukihada     | 000  | 002  | 030  | 005  | \#F9F1C0" | <font color="#F9F1C0">■■■</font> |
|     <font color="#B15C65">薄紅</font>     |    Usukurenai     | 000  | 064  | 032  | 024  | \#B15C65  | <font color="#B15C65>■■■</font>  |
|    <font color="#F3BF88"">淡香</font>     |       Usuko       | 000  | 021  | 044  | 005  | \#F3BF88" | <font color="#F3BF88">■■■</font> |
|    <font color="#FCF5F7"">薄桜</font>     |     Usuzakura     | 000  | 005  | 001  | 002  | \#FCF5F7" | <font color="#FCF5F7">■■■</font> |
|   <font color="#A3A3A2"">薄墨色</font>    |    Usuzumi-iro    | 000  | 000  | 001  | 036  | \#A3A3A2" | <font color="#A3A3A2">■■■</font> |
|   <font color="#82A9DA"">薄花色</font>    |    Usuhana-iro    | 052  | 025  | 000  | 000  | \#82A9DA" | <font color="#82A9DA">■■■</font> |
|   <font color="#C7C3E1"">薄藤色</font>    |    Usufuji-iro    | 025  | 023  | 000  | 000  | \#C7C3E1" | <font color="#C7C3E1">■■■</font> |
|   <font color="#E9C3DC"">淡紅藤</font>    |    Usubenifuji    | 008  | 030  | 000  | 000  | \#E9C3DC" | <font color="#E9C3DC">■■■</font> |
|   <font color="#BCE1DF"">薄水色</font>    |    Usumizu-iro    | 030  | 000  | 015  | 000  | \#BCE1DF" | <font color="#BCE1DF">■■■</font> |
|    <font color="#CAE5CD"">薄緑</font>     |     Usumidori     | 025  | 000  | 025  | 000  | \#CAE5CD" | <font color="#CAE5CD">■■■</font> |
|    <font color="#E0E7AA"">薄柳</font>     |     Usuyanagi     | 013  | 000  | 040  | 005  | \#E0E7AA" | <font color="#E0E7AA">■■■</font> |
|  <font color="#9D896C">空五倍子色</font>  |   Utsubushi-iro   | 000  | 013  | 031  | 038  | \#9D896C  | <font color="#9D896C>■■■</font>  |
|  <font color="#FBFBF6"">卯の花色</font>   |    Unohana-iro    | 001  | 000  | 004  | 002  | \#FBFBF6" | <font color="#FBFBF6">■■■</font> |
|     <font color="#E9546B">梅重</font>     |     Umegasane     | 000  | 080  | 040  | 000  | \#E9546B  | <font color="#E9546B>■■■</font>  |
|     <font color="#B48A76">梅染</font>     |      Umezome      | 000  | 023  | 034  | 029  | \#B48A76  | <font color="#B48A76>■■■</font>  |
|     <font color="#AD7984">梅鼠</font>     |     Umenezumi     | 008  | 035  | 015  | 025  | \#AD7984  | <font color="#AD7984>■■■</font>  |
|     <font color="#493759">梅紫</font>     |    Umemurasaki    | 045  | 080  | 037  | 000  | \#493759  | <font color="#493759>■■■</font>  |
|   <font color="#C1D8AC"">裏葉柳</font>    |    Urahayanagi    | 011  | 000  | 020  | 015  | \#C1D8AC" | <font color="#C1D8AC">■■■</font> |
|   <font color="#A4C2A9"">裏葉色</font>    |     Uraha-iro     | 030  | 000  | 030  | 020  | \#A4C2A9" | <font color="#A4C2A9">■■■</font> |
|    <font color="#C1D8AC"">裏柳</font>     |     Urayanagi     | 011  | 000  | 020  | 015  | \#C1D8AC" | <font color="#C1D8AC">■■■</font> |
|    <font color="#CD8C5C">江戸茶</font>    |      Edocha       | 000  | 032  | 055  | 020  | \#CD8C5C  | <font color="#CD8C5C>■■■</font>  |
|    <font color="#745399">江戸紫</font>    |    Edomurasaki    | 024  | 046  | 000  | 040  | \#745399  | <font color="#745399>■■■</font>  |
|    <font color="#6E1E51">葡萄色</font>    |      Ebi-iro      | 020  | 080  | 000  | 060  | \#6E1E51  | <font color="#6E1E51>■■■</font>  |
|    <font color="#932e40">海老色</font>    |      Ebi-iro      | 000  | 080  | 040  | 050  | \#932E40  | <font color="#932e40>■■■</font>  |
|    <font color="#7A4171">葡萄染</font>    |      Ebizome      | 000  | 047  | 007  | 052  | \#7A4171  | <font color="#7A4171>■■■</font>  |
|    <font color="#640125">葡萄茶</font>    |      Ebicha       | 000  | 099  | 063  | 064  | \#640125  | <font color="#640125>■■■</font>  |
|    <font color="#6c2c2f">海老茶</font>    |      Ebicha       | 000  | 059  | 056  | 058  | \#6C2C2F  | <font color="#6c2c2f>■■■</font>  |
|    <font color="#CA8269">遠州茶</font>    |     Enshucha      | 000  | 036  | 048  | 021  | \#CA8269  | <font color="#CA8269>■■■</font>  |
|    <font color="#9B003F">臙脂色</font>    |     Enji-iro      | 000  | 095  | 036  | 045  | \#9B003F  | <font color="#9B003F>■■■</font>  |
|    <font color="#85646C">臙脂鼠</font>    |     Enji-nezu     | 000  | 035  | 009  | 060  | \#85646C  | <font color="#85646C>■■■</font>  |
|    <font color="#EC6D51">鉛丹色</font>    |     Entan-iro     | 000  | 054  | 066  | 007  | \#EC6D51  | <font color="#EC6D51>■■■</font>  |
|    <font color="#769164">老竹色</font>    |    Oitake-iro     | 019  | 000  | 031  | 043  | \#769164  | <font color="#769164>■■■</font>  |
|     <font color="#405C36">老緑</font>     |     Oimidori      | 045  | 000  | 060  | 070  | \#405C36  | <font color="#405C36>■■■</font>  |
|    <font color="#a596c7"">楝色</font>     |     Ouchi-iro     | 043  | 043  | 005  | 000  | \#A596C7" | <font color="#a596c7">■■■</font> |
|    <font color="#CE9B0E">黄土色</font>    |      Odo-iro      | 000  | 032  | 090  | 025  | \#CE9B0E  | <font color="#CE9B0E>■■■</font>  |
|     <font color="#EE7948">黄丹</font>     |        Oni        | 000  | 049  | 070  | 007  | \#EE7948  | <font color="#EE7948>■■■</font>  |
|     <font color="#9FBB00">鸚緑</font>     |      Ouryoku      | 038  | 000  | 010  | 015  | \#9FBB00  | <font color="#9FBB00>■■■</font>  |
|   <font color="#F9D0C5"">乙女色</font>    |     Otome-iro     | 000  | 045  | 034  | 000  | \#F9D0C5" | <font color="#F9D0C5">■■■</font> |
|   <font color="#007083">御納戸色</font>   |    Onando-iro     | 080  | 000  | 020  | 050  | \#007083  | <font color="#007083>■■■</font>  |
|   <font color="#465D4C">御納戸茶</font>   |     Onandocha     | 081  | 060  | 068  | 022  | \#465D4C  | <font color="#465D4C>■■■</font>  |
|   <font color="#F2F2B0"">女郎花</font>    |     Ominaeshi     | 000  | 000  | 027  | 005  | \#F2F2B0" | <font color="#F2F2B0">■■■</font> |
|  <font color="#4C6473">御召御納戸</font>  |   Omeshionando    | 034  | 013  | 000  | 055  | \#4C6473  | <font color="#4C6473>■■■</font>  |
|    <font color="#43676B">御召茶</font>    |     Omeshicha     | 037  | 004  | 000  | 058  | \#43676B  | <font color="#43676B>■■■</font>  |
|     <font color="#125115">織部</font>     |       Oribe       | 068  | 000  | 090  | 070  | \#125115  | <font color="#125115>■■■</font>  |
|     <font color="#DE6A1C">柿色</font>     |     Kaki-iro      | 000  | 068  | 090  | 010  | \#DE6A1C  | <font color="#DE6A1C>■■■</font>  |
|    <font color="#BD7862">柿渋色</font>    |   Kakishibu-iro   | 035  | 065  | 065  | 000  | \#BD7862  | <font color="#BD7862>■■■</font>  |
|     <font color="#5E3862">杜若</font>     |    Kakitsubata    | 074  | 088  | 045  | 009  | \#5E3862  | <font color="#5E3862>■■■</font>  |
|     <font color="#003847">褐色</font>     |     Kachiiro      | 010  | 080  | 065  | 035  | \#003847  | <font color="#003847>■■■</font>  |
|     <font color="#181B39">勝色</font>     |     Katsu-iro     | 060  | 045  | 000  | 085  | \#181B39  | <font color="#181B39>■■■</font>  |
|     <font color="#C5591A">樺色</font>     |     Kaba-iro      | 030  | 080  | 095  | 000  | \#C5591A  | <font color="#C5591A>■■■</font>  |
|     <font color="#726250">樺茶</font>     |      Kabacha      | 000  | 014  | 030  | 055  | \#726250  | <font color="#726250>■■■</font>  |
|    <font color="#C5E4Ed"">甕覗</font>     |    Kamenozoki     | 025  | 000  | 006  | 003  | \#C5E4ED" | <font color="#C5E4Ed">■■■</font> |
|   <font color="#00695B">鴨の羽色</font>   |   Kamonoha-iro    | 089  | 050  | 070  | 009  | \#00695B  | <font color="#00695B>■■■</font>  |
|    <font color="#C7B183"">茅色</font>     |     Kaya-iro      | 000  | 015  | 040  | 030  | \#C7B183" | <font color="#C7B183">■■■</font> |
|     <font color="#EA0032">唐紅</font>     |    Karakurenai    | 003  | 010  | 080  | 000  | \#EA0032  | <font color="#EA0032>■■■</font>  |
|     <font color="#EA0032">韓紅</font>     |    Karakurenai    | 003  | 010  | 080  | 000  | \#EA0032  | <font color="#EA0032>■■■</font>  |
|   <font color="#EB9793"">乾鮭色</font>    |   Karasake-iro    | 000  | 050  | 030  | 005  | \#EB9793" | <font color="#EB9793">■■■</font> |
|    <font color="#D0AF4C">芥子色</font>    |    Karashi-iro    | 000  | 016  | 063  | 018  | \#D0AF4C  | <font color="#D0AF4C>■■■</font>  |
|     <font color="#A06705">唐茶</font>     |      Karacha      | 050  | 070  | 010  | 000  | \#A06705  | <font color="#A06705>■■■</font>  |
|    <font color="#FFED00"">刈安</font>     |     Kariyasu      | 000  | 015  | 095  | 000  | \#FFED00" | <font color="#FFED00">■■■</font> |
|    <font color="#C37854">土器色</font>    |   Kawarake-iro    | 000  | 038  | 057  | 024  | \#C37854  | <font color="#C37854>■■■</font>  |
|    <font color="#FDA900">萱草色</font>    |     Kanzo-iro     | 000  | 045  | 096  | 000  | \#FDA900  | <font color="#FDA900>■■■</font>  |
|    <font color="#8CB155">黄浅緑</font>    |    Kiasamidori    | 053  | 019  | 079  | 000  | \#8CB155  | <font color="#8CB155>■■■</font>  |
|    <font color="#FFD900"">黄色</font>     |      Ki-iro       | 000  | 015  | 010  | 000  | \#FFD900" | <font color="#FFD900">■■■</font> |
|    <font color="#B98C46">黄唐茶</font>    |     Kigaracha     | 000  | 024  | 062  | 027  | \#B98C46  | <font color="#B98C46>■■■</font>  |
|    <font color="#765C47">黄枯茶</font>    |     Kigaracha     | 000  | 022  | 040  | 054  | \#765C47  | <font color="#765C47>■■■</font>  |
|    <font color="#624498">桔梗色</font>    |     Kikyo-iro     | 072  | 080  | 000  | 000  | \#624498  | <font color="#624498>■■■</font>  |
|     <font color="#6E7955">麹塵</font>     |      Kikujin      | 009  | 000  | 030  | 053  | \#6E7955  | <font color="#6E7955>■■■</font>  |
|   <font color="#FFDB4F"">黄支子</font>    |   Kikuchinashi    | 000  | 014  | 069  | 000  | \#FFDB4F" | <font color="#FFDB4F">■■■</font> |
|    <font color="#d3a243">黄朽葉</font>    |     Kikuchiba     | 000  | 023  | 068  | 017  | \#D3A243  | <font color="#d3a243>■■■</font>  |
|    <font color="#856859">紀州茶</font>    |     Kishucha      | 000  | 022  | 033  | 048  | \#856859  | <font color="#856859>■■■</font>  |
|     <font color="#D9972F">狐色</font>     |    Kitsune-iro    | 020  | 050  | 090  | 000  | \#D9972F  | <font color="#D9972F>■■■</font>  |
|     <font color="#A27033">黄橡</font>     |    Kitsurubami    | 020  | 040  | 070  | 020  | \#A27033  | <font color="#A27033>■■■</font>  |
|   <font color="#F7EFE3"">生成色</font>    |    Kinari-iro     | 000  | 005  | 010  | 005  | \#F7EFE3" | <font color="#F7EFE3">■■■</font> |
|    <font color="#FEF263"">黄蘗</font>     |      Kihada       | 003  | 000  | 070  | 000  | \#FEF263" | <font color="#FEF263">■■■</font> |
|   <font color="#918754">黄海松茶</font>   |     Kimirucha     | 000  | 007  | 042  | 043  | \#918754  | <font color="#918754>■■■</font>  |
|    <font color="#D8A373">伽羅色</font>    |     Kyara-iro     | 000  | 025  | 047  | 015  | \#D8A373  | <font color="#D8A373>■■■</font>  |
|    <font color="#C08FB3"">京藤</font>     |     Kyoufuji      | 017  | 045  | 000  | 015  | \#C08FB3" | <font color="#C08FB3">■■■</font> |
|     <font color="#772F6D">京紫</font>     |    Kyomurasaki    | 040  | 080  | 000  | 040  | \#772F6D  | <font color="#772F6D>■■■</font>  |
|     <font color="#CE7A19">金茶</font>     |      Kincha       | 025  | 065  | 095  | 000  | \#CE7A19  | <font color="#CE7A19>■■■</font>  |
|    <font color="#C0C0C0"">銀色</font>     |      Gin-iro      | 025  | 025  | 025  | 000  | \#C0C0C0" | <font color="#C0C0C0">■■■</font> |
|     <font color="#F12B00">銀朱</font>     |      Ginshu       | 002  | 082  | 085  | 005  | \#F12B00  | <font color="#F12B00>■■■</font>  |
|    <font color="#82663A">銀煤竹</font>    |    Ginsusutake    | 054  | 058  | 076  | 010  | \#82663A  | <font color="#82663A>■■■</font>  |
|    <font color="#BBBCBF"">銀鼠</font>     |     Ginnezumi     | 003  | 002  | 000  | 035  | \#BBBCBF" | <font color="#BBBCBF">■■■</font> |
|     <font color="#7B8D42">草色</font>     |     Kusa-iro      | 061  | 039  | 089  | 000  | \#7B8D42  | <font color="#7B8D42>■■■</font>  |
|    <font color="#0086A2">孔雀青</font>    |     Kujakuao      | 010  | 000  | 025  | 025  | \#0086A2  | <font color="#0086A2>■■■</font>  |
|    <font color="#008E74">孔雀緑</font>    |   Kujakumidori    | 010  | 000  | 063  | 015  | \#008E74  | <font color="#008E74>■■■</font>  |
|   <font color="#FFD768"">梔子色</font>    |  Kuchinashi-iro   | 000  | 018  | 060  | 000  | \#FFD768" | <font color="#FFD768">■■■</font> |
|   <font color="#FFD768"">支子色</font>    |  Kuchinashi-iro   | 000  | 018  | 060  | 000  | \#FFD768" | <font color="#FFD768">■■■</font> |
|    <font color="#917347">朽葉色</font>    |    Kuchiba-iro    | 000  | 021  | 051  | 043  | \#917347  | <font color="#917347>■■■</font>  |
|     <font color="#433634">涅色</font>     |     Kuri-iro      | 080  | 085  | 081  | 019  | \#433634  | <font color="#433634>■■■</font>  |
|     <font color="#762F07">栗色</font>     |     Kuri-iro      | 000  | 060  | 094  | 054  | \#762F07  | <font color="#762F07>■■■</font>  |
|     <font color="#6C1912">栗梅</font>     |      Kiriume      | 005  | 078  | 075  | 055  | \#6C1912  | <font color="#6C1912>■■■</font>  |
|    <font color="#6A4028">栗皮色</font>    |   Kurikawa-iro    | 058  | 074  | 072  | 030  | \#6A4028  | <font color="#6A4028>■■■</font>  |
|    <font color="#824522">栗皮茶</font>    |    Kurikawacha    | 065  | 085  | 095  | 000  | \#824522  | <font color="#824522>■■■</font>  |
|    <font color="#A86F4C">胡桃色</font>    |    Kurumi-iro     | 000  | 034  | 055  | 034  | \#A86F4C  | <font color="#A86F4C>■■■</font>  |
|   <font color="#A58F86"">胡桃染</font>    |    Kurumizome     | 000  | 013  | 019  | 035  | \#A58F86" | <font color="#A58F86">■■■</font> |
|   <font color="#AD002D">紅の八塩</font>   |  kurenainoyashio  | 000  | 010  | 063  | 035  | \#AD002D  | <font color="#AD002D>■■■</font>  |
|     <font color="#86473F">黒緋</font>     |      Kuroake      | 054  | 075  | 065  | 014  | \#86473F  | <font color="#86473F>■■■</font>  |
|     <font color="#102E24">鉄色</font>     |   Kurogane-iro    | 090  | 050  | 075  | 040  | \#102E24  | <font color="#102E24>■■■</font>  |
|     <font color="#322C28">黒橡</font>     |   Kurotsurubami   | 020  | 025  | 025  | 075  | \#322C28  | <font color="#322C28>■■■</font>  |
|     <font color="#432F2F">黒鳶</font>     |     Kurotobi      | 000  | 030  | 030  | 074  | \#432F2F  | <font color="#432F2F>■■■</font>  |
|     <font color="#302833">黒紅</font>     |     Kurobeni      | 006  | 022  | 000  | 080  | \#302833  | <font color="#302833>■■■</font>  |
|    <font color="#302833">黒紅梅</font>    |    Kurobeniume    | 006  | 022  | 000  | 080  | \#302833  | <font color="#302833>■■■</font>  |
|    <font color="#DABC91"">桑色</font>     |     Kuwa-iro      | 020  | 030  | 050  | 000  | \#DABC91" | <font color="#DABC91">■■■</font> |
|    <font color="#DABC91"">桑染</font>     |     Kuwazome      | 020  | 030  | 050  | 000  | \#DABC91" | <font color="#DABC91">■■■</font> |
|   <font color="#550030">桑の実色</font>   |   Kuwanomi-iro    | 045  | 090  | 000  | 000  | \#550030  | <font color="#550030>■■■</font>  |
|    <font color="#005baa">群青色</font>    |    Gunjou-iro     | 010  | 058  | 000  | 000  | \#005BAA  | <font color="#005baa>■■■</font>  |
|    <font color="#595045">消炭色</font>    |   Keshizumi-iro   | 000  | 010  | 020  | 080  | \#595045  | <font color="#595045>■■■</font>  |
|    <font color="#574738">憲法染</font>    |     Kenpozome     | 068  | 068  | 077  | 031  | \#574738  | <font color="#574738>■■■</font>  |
|    <font color="#F6F7F8"">月白</font>     |      Geppaku      | 002  | 001  | 000  | 004  | \#F6F7F8" | <font color="#F6F7F8">■■■</font> |
|      <font color="#3E1E00">玄</font>      |        Gen        | 068  | 068  | 077  | 031  | \#3E1E00  | <font color="#3E1E00>■■■</font>  |
|     <font color="#002E4E">濃藍</font>     |       Koiai       | 060  | 045  | 000  | 085  | \#002E4E  | <font color="#002E4E>■■■</font>  |
|    <font color="#EFCD9A"">香色</font>     |      Kou-iro      | 000  | 014  | 036  | 006  | \#EFCD9A" | <font color="#EFCD9A">■■■</font> |
|    <font color="#9A725C">光悦茶</font>    |    Kouetsucha     | 000  | 036  | 040  | 050  | \#9A725C  | <font color="#9A725C>■■■</font>  |
|    <font color="#FF5234">柑子色</font>    |     Kouji-iro     | 007  | 068  | 080  | 000  | \#FF5234  | <font color="#FF5234>■■■</font>  |
|     <font color="#AD7D4C">香染</font>     |      Kouzome      | 000  | 028  | 056  | 032  | \#AD7D4C  | <font color="#AD7D4C>■■■</font>  |
|    <font color="#E86B79">紅梅色</font>    |     Kobai-iro     | 000  | 070  | 035  | 003  | \#E86B79  | <font color="#E86B79>■■■</font>  |
|   <font color="#104539">高麗納戸</font>   |    Kourainando    | 095  | 078  | 085  | 010  | \#104539  | <font color="#104539>■■■</font>  |
|    <font color="#D74B22">黄櫨染</font>    |      Korozen      | 000  | 066  | 077  | 015  | \#D74B22  | <font color="#D74B22>■■■</font>  |
|     <font color="#C20024">深緋</font>     |      Kokiake      | 030  | 010  | 095  | 000  | \#C20024  | <font color="#C20024>■■■</font>  |
|    <font color="#EFBB2C">深支子</font>    |  Kokikuchinashi   | 010  | 032  | 090  | 000  | \#EFBB2C  | <font color="#EFBB2C>■■■</font>  |
|     <font color="#2A4073">深縹</font>     |    Kokihanada     | 063  | 044  | 000  | 055  | \#2A4073  | <font color="#2A4073>■■■</font>  |
|     <font color="#493759">深紫</font>     |   Kokimurasaki    | 018  | 038  | 000  | 065  | \#493759  | <font color="#493759>■■■</font>  |
|     <font color="#78882d">苔色</font>     |     Koke-iro      | 030  | 000  | 080  | 050  | \#78882D  | <font color="#78882d>■■■</font>  |
|     <font color="#6A4D32">焦茶</font>     |      Kogecha      | 075  | 080  | 090  | 000  | \#6A4D32  | <font color="#6A4D32>■■■</font>  |
|    <font color="#8C6589">古代紫</font>    |   Kodaimurasaki   | 025  | 050  | 000  | 040  | \#8C6589  | <font color="#8C6589>■■■</font>  |
|    <font color="#EA930A">琥珀色</font>    |    Kohaku-iro     | 010  | 055  | 095  | 000  | \#EA930A  | <font color="#EA930A>■■■</font>  |
|     <font color="#716246">媚茶</font>     |      Kobicha      | 000  | 013  | 038  | 056  | \#716246  | <font color="#716246>■■■</font>  |
|    <font color="#6F6045">昆布茶</font>    |      Kobucha      | 056  | 062  | 073  | 000  | \#6F6045  | <font color="#6F6045>■■■</font>  |
|   <font color="#E5E2E4"">小町鼠</font>    |    Komachinezu    | 000  | 003  | 000  | 015  | \#E5E2E4" | <font color="#E5E2E4">■■■</font> |
|    <font color="#E4A343">小麦色</font>    |    Komugi-iro     | 000  | 038  | 075  | 012  | \#E4A343  | <font color="#E4A343>■■■</font>  |
|     <font color="#4B0D43">小紫</font>     |    Komurasaki     | 040  | 080  | 000  | 070  | \#4B0D43  | <font color="#4B0D43>■■■</font>  |
|      <font color="#001A43">紺</font>      |        Kon        | 010  | 050  | 000  | 080  | \#001A43  | <font color="#001A43>■■■</font>  |
|    <font color="#211E55">紺桔梗</font>    |     Konkikyou     | 010  | 090  | 042  | 012  | \#211E55  | <font color="#211E55>■■■</font>  |
|    <font color="#005499">紺青色</font>    |    Konjou-iro     | 010  | 072  | 005  | 000  | \#005499  | <font color="#005499>■■■</font>  |
|     <font color="#3F4551">紺鼠</font>     |      Konnezu      | 030  | 015  | 000  | 080  | \#3F4551  | <font color="#3F4551>■■■</font>  |
|    <font color="#5AC2D9">金春色</font>    |    Konparu-iro    | 065  | 000  | 015  | 000  | \#5AC2D9  | <font color="#5AC2D9>■■■</font>  |
|     <font color="#6592C6">紺藤</font>     |      Konfuji      | 060  | 030  | 000  | 010  | \#6592C6  | <font color="#6592C6>■■■</font>  |
|     <font color="#005B98">紺碧</font>     |      Konpeki      | 090  | 045  | 000  | 030  | \#005B98  | <font color="#005B98>■■■</font>  |
|   <font color="#FFFFFC"">胡粉色</font>    |     Gofun-iro     | 000  | 000  | 001  | 000  | \#FFFFFC" | <font color="#FFFFFC">■■■</font> |
| <font color="#327131">左伊多津万色</font> |   Saitaduma-iro   | 068  | 000  | 090  | 040  | \#327131  | <font color="#327131>■■■</font>  |
|   <font color="#B08D84"">嵯峨鼠</font>    |     Saganezu      | 000  | 030  | 023  | 040  | \#B08D84" | <font color="#B08D84">■■■</font> |
|    <font color="#FEEEED"">桜色</font>     |    Sakura-iro     | 000  | 005  | 002  | 000  | \#FEEEED" | <font color="#FEEEED">■■■</font> |
|    <font color="#D8C6BC"">桜鼠</font>     |   Sakuranezumi    | 020  | 025  | 020  | 000  | \#D8C6BC" | <font color="#D8C6BC">■■■</font> |
|    <font color="#5C9291">錆浅葱</font>    |     Sabiasagi     | 037  | 000  | 001  | 043  | \#5C9291  | <font color="#5C9291>■■■</font>  |
|   <font color="#406F79">錆御納戸</font>   |    Sabionando     | 050  | 000  | 013  | 060  | \#406F79  | <font color="#406F79>■■■</font>  |
|  <font color="#485859">錆鉄御納戸</font>  |  Sabitetsuonando  | 019  | 001  | 000  | 065  | \#485859  | <font color="#485859>■■■</font>  |
|    <font color="#406F79">錆納戸</font>    |     Sabinando     | 050  | 000  | 013  | 060  | \#406F79  | <font color="#406F79>■■■</font>  |
|    <font color="#877254">錆利休</font>    |     Sabirikyu     | 000  | 020  | 040  | 060  | \#877254  | <font color="#877254>■■■</font>  |
|    <font color="#EF8468">珊瑚色</font>    |     Sango-iro     | 000  | 060  | 053  | 000  | \#EF8468  | <font color="#EF8468>■■■</font>  |
|   <font color="#EF454A">珊瑚珠色</font>   |      Shu-iro      | 005  | 085  | 064  | 000  | \#EF454A  | <font color="#EF454A>■■■</font>  |
|    <font color="#C92E36">柘榴色</font>    |    Zakuro-iro     | 000  | 090  | 068  | 020  | \#C92E36  | <font color="#C92E36>■■■</font>  |
|   <font color="#968ABD"">紫苑色</font>    |     Shion-iro     | 045  | 045  | 000  | 005  | \#968ABD" | <font color="#968ABD">■■■</font> |
|    <font color="#BF795D">芝翫茶</font>    |     Shikancha     | 000  | 050  | 050  | 030  | \#BF795D  | <font color="#BF795D>■■■</font>  |
|     <font color="#400B36">紫紺</font>     |      Shikon       | 050  | 090  | 020  | 050  | \#400B36  | <font color="#400B36>■■■</font>  |
|    <font color="#2D0425">至極色</font>    |    Shigoku-iro    | 030  | 060  | 000  | 090  | \#2D0425  | <font color="#2D0425>■■■</font>  |
|    <font color="#EFAB93"">宍色</font>     |    Shishi-iro     | 000  | 028  | 038  | 006  | \#EFAB93" | <font color="#EFAB93">■■■</font> |
|    <font color="#6A1435">紫檀色</font>    |    Shitan-iro     | 000  | 080  | 020  | 070  | \#6A1435  | <font color="#6A1435>■■■</font>  |
|     <font color="#080000">漆黒</font>     |      Sikkoku      | 045  | 045  | 045  | 010  | \#080000  | <font color="#080000>■■■</font>  |
|    <font color="#F19072">東雲色</font>    |   Shinonome-iro   | 000  | 040  | 053  | 005  | \#F19072  | <font color="#F19072>■■■</font>  |
|    <font color="#7E0F09">赤銅色</font>    |    Shakudo-iro    | 000  | 090  | 079  | 060  | \#7E0F09  | <font color="#7E0F09>■■■</font>  |
|   <font color="#F7BD8F"">洒落柿</font>    |     Sharegaki     | 000  | 023  | 042  | 003  | \#F7BD8F" | <font color="#F7BD8F">■■■</font> |
|     <font color="#740A00">朱殷</font>     |       Shuan       | 000  | 090  | 090  | 065  | \#740A00  | <font color="#740A00>■■■</font>  |
|     <font color="#EF454A">朱色</font>     |      Shu-iro      | 000  | 059  | 010  | 008  | \#EF454A  | <font color="#EF454A>■■■</font>  |
|    <font color="#E7001D">猩々緋</font>    |      Shojohi      | 005  | 010  | 090  | 000  | \#E7001D  | <font color="#E7001D>■■■</font>  |
|    <font color="#D4ECEE"">白藍</font>     |      Shiraai      | 020  | 000  | 008  | 000  | \#D4ECEE" | <font color="#D4ECEE">■■■</font> |
|    <font color="#DAC4A5"">白茶</font>     |     Shiracha      | 020  | 025  | 040  | 000  | \#DAC4A5" | <font color="#DAC4A5">■■■</font> |
|  <font color="#FDFCF5"">白百合色</font>   |   Shirayuri-iro   | 000  | 000  | 005  | 002  | \#FDFCF5" | <font color="#FDFCF5">■■■</font> |
|     <font color="#FFFFFD"">白</font>      |       Shiro       | 000  | 000  | 001  | 000  | \#FFFFFD" | <font color="#FFFFFD">■■■</font> |
|   <font color="#E9EAF5"">白菫色</font>    |  Shirosumire-iro  | 010  | 008  | 000  | 000  | \#E9EAF5" | <font color="#E9EAF5">■■■</font> |
|    <font color="#CBB994"">白橡</font>     |  Shirotsurubami   | 000  | 009  | 027  | 020  | \#CBB994" | <font color="#CBB994">■■■</font> |
|    <font color="#E6E6E6"">白鼠</font>     |    Shironezumi    | 000  | 000  | 000  | 013  | \#E6E6E6" | <font color="#E6E6E6">■■■</font> |
|    <font color="#FCFAF2"">白練</font>     |     Shironeri     | 000  | 003  | 011  | 000  | \#FCFAF2" | <font color="#FCFAF2">■■■</font> |
|    <font color="#DFF2FC"">白縹</font>     |    Shirohanada    | 015  | 000  | 000  | 000  | \#DFF2FC" | <font color="#DFF2FC">■■■</font> |
|     <font color="#AD002D">深紅</font>     |      Shinku       | 000  | 010  | 063  | 035  | \#AD002D  | <font color="#AD002D>■■■</font>  |
|     <font color="#AD002D">真紅</font>     |      Shinku       | 000  | 010  | 063  | 035  | \#AD002D  | <font color="#AD002D>■■■</font>  |
|     <font color="#d72500">真朱</font>     |      Shinshu      | 002  | 082  | 085  | 020  | \#D72500  | <font color="#d72500>■■■</font>  |
|    <font color="#5AC2D9">新橋色</font>    |   Shinbashi-iro   | 065  | 000  | 015  | 000  | \#5AC2D9  | <font color="#5AC2D9>■■■</font>  |
|     <font color="#005E15">深碧</font>     |     Shinpeki      | 075  | 000  | 010  | 060  | \#005E15  | <font color="#005E15>■■■</font>  |
|    <font color="#FFFFFF"">純白</font>     |      Junpaku      | 000  | 000  | 000  | 000  | \#FFFFFF" | <font color="#FFFFFF">■■■</font> |
|    <font color="#D23F40">甚三紅</font>    |     Jinzamomi     | 000  | 085  | 064  | 015  | \#D23F40  | <font color="#D23F40>■■■</font>  |
|     <font color="#7E2639">蘇芳</font>     |        Suō        | 052  | 086  | 063  | 000  | \#7E2639  | <font color="#7E2639>■■■</font>  |
|    <font color="#B23E52">蘇芳香</font>    |       Suoko       | 040  | 090  | 065  | 000  | \#B23E52  | <font color="#B23E52>■■■</font>  |
|    <font color="#70564A">煤竹色</font>    |   Susutake-iro    | 000  | 030  | 030  | 072  | \#70564A  | <font color="#70564A>■■■</font>  |
|    <font color="#9EA1A3"">錫色</font>     |     Suzu-iro      | 003  | 001  | 000  | 036  | \#9EA1A3" | <font color="#9EA1A3">■■■</font> |
|     <font color="#864337">雀色</font>     |     Suzumeiro     | 000  | 050  | 059  | 047  | \#864337  | <font color="#864337>■■■</font>  |
|     <font color="#954039">雀茶</font>     |     Suzumecha     | 000  | 070  | 053  | 050  | \#954039  | <font color="#954039>■■■</font>  |
|     <font color="#737373">素鼠</font>     |     Sunezumi      | 000  | 000  | 000  | 055  | \#737373  | <font color="#737373>■■■</font>  |
|     <font color="#000A02">墨色</font>     |     Sumi-iro      | 090  | 080  | 085  | 080  | \#000A02  | <font color="#000A02>■■■</font>  |
|     <font color="#7065A3">菫色</font>     |    Sumire-iro     | 070  | 070  | 000  | 000  | \#7065A3  | <font color="#7065A3>■■■</font>  |
|     <font color="#184212">青漆</font>     |     Seishitsu     | 060  | 000  | 080  | 080  | \#184212  | <font color="#184212>■■■</font>  |
|    <font color="#7EBEA5">青磁色</font>    |     Seiji-iro     | 055  | 010  | 042  | 000  | \#7EBEA5  | <font color="#7EBEA5>■■■</font>  |
|   <font color="#EBF4F4"">青白磁</font>    |     Seihakuji     | 008  | 000  | 004  | 003  | \#EBF4F4" | <font color="#EBF4F4">■■■</font> |
|     <font color="#478384">青碧</font>     |      Seiheki      | 046  | 001  | 000  | 048  | \#478384  | <font color="#478384>■■■</font>  |
|     <font color="#00558F">青藍</font>     |      Seiran       | 010  | 038  | 000  | 040  | \#00558F  | <font color="#00558F>■■■</font>  |
|    <font color="#683F36">赤褐色</font>    |    Sekkashoku     | 000  | 039  | 048  | 059  | \#683F36  | <font color="#683F36>■■■</font>  |
|    <font color="#474B42">仙斎茶</font>    |     Sensaicha     | 005  | 000  | 012  | 071  | \#474B42  | <font color="#474B42>■■■</font>  |
|    <font color="#48493F">千歳茶</font>    |     Senzaicha     | 058  | 043  | 052  | 034  | \#48493F  | <font color="#48493F>■■■</font>  |
|    <font color="#335719">千歳緑</font>    |   Chitosemidori   | 081  | 055  | 010  | 015  | \#335719  | <font color="#335719>■■■</font>  |
|    <font color="#8C6450">煎茶色</font>    |    Sencha-iro     | 000  | 029  | 043  | 045  | \#8C6450  | <font color="#8C6450>■■■</font>  |
|     <font color="#6CBB5A">鮮緑</font>     |     Senryoku      | 060  | 000  | 080  | 008  | \#6CBB5A  | <font color="#6CBB5A>■■■</font>  |
|     <font color="#007655">蒼色</font>     |     Soushoku      | 090  | 000  | 068  | 040  | \#007655  | <font color="#007655>■■■</font>  |
|   <font color="#A16D5D">宗伝唐茶</font>   |   Sodenkaracha    | 000  | 032  | 042  | 037  | \#A16D5D  | <font color="#A16D5D>■■■</font>  |
|   <font color="#F3F47F"">承和色</font>    |     Soga-iro      | 000  | 000  | 047  | 007  | \#F3F47F" | <font color="#F3F47F">■■■</font> |
|     <font color="#FBA027">蘇比</font>     |       Sohi        | 000  | 050  | 090  | 000  | \#FBA027  | <font color="#FBA027>■■■</font>  |
|      <font color="#E0815E">纁</font>      |       Sohi        | 000  | 042  | 058  | 012  | \#E0815E  | <font color="#E0815E>■■■</font>  |
|      <font color="#CA4829">赭</font>      |       Soho        | 000  | 080  | 080  | 020  | \#CA4829  | <font color="#CA4829>■■■</font>  |
|     <font color="#73B8E2">空色</font>     |     Sora-iro      | 060  | 015  | 000  | 000  | \#73B8E2  | <font color="#73B8E2>■■■</font>  |
|   <font color="#B8C8D1"">空色鼠</font>    |    Soraironezu    | 015  | 000  | 000  | 025  | \#B8C8D1" | <font color="#B8C8D1">■■■</font> |
|    <font color="#B36C3C">代赭色</font>    |    Taisha-iro     | 040  | 070  | 085  | 000  | \#B36C3C  | <font color="#B36C3C>■■■</font>  |
|   <font color="#FFDF85"">玉子色</font>    |    Tamago-iro     | 000  | 016  | 060  | 000  | \#FFDF85" | <font color="#FFDF85">■■■</font> |
|    <font color="#F8E58C"">淡黄</font>     |      Tankou       | 000  | 008  | 044  | 003  | \#F8E58C" | <font color="#F8E58C">■■■</font> |
|   <font color="#FADCE9"">淡紅色</font>    |    Tankoushoku    | 000  | 020  | 000  | 000  | \#FADCE9" | <font color="#FADCE9">■■■</font> |
|    <font color="#007D7A">胆礬色</font>    |     Tanba-iro     | 080  | 000  | 040  | 040  | \#007D7A  | <font color="#007D7A>■■■</font>  |
|  <font color="#FFE200"">蒲公英色</font>   |    Tanpopo-iro    | 000  | 010  | 095  | 000  | \#FFE200" | <font color="#FFE200">■■■</font> |
|     <font color="#EE7800">橙色</font>     |    Daidai-iro     | 000  | 050  | 010  | 007  | \#EE7800  | <font color="#EE7800>■■■</font>  |
|   <font color="#9F563A">団十郎茶</font>   |    Danjurocha     | 000  | 046  | 064  | 038  | \#9F563A  | <font color="#9F563A>■■■</font>  |
|    <font color="#3A8FB7">千草色</font>    |    Chigusa-iro    | 083  | 031  | 017  | 000  | \#3A8FB7  | <font color="#3A8FB7>■■■</font>  |
|     <font color="#965042">茶色</font>     |      Cha-iro      | 000  | 047  | 056  | 041  | \#965042  | <font color="#965042>■■■</font>  |
|    <font color="#664032">茶褐色</font>    |    Chakasshoku    | 000  | 037  | 051  | 060  | \#664032  | <font color="#664032>■■■</font>  |
|   <font color="#D88B83"">長春色</font>    |    Chōshun-iro    | 017  | 061  | 046  | 000  | \#D88B83" | <font color="#D88B83">■■■</font> |
|   <font color="#EFCD9A"">丁子色</font>    |     Chōji-iro     | 000  | 014  | 036  | 006  | \#EFCD9A" | <font color="#EFCD9A">■■■</font> |
|    <font color="#DDB87E">丁子染</font>    |     Chojizome     | 005  | 020  | 040  | 008  | \#DDB87E  | <font color="#DDB87E>■■■</font>  |
|    <font color="#B4866B">丁子茶</font>    |     Chojicha      | 000  | 026  | 041  | 029  | \#B4866B  | <font color="#B4866B>■■■</font>  |
|    <font color="#68a5da">鴨頭草</font>    |     Tsukikusa     | 063  | 023  | 000  | 000  | \#68A5DA  | <font color="#68a5da>■■■</font>  |
|    <font color="#E02C87">躑躅色</font>    |    Tutuji-iro     | 000  | 090  | 000  | 005  | \#E02C87  | <font color="#E02C87>■■■</font>  |
|    <font color="#71A4D9">露草色</font>    |   Tsuyukusa-iro   | 060  | 023  | 000  | 000  | \#71A4D9  | <font color="#71A4D9>■■■</font>  |
|   <font color="#455765">鉄御納戸</font>   |    Tetsuonando    | 068  | 042  | 034  | 019  | \#455765  | <font color="#455765>■■■</font>  |
|     <font color="#003149">鉄紺</font>     |     Tetsukon      | 085  | 000  | 000  | 085  | \#003149  | <font color="#003149>■■■</font>  |
|     <font color="#F89264">照柿</font>     |     Terigaki      | 000  | 058  | 065  | 000  | \#F89264  | <font color="#F89264>■■■</font>  |
|     <font color="#F7C114">藤黄</font>     |        Tōō        | 000  | 022  | 092  | 002  | \#F7C114  | <font color="#F7C114>■■■</font>  |
|   <font color="#EEC362">玉蜀黍色</font>   | Toumorokoshi-iro  | 000  | 018  | 059  | 007  | \#EEC362  | <font color="#EEC362>■■■</font>  |
|   <font color="#B88884"">鴇浅葱</font>    |     tokiasagi     | 000  | 026  | 028  | 028  | \#B88884" | <font color="#B88884">■■■</font> |
|   <font color="#F3A696"">朱鷺色</font>    |     Toki-iro      | 004  | 045  | 034  | 000  | \#F3A696" | <font color="#F3A696">■■■</font> |
|    <font color="#F3A696"">鴇色</font>     |      Tokiiro      | 000  | 045  | 034  | 000  | \#F3A696" | <font color="#F3A696">■■■</font> |
| <font color="#E09E87"">ときがら茶</font>  |    Tokigaracha    | 000  | 029  | 040  | 012  | \#E09E87" | <font color="#E09E87">■■■</font> |
|   <font color="#F49E95"">鴇羽色</font>    |    Tokiha-iro     | 000  | 050  | 030  | 000  | \#F49E95" | <font color="#F49E95">■■■</font> |
|    <font color="#007B43">常盤色</font>    |    Tokiwa-iro     | 010  | 000  | 046  | 052  | \#007B43  | <font color="#007B43>■■■</font>  |
|    <font color="#22825D">木賊色</font>    |    Tokusa-iro     | 070  | 000  | 061  | 040  | \#22825D  | <font color="#22825D>■■■</font>  |
|   <font color="#F4DDA5"">砥粉色</font>    |    Tonoko-iro     | 000  | 009  | 032  | 004  | \#F4DDA5" | <font color="#F4DDA5">■■■</font> |
|    <font color="#84a1a8"">殿茶</font>     |      Tonocha      | 030  | 000  | 008  | 040  | \#84A1A8" | <font color="#84a1a8">■■■</font> |
|   <font color="#84a1a8"">沈香茶</font>    |      Tonocha      | 030  | 000  | 008  | 040  | \#84A1A8" | <font color="#84a1a8">■■■</font> |
|     <font color="#9F6F55">礪茶</font>     |      Tonocha      | 000  | 030  | 047  | 038  | \#9F6F55  | <font color="#9F6F55>■■■</font>  |
|     <font color="#7A380F">鳶色</font>     |     Tobi-iro      | 069  | 090  | 010  | 000  | \#7A380F  | <font color="#7A380F>■■■</font>  |
|  <font color="#F8EED1"">鳥の子色</font>   |   Torinoko-iro    | 000  | 005  | 020  | 005  | \#F8EED1" | <font color="#F8EED1">■■■</font> |
|     <font color="#595455">丼鼠</font>     |    Dobunezumi     | 000  | 006  | 004  | 065  | \#595455  | <font color="#595455>■■■</font>  |
|     <font color="#B0CA71">苗色</font>     |      Naeiro       | 013  | 000  | 044  | 021  | \#B0CA71  | <font color="#B0CA71>■■■</font>  |
|   <font color="#EE869A"">中紅花</font>    |    Nakakurenai    | 000  | 060  | 020  | 000  | \#EE869A" | <font color="#EE869A">■■■</font> |
|     <font color="#EB6159">中紅</font>     |     Nakabeni      | 000  | 075  | 056  | 000  | \#EB6159  | <font color="#EB6159>■■■</font>  |
|    <font color="#824880">茄子紺</font>    |      Nasukon      | 000  | 045  | 002  | 049  | \#824880  | <font color="#824880>■■■</font>  |
|   <font color="#DEC031">菜種油色</font>   |  Nataneabura-iro  | 020  | 025  | 090  | 000  | \#DEC031  | <font color="#DEC031>■■■</font>  |
|   <font color="#EEBBCB"">撫子色</font>    |   Nadeshiko-iro   | 000  | 021  | 015  | 007  | \#EEBBCB" | <font color="#EEBBCB">■■■</font> |
|  <font color="#FCD900"">菜の花色</font>   |   Nanohana-iro    | 005  | 015  | 010  | 000  | \#FCD900" | <font color="#FCD900">■■■</font> |
|    <font color="#AA8C63">生壁色</font>    |   Namakabe-iro    | 040  | 055  | 075  | 000  | \#AA8C63  | <font color="#AA8C63>■■■</font>  |
|     <font color="#7B7C7D">鉛色</font>     |    Namari-iro     | 002  | 001  | 000  | 051  | \#7B7C7D  | <font color="#7B7C7D>■■■</font>  |
|    <font color="#008899">納戸色</font>    |     Nando-iro     | 010  | 011  | 000  | 040  | \#008899  | <font color="#008899>■■■</font>  |
|     <font color="#E45E32">丹色</font>     |      Ni-iro       | 000  | 059  | 078  | 011  | \#E45E32  | <font color="#E45E32>■■■</font>  |
|     <font color="#513743">似紫</font>     |   Nisemurasaki    | 000  | 032  | 017  | 068  | \#513743  | <font color="#513743>■■■</font>  |
|     <font color="#727171">鈍色</font>     |     Nibi-iro      | 000  | 001  | 001  | 055  | \#727171  | <font color="#727171>■■■</font>  |
|    <font color="#000B00">濡羽色</font>    |    Nureba-iro     | 010  | 000  | 010  | 096  | \#000B00  | <font color="#000B00>■■■</font>  |
|    <font color="#908E65">根岸色</font>    |    Negishi-iro    | 004  | 000  | 040  | 055  | \#908E65  | <font color="#908E65>■■■</font>  |
|     <font color="#7D7D7D">鼠色</font>     |    Nezumi-iro     | 000  | 000  | 000  | 065  | \#7D7D7D  | <font color="#7D7D7D>■■■</font>  |
|   <font color="#175B66">熨斗目色</font>   |    Noshime-iro    | 091  | 064  | 060  | 000  | \#175B66  | <font color="#175B66>■■■</font>  |
|  <font color="#426579">熨斗目花色</font>  |  Noshime-hanairo  | 045  | 017  | 000  | 053  | \#426579  | <font color="#426579>■■■</font>  |
|    <font color="#9F9D9A"">灰色</font>     |      Hai-iro      | 000  | 003  | 005  | 050  | \#9F9D9A" | <font color="#9F9D9A">■■■</font> |
|    <font color="#E8D3D1"">灰桜</font>     |     Haizakura     | 000  | 009  | 010  | 009  | \#E8D3D1" | <font color="#E8D3D1">■■■</font> |
|     <font color="#98623C">灰茶</font>     |      Haicha       | 000  | 036  | 061  | 040  | \#98623C  | <font color="#98623C>■■■</font>  |
|   <font color="#D3DBE2"">白銅色</font>    |    Hakudou-iro    | 010  | 003  | 000  | 015  | \#D3DBE2" | <font color="#D3DBE2">■■■</font> |
|    <font color="#A69ABD"">半色</font>     |    Hashita-iro    | 012  | 019  | 000  | 026  | \#A69ABD" | <font color="#A69ABD">■■■</font> |
|     <font color="#D9A62E">櫨染</font>     |     Hajizome      | 000  | 024  | 079  | 015  | \#D9A62E  | <font color="#D9A62E>■■■</font>  |
|   <font color="#95859C"">鳩羽色</font>    |    Hatoba-iro     | 004  | 015  | 000  | 039  | \#95859C" | <font color="#95859C">■■■</font> |
|   <font color="#9E8B8E"">鳩羽鼠</font>    |   Hatobanezumi    | 000  | 012  | 010  | 038  | \#9E8B8E" | <font color="#9E8B8E">■■■</font> |
|    <font color="#1E88A8">花浅葱</font>    |     Hanaasagi     | 090  | 032  | 023  | 000  | \#1E88A8  | <font color="#1E88A8>■■■</font>  |
|     <font color="#0086AD">花色</font>     |     Hana-iro      | 082  | 039  | 026  | 000  | \#0086AD  | <font color="#0086AD>■■■</font>  |
|    <font color="#062C54">花紺青</font>    |    Hanakonjou     | 090  | 065  | 000  | 048  | \#062C54  | <font color="#062C54>■■■</font>  |
|     <font color="#0086AD">縹色</font>     |    Hanada-iro     | 082  | 039  | 026  | 000  | \#0086AD  | <font color="#0086AD>■■■</font>  |
|   <font color="#FBD26B"">花葉色</font>    |    Hanaba-iro     | 000  | 016  | 057  | 002  | \#FBD26B" | <font color="#FBD26B">■■■</font> |
|    <font color="#008D56">花萌葱</font>    |     Hanamoegi     | 090  | 000  | 079  | 020  | \#008D56  | <font color="#008D56>■■■</font>  |
|    <font color="#5AB5B2">花緑青</font>    |    Hanarokusho    | 060  | 000  | 030  | 010  | \#5AB5B2  | <font color="#5AB5B2>■■■</font>  |
|     <font color="#F4A57A">朱華</font>     |      Hanezu       | 000  | 045  | 050  | 000  | \#F4A57A  | <font color="#F4A57A>■■■</font>  |
|     <font color="#79520B">榛摺</font>     |     Harizuri      | 000  | 040  | 080  | 065  | \#79520B  | <font color="#79520B>■■■</font>  |
|    <font color="#AAA751">梅幸茶</font>    |     Baikoucha     | 045  | 031  | 082  | 000  | \#AAA751  | <font color="#AAA751>■■■</font>  |
|    <font color="#E73275">薔薇色</font>    |     Bara-iro      | 000  | 090  | 023  | 000  | \#E73275  | <font color="#E73275>■■■</font>  |
|   <font color="#897858">肥後煤竹</font>   |   Higosusutake    | 000  | 012  | 036  | 046  | \#897858  | <font color="#897858>■■■</font>  |
|    <font color="#abced8"">秘色</font>     |      Hisoku       | 038  | 011  | 015  | 000  | \#ABCED8" | <font color="#abced8">■■■</font> |
|    <font color="#7B4334">檜皮色</font>    |    Hihada-iro     | 000  | 060  | 060  | 050  | \#7B4334  | <font color="#7B4334>■■■</font>  |
|     <font color="#D6D000">鶸色</font>     |     Hiwa-iro      | 015  | 000  | 010  | 015  | \#D6D000  | <font color="#D6D000>■■■</font>  |
|     <font color="#8C8861">鶸茶</font>     |      Hiwacha      | 000  | 003  | 031  | 045  | \#8C8861  | <font color="#8C8861>■■■</font>  |
|    <font color="#82AE46">鶸萌黄</font>    |     Hiwamoegi     | 025  | 000  | 060  | 032  | \#82AE46  | <font color="#82AE46>■■■</font>  |
|    <font color="#83CCD2"">白群</font>     |     Byakugun      | 038  | 003  | 000  | 018  | \#83CCD2" | <font color="#83CCD2">■■■</font> |
|    <font color="#DAEAD0"">白緑</font>     |     byakuroku     | 020  | 000  | 025  | 000  | \#DAEAD0" | <font color="#DAEAD0">■■■</font> |
|    <font color="#00451E">天鵞絨</font>    |      veludo       | 080  | 000  | 080  | 075  | \#00451E  | <font color="#00451E>■■■</font>  |
|    <font color="#AE7C4F">枇杷茶</font>    |      Biwacha      | 000  | 029  | 055  | 032  | \#AE7C4F  | <font color="#AE7C4F>■■■</font>  |
|   <font color="#00081A">檳榔子黒</font>   |   Binroujiguro    | 050  | 013  | 000  | 010  | \#00081A  | <font color="#00081A>■■■</font>  |
|   <font color="#433D3C">檳榔子染</font>   |   Binroujizome    | 000  | 009  | 010  | 074  | \#433D3C  | <font color="#433D3C>■■■</font>  |
|     <font color="#004150">深藍</font>     |      Fukaai       | 010  | 000  | 025  | 075  | \#004150  | <font color="#004150>■■■</font>  |
|   <font color="#85A1A0"">深川鼠</font>    |  Fukagawanezumi   | 030  | 000  | 015  | 040  | \#85A1A0" | <font color="#85A1A0">■■■</font> |
|    <font color="#006A66">深藍色</font>    |    fukakiaiiro    | 090  | 000  | 045  | 050  | \#006A66  | <font color="#006A66>■■■</font>  |
|     <font color="#004025">深緑</font>     |    Fukamidori     | 010  | 000  | 075  | 075  | \#004025  | <font color="#004025>■■■</font>  |
|     <font color="#998C78">柴色</font>     |     Fushi-iro     | ---  | ---  | ---  | ---  | \#998C78  | <font color="#998C78>■■■</font>  |
|     <font color="#B28C6E">柴染</font>     |     Fushizome     | 000  | 021  | 038  | 030  | \#B28C6E  | <font color="#B28C6E>■■■</font>  |
|    <font color="#BAA7CC"">藤色</font>     |     Fuji-iro      | 032  | 037  | 006  | 000  | \#BAA7CC" | <font color="#BAA7CC">■■■</font> |
|    <font color="#5A5359">藤煤竹</font>    |   Fujisusutake    | 000  | 008  | 001  | 065  | \#5A5359  | <font color="#5A5359>■■■</font>  |
|    <font color="#606DA1">藤納戸</font>    |     Fujinando     | 060  | 045  | 000  | 025  | \#606DA1  | <font color="#606DA1>■■■</font>  |
|     <font color="#6E75A4">藤鼠</font>     |    Fujinezumi     | 069  | 056  | 017  | 000  | \#6E75A4  | <font color="#6E75A4>■■■</font>  |
|    <font color="#8F82BC"">藤紫</font>     |   Fujimurasaki    | 050  | 050  | 000  | 000  | \#8F82BC" | <font color="#8F82BC">■■■</font> |
|    <font color="#888ABC"">二藍</font>     |      Futaai       | 058  | 050  | 000  | 000  | \#888ABC" | <font color="#888ABC">■■■</font> |
|    <font color="#583B55">二人静</font>    |   Futarishizuka   | 025  | 050  | 000  | 070  | \#583B55  | <font color="#583B55>■■■</font>  |
|    <font color="#705B67">葡萄鼠</font>    |    BudouNezumi    | 000  | 019  | 008  | 056  | \#705B67  | <font color="#705B67>■■■</font>  |
|     <font color="#007F89">碧色</font>     |     Hekishoku     | 090  | 000  | 034  | 035  | \#007F89  | <font color="#007F89>■■■</font>  |
|     <font color="#E5004F">紅赤</font>     |      Beniaka      | 000  | 010  | 050  | 000  | \#E5004F  | <font color="#E5004F>■■■</font>  |
|     <font color="#C41A41">紅色</font>     |     Beni-iro      | 010  | 010  | 053  | 010  | \#C41A41  | <font color="#C41A41>■■■</font>  |
|    <font color="#CB8347">紅鬱金</font>    |     Beniukon      | 000  | 035  | 065  | 020  | \#CB8347  | <font color="#CB8347>■■■</font>  |
|  <font color="#8491C3"">紅掛空色</font>   |  Benikakesorairo  | 032  | 026  | 000  | 024  | \#8491C3" | <font color="#8491C3">■■■</font> |
|   <font color="#68699B">紅掛花色</font>   |  Benikakehanairo  | 033  | 032  | 000  | 039  | \#68699B  | <font color="#68699B>■■■</font>  |
|     <font color="#B63D1B">紅樺</font>     |     Benikaba      | 038  | 090  | 095  | 000  | \#B63D1B  | <font color="#B63D1B>■■■</font>  |
|    <font color="#9C308D">紅桔梗</font>    |    Benikikyou     | 045  | 090  | 000  | 000  | \#9C308D  | <font color="#9C308D>■■■</font>  |
|    <font color="#524748">紅消鼠</font>    |  Benikeshinezumi  | 000  | 013  | 012  | 068  | \#524748  | <font color="#524748>■■■</font>  |
|    <font color="#CC5229">紅柑子</font>    |     Benikouji     | 013  | 080  | 095  | 002  | \#CC5229  | <font color="#CC5229>■■■</font>  |
|     <font color="#D23F40">紅唐</font>     |      Benitou      | 000  | 085  | 064  | 015  | \#D23F40  | <font color="#D23F40>■■■</font>  |
|     <font color="#9A493F">紅鳶</font>     |     Benitobi      | 000  | 053  | 059  | 040  | \#9A493F  | <font color="#9A493F>■■■</font>  |
|     <font color="#A06F70">紅鼠</font>     |     Beninezu      | 037  | 056  | 056  | 000  | \#A06F70  | <font color="#A06F70>■■■</font>  |
|     <font color="#F83929">紅緋</font>     |      Benihi       | 000  | 075  | 082  | 009  | \#F83929  | <font color="#F83929>■■■</font>  |
|    <font color="#7B4741">紅檜皮</font>    |    Benihihada     | 000  | 042  | 047  | 052  | \#7B4741  | <font color="#7B4741>■■■</font>  |
|    <font color="#C9396D">紅鶸色</font>    |   Benihiwa-iro    | 000  | 080  | 021  | 000  | \#C9396D  | <font color="#C9396D>■■■</font>  |
|    <font color="#CCA6BF"">紅藤</font>     |     Benifuji      | 019  | 050  | 000  | 000  | \#CCA6BF" | <font color="#CCA6BF">■■■</font> |
|    <font color="#8491C3"">紅碧</font>     |    Benimidori     | 032  | 026  | 000  | 024  | \#8491C3" | <font color="#8491C3">■■■</font> |
|    <font color="#AA562E">紅柄色</font>    |    Bengara-iro    | 045  | 080  | 090  | 000  | \#AA562E  | <font color="#AA562E>■■■</font>  |
|    <font color="#8F2E14">弁柄色</font>    |    Bengara-iro    | 000  | 068  | 086  | 044  | \#8F2E14  | <font color="#8F2E14>■■■</font>  |
|    <font color="#E761A4">牡丹色</font>    |       Botan       | 012  | 075  | 004  | 000  | \#E761A4  | <font color="#E761A4>■■■</font>  |
|    <font color="#5B7E91">舛花色</font>    |   Masuhana-iro    | 037  | 013  | 000  | 043  | \#5B7E91  | <font color="#5B7E91>■■■</font>  |
|    <font color="#3F7735">松葉色</font>    |     Sensaicha     | 060  | 000  | 080  | 050  | \#3F7735  | <font color="#3F7735>■■■</font>  |
|    <font color="#F08300">蜜柑色</font>    |     Mikan-iro     | 000  | 045  | 010  | 006  | \#F08300  | <font color="#F08300>■■■</font>  |
|   <font color="#8CD2BC"">水浅葱</font>    |     Mizuasagi     | 045  | 000  | 020  | 000  | \#8CD2BC" | <font color="#8CD2BC">■■■</font> |
|     <font color="#7FCCE3">水色</font>     |     Mizu-iro      | 055  | 000  | 010  | 000  | \#7FCCE3  | <font color="#7FCCE3>■■■</font>  |
|     <font color="#B56C60">水柿</font>     |     Mizugaki      | 036  | 067  | 059  | 000  | \#B56C60  | <font color="#B56C60>■■■</font>  |
|    <font color="#6C9BD2">み空色</font>    |    Misora-iro     | 060  | 030  | 000  | 000  | \#6C9BD2  | <font color="#6C9BD2>■■■</font>  |
|      <font color="#3EB370">緑</font>      |      Midori       | 065  | 000  | 037  | 030  | \#3EB370  | <font color="#3EB370>■■■</font>  |
|     <font color="#77969A">湊鼠</font>     |   Minatonezumi    | 063  | 038  | 040  | 000  | \#77969A  | <font color="#77969A>■■■</font>  |
|     <font color="#7EC7D8">水縹</font>     |     Mihanada      | 050  | 000  | 013  | 005  | \#7EC7D8  | <font color="#7EC7D8>■■■</font>  |
|    <font color="#596327">海松色</font>    |     Miru-iro      | 026  | 000  | 070  | 070  | \#596327  | <font color="#596327>■■■</font>  |
|    <font color="#57543D">海松茶</font>    |      Mirucha      | 052  | 040  | 059  | 029  | \#57543D  | <font color="#57543D>■■■</font>  |
|    <font color="#E3C576">麦藁色</font>    |   Mugiwara-iro    | 000  | 017  | 055  | 015  | \#E3C576  | <font color="#E3C576>■■■</font>  |
|     <font color="#20604F">虫襖</font>     |      Mushiao      | 090  | 063  | 066  | 030  | \#20604F  | <font color="#20604F>■■■</font>  |
|   <font color="#EFEACC"">蒸栗色</font>    |   Mushikuri-iro   | 000  | 002  | 020  | 010  | \#EFEACC" | <font color="#EFEACC">■■■</font> |
|      <font color="#884898">紫</font>      |     Murasaki      | 011  | 053  | 000  | 040  | \#884898  | <font color="#884898>■■■</font>  |
|    <font color="#90326D">紫式部</font>    |  Murasakishikibu  | 020  | 080  | 000  | 040  | \#90326D  | <font color="#90326D>■■■</font>  |
|     <font color="#5F414B">紫鳶</font>     |   murasakitobi    | 000  | 032  | 021  | 063  | \#5F414B  | <font color="#5F414B>■■■</font>  |
|     <font color="#594255">滅紫</font>     |      Messhi       | 000  | 026  | 004  | 065  | \#594255  | <font color="#594255>■■■</font>  |
|    <font color="#A7BD00">萌木色</font>    |     Moegi-iro     | 040  | 000  | 010  | 015  | \#A7BD00  | <font color="#A7BD00>■■■</font>  |
|    <font color="#006D4D">萌葱色</font>    |     Moegi-iro     | 080  | 000  | 065  | 050  | \#006D4D  | <font color="#006D4D>■■■</font>  |
|    <font color="#86B81B">萌黄色</font>    |     Moegi-iro     | 050  | 000  | 010  | 010  | \#86B81B  | <font color="#86B81B>■■■</font>  |
|     <font color="#C7B370">木蘭</font>     |      Mokuran      | 000  | 010  | 044  | 022  | \#C7B370  | <font color="#C7B370>■■■</font>  |
|    <font color="#F58F98"">桃色</font>     |     Momo-iro      | 000  | 055  | 025  | 000  | \#F58F98" | <font color="#F58F98">■■■</font> |
|    <font color="#724938">百塩茶</font>    |    Momoshiocha    | 061  | 070  | 068  | 025  | \#724938  | <font color="#724938>■■■</font>  |
|   <font color="#F9AEA5"">桃花色</font>    |   Momohana-iro    | 000  | 045  | 030  | 000  | \#F9AEA5" | <font color="#F9AEA5">■■■</font> |
|    <font color="#4A593D">柳煤竹</font>    |  Yanagisusutake   | 076  | 057  | 070  | 017  | \#4A593D  | <font color="#4A593D>■■■</font>  |
|    <font color="#93B881"">柳染</font>     |    Yanagisome     | 020  | 000  | 030  | 028  | \#93B881" | <font color="#93B881">■■■</font> |
|     <font color="#A3A86C">柳茶</font>     |     Yanagicha     | 013  | 000  | 050  | 040  | \#A3A86C  | <font color="#A3A86C>■■■</font>  |
|    <font color="#C8D5BB"">柳鼠</font>     |   Yanaginezumi    | 006  | 000  | 012  | 016  | \#C8D5BB" | <font color="#C8D5BB">■■■</font> |
|    <font color="#EFAE7C">大和柿</font>    |    Yamatogaki     | 000  | 038  | 050  | 005  | \#EFAE7C  | <font color="#EFAE7C>■■■</font>  |
|    <font color="#767C6B">山鳩色</font>    |   Yamabato-iro    | 005  | 000  | 014  | 051  | \#767C6B  | <font color="#767C6B>■■■</font>  |
|    <font color="#F8B400">山吹色</font>    |   Yamabuki-iro    | 000  | 036  | 095  | 000  | \#F8B400  | <font color="#F8B400>■■■</font>  |
|    <font color="#C89932">山吹茶</font>    |    Yamabukicha    | 000  | 024  | 075  | 022  | \#C89932  | <font color="#C89932>■■■</font>  |
|    <font color="#C6A35B">楊梅色</font>    |   yamamomo-iro    | 000  | 023  | 060  | 030  | \#C6A35B  | <font color="#C6A35B>■■■</font>  |
|     <font color="#EE9D19">雄黄</font>     |       Yuuou       | 000  | 045  | 090  | 005  | \#EE9D19  | <font color="#EE9D19>■■■</font>  |
|    <font color="#006543">柚葉色</font>    |    Yuzuha-iro     | 080  | 000  | 068  | 055  | \#006543  | <font color="#006543>■■■</font>  |
|    <font color="#FCD4D5"">聴色</font>     |    Yurushi-iro    | 000  | 025  | 010  | 000  | \#FCD4D5" | <font color="#FCD4D5">■■■</font> |
|    <font color="#6D3C14">羊羹色</font>    |    Youkan-iro     | 000  | 053  | 070  | 070  | \#6D3C14  | <font color="#6D3C14>■■■</font>  |
|    <font color="#DA003D">洋紅色</font>    |    Youkoushoku    | 000  | 010  | 063  | 008  | \#DA003D  | <font color="#DA003D>■■■</font>  |
|    <font color="#43341B">吉岡染</font>    |   Yoshiokazome    | 076  | 071  | 073  | 047  | \#43341B  | <font color="#43341B>■■■</font>  |
|    <font color="#BF794E">駱駝色</font>    |    Rakuda-iro     | 000  | 037  | 059  | 025  | \#BF794E  | <font color="#BF794E>■■■</font>  |
|     <font color="#D19826">蘭茶</font>     |      Rancha       | 017  | 044  | 089  | 000  | \#D19826  | <font color="#D19826>■■■</font>  |
|    <font color="#6A5D21">璃寛茶</font>    |     Rikancha      | 000  | 012  | 069  | 058  | \#6A5D21  | <font color="#6A5D21>■■■</font>  |
|  <font color="#E6E3C5"">利休白茶</font>   |   Rikyūshiracha   | 000  | 001  | 020  | 015  | \#E6E3C5" | <font color="#E6E3C5">■■■</font> |
|    <font color="#897845">利休茶</font>    |     Rikyūcha      | 010  | 018  | 050  | 040  | \#897845  | <font color="#897845>■■■</font>  |
|     <font color="#7BAA17">柳緑</font>     |     Ryuuryoku     | 050  | 000  | 010  | 020  | \#7BAA17  | <font color="#7BAA17>■■■</font>  |
|    <font color="#6967AB">竜胆色</font>    |    Rindou-iro     | 069  | 096  | 009  | 000  | \#6967AB  | <font color="#6967AB>■■■</font>  |
|    <font color="#004898">瑠璃色</font>    |     Ruri-iro      | 010  | 070  | 000  | 010  | \#004898  | <font color="#004898>■■■</font>  |
|    <font color="#224B8F">瑠璃紺</font>    |      Rurikon      | 089  | 054  | 011  | 003  | \#224B8F  | <font color="#224B8F>■■■</font>  |
|   <font color="#ECDF2B"">檸檬色</font>    |     Remon-iro     | 007  | 013  | 083  | 000  | \#ECDF2B" | <font color="#ECDF2B">■■■</font> |
|    <font color="#AA5C3F">煉瓦色</font>    |     Renga-iro     | 000  | 060  | 060  | 040  | \#AA5C3F  | <font color="#AA5C3F>■■■</font>  |
|     <font color="#0c0c0c">呂色</font>     |       Roiro       | 000  | 000  | 000  | 010  | \#0C0C0C  | <font color="#0c0c0c>■■■</font>  |
|     <font color="#5BAD92">緑青</font>     |      Rokusho      | 060  | 000  | 045  | 015  | \#5BAD92  | <font color="#5BAD92>■■■</font>  |
|    <font color="#927A30">路考茶</font>    |      Rokōcha      | 000  | 020  | 070  | 055  | \#927A30  | <font color="#927A30>■■■</font>  |
|    <font color="#ABC900">若草色</font>    |   Wakakusa-iro    | 038  | 000  | 010  | 005  | \#ABC900  | <font color="#ABC900>■■■</font>  |
|    <font color="#7CC28E">若竹色</font>    |   Wakatake-iro    | 060  | 000  | 060  | 000  | \#7CC28E  | <font color="#7CC28E>■■■</font>  |
|    <font color="#CCDE68">若菜色</font>    |    Wakana-iro     | 026  | 000  | 070  | 000  | \#CCDE68  | <font color="#CCDE68>■■■</font>  |
|    <font color="#C7DC68">若苗色</font>    |    Wakanae-iro    | 010  | 000  | 053  | 014  | \#C7DC68  | <font color="#C7DC68>■■■</font>  |
|    <font color="#A4CA68">若葉色</font>    |    Wakaba-iro     | 040  | 000  | 070  | 005  | \#A4CA68  | <font color="#A4CA68>■■■</font>  |
|    <font color="#A5CD89"">若緑</font>     |    Wakamidori     | 039  | 000  | 055  | 005  | \#A5CD89" | <font color="#A5CD89">■■■</font> |
|    <font color="#BE84B8"">若紫</font>     |   Wakamurasaki    | 028  | 055  | 000  | 000  | \#BE84B8" | <font color="#BE84B8">■■■</font> |
|   <font color="#E8EC98"">若芽色</font>    |    Wakame-iro     | 013  | 000  | 050  | 000  | \#E8EC98" | <font color="#E8EC98">■■■</font> |
|   <font color="#8EC298"">山葵色</font>    |    Wasabi-iro     | 045  | 000  | 045  | 010  | \#8EC298" | <font color="#8EC298">■■■</font> |
|   <font color="#9CC5E6"">勿忘草</font>    |   Wasurenagusa    | 040  | 010  | 000  | 005  | \#9CC5E6" | <font color="#9CC5E6">■■■</font> |

## chinaz
Colors from [tool.chinaz.com](http://tool.chinaz.com/tools/cj) :
|                  Name                   | Roma |  C   |  M   |  Y   |  K   |   RGB    |              View               |
| :-------------------------------------: | :--: | :--: | :--: | :--: | :--: | :------: | :-----------------------------: |
|   <font color="#895B8A">古代紫</font>   | ---  | ---  | ---  | ---  | ---  | \#895B8A | <font color="#895B8A>■■■</font> |
|   <font color="#824880">茄子紺</font>   | ---  | ---  | ---  | ---  | ---  | \#824880 | <font color="#824880>■■■</font> |
|    <font color="#915C8B">二藍</font>    | ---  | ---  | ---  | ---  | ---  | \#915C8B | <font color="#915C8B>■■■</font> |
|    <font color="#9D5B8B">京紫</font>    | ---  | ---  | ---  | ---  | ---  | \#9D5B8B | <font color="#9D5B8B>■■■</font> |
|    <font color="#7A4171">蒲葡</font>    | ---  | ---  | ---  | ---  | ---  | \#7A4171 | <font color="#7A4171>■■■</font> |
|    <font color="#BC64A4">若紫</font>    | ---  | ---  | ---  | ---  | ---  | \#BC64A4 | <font color="#BC64A4>■■■</font> |
|    <font color="#B44C97">紅紫</font>    | ---  | ---  | ---  | ---  | ---  | \#B44C97 | <font color="#B44C97>■■■</font> |
|    <font color="#AA4C8F">梅紫</font>    | ---  | ---  | ---  | ---  | ---  | \#AA4C8F | <font color="#AA4C8F>■■■</font> |
|   <font color="#CC7EB1">菖蒲色</font>   | ---  | ---  | ---  | ---  | ---  | \#CC7EB1 | <font color="#CC7EB1>■■■</font> |
|   <font color="#CCA6BF">紅藤色</font>   | ---  | ---  | ---  | ---  | ---  | \#CCA6BF | <font color="#CCA6BF>■■■</font> |
|    <font color="#C4A3BF">浅紫</font>    | ---  | ---  | ---  | ---  | ---  | \#C4A3BF | <font color="#C4A3BF>■■■</font> |
|   <font color="#E7E7EB">紫水晶</font>   | ---  | ---  | ---  | ---  | ---  | \#E7E7EB | <font color="#E7E7EB>■■■</font> |
|   <font color="#DCD6D9">薄梅鼠</font>   | ---  | ---  | ---  | ---  | ---  | \#DCD6D9 | <font color="#DCD6D9>■■■</font> |
|    <font color="#D3CFD9">暁鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#D3CFD9 | <font color="#D3CFD9>■■■</font> |
|   <font color="#D3CCD6">牡丹鼠</font>   | ---  | ---  | ---  | ---  | ---  | \#D3CCD6 | <font color="#D3CCD6>■■■</font> |
|    <font color="#C8C2C6">霞色</font>    | ---  | ---  | ---  | ---  | ---  | \#C8C2C6 | <font color="#C8C2C6>■■■</font> |
|    <font color="#A6A5C4">藤鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#A6A5C4 | <font color="#A6A5C4>■■■</font> |
|    <font color="#A69ABD">半色</font>    | ---  | ---  | ---  | ---  | ---  | \#A69ABD | <font color="#A69ABD>■■■</font> |
|    <font color="#A89DAC">薄色</font>    | ---  | ---  | ---  | ---  | ---  | \#A89DAC | <font color="#A89DAC>■■■</font> |
|    <font color="#9790A4">薄鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#9790A4 | <font color="#9790A4>■■■</font> |
|   <font color="#9E8B8E">鳩羽鼠</font>   | ---  | ---  | ---  | ---  | ---  | \#9E8B8E | <font color="#9E8B8E>■■■</font> |
|   <font color="#95859C">鳩羽色</font>   | ---  | ---  | ---  | ---  | ---  | \#95859C | <font color="#95859C>■■■</font> |
|   <font color="#95949A">桔梗鼠</font>   | ---  | ---  | ---  | ---  | ---  | \#95949A | <font color="#95949A>■■■</font> |
|    <font color="#71686C">紫鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#71686C | <font color="#71686C>■■■</font> |
|   <font color="#705B67">葡萄鼠</font>   | ---  | ---  | ---  | ---  | ---  | \#705B67 | <font color="#705B67>■■■</font> |
|    <font color="#634950">濃色</font>    | ---  | ---  | ---  | ---  | ---  | \#634950 | <font color="#634950>■■■</font> |
|    <font color="#5F414B">紫鳶</font>    | ---  | ---  | ---  | ---  | ---  | \#5F414B | <font color="#5F414B>■■■</font> |
|    <font color="#4F455C">濃鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#4F455C | <font color="#4F455C>■■■</font> |
|   <font color="#5A5359">藤煤竹</font>   | ---  | ---  | ---  | ---  | ---  | \#5A5359 | <font color="#5A5359>■■■</font> |
|    <font color="#594255">滅紫</font>    | ---  | ---  | ---  | ---  | ---  | \#594255 | <font color="#594255>■■■</font> |
|   <font color="#524748">紅消鼠</font>   | ---  | ---  | ---  | ---  | ---  | \#524748 | <font color="#524748>■■■</font> |
|   <font color="#513743">似せ紫</font>   | ---  | ---  | ---  | ---  | ---  | \#513743 | <font color="#513743>■■■</font> |
|   <font color="#E6EAE3">灰黄緑</font>   | ---  | ---  | ---  | ---  | ---  | \#E6EAE3 | <font color="#E6EAE3>■■■</font> |
|  <font color="#D4DCD6">蕎麦切色</font>  | ---  | ---  | ---  | ---  | ---  | \#D4DCD6 | <font color="#D4DCD6>■■■</font> |
|   <font color="#D4DCDA">薄雲鼠</font>   | ---  | ---  | ---  | ---  | ---  | \#D4DCDA | <font color="#D4DCDA>■■■</font> |
|   <font color="#D3CBC6">枯野色</font>   | ---  | ---  | ---  | ---  | ---  | \#D3CBC6 | <font color="#D3CBC6>■■■</font> |
|    <font color="#C8C2BE">潤色</font>    | ---  | ---  | ---  | ---  | ---  | \#C8C2BE | <font color="#C8C2BE>■■■</font> |
|  <font color="#B3ADA0">利休白茶</font>  | ---  | ---  | ---  | ---  | ---  | \#B3ADA0 | <font color="#B3ADA0>■■■</font> |
|    <font color="#A99E93">茶鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#A99E93 | <font color="#A99E93>■■■</font> |
|   <font color="#A58F86">胡桃染</font>   | ---  | ---  | ---  | ---  | ---  | \#A58F86 | <font color="#A58F86>■■■</font> |
|   <font color="#928178">江戸鼠</font>   | ---  | ---  | ---  | ---  | ---  | \#928178 | <font color="#928178>■■■</font> |
|    <font color="#887F7A">煤色</font>    | ---  | ---  | ---  | ---  | ---  | \#887F7A | <font color="#887F7A>■■■</font> |
|   <font color="#B4866B">丁子茶</font>   | ---  | ---  | ---  | ---  | ---  | \#B4866B | <font color="#B4866B>■■■</font> |
|    <font color="#B28C6E">柴染</font>    | ---  | ---  | ---  | ---  | ---  | \#B28C6E | <font color="#B28C6E>■■■</font> |
|  <font color="#A16D5D">宗伝唐茶</font>  | ---  | ---  | ---  | ---  | ---  | \#A16D5D | <font color="#A16D5D>■■■</font> |
|    <font color="#9F6F55">砺茶</font>    | ---  | ---  | ---  | ---  | ---  | \#9F6F55 | <font color="#9F6F55>■■■</font> |
|   <font color="#8C6450">煎茶色</font>   | ---  | ---  | ---  | ---  | ---  | \#8C6450 | <font color="#8C6450>■■■</font> |
|   <font color="#856859">銀煤竹</font>   | ---  | ---  | ---  | ---  | ---  | \#856859 | <font color="#856859>■■■</font> |
|   <font color="#765C47">黄枯茶</font>   | ---  | ---  | ---  | ---  | ---  | \#765C47 | <font color="#765C47>■■■</font> |
|   <font color="#6F514C">煤竹色</font>   | ---  | ---  | ---  | ---  | ---  | \#6F514C | <font color="#6F514C>■■■</font> |
|    <font color="#6F4B3E">焦茶</font>    | ---  | ---  | ---  | ---  | ---  | \#6F4B3E | <font color="#6F4B3E>■■■</font> |
|    <font color="#544A47">黒橡</font>    | ---  | ---  | ---  | ---  | ---  | \#544A47 | <font color="#544A47>■■■</font> |
|   <font color="#543F32">憲法色</font>   | ---  | ---  | ---  | ---  | ---  | \#543F32 | <font color="#543F32>■■■</font> |
|    <font color="#554738">涅色</font>    | ---  | ---  | ---  | ---  | ---  | \#554738 | <font color="#554738>■■■</font> |
|  <font color="#433D3C">檳榔子染</font>  | ---  | ---  | ---  | ---  | ---  | \#433D3C | <font color="#433D3C>■■■</font> |
|    <font color="#432F2F">黒鳶</font>    | ---  | ---  | ---  | ---  | ---  | \#432F2F | <font color="#432F2F>■■■</font> |
|    <font color="#3F312B">赤墨</font>    | ---  | ---  | ---  | ---  | ---  | \#3F312B | <font color="#3F312B>■■■</font> |
|    <font color="#302833">黒紅</font>    | ---  | ---  | ---  | ---  | ---  | \#302833 | <font color="#302833>■■■</font> |
|     <font color="#FFFFFF">白</font>     | ---  | ---  | ---  | ---  | ---  | \#FFFFFF | <font color="#FFFFFF>■■■</font> |
|   <font color="#FFFFFC">胡粉色</font>   | ---  | ---  | ---  | ---  | ---  | \#FFFFFC | <font color="#FFFFFC>■■■</font> |
|  <font color="#F7FCFE">卯の花色</font>  | ---  | ---  | ---  | ---  | ---  | \#F7FCFE | <font color="#F7FCFE>■■■</font> |
|    <font color="#F8FBF8">白磁</font>    | ---  | ---  | ---  | ---  | ---  | \#F8FBF8 | <font color="#F8FBF8>■■■</font> |
|  <font color="#FBFAF5">生成り色</font>  | ---  | ---  | ---  | ---  | ---  | \#FBFAF5 | <font color="#FBFAF5>■■■</font> |
|   <font color="#F3F3F3">乳白色</font>   | ---  | ---  | ---  | ---  | ---  | \#F3F3F3 | <font color="#F3F3F3>■■■</font> |
|    <font color="#F3F3F2">白練</font>    | ---  | ---  | ---  | ---  | ---  | \#F3F3F2 | <font color="#F3F3F2>■■■</font> |
|    <font color="#EAE5E3">素色</font>    | ---  | ---  | ---  | ---  | ---  | \#EAE5E3 | <font color="#EAE5E3>■■■</font> |
|   <font color="#E5E4E6">白梅鼠</font>   | ---  | ---  | ---  | ---  | ---  | \#E5E4E6 | <font color="#E5E4E6>■■■</font> |
|    <font color="#DCDDDD">白鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#DCDDDD | <font color="#DCDDDD>■■■</font> |
|    <font color="#DDDCD6">絹鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#DDDCD6 | <font color="#DDDCD6>■■■</font> |
|    <font color="#C0C6C9">灰青</font>    | ---  | ---  | ---  | ---  | ---  | \#C0C6C9 | <font color="#C0C6C9>■■■</font> |
|    <font color="#AFAFB0">銀鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#AFAFB0 | <font color="#AFAFB0>■■■</font> |
|    <font color="#ADADAD">薄鈍</font>    | ---  | ---  | ---  | ---  | ---  | \#ADADAD | <font color="#ADADAD>■■■</font> |
|   <font color="#A3A3A2">薄墨色</font>   | ---  | ---  | ---  | ---  | ---  | \#A3A3A2 | <font color="#A3A3A2>■■■</font> |
|    <font color="#9EA1A3">錫色</font>    | ---  | ---  | ---  | ---  | ---  | \#9EA1A3 | <font color="#9EA1A3>■■■</font> |
|    <font color="#9FA0A0">素鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#9FA0A0 | <font color="#9FA0A0>■■■</font> |
|    <font color="#949495">鼠色</font>    | ---  | ---  | ---  | ---  | ---  | \#949495 | <font color="#949495>■■■</font> |
|   <font color="#888084">源氏鼠</font>   | ---  | ---  | ---  | ---  | ---  | \#888084 | <font color="#888084>■■■</font> |
|    <font color="#7D7D7D">灰色</font>    | ---  | ---  | ---  | ---  | ---  | \#7D7D7D | <font color="#7D7D7D>■■■</font> |
|    <font color="#7B7C7D">鉛色</font>    | ---  | ---  | ---  | ---  | ---  | \#7B7C7D | <font color="#7B7C7D>■■■</font> |
|    <font color="#727171">鈍色</font>    | ---  | ---  | ---  | ---  | ---  | \#727171 | <font color="#727171>■■■</font> |
|     <font color="#595857">墨</font>     | ---  | ---  | ---  | ---  | ---  | \#595857 | <font color="#595857>■■■</font> |
|    <font color="#595455">丼鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#595455 | <font color="#595455>■■■</font> |
|   <font color="#524E4D">消炭色</font>   | ---  | ---  | ---  | ---  | ---  | \#524E4D | <font color="#524E4D>■■■</font> |
|   <font color="#474A4D">藍墨茶</font>   | ---  | ---  | ---  | ---  | ---  | \#474A4D | <font color="#474A4D>■■■</font> |
|   <font color="#383C3C">羊羹色</font>   | ---  | ---  | ---  | ---  | ---  | \#383C3C | <font color="#383C3C>■■■</font> |
|    <font color="#2B2B2B">蝋色</font>    | ---  | ---  | ---  | ---  | ---  | \#2B2B2B | <font color="#2B2B2B>■■■</font> |
|     <font color="#2B2B2B">黒</font>     | ---  | ---  | ---  | ---  | ---  | \#2B2B2B | <font color="#2B2B2B>■■■</font> |
|   <font color="#180614">烏羽色</font>   | ---  | ---  | ---  | ---  | ---  | \#180614 | <font color="#180614>■■■</font> |
|    <font color="#281A14">鉄黒</font>    | ---  | ---  | ---  | ---  | ---  | \#281A14 | <font color="#281A14>■■■</font> |
|   <font color="#000B00">濡羽色</font>   | ---  | ---  | ---  | ---  | ---  | \#000B00 | <font color="#000B00>■■■</font> |
|    <font color="#250D00">黒壇</font>    | ---  | ---  | ---  | ---  | ---  | \#250D00 | <font color="#250D00>■■■</font> |
|  <font color="#241A08">憲法黒茶</font>  | ---  | ---  | ---  | ---  | ---  | \#241A08 | <font color="#241A08>■■■</font> |
|   <font color="#16160E">暗黒色</font>   | ---  | ---  | ---  | ---  | ---  | \#16160E | <font color="#16160E>■■■</font> |
|   <font color="#006E54">萌葱色</font>   | ---  | ---  | ---  | ---  | ---  | \#006E54 | <font color="#006E54>■■■</font> |
|   <font color="#00A381">花緑青</font>   | ---  | ---  | ---  | ---  | ---  | \#00A381 | <font color="#00A381>■■■</font> |
|   <font color="#38B48B">翡翠色</font>   | ---  | ---  | ---  | ---  | ---  | \#38B48B | <font color="#38B48B>■■■</font> |
|    <font color="#00A497">青緑</font>    | ---  | ---  | ---  | ---  | ---  | \#00A497 | <font color="#00A497>■■■</font> |
|   <font color="#80ABA9">水浅葱</font>   | ---  | ---  | ---  | ---  | ---  | \#80ABA9 | <font color="#80ABA9>■■■</font> |
|   <font color="#5C9291">錆浅葱</font>   | ---  | ---  | ---  | ---  | ---  | \#5C9291 | <font color="#5C9291>■■■</font> |
|    <font color="#478384">青碧</font>    | ---  | ---  | ---  | ---  | ---  | \#478384 | <font color="#478384>■■■</font> |
|   <font color="#43676B">御召茶</font>   | ---  | ---  | ---  | ---  | ---  | \#43676B | <font color="#43676B>■■■</font> |
|    <font color="#80989B">湊鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#80989B | <font color="#80989B>■■■</font> |
|  <font color="#2C4F54">高麗納戸</font>  | ---  | ---  | ---  | ---  | ---  | \#2C4F54 | <font color="#2C4F54>■■■</font> |
|   <font color="#1F3134">百入茶</font>   | ---  | ---  | ---  | ---  | ---  | \#1F3134 | <font color="#1F3134>■■■</font> |
|    <font color="#47585C">錆鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#47585C | <font color="#47585C>■■■</font> |
| <font color="#485859">錆鉄御納戸</font> | ---  | ---  | ---  | ---  | ---  | \#485859 | <font color="#485859>■■■</font> |
|    <font color="#6C848D">藍鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#6C848D | <font color="#6C848D>■■■</font> |
|  <font color="#53727D">錆御納戸</font>  | ---  | ---  | ---  | ---  | ---  | \#53727D | <font color="#53727D>■■■</font> |
|   <font color="#5B7E91">舛花色</font>   | ---  | ---  | ---  | ---  | ---  | \#5B7E91 | <font color="#5B7E91>■■■</font> |
| <font color="#426579">熨斗目花色</font> | ---  | ---  | ---  | ---  | ---  | \#426579 | <font color="#426579>■■■</font> |
| <font color="#4C6473">御召御納戸</font> | ---  | ---  | ---  | ---  | ---  | \#4C6473 | <font color="#4C6473>■■■</font> |
|  <font color="#455765">鉄御納戸</font>  | ---  | ---  | ---  | ---  | ---  | \#455765 | <font color="#455765>■■■</font> |
|    <font color="#44617B">紺鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#44617B | <font color="#44617B>■■■</font> |
|    <font color="#393F4C">藍鉄</font>    | ---  | ---  | ---  | ---  | ---  | \#393F4C | <font color="#393F4C>■■■</font> |
|    <font color="#393E4F">青褐</font>    | ---  | ---  | ---  | ---  | ---  | \#393E4F | <font color="#393E4F>■■■</font> |
|    <font color="#203744">褐返</font>    | ---  | ---  | ---  | ---  | ---  | \#203744 | <font color="#203744>■■■</font> |
|    <font color="#4D4C61">褐色</font>    | ---  | ---  | ---  | ---  | ---  | \#4D4C61 | <font color="#4D4C61>■■■</font> |
|    <font color="#EAF4FC">月白</font>    | ---  | ---  | ---  | ---  | ---  | \#EAF4FC | <font color="#EAF4FC>■■■</font> |
|   <font color="#EAEDF7">白菫色</font>   | ---  | ---  | ---  | ---  | ---  | \#EAEDF7 | <font color="#EAEDF7>■■■</font> |
|   <font color="#E8ECEF">白花色</font>   | ---  | ---  | ---  | ---  | ---  | \#E8ECEF | <font color="#E8ECEF>■■■</font> |
|    <font color="#EBF6F7">藍白</font>    | ---  | ---  | ---  | ---  | ---  | \#EBF6F7 | <font color="#EBF6F7>■■■</font> |
|    <font color="#C1E4E9">白藍</font>    | ---  | ---  | ---  | ---  | ---  | \#C1E4E9 | <font color="#C1E4E9>■■■</font> |
|    <font color="#BCE2E8">水色</font>    | ---  | ---  | ---  | ---  | ---  | \#BCE2E8 | <font color="#BCE2E8>■■■</font> |
|    <font color="#A2D7DD">瓶覗</font>    | ---  | ---  | ---  | ---  | ---  | \#A2D7DD | <font color="#A2D7DD>■■■</font> |
|   <font color="#ABCED8">秘色色</font>   | ---  | ---  | ---  | ---  | ---  | \#ABCED8 | <font color="#ABCED8>■■■</font> |
|    <font color="#A0D8EF">空色</font>    | ---  | ---  | ---  | ---  | ---  | \#A0D8EF | <font color="#A0D8EF>■■■</font> |
|  <font color="#89C3EB">勿忘草色</font>  | ---  | ---  | ---  | ---  | ---  | \#89C3EB | <font color="#89C3EB>■■■</font> |
|   <font color="#84A2D4">青藤色</font>   | ---  | ---  | ---  | ---  | ---  | \#84A2D4 | <font color="#84A2D4>■■■</font> |
|    <font color="#83CCD2">白群</font>    | ---  | ---  | ---  | ---  | ---  | \#83CCD2 | <font color="#83CCD2>■■■</font> |
|    <font color="#84B9CB">浅縹</font>    | ---  | ---  | ---  | ---  | ---  | \#84B9CB | <font color="#84B9CB>■■■</font> |
|   <font color="#698AAB">薄花色</font>   | ---  | ---  | ---  | ---  | ---  | \#698AAB | <font color="#698AAB>■■■</font> |
|   <font color="#008899">納戸色</font>   | ---  | ---  | ---  | ---  | ---  | \#008899 | <font color="#008899>■■■</font> |
|   <font color="#00A3AF">浅葱色</font>   | ---  | ---  | ---  | ---  | ---  | \#00A3AF | <font color="#00A3AF>■■■</font> |
|   <font color="#2A83A2">花浅葱</font>   | ---  | ---  | ---  | ---  | ---  | \#2A83A2 | <font color="#2A83A2>■■■</font> |
|   <font color="#59B9C6">新橋色</font>   | ---  | ---  | ---  | ---  | ---  | \#59B9C6 | <font color="#59B9C6>■■■</font> |
|    <font color="#2CA9E1">天色</font>    | ---  | ---  | ---  | ---  | ---  | \#2CA9E1 | <font color="#2CA9E1>■■■</font> |
|   <font color="#38A1DB">露草色</font>   | ---  | ---  | ---  | ---  | ---  | \#38A1DB | <font color="#38A1DB>■■■</font> |
|     <font color="#0095D9">青</font>     | ---  | ---  | ---  | ---  | ---  | \#0095D9 | <font color="#0095D9>■■■</font> |
|    <font color="#0094C8">薄藍</font>    | ---  | ---  | ---  | ---  | ---  | \#0094C8 | <font color="#0094C8>■■■</font> |
|    <font color="#2792C3">縹色</font>    | ---  | ---  | ---  | ---  | ---  | \#2792C3 | <font color="#2792C3>■■■</font> |
|    <font color="#007BBB">紺碧</font>    | ---  | ---  | ---  | ---  | ---  | \#007BBB | <font color="#007BBB>■■■</font> |
|   <font color="#5383C3">薄群青</font>   | ---  | ---  | ---  | ---  | ---  | \#5383C3 | <font color="#5383C3>■■■</font> |
|   <font color="#5A79BA">薄花桜</font>   | ---  | ---  | ---  | ---  | ---  | \#5A79BA | <font color="#5A79BA>■■■</font> |
|   <font color="#4C6CB3">群青色</font>   | ---  | ---  | ---  | ---  | ---  | \#4C6CB3 | <font color="#4C6CB3>■■■</font> |
|   <font color="#3E62AD">杜若色</font>   | ---  | ---  | ---  | ---  | ---  | \#3E62AD | <font color="#3E62AD>■■■</font> |
|   <font color="#1E50A2">瑠璃色</font>   | ---  | ---  | ---  | ---  | ---  | \#1E50A2 | <font color="#1E50A2>■■■</font> |
|    <font color="#507EA4">薄縹</font>    | ---  | ---  | ---  | ---  | ---  | \#507EA4 | <font color="#507EA4>■■■</font> |
|   <font color="#19448E">瑠璃紺</font>   | ---  | ---  | ---  | ---  | ---  | \#19448E | <font color="#19448E>■■■</font> |
|   <font color="#164A84">紺瑠璃</font>   | ---  | ---  | ---  | ---  | ---  | \#164A84 | <font color="#164A84>■■■</font> |
|    <font color="#165E83">藍色</font>    | ---  | ---  | ---  | ---  | ---  | \#165E83 | <font color="#165E83>■■■</font> |
|    <font color="#274A78">青藍</font>    | ---  | ---  | ---  | ---  | ---  | \#274A78 | <font color="#274A78>■■■</font> |
|    <font color="#2A4073">深縹</font>    | ---  | ---  | ---  | ---  | ---  | \#2A4073 | <font color="#2A4073>■■■</font> |
|    <font color="#223A70">紺色</font>    | ---  | ---  | ---  | ---  | ---  | \#223A70 | <font color="#223A70>■■■</font> |
|    <font color="#192F60">紺青</font>    | ---  | ---  | ---  | ---  | ---  | \#192F60 | <font color="#192F60>■■■</font> |
|    <font color="#1C305C">留紺</font>    | ---  | ---  | ---  | ---  | ---  | \#1C305C | <font color="#1C305C>■■■</font> |
|    <font color="#0F2350">濃藍</font>    | ---  | ---  | ---  | ---  | ---  | \#0F2350 | <font color="#0F2350>■■■</font> |
|    <font color="#17184B">鉄紺</font>    | ---  | ---  | ---  | ---  | ---  | \#17184B | <font color="#17184B>■■■</font> |
|    <font color="#0D0015">漆黒</font>    | ---  | ---  | ---  | ---  | ---  | \#0D0015 | <font color="#0D0015>■■■</font> |
|   <font color="#BBC8E6">淡藤色</font>   | ---  | ---  | ---  | ---  | ---  | \#BBC8E6 | <font color="#BBC8E6>■■■</font> |
|    <font color="#BBBCDE">藤色</font>    | ---  | ---  | ---  | ---  | ---  | \#BBBCDE | <font color="#BBBCDE>■■■</font> |
|  <font color="#8491C3">紅掛空色</font>  | ---  | ---  | ---  | ---  | ---  | \#8491C3 | <font color="#8491C3>■■■</font> |
|    <font color="#8491C3">紅碧</font>    | ---  | ---  | ---  | ---  | ---  | \#8491C3 | <font color="#8491C3>■■■</font> |
|   <font color="#4D5AAF">紺桔梗</font>   | ---  | ---  | ---  | ---  | ---  | \#4D5AAF | <font color="#4D5AAF>■■■</font> |
|    <font color="#4D5AAF">花色</font>    | ---  | ---  | ---  | ---  | ---  | \#4D5AAF | <font color="#4D5AAF>■■■</font> |
|    <font color="#4A488E">紺藍</font>    | ---  | ---  | ---  | ---  | ---  | \#4A488E | <font color="#4A488E>■■■</font> |
|   <font color="#4D4398">紅桔梗</font>   | ---  | ---  | ---  | ---  | ---  | \#4D4398 | <font color="#4D4398>■■■</font> |
|   <font color="#5654A2">桔梗色</font>   | ---  | ---  | ---  | ---  | ---  | \#5654A2 | <font color="#5654A2>■■■</font> |
|   <font color="#706CAA">藤納戸</font>   | ---  | ---  | ---  | ---  | ---  | \#706CAA | <font color="#706CAA>■■■</font> |
|  <font color="#68699B">紅掛花色</font>  | ---  | ---  | ---  | ---  | ---  | \#68699B | <font color="#68699B>■■■</font> |
|   <font color="#867BA9">紫苑色</font>   | ---  | ---  | ---  | ---  | ---  | \#867BA9 | <font color="#867BA9>■■■</font> |
|   <font color="#DBD0E6">白藤色</font>   | ---  | ---  | ---  | ---  | ---  | \#DBD0E6 | <font color="#DBD0E6>■■■</font> |
|    <font color="#A59ACA">藤紫</font>    | ---  | ---  | ---  | ---  | ---  | \#A59ACA | <font color="#A59ACA>■■■</font> |
|    <font color="#7058A3">菫色</font>    | ---  | ---  | ---  | ---  | ---  | \#7058A3 | <font color="#7058A3>■■■</font> |
|    <font color="#674598">青紫</font>    | ---  | ---  | ---  | ---  | ---  | \#674598 | <font color="#674598>■■■</font> |
|   <font color="#674196">菖蒲色</font>   | ---  | ---  | ---  | ---  | ---  | \#674196 | <font color="#674196>■■■</font> |
|   <font color="#9079AD">竜胆色</font>   | ---  | ---  | ---  | ---  | ---  | \#9079AD | <font color="#9079AD>■■■</font> |
|   <font color="#745399">江戸紫</font>   | ---  | ---  | ---  | ---  | ---  | \#745399 | <font color="#745399>■■■</font> |
|    <font color="#65318E">本紫</font>    | ---  | ---  | ---  | ---  | ---  | \#65318E | <font color="#65318E>■■■</font> |
|   <font color="#522F60">葡萄色</font>   | ---  | ---  | ---  | ---  | ---  | \#522F60 | <font color="#522F60>■■■</font> |
|    <font color="#493759">深紫</font>    | ---  | ---  | ---  | ---  | ---  | \#493759 | <font color="#493759>■■■</font> |
|    <font color="#2E2930">紫黒</font>    | ---  | ---  | ---  | ---  | ---  | \#2E2930 | <font color="#2E2930>■■■</font> |
|     <font color="#884898">紫</font>     | ---  | ---  | ---  | ---  | ---  | \#884898 | <font color="#884898>■■■</font> |
|   <font color="#C0A2C7">薄葡萄</font>   | ---  | ---  | ---  | ---  | ---  | \#C0A2C7 | <font color="#C0A2C7>■■■</font> |
|    <font color="#460E44">紫紺</font>    | ---  | ---  | ---  | ---  | ---  | \#460E44 | <font color="#460E44>■■■</font> |
|   <font color="#74325C">暗紅色</font>   | ---  | ---  | ---  | ---  | ---  | \#74325C | <font color="#74325C>■■■</font> |
|  <font color="#55295B">桑の実色</font>  | ---  | ---  | ---  | ---  | ---  | \#55295B | <font color="#55295B>■■■</font> |
|    <font color="#E6B422">黄金</font>    | ---  | ---  | ---  | ---  | ---  | \#E6B422 | <font color="#E6B422>■■■</font> |
|    <font color="#D9A62E">櫨染</font>    | ---  | ---  | ---  | ---  | ---  | \#D9A62E | <font color="#D9A62E>■■■</font> |
|  <font color="#D3A243">黄朽葉色</font>  | ---  | ---  | ---  | ---  | ---  | \#D3A243 | <font color="#D3A243>■■■</font> |
|   <font color="#C89932">山吹茶</font>   | ---  | ---  | ---  | ---  | ---  | \#C89932 | <font color="#C89932>■■■</font> |
|   <font color="#D0AF4C">芥子色</font>   | ---  | ---  | ---  | ---  | ---  | \#D0AF4C | <font color="#D0AF4C>■■■</font> |
|  <font color="#8B968D">豆がら茶</font>  | ---  | ---  | ---  | ---  | ---  | \#8B968D | <font color="#8B968D>■■■</font> |
|    <font color="#6E7955">麹塵</font>    | ---  | ---  | ---  | ---  | ---  | \#6E7955 | <font color="#6E7955>■■■</font> |
|   <font color="#767C6B">山鳩色</font>   | ---  | ---  | ---  | ---  | ---  | \#767C6B | <font color="#767C6B>■■■</font> |
|   <font color="#888E7E">利休鼠</font>   | ---  | ---  | ---  | ---  | ---  | \#888E7E | <font color="#888E7E>■■■</font> |
|   <font color="#5A544B">海松茶</font>   | ---  | ---  | ---  | ---  | ---  | \#5A544B | <font color="#5A544B>■■■</font> |
|  <font color="#56564B">藍海松茶</font>  | ---  | ---  | ---  | ---  | ---  | \#56564B | <font color="#56564B>■■■</font> |
|   <font color="#56564B">藍媚茶</font>   | ---  | ---  | ---  | ---  | ---  | \#56564B | <font color="#56564B>■■■</font> |
|   <font color="#494A41">千歳茶</font>   | ---  | ---  | ---  | ---  | ---  | \#494A41 | <font color="#494A41>■■■</font> |
|   <font color="#6B6F59">岩井茶</font>   | ---  | ---  | ---  | ---  | ---  | \#6B6F59 | <font color="#6B6F59>■■■</font> |
|   <font color="#474B42">仙斎茶</font>   | ---  | ---  | ---  | ---  | ---  | \#474B42 | <font color="#474B42>■■■</font> |
|    <font color="#333631">黒緑</font>    | ---  | ---  | ---  | ---  | ---  | \#333631 | <font color="#333631>■■■</font> |
|   <font color="#5B6356">柳煤竹</font>   | ---  | ---  | ---  | ---  | ---  | \#5B6356 | <font color="#5B6356>■■■</font> |
|   <font color="#726250">樺茶色</font>   | ---  | ---  | ---  | ---  | ---  | \#726250 | <font color="#726250>■■■</font> |
| <font color="#9D896C">空五倍子色</font> | ---  | ---  | ---  | ---  | ---  | \#9D896C | <font color="#9D896C>■■■</font> |
|   <font color="#94846A">生壁色</font>   | ---  | ---  | ---  | ---  | ---  | \#94846A | <font color="#94846A>■■■</font> |
|  <font color="#897858">肥後煤竹</font>  | ---  | ---  | ---  | ---  | ---  | \#897858 | <font color="#897858>■■■</font> |
|    <font color="#716246">媚茶</font>    | ---  | ---  | ---  | ---  | ---  | \#716246 | <font color="#716246>■■■</font> |
|    <font color="#CBB994">白橡</font>    | ---  | ---  | ---  | ---  | ---  | \#CBB994 | <font color="#CBB994>■■■</font> |
|   <font color="#D6C6AF">亜麻色</font>   | ---  | ---  | ---  | ---  | ---  | \#D6C6AF | <font color="#D6C6AF>■■■</font> |
|    <font color="#BFA46F">榛色</font>    | ---  | ---  | ---  | ---  | ---  | \#BFA46F | <font color="#BFA46F>■■■</font> |
|   <font color="#9E9478">灰汁色</font>   | ---  | ---  | ---  | ---  | ---  | \#9E9478 | <font color="#9E9478>■■■</font> |
|   <font color="#A59564">利休茶</font>   | ---  | ---  | ---  | ---  | ---  | \#A59564 | <font color="#A59564>■■■</font> |
|    <font color="#715C1F">鶯茶</font>    | ---  | ---  | ---  | ---  | ---  | \#715C1F | <font color="#715C1F>■■■</font> |
|   <font color="#C7B370">木蘭色</font>   | ---  | ---  | ---  | ---  | ---  | \#C7B370 | <font color="#C7B370>■■■</font> |
|    <font color="#DCD3B2">砂色</font>    | ---  | ---  | ---  | ---  | ---  | \#DCD3B2 | <font color="#DCD3B2>■■■</font> |
|    <font color="#A19361">油色</font>    | ---  | ---  | ---  | ---  | ---  | \#A19361 | <font color="#A19361>■■■</font> |
|   <font color="#8F8667">利休色</font>   | ---  | ---  | ---  | ---  | ---  | \#8F8667 | <font color="#8F8667>■■■</font> |
|   <font color="#887938">梅幸茶</font>   | ---  | ---  | ---  | ---  | ---  | \#887938 | <font color="#887938>■■■</font> |
|   <font color="#6A5D21">璃寛茶</font>   | ---  | ---  | ---  | ---  | ---  | \#6A5D21 | <font color="#6A5D21>■■■</font> |
|  <font color="#918754">黄海松茶</font>  | ---  | ---  | ---  | ---  | ---  | \#918754 | <font color="#918754>■■■</font> |
|  <font color="#A69425">菜種油色</font>  | ---  | ---  | ---  | ---  | ---  | \#A69425 | <font color="#A69425>■■■</font> |
|   <font color="#ADA250">青朽葉</font>   | ---  | ---  | ---  | ---  | ---  | \#ADA250 | <font color="#ADA250>■■■</font> |
|   <font color="#938B4B">根岸色</font>   | ---  | ---  | ---  | ---  | ---  | \#938B4B | <font color="#938B4B>■■■</font> |
|    <font color="#8C8861">鶸茶</font>    | ---  | ---  | ---  | ---  | ---  | \#8C8861 | <font color="#8C8861>■■■</font> |
|    <font color="#A1A46D">柳茶</font>    | ---  | ---  | ---  | ---  | ---  | \#A1A46D | <font color="#A1A46D>■■■</font> |
|   <font color="#726D40">海松色</font>   | ---  | ---  | ---  | ---  | ---  | \#726D40 | <font color="#726D40>■■■</font> |
|    <font color="#928C36">鶯色</font>    | ---  | ---  | ---  | ---  | ---  | \#928C36 | <font color="#928C36>■■■</font> |
|   <font color="#DCCB18">緑黄色</font>   | ---  | ---  | ---  | ---  | ---  | \#DCCB18 | <font color="#DCCB18>■■■</font> |
|    <font color="#D7CF3A">鶸色</font>    | ---  | ---  | ---  | ---  | ---  | \#D7CF3A | <font color="#D7CF3A>■■■</font> |
|   <font color="#C5C56A">抹茶色</font>   | ---  | ---  | ---  | ---  | ---  | \#C5C56A | <font color="#C5C56A>■■■</font> |
|   <font color="#C3D825">若草色</font>   | ---  | ---  | ---  | ---  | ---  | \#C3D825 | <font color="#C3D825>■■■</font> |
|    <font color="#B8D200">黄緑</font>    | ---  | ---  | ---  | ---  | ---  | \#B8D200 | <font color="#B8D200>■■■</font> |
|   <font color="#E0EBAF">若芽色</font>   | ---  | ---  | ---  | ---  | ---  | \#E0EBAF | <font color="#E0EBAF>■■■</font> |
|   <font color="#D8E698">若菜色</font>   | ---  | ---  | ---  | ---  | ---  | \#D8E698 | <font color="#D8E698>■■■</font> |
|   <font color="#C7DC68">若苗色</font>   | ---  | ---  | ---  | ---  | ---  | \#C7DC68 | <font color="#C7DC68>■■■</font> |
|    <font color="#99AB4E">青丹</font>    | ---  | ---  | ---  | ---  | ---  | \#99AB4E | <font color="#99AB4E>■■■</font> |
|    <font color="#7B8D42">草色</font>    | ---  | ---  | ---  | ---  | ---  | \#7B8D42 | <font color="#7B8D42>■■■</font> |
|    <font color="#69821B">苔色</font>    | ---  | ---  | ---  | ---  | ---  | \#69821B | <font color="#69821B>■■■</font> |
|    <font color="#AACF53">萌黄</font>    | ---  | ---  | ---  | ---  | ---  | \#AACF53 | <font color="#AACF53>■■■</font> |
|    <font color="#B0CA71">苗色</font>    | ---  | ---  | ---  | ---  | ---  | \#B0CA71 | <font color="#B0CA71>■■■</font> |
|   <font color="#B9D08B">若葉色</font>   | ---  | ---  | ---  | ---  | ---  | \#B9D08B | <font color="#B9D08B>■■■</font> |
|   <font color="#839B5C">松葉色</font>   | ---  | ---  | ---  | ---  | ---  | \#839B5C | <font color="#839B5C>■■■</font> |
|   <font color="#CEE4AE">夏虫色</font>   | ---  | ---  | ---  | ---  | ---  | \#CEE4AE | <font color="#CEE4AE>■■■</font> |
|   <font color="#82AE46">鶸萌黄</font>   | ---  | ---  | ---  | ---  | ---  | \#82AE46 | <font color="#82AE46>■■■</font> |
|    <font color="#A8C97F">柳色</font>    | ---  | ---  | ---  | ---  | ---  | \#A8C97F | <font color="#A8C97F>■■■</font> |
|   <font color="#9BA88D">青白橡</font>   | ---  | ---  | ---  | ---  | ---  | \#9BA88D | <font color="#9BA88D>■■■</font> |
|    <font color="#C8D5BB">柳鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#C8D5BB | <font color="#C8D5BB>■■■</font> |
|   <font color="#C1D8AC">裏葉柳</font>   | ---  | ---  | ---  | ---  | ---  | \#C1D8AC | <font color="#C1D8AC>■■■</font> |
|   <font color="#A8BF93">山葵色</font>   | ---  | ---  | ---  | ---  | ---  | \#A8BF93 | <font color="#A8BF93>■■■</font> |
|   <font color="#769164">老竹色</font>   | ---  | ---  | ---  | ---  | ---  | \#769164 | <font color="#769164>■■■</font> |
|    <font color="#D6E9CA">白緑</font>    | ---  | ---  | ---  | ---  | ---  | \#D6E9CA | <font color="#D6E9CA>■■■</font> |
|   <font color="#93CA76">淡萌黄</font>   | ---  | ---  | ---  | ---  | ---  | \#93CA76 | <font color="#93CA76>■■■</font> |
|    <font color="#93B881">柳染</font>    | ---  | ---  | ---  | ---  | ---  | \#93B881 | <font color="#93B881>■■■</font> |
|   <font color="#BADCAD">薄萌葱</font>   | ---  | ---  | ---  | ---  | ---  | \#BADCAD | <font color="#BADCAD>■■■</font> |
|   <font color="#97A791">深川鼠</font>   | ---  | ---  | ---  | ---  | ---  | \#97A791 | <font color="#97A791>■■■</font> |
|    <font color="#98D98E">若緑</font>    | ---  | ---  | ---  | ---  | ---  | \#98D98E | <font color="#98D98E>■■■</font> |
|    <font color="#88CB7F">浅緑</font>    | ---  | ---  | ---  | ---  | ---  | \#88CB7F | <font color="#88CB7F>■■■</font> |
|    <font color="#69B076">薄緑</font>    | ---  | ---  | ---  | ---  | ---  | \#69B076 | <font color="#69B076>■■■</font> |
|    <font color="#6B7B6E">青鈍</font>    | ---  | ---  | ---  | ---  | ---  | \#6B7B6E | <font color="#6B7B6E>■■■</font> |
|   <font color="#BED2C3">青磁鼠</font>   | ---  | ---  | ---  | ---  | ---  | \#BED2C3 | <font color="#BED2C3>■■■</font> |
|    <font color="#93B69C">薄青</font>    | ---  | ---  | ---  | ---  | ---  | \#93B69C | <font color="#93B69C>■■■</font> |
|   <font color="#A6C8B2">錆青磁</font>   | ---  | ---  | ---  | ---  | ---  | \#A6C8B2 | <font color="#A6C8B2>■■■</font> |
|   <font color="#47885E">緑青色</font>   | ---  | ---  | ---  | ---  | ---  | \#47885E | <font color="#47885E>■■■</font> |
|   <font color="#316745">千歳緑</font>   | ---  | ---  | ---  | ---  | ---  | \#316745 | <font color="#316745>■■■</font> |
|   <font color="#68BE8D">若竹色</font>   | ---  | ---  | ---  | ---  | ---  | \#68BE8D | <font color="#68BE8D>■■■</font> |
|     <font color="#3EB370">緑</font>     | ---  | ---  | ---  | ---  | ---  | \#3EB370 | <font color="#3EB370>■■■</font> |
|   <font color="#007B43">常磐色</font>   | ---  | ---  | ---  | ---  | ---  | \#007B43 | <font color="#007B43>■■■</font> |
|   <font color="#BED3CA">千草鼠</font>   | ---  | ---  | ---  | ---  | ---  | \#BED3CA | <font color="#BED3CA>■■■</font> |
|   <font color="#92B5A9">千草色</font>   | ---  | ---  | ---  | ---  | ---  | \#92B5A9 | <font color="#92B5A9>■■■</font> |
|   <font color="#7EBEA5">青磁色</font>   | ---  | ---  | ---  | ---  | ---  | \#7EBEA5 | <font color="#7EBEA5>■■■</font> |
|   <font color="#7EBEAB">青竹色</font>   | ---  | ---  | ---  | ---  | ---  | \#7EBEAB | <font color="#7EBEAB>■■■</font> |
|   <font color="#028760">常磐緑</font>   | ---  | ---  | ---  | ---  | ---  | \#028760 | <font color="#028760>■■■</font> |
|   <font color="#3B7960">木賊色</font>   | ---  | ---  | ---  | ---  | ---  | \#3B7960 | <font color="#3B7960>■■■</font> |
|   <font color="#2F5D50">天鵞絨</font>   | ---  | ---  | ---  | ---  | ---  | \#2F5D50 | <font color="#2F5D50>■■■</font> |
|    <font color="#3A5B52">虫襖</font>    | ---  | ---  | ---  | ---  | ---  | \#3A5B52 | <font color="#3A5B52>■■■</font> |
|    <font color="#475950">革色</font>    | ---  | ---  | ---  | ---  | ---  | \#475950 | <font color="#475950>■■■</font> |
|    <font color="#00552E">深緑</font>    | ---  | ---  | ---  | ---  | ---  | \#00552E | <font color="#00552E>■■■</font> |
|    <font color="#005243">鉄色</font>    | ---  | ---  | ---  | ---  | ---  | \#005243 | <font color="#005243>■■■</font> |
|   <font color="#96514D">小豆色</font>   | ---  | ---  | ---  | ---  | ---  | \#96514D | <font color="#96514D>■■■</font> |
|    <font color="#8D6449">枯茶</font>    | ---  | ---  | ---  | ---  | ---  | \#8D6449 | <font color="#8D6449>■■■</font> |
|    <font color="#DEB068">饴色</font>    | ---  | ---  | ---  | ---  | ---  | \#DEB068 | <font color="#DEB068>■■■</font> |
|   <font color="#BF794E">骆驼色</font>   | ---  | ---  | ---  | ---  | ---  | \#BF794E | <font color="#BF794E>■■■</font> |
|    <font color="#BC763C">土色</font>    | ---  | ---  | ---  | ---  | ---  | \#BC763C | <font color="#BC763C>■■■</font> |
|   <font color="#B98C46">黄唐色</font>   | ---  | ---  | ---  | ---  | ---  | \#B98C46 | <font color="#B98C46>■■■</font> |
|    <font color="#B79B5B">桑染</font>    | ---  | ---  | ---  | ---  | ---  | \#B79B5B | <font color="#B79B5B>■■■</font> |
|    <font color="#B77B57">栌色</font>    | ---  | ---  | ---  | ---  | ---  | \#B77B57 | <font color="#B77B57>■■■</font> |
|    <font color="#B68D4C">黄橡</font>    | ---  | ---  | ---  | ---  | ---  | \#B68D4C | <font color="#B68D4C>■■■</font> |
|   <font color="#AD7D4C">丁字染</font>   | ---  | ---  | ---  | ---  | ---  | \#AD7D4C | <font color="#AD7D4C>■■■</font> |
|    <font color="#AD7D4C">香染</font>    | ---  | ---  | ---  | ---  | ---  | \#AD7D4C | <font color="#AD7D4C>■■■</font> |
|   <font color="#AE7C4F">枇杷茶</font>   | ---  | ---  | ---  | ---  | ---  | \#AE7C4F | <font color="#AE7C4F>■■■</font> |
|   <font color="#AD7E4E">芝翫茶</font>   | ---  | ---  | ---  | ---  | ---  | \#AD7E4E | <font color="#AD7E4E>■■■</font> |
|    <font color="#AE7C58">焦香</font>    | ---  | ---  | ---  | ---  | ---  | \#AE7C58 | <font color="#AE7C58>■■■</font> |
|   <font color="#A86F4C">胡桃色</font>   | ---  | ---  | ---  | ---  | ---  | \#A86F4C | <font color="#A86F4C>■■■</font> |
|   <font color="#946243">渋纸色</font>   | ---  | ---  | ---  | ---  | ---  | \#946243 | <font color="#946243>■■■</font> |
|   <font color="#917347">朽葉色</font>   | ---  | ---  | ---  | ---  | ---  | \#917347 | <font color="#917347>■■■</font> |
|    <font color="#956F29">桑茶</font>    | ---  | ---  | ---  | ---  | ---  | \#956F29 | <font color="#956F29>■■■</font> |
|   <font color="#8C7042">路考茶</font>   | ---  | ---  | ---  | ---  | ---  | \#8C7042 | <font color="#8C7042>■■■</font> |
|   <font color="#7B6C3E">国防色</font>   | ---  | ---  | ---  | ---  | ---  | \#7B6C3E | <font color="#7B6C3E>■■■</font> |
|   <font color="#D8A373">伽羅色</font>   | ---  | ---  | ---  | ---  | ---  | \#D8A373 | <font color="#D8A373>■■■</font> |
|   <font color="#CD8C5C">江戸茶</font>   | ---  | ---  | ---  | ---  | ---  | \#CD8C5C | <font color="#CD8C5C>■■■</font> |
|    <font color="#CD5E3C">樺色</font>    | ---  | ---  | ---  | ---  | ---  | \#CD5E3C | <font color="#CD5E3C>■■■</font> |
|   <font color="#CB8347">紅鬱金</font>   | ---  | ---  | ---  | ---  | ---  | \#CB8347 | <font color="#CB8347>■■■</font> |
|   <font color="#C37854">土器色</font>   | ---  | ---  | ---  | ---  | ---  | \#C37854 | <font color="#C37854>■■■</font> |
|    <font color="#C38743">狐色</font>    | ---  | ---  | ---  | ---  | ---  | \#C38743 | <font color="#C38743>■■■</font> |
|   <font color="#C39143">黄土色</font>   | ---  | ---  | ---  | ---  | ---  | \#C39143 | <font color="#C39143>■■■</font> |
|   <font color="#BF783A">琥珀色</font>   | ---  | ---  | ---  | ---  | ---  | \#BF783A | <font color="#BF783A>■■■</font> |
|    <font color="#BB5535">赤茶</font>    | ---  | ---  | ---  | ---  | ---  | \#BB5535 | <font color="#BB5535>■■■</font> |
|    <font color="#BB5520">代赭</font>    | ---  | ---  | ---  | ---  | ---  | \#BB5520 | <font color="#BB5520>■■■</font> |
|   <font color="#B55233">煉瓦色</font>   | ---  | ---  | ---  | ---  | ---  | \#B55233 | <font color="#B55233>■■■</font> |
|    <font color="#AA4F37">雀茶</font>    | ---  | ---  | ---  | ---  | ---  | \#AA4F37 | <font color="#AA4F37>■■■</font> |
|  <font color="#9F563A">団十郎茶</font>  | ---  | ---  | ---  | ---  | ---  | \#9F563A | <font color="#9F563A>■■■</font> |
|   <font color="#9F563A">柿渋色</font>   | ---  | ---  | ---  | ---  | ---  | \#9F563A | <font color="#9F563A>■■■</font> |
|    <font color="#9A493F">紅鳶</font>    | ---  | ---  | ---  | ---  | ---  | \#9A493F | <font color="#9A493F>■■■</font> |
|    <font color="#98623C">灰茶</font>    | ---  | ---  | ---  | ---  | ---  | \#98623C | <font color="#98623C>■■■</font> |
|    <font color="#965042">茶色</font>    | ---  | ---  | ---  | ---  | ---  | \#965042 | <font color="#965042>■■■</font> |
|   <font color="#965036">檜皮色</font>   | ---  | ---  | ---  | ---  | ---  | \#965036 | <font color="#965036>■■■</font> |
|    <font color="#95483F">鳶色</font>    | ---  | ---  | ---  | ---  | ---  | \#95483F | <font color="#95483F>■■■</font> |
|    <font color="#954E2A">柿茶</font>    | ---  | ---  | ---  | ---  | ---  | \#954E2A | <font color="#954E2A>■■■</font> |
|   <font color="#8F2E14">弁柄色</font>   | ---  | ---  | ---  | ---  | ---  | \#8F2E14 | <font color="#8F2E14>■■■</font> |
|   <font color="#8A3319">赤錆色</font>   | ---  | ---  | ---  | ---  | ---  | \#8A3319 | <font color="#8A3319>■■■</font> |
|    <font color="#8A3B00">褐色</font>    | ---  | ---  | ---  | ---  | ---  | \#8A3B00 | <font color="#8A3B00>■■■</font> |
|    <font color="#852E19">栗梅</font>    | ---  | ---  | ---  | ---  | ---  | \#852E19 | <font color="#852E19>■■■</font> |
|   <font color="#7B4741">紅檜皮</font>   | ---  | ---  | ---  | ---  | ---  | \#7B4741 | <font color="#7B4741>■■■</font> |
|   <font color="#773C30">海老茶</font>   | ---  | ---  | ---  | ---  | ---  | \#773C30 | <font color="#773C30>■■■</font> |
|    <font color="#783C1D">唐茶</font>    | ---  | ---  | ---  | ---  | ---  | \#783C1D | <font color="#783C1D>■■■</font> |
|    <font color="#762F07">栗色</font>    | ---  | ---  | ---  | ---  | ---  | \#762F07 | <font color="#762F07>■■■</font> |
|   <font color="#752100">赤銅色</font>   | ---  | ---  | ---  | ---  | ---  | \#752100 | <font color="#752100>■■■</font> |
|    <font color="#6C3524">錆色</font>    | ---  | ---  | ---  | ---  | ---  | \#6C3524 | <font color="#6C3524>■■■</font> |
|   <font color="#683F36">赤褐色</font>   | ---  | ---  | ---  | ---  | ---  | \#683F36 | <font color="#683F36>■■■</font> |
|   <font color="#664032">茶褐色</font>   | ---  | ---  | ---  | ---  | ---  | \#664032 | <font color="#664032>■■■</font> |
|   <font color="#6D3C32">栗皮茶</font>   | ---  | ---  | ---  | ---  | ---  | \#6D3C32 | <font color="#6D3C32>■■■</font> |
|    <font color="#583822">黒茶</font>    | ---  | ---  | ---  | ---  | ---  | \#583822 | <font color="#583822>■■■</font> |
|   <font color="#6C2C2F">葡萄茶</font>   | ---  | ---  | ---  | ---  | ---  | \#6C2C2F | <font color="#6C2C2F>■■■</font> |
|   <font color="#640125">葡萄色</font>   | ---  | ---  | ---  | ---  | ---  | \#640125 | <font color="#640125>■■■</font> |
|   <font color="#F8B862">萱草色</font>   | ---  | ---  | ---  | ---  | ---  | \#F8B862 | <font color="#F8B862>■■■</font> |
|   <font color="#F6AD49">柑子色</font>   | ---  | ---  | ---  | ---  | ---  | \#F6AD49 | <font color="#F6AD49>■■■</font> |
|    <font color="#F39800">金茶</font>    | ---  | ---  | ---  | ---  | ---  | \#F39800 | <font color="#F39800>■■■</font> |
|   <font color="#F08300">蜜柑色</font>   | ---  | ---  | ---  | ---  | ---  | \#F08300 | <font color="#F08300>■■■</font> |
|   <font color="#EC6D51">鉛丹色</font>   | ---  | ---  | ---  | ---  | ---  | \#EC6D51 | <font color="#EC6D51>■■■</font> |
|    <font color="#EE7948">黄丹</font>    | ---  | ---  | ---  | ---  | ---  | \#EE7948 | <font color="#EE7948>■■■</font> |
|    <font color="#ED6D3D">柿色</font>    | ---  | ---  | ---  | ---  | ---  | \#ED6D3D | <font color="#ED6D3D>■■■</font> |
|    <font color="#EC6800">黄赤</font>    | ---  | ---  | ---  | ---  | ---  | \#EC6800 | <font color="#EC6800>■■■</font> |
|   <font color="#EC6800">人参色</font>   | ---  | ---  | ---  | ---  | ---  | \#EC6800 | <font color="#EC6800>■■■</font> |
|    <font color="#EE7800">橙色</font>    | ---  | ---  | ---  | ---  | ---  | \#EE7800 | <font color="#EE7800>■■■</font> |
|    <font color="#EB6238">照柿</font>    | ---  | ---  | ---  | ---  | ---  | \#EB6238 | <font color="#EB6238>■■■</font> |
|    <font color="#EA5506">赤橙</font>    | ---  | ---  | ---  | ---  | ---  | \#EA5506 | <font color="#EA5506>■■■</font> |
|    <font color="#EA5506">金赤</font>    | ---  | ---  | ---  | ---  | ---  | \#EA5506 | <font color="#EA5506>■■■</font> |
|    <font color="#EB6101">朱色</font>    | ---  | ---  | ---  | ---  | ---  | \#EB6101 | <font color="#EB6101>■■■</font> |
|   <font color="#E49E61">小麦色</font>   | ---  | ---  | ---  | ---  | ---  | \#E49E61 | <font color="#E49E61>■■■</font> |
|    <font color="#E45E32">丹色</font>    | ---  | ---  | ---  | ---  | ---  | \#E45E32 | <font color="#E45E32>■■■</font> |
|    <font color="#E17B34">黄茶</font>    | ---  | ---  | ---  | ---  | ---  | \#E17B34 | <font color="#E17B34>■■■</font> |
|   <font color="#DD7A56">肉桂色</font>   | ---  | ---  | ---  | ---  | ---  | \#DD7A56 | <font color="#DD7A56>■■■</font> |
|  <font color="#DB8449">赤朽葉色</font>  | ---  | ---  | ---  | ---  | ---  | \#DB8449 | <font color="#DB8449>■■■</font> |
|   <font color="#D66A35">黄櫨染</font>   | ---  | ---  | ---  | ---  | ---  | \#D66A35 | <font color="#D66A35>■■■</font> |
|  <font color="#FFD900">蒲公英色</font>  | ---  | ---  | ---  | ---  | ---  | \#FFD900 | <font color="#FFD900>■■■</font> |
|    <font color="#FFD900">黄色</font>    | ---  | ---  | ---  | ---  | ---  | \#FFD900 | <font color="#FFD900>■■■</font> |
|    <font color="#FFEA00">中黄</font>    | ---  | ---  | ---  | ---  | ---  | \#FFEA00 | <font color="#FFEA00>■■■</font> |
|  <font color="#FFEC47">菜の花色</font>  | ---  | ---  | ---  | ---  | ---  | \#FFEC47 | <font color="#FFEC47>■■■</font> |
|   <font color="#FEF263">黄檗色</font>   | ---  | ---  | ---  | ---  | ---  | \#FEF263 | <font color="#FEF263>■■■</font> |
|    <font color="#FCD575">卵色</font>    | ---  | ---  | ---  | ---  | ---  | \#FCD575 | <font color="#FCD575>■■■</font> |
|   <font color="#FBD26B">花葉色</font>   | ---  | ---  | ---  | ---  | ---  | \#FBD26B | <font color="#FBD26B>■■■</font> |
|   <font color="#F5E56B">刈安色</font>   | ---  | ---  | ---  | ---  | ---  | \#F5E56B | <font color="#F5E56B>■■■</font> |
|  <font color="#EEC362">玉蜀黍色</font>  | ---  | ---  | ---  | ---  | ---  | \#EEC362 | <font color="#EEC362>■■■</font> |
|  <font color="#EBD842">金糸雀色</font>  | ---  | ---  | ---  | ---  | ---  | \#EBD842 | <font color="#EBD842>■■■</font> |
|  <font color="#FFDB4F">黄支子色</font>  | ---  | ---  | ---  | ---  | ---  | \#FFDB4F | <font color="#FFDB4F>■■■</font> |
|   <font color="#FBCA4D">支子色</font>   | ---  | ---  | ---  | ---  | ---  | \#FBCA4D | <font color="#FBCA4D>■■■</font> |
|  <font color="#FCC800">向日葵色</font>  | ---  | ---  | ---  | ---  | ---  | \#FCC800 | <font color="#FCC800>■■■</font> |
|   <font color="#F8B500">山吹色</font>   | ---  | ---  | ---  | ---  | ---  | \#F8B500 | <font color="#F8B500>■■■</font> |
|   <font color="#FABF14">鬱金色</font>   | ---  | ---  | ---  | ---  | ---  | \#FABF14 | <font color="#FABF14>■■■</font> |
|    <font color="#F7C114">藤黄</font>    | ---  | ---  | ---  | ---  | ---  | \#F7C114 | <font color="#F7C114>■■■</font> |
|    <font color="#E6B422">金色</font>    | ---  | ---  | ---  | ---  | ---  | \#E6B422 | <font color="#E6B422>■■■</font> |
|    <font color="#FDEFF2">薄桜</font>    | ---  | ---  | ---  | ---  | ---  | \#FDEFF2 | <font color="#FDEFF2>■■■</font> |
|    <font color="#E9DFE5">桜鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#E9DFE5 | <font color="#E9DFE5>■■■</font> |
|    <font color="#E4D2D8">鸨鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#E4D2D8 | <font color="#E4D2D8>■■■</font> |
|    <font color="#F6BFBC">虹色</font>    | ---  | ---  | ---  | ---  | ---  | \#F6BFBC | <font color="#F6BFBC>■■■</font> |
|   <font color="#F5B1AA">珊瑚色</font>   | ---  | ---  | ---  | ---  | ---  | \#F5B1AA | <font color="#F5B1AA>■■■</font> |
|   <font color="#F5B199">一斤染</font>   | ---  | ---  | ---  | ---  | ---  | \#F5B199 | <font color="#F5B199>■■■</font> |
|    <font color="#EFAB93">宍色</font>    | ---  | ---  | ---  | ---  | ---  | \#EFAB93 | <font color="#EFAB93>■■■</font> |
|   <font color="#F2A0A1">红梅色</font>   | ---  | ---  | ---  | ---  | ---  | \#F2A0A1 | <font color="#F2A0A1>■■■</font> |
|    <font color="#F0908D">薄红</font>    | ---  | ---  | ---  | ---  | ---  | \#F0908D | <font color="#F0908D>■■■</font> |
|   <font color="#EE827C">甚三红</font>   | ---  | ---  | ---  | ---  | ---  | \#EE827C | <font color="#EE827C>■■■</font> |
|    <font color="#F09199">桃色</font>    | ---  | ---  | ---  | ---  | ---  | \#F09199 | <font color="#F09199>■■■</font> |
|    <font color="#F4B3C2">鸨色</font>    | ---  | ---  | ---  | ---  | ---  | \#F4B3C2 | <font color="#F4B3C2>■■■</font> |
|   <font color="#EEBBCB">撫子色</font>   | ---  | ---  | ---  | ---  | ---  | \#EEBBCB | <font color="#EEBBCB>■■■</font> |
|    <font color="#E8D3C7">灰梅</font>    | ---  | ---  | ---  | ---  | ---  | \#E8D3C7 | <font color="#E8D3C7>■■■</font> |
|    <font color="#E8D3D1">灰桜</font>    | ---  | ---  | ---  | ---  | ---  | \#E8D3D1 | <font color="#E8D3D1>■■■</font> |
|   <font color="#E6CDE3">淡红藤</font>   | ---  | ---  | ---  | ---  | ---  | \#E6CDE3 | <font color="#E6CDE3>■■■</font> |
|   <font color="#E5ABBE">石竹色</font>   | ---  | ---  | ---  | ---  | ---  | \#E5ABBE | <font color="#E5ABBE>■■■</font> |
|   <font color="#E597B2">薄红梅</font>   | ---  | ---  | ---  | ---  | ---  | \#E597B2 | <font color="#E597B2>■■■</font> |
|   <font color="#E198B4">桃花色</font>   | ---  | ---  | ---  | ---  | ---  | \#E198B4 | <font color="#E198B4>■■■</font> |
|    <font color="#E4AB9B">水柿</font>    | ---  | ---  | ---  | ---  | ---  | \#E4AB9B | <font color="#E4AB9B>■■■</font> |
| <font color="#E09E87">ときがら茶</font> | ---  | ---  | ---  | ---  | ---  | \#E09E87 | <font color="#E09E87>■■■</font> |
|    <font color="#D69090">退红</font>    | ---  | ---  | ---  | ---  | ---  | \#D69090 | <font color="#D69090>■■■</font> |
|    <font color="#D4ACAD">薄柿</font>    | ---  | ---  | ---  | ---  | ---  | \#D4ACAD | <font color="#D4ACAD>■■■</font> |
|   <font color="#C97586">长春色</font>   | ---  | ---  | ---  | ---  | ---  | \#C97586 | <font color="#C97586>■■■</font> |
|    <font color="#C099A0">梅鼠</font>    | ---  | ---  | ---  | ---  | ---  | \#C099A0 | <font color="#C099A0>■■■</font> |
|   <font color="#B88884">鸨浅葱</font>   | ---  | ---  | ---  | ---  | ---  | \#B88884 | <font color="#B88884>■■■</font> |
|    <font color="#B48A76">梅染</font>    | ---  | ---  | ---  | ---  | ---  | \#B48A76 | <font color="#B48A76>■■■</font> |
|   <font color="#A86965">苏芳香</font>   | ---  | ---  | ---  | ---  | ---  | \#A86965 | <font color="#A86965>■■■</font> |
|   <font color="#A25768">浅苏芳</font>   | ---  | ---  | ---  | ---  | ---  | \#A25768 | <font color="#A25768>■■■</font> |
|    <font color="#EC6D71">真朱</font>    | ---  | ---  | ---  | ---  | ---  | \#EC6D71 | <font color="#EC6D71>■■■</font> |
|    <font color="#EB6EA5">赤紫</font>    | ---  | ---  | ---  | ---  | ---  | \#EB6EA5 | <font color="#EB6EA5>■■■</font> |
|   <font color="#E95295">躑躅色</font>   | ---  | ---  | ---  | ---  | ---  | \#E95295 | <font color="#E95295>■■■</font> |
|   <font color="#E7609E">牡丹色</font>   | ---  | ---  | ---  | ---  | ---  | \#E7609E | <font color="#E7609E>■■■</font> |
|   <font color="#D0576B">今样色</font>   | ---  | ---  | ---  | ---  | ---  | \#D0576B | <font color="#D0576B>■■■</font> |
|    <font color="#C85179">中红</font>    | ---  | ---  | ---  | ---  | ---  | \#C85179 | <font color="#C85179>■■■</font> |
|   <font color="#E9546B">蔷薇色</font>   | ---  | ---  | ---  | ---  | ---  | \#E9546B | <font color="#E9546B>■■■</font> |
|    <font color="#E95464">韩红</font>    | ---  | ---  | ---  | ---  | ---  | \#E95464 | <font color="#E95464>■■■</font> |
|    <font color="#C85554">银朱</font>    | ---  | ---  | ---  | ---  | ---  | \#C85554 | <font color="#C85554>■■■</font> |
|    <font color="#C53D43">赤红</font>    | ---  | ---  | ---  | ---  | ---  | \#C53D43 | <font color="#C53D43>■■■</font> |
|    <font color="#E83929">红緋</font>    | ---  | ---  | ---  | ---  | ---  | \#E83929 | <font color="#E83929>■■■</font> |
|     <font color="#E60033">赤</font>     | ---  | ---  | ---  | ---  | ---  | \#E60033 | <font color="#E60033>■■■</font> |
|    <font color="#E2041B">猩緋</font>    | ---  | ---  | ---  | ---  | ---  | \#E2041B | <font color="#E2041B>■■■</font> |
|     <font color="#D7003A">红</font>     | ---  | ---  | ---  | ---  | ---  | \#D7003A | <font color="#D7003A>■■■</font> |
|    <font color="#C9171E">深緋</font>    | ---  | ---  | ---  | ---  | ---  | \#C9171E | <font color="#C9171E>■■■</font> |
|    <font color="#D3381C">绯色</font>    | ---  | ---  | ---  | ---  | ---  | \#D3381C | <font color="#D3381C>■■■</font> |
|    <font color="#BF242A">桜色</font>    | ---  | ---  | ---  | ---  | ---  | \#BF242A | <font color="#BF242A>■■■</font> |
|    <font color="#CE5242">赤丹</font>    | ---  | ---  | ---  | ---  | ---  | \#CE5242 | <font color="#CE5242>■■■</font> |
|    <font color="#D9333F">红赤</font>    | ---  | ---  | ---  | ---  | ---  | \#D9333F | <font color="#D9333F>■■■</font> |
|    <font color="#B94047">胭脂</font>    | ---  | ---  | ---  | ---  | ---  | \#B94047 | <font color="#B94047>■■■</font> |
|    <font color="#BA2636">朱緋</font>    | ---  | ---  | ---  | ---  | ---  | \#BA2636 | <font color="#BA2636>■■■</font> |
|    <font color="#B7282E">茜色</font>    | ---  | ---  | ---  | ---  | ---  | \#B7282E | <font color="#B7282E>■■■</font> |
|  <font color="#A73836">深海老茶</font>  | ---  | ---  | ---  | ---  | ---  | \#A73836 | <font color="#A73836>■■■</font> |
|    <font color="#9E3D3F">苏芳</font>    | ---  | ---  | ---  | ---  | ---  | \#9E3D3F | <font color="#9E3D3F>■■■</font> |
|    <font color="#A22041">真红</font>    | ---  | ---  | ---  | ---  | ---  | \#A22041 | <font color="#A22041>■■■</font> |
|    <font color="#A22041">浓红</font>    | ---  | ---  | ---  | ---  | ---  | \#A22041 | <font color="#A22041>■■■</font> |
|   <font color="#F8F4E6">象牙色</font>   | ---  | ---  | ---  | ---  | ---  | \#F8F4E6 | <font color="#F8F4E6>■■■</font> |
|    <font color="#EDE4CD">练色</font>    | ---  | ---  | ---  | ---  | ---  | \#EDE4CD | <font color="#EDE4CD>■■■</font> |
|   <font color="#E9E4D4">灰白色</font>   | ---  | ---  | ---  | ---  | ---  | \#E9E4D4 | <font color="#E9E4D4>■■■</font> |
|   <font color="#EDE1A9">蒸栗色</font>   | ---  | ---  | ---  | ---  | ---  | \#EDE1A9 | <font color="#EDE1A9>■■■</font> |
|   <font color="#F2F2B0">女郎花</font>   | ---  | ---  | ---  | ---  | ---  | \#F2F2B0 | <font color="#F2F2B0>■■■</font> |
|   <font color="#E4DC8A">枯草色</font>   | ---  | ---  | ---  | ---  | ---  | \#E4DC8A | <font color="#E4DC8A>■■■</font> |
|    <font color="#F8E58C">淡黄</font>    | ---  | ---  | ---  | ---  | ---  | \#F8E58C | <font color="#F8E58C>■■■</font> |
|    <font color="#DDBB99">白茶</font>    | ---  | ---  | ---  | ---  | ---  | \#DDBB99 | <font color="#DDBB99>■■■</font> |
|   <font color="#D7A98C">赤白橡</font>   | ---  | ---  | ---  | ---  | ---  | \#D7A98C | <font color="#D7A98C>■■■</font> |
|    <font color="#F2C9AC">洗柿</font>    | ---  | ---  | ---  | ---  | ---  | \#F2C9AC | <font color="#F2C9AC>■■■</font> |
|  <font color="#FFF1CF">鸟の子色</font>  | ---  | ---  | ---  | ---  | ---  | \#FFF1CF | <font color="#FFF1CF>■■■</font> |
|   <font color="#FDDEA5">蜂蜜色</font>   | ---  | ---  | ---  | ---  | ---  | \#FDDEA5 | <font color="#FDDEA5>■■■</font> |
|    <font color="#FCE2C4">肌色</font>    | ---  | ---  | ---  | ---  | ---  | \#FCE2C4 | <font color="#FCE2C4>■■■</font> |
|   <font color="#FDE8D0">薄卵色</font>   | ---  | ---  | ---  | ---  | ---  | \#FDE8D0 | <font color="#FDE8D0>■■■</font> |
|    <font color="#F9C89B">雄黄</font>    | ---  | ---  | ---  | ---  | ---  | \#F9C89B | <font color="#F9C89B>■■■</font> |
|   <font color="#F7BD8F">洒落柿</font>   | ---  | ---  | ---  | ---  | ---  | \#F7BD8F | <font color="#F7BD8F>■■■</font> |
|    <font color="#F6B894">赤香</font>    | ---  | ---  | ---  | ---  | ---  | \#F6B894 | <font color="#F6B894>■■■</font> |
|   <font color="#F4DDA5">砥粉色</font>   | ---  | ---  | ---  | ---  | ---  | \#F4DDA5 | <font color="#F4DDA5>■■■</font> |
|    <font color="#F1BF99">肉色</font>    | ---  | ---  | ---  | ---  | ---  | \#F1BF99 | <font color="#F1BF99>■■■</font> |
|    <font color="#F1BF99">人色</font>    | ---  | ---  | ---  | ---  | ---  | \#F1BF99 | <font color="#F1BF99>■■■</font> |
|   <font color="#EFCD9A">丁子色</font>   | ---  | ---  | ---  | ---  | ---  | \#EFCD9A | <font color="#EFCD9A>■■■</font> |
|    <font color="#EFCD9A">香色</font>    | ---  | ---  | ---  | ---  | ---  | \#EFCD9A | <font color="#EFCD9A>■■■</font> |
|    <font color="#F0CFA0">薄香</font>    | ---  | ---  | ---  | ---  | ---  | \#F0CFA0 | <font color="#F0CFA0>■■■</font> |
|    <font color="#EDD3A1">浅黄</font>    | ---  | ---  | ---  | ---  | ---  | \#EDD3A1 | <font color="#EDD3A1>■■■</font> |
|    <font color="#E0C38C">枯色</font>    | ---  | ---  | ---  | ---  | ---  | \#E0C38C | <font color="#E0C38C>■■■</font> |
|    <font color="#F3BF88">淡香</font>    | ---  | ---  | ---  | ---  | ---  | \#F3BF88 | <font color="#F3BF88>■■■</font> |
|    <font color="#F7B977">杏色</font>    | ---  | ---  | ---  | ---  | ---  | \#F7B977 | <font color="#F7B977>■■■</font> |
|   <font color="#F19072">东云色</font>   | ---  | ---  | ---  | ---  | ---  | \#F19072 | <font color="#F19072>■■■</font> |
|    <font color="#F19072">曙色</font>    | ---  | ---  | ---  | ---  | ---  | \#F19072 | <font color="#F19072>■■■</font> |
|  <font color="#EE836F">珊瑚朱色</font>  | ---  | ---  | ---  | ---  | ---  | \#EE836F | <font color="#EE836F>■■■</font> |
|   <font color="#EB9B6F">深支子</font>   | ---  | ---  | ---  | ---  | ---  | \#EB9B6F | <font color="#EB9B6F>■■■</font> |
|     <font color="#E0815E">纁</font>     | ---  | ---  | ---  | ---  | ---  | \#E0815E | <font color="#E0815E>■■■</font> |
|    <font color="#DF7163">浅绯</font>    | ---  | ---  | ---  | ---  | ---  | \#DF7163 | <font color="#DF7163>■■■</font> |
|    <font color="#D57C6B">真赭</font>    | ---  | ---  | ---  | ---  | ---  | \#D57C6B | <font color="#D57C6B>■■■</font> |
|    <font color="#D0826C">洗朱</font>    | ---  | ---  | ---  | ---  | ---  | \#D0826C | <font color="#D0826C>■■■</font> |
|   <font color="#CA8269">遠州茶</font>   | ---  | ---  | ---  | ---  | ---  | \#CA8269 | <font color="#CA8269>■■■</font> |
|   <font color="#BB5548">红桦色</font>   | ---  | ---  | ---  | ---  | ---  | \#BB5548 | <font color="#BB5548>■■■</font> |
|     <font color="#AB6953">赭</font>     | ---  | ---  | ---  | ---  | ---  | \#AB6953 | <font color="#AB6953>■■■</font> |



# CopyRight

You can use and edit everything in this repository freely,  copyright of all of these color data come from their website.

[天空Blond](https://www.skyblond.info) © 2018
