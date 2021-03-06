package cf.cuong.vietnamplaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tvc97 on 12/14/15.
 */
public class Places {

    public static final int NORTHERN = 0;
    public static final int MIDDLE = 1;
    public static final int SOUTHERN = 2;

    public static List<Place> northern;
    public static List<Place> middle;
    public static List<Place> southern;

    public static List<Place> get(int region) {
        if(region == NORTHERN)
            return northern;
        if(region == MIDDLE)
            return middle;
        if(region == SOUTHERN)
            return southern;
        return null;
    }

    static {

        /****************************************************
         *                    NORTHERN DATA
         ****************************************************/

        northern = new ArrayList<>();
        northern.add(
                new Place(
                        "Hanoi",
                        "The fertile alluvial soils of the Red River Delta nurture a rich rice crop, and many of the communities surrounding Hanoi are still engaged in agriculture. The contrast between modern Hanoi and the rural villages is stark.\n" +
                                "In recent decades, numerous villages surrounding Hanoi specialised in cottage industries, but many seem to have been swallowed up by Hanoi's urban sprawl. There are two working villages in particular that remain a rewarding day trip, though having a good guide helps make the journey really worthwhile. Most Hanoi tour operators can take you there.\n" +
                                "Bat Trang is known as the ‘ceramic village’. Here, artisans mass-produce ceramic vases and other pieces in their kilns. It’s hot, sweaty work, but the results are superb and very reasonably priced compared with the boutiques in town. There are masses of ceramic shops, but poke around down the lanes and behind the shops to find the kilns. Bat Trang is 13km southeast of Hanoi. Public bus 47 runs here from Long Bien bus station.\n" +
                                "Van Phuc specialises in silk. Silk cloth is produced here on looms and lots of visitors like to buy or order tailor-made clothes. Many of the fine silk items you see on sale in Hanoi’s P Hang Gai are made in Van Phuc. There’s also a pretty village pagoda with a lily pond. Van Phuc is 8km southwest of Hanoi; take city bus 1 from Long Bien bus station. Look out for the well-signposted gate.",
                        R.drawable.hanoi)
        );

        northern.add(
                new Place(
                        "Halong Bay",
                        "Towering limestone pillars and tiny islets topped by forest rise from the emerald waters of the Gulf of Tonkin. Halong translates as 'where the dragon descends into the sea' and legend tells that this mystical seascape was created when a great mountain dragon charged towards the coast, its flailing tail gouging out valleys and crevasses. As the creature plunged into the sea, the area filled with water leaving only the pinnacles visible. The geological explanation of karst erosion may be more prosaic, but doesn't make this seascape any less poetic.\n" +
                                "Designated a World Heritage site in 1994, Halong Bay's spectacular scatter of islands, dotted with wind- and wave-eroded grottoes, is a vision of ethereal beauty and, unsurprisingly, northern Vietnam's number one tourism hub. Sprawling Halong City is the bay's main gateway but its dowdy high-rises are a disappointing doorstep to this site. Most visitors sensibly opt for cruise-tours that include sleeping on board within the bay, while a growing number are deciding to eschew the main bay completely, heading straight for Cat Ba Island from where trips to less-visited but equally alluring Lan Ha Bay are easily set up.\n" +
                                "Halong Bay attracts visitors year-round with peak season between late May and early August. January to March is often cool and drizzly, and the ensuing fog can make visibility low, but adds bags of eerie atmosphere. From May to September tropical storms are frequent, and year-round tourist boats sometimes need to alter their itineraries, depending on the weather. November's sunny blue-sky days and lack of crowds make it the best time to make a beeline here.",
                        R.drawable.halong)
        );

        northern.add(
                new Place(
                        "Cat Ba Island",
                        "Rugged, craggy and jungle-clad Cat Ba, the largest island in Halong Bay, has experienced a tourism surge in recent years. The central hub of Cat Ba Town is now framed by a chain of low-rise concrete hotels along its once-lovely bay, but the rest of the island is largely untouched and as wild as ever. With idyllic Lan Ha Bay just offshore you'll soon overlook Cat Ba Town's overdevelopment.\n" +
                                "Cat Ba is a pretty laid-back place most of the year and for climbers, kayakers and hikers it's the launching pad for a swag of sweat-inducing activities. Between June and early August (and particularly on summer weekends) the energy level gets dialled up significantly as Cat Ba Town transforms into a roaring resort, filled with vacationing Vietnamese. This is peak season and hotel prices during this period can rocket.\n" +
                                "Almost half of Cat Ba Island (with a total area of 354 sq km) and 90 sq km of the adjacent waters were declared a national park in 1986 to protect the island’s diverse ecosystems. Most of the coastline consists of rocky cliffs, but there are some sandy beaches and tiny fishing villages hidden away in small coves.\n" +
                                "Lakes, waterfalls and grottoes dot the spectacular limestone hills, the highest rising 331m above sea level. The island’s largest body of water is Ech Lake (3 hectares). Almost all of the surface streams are seasonal. Most of the island’s rainwater flows into caves and follows underground streams to the sea, creating a shortage of fresh water during the dry season.\n" +
                                "Ho Chi Minh paid a visit to Cat Ba Island on 1 April 1951 and there is an annual festival to commemorate the event. During this time, expect lots of waterfront karaoke and techno beats from 8am to midnight.",
                        R.drawable.catba)
        );

        northern.add(
                new Place(
                        "Sapa",
                        "Established as a hill station by the French in 1922, Sapa today is the tourism centre of the northwest.\n" +
                                "Sapa is orientated to make the most of the spectacular views emerging on clear days; overlooking a plunging valley, with mountains towering above on all sides. Views of this epic scenery are often subdued by thick mist rolling across the peaks, but even when it's cloudy, local hill-tribe people fill the town with colour.\n" +
                                "If you were expecting a quaint alpine town, recalibrate your expectations. Sapa's French colonial villas fell into disrepair during successive wars with the French, Americans and Chinese, and modern tourism development has mushroomed haphazardly. Sapa today is undergoing a construction boom and, thanks to rarely enforced building height restrictions, the skyline is continually thrusting upwards.\n" +
                                "But you're not here to hang out in town. This is northern Vietnam's premier trekking base from where hikers launch themselves into a surrounding countryside of cascading rice terraces and tiny hill-tribe villages that seems a world apart. Once you've stepped out into the lush fields you'll understand the Sapa area's real charm.",
                        R.drawable.sapa)
        );

        northern.add(
                new Place(
                        "Mai Chau",
                        "Set in an idyllic valley, hemmed in by hills, the Mai Chau area is a world away from Hanoi's hustle. The small town of Mai Chau itself is unappealing, but just outside the patchwork of rice fields rolls out, speckled by tiny Thai villages where visitors doss down for the night in traditional stilt houses and wake up to a rural soundtrack defined by gurgling irrigation streams and birdsong.\n" +
                                "The villagers are mostly White Thai, distantly related to tribes in Thailand, Laos and China. Most no longer wear traditional dress, but the Thai women are masterful weavers producing plenty of traditional-style textiles. Locals do not employ strong-arm sales tactics here: polite bargaining is the norm.\n" +
                                "Mai Chau is a successful grassroots tourism project and the village homestays here are firmly stamped on the tour-group agenda, as well as being an extremely popular weekend getaway for locals from Hanoi – try to come midweek if possible. Due to its popularity, some find the experience too sanitised. If you’re looking for hard-core exploration, this is not the place, but for biking, hiking and relaxation, Mai Chau fits the bill nicely.",
                        R.drawable.maichau)
        );


        northern.add(
                new Place(
                        "Ba Be National Park",
                        "Often referred to as the Ba Be Lakes, Ba Be National Park was established in 1992 as Vietnam’s eighth national park. The scenery here swoops from towering limestone mountains peaking at 1554m down into plunging valleys wrapped in dense evergreen forests, speckled with waterfalls and caves, with the lakes themselves dominating the very heart of the park.\n" +
                                "The park is a rainforest area with more than 550 named plant species, and the government subsidises the villagers not to cut down the trees. The hundreds of wildlife species here include 65 (mostly rarely seen) mammals, 353 butterflies, 106 species of fish, four kinds of turtle, the highly endangered Vietnamese salamander and even the Burmese python. Ba Be birdlife is equally prolific, with 233 species recorded, including the spectacular crested serpent eagle and the oriental honey buzzard. Hunting is forbidden, but villagers are permitted to fish.\n" +
                                "The region is home to 13 tribal villages, most belonging to the Tay minority plus smaller numbers of Dzao and Hmong.\n" +
                                "The park entrance fee is payable at a checkpoint on the road into the park, about 15km before the park headquarters, just beyond the town of Cho Ra.",
                        R.drawable.babe)
        );

        northern.add(
                new Place(
                        "Hang Pac Po",
                        "After 30 years of exile, Ho Chi Minh re-entered Vietnam in January 1941 and took shelter in a small cave in one of the most remote regions of Vietnam, 3km from the Chinese border. The cave itself, Hang Pac Bo (Water-Wheel Cave), and the surrounding area are sacred ground for Vietnamese revolutionaries – this is the base from which Ho launched the revolution he’d long been planning.\n" +
                                "Even if you have little interest in the history of Vietnamese communism, the cave is in a beautiful location surrounded by evergreen forests filled with butterflies and birdsong, and overlooked by limestone mountains.\n" +
                                "Ho Chi Minh lived in the cave for a few weeks in 1941, writing poetry and translating key texts by the fathers of socialism. He stuck close to China so that he would be able to flee across the border if French soldiers discovered his hiding place. Ho named the stream in front of his cave Lenin Creek and the jungle-clad mountain that overlooks this stream Karl Marx Peak.\n" +
                                "There’s a modest Uncle Ho museum at the entrance to the Pac Bo area. About 2km beyond this is a parking area. The cave is a 10-minute walk away along a shady stone path that follows the riverbank. You can step inside the mouth of the small cave, but not enter inside. The path then loops past various other points of interest, including a rock table that Ho is said to have used as a kind of jungle office for his translations and writing.\n" +
                                "In a patch of forest about a 15-minute walk in the opposite direction is a jungle hut, another of Ho’s hideouts. On the way to the hut is a rock outcrop used as a ‘dead-letter box’, where he would leave and pick up messages.\n" +
                                "Hang Pac Bo is 58km northwest of Cao Bang. Allow three hours to make the return trip by road, plus an hour to look around. To do this as a return half-day trip by xe om, expect to pay around 200,000d. No permits are currently needed, despite the proximity to the Chinese border.",
                        R.drawable.pacpo)
        );

        /****************************************************
         *                    MIDDLE DATA
         ****************************************************/

        middle = new ArrayList<>();

        middle.add(
                new Place(
                        "The Imperial City",
                        "The construction of the Imperial Citadel, designed for exclusive use by the emperor, his family, and his retinue, started in 1804." +
                                "The city is protected by a series of four enormous outer walls that are 7-21 meters thick. Access to the walled city is via four arched gates, the best known of which is the Ngo Mon Gate, built in 1834." +
                                "The Imperial City contains a series of palaces, ornate halls, libraries, residences, and colleges." +
                                "Much of the City, including the Forbidden Palace, was destroyed during a vicious battle between opposing forces during the Tet Offensive of 1968." +
                                "One can spend an entire afternoon wandering around the grounds of the Imperial City, viewing the ancient architecture of the Nguyen emperors and scars of recent battles.",
                        R.drawable.kthue
                )
        );

        middle.add(
                new Place(
                        "The Tomb Of Emperor Minh Mang",
                        "Much of the Imperial City was built during the reign of Emperor Minh Mang." +
                                "His tomb is located at the juncture of two tributaries of the Perfume River surrounded by rolling hills." +
                                "It is said that it took 13 years to find an appropriate burial site for the Emperor and upon arrival it's not hard to see why this location was chosen." +
                                "Set within an exquisitely landscaped garden it is a tranquil and idyllic place." +
                                "The site is considered one of the best examples of Nguyen Dynasty architecture and artwork.",
                        R.drawable.minhmang
                )
        );

        middle.add(
                new Place(
                        "The Tomb Of Emperor Tu Duc",
                        "This tomb is located in an area of rolling hills and pine trees 7km outside Hue." +
                                "The tranquil grounds are filled with trees, ponds and pavilions where TuDuc would write poetry." +
                                "Emperor TuDuc had his tomb built 16 years prior to his death and actually wrote his own biography prior to his death.",
                        R.drawable.tuduc
                )
        );

        middle.add(
                new Place(
                        "The Tomb Of Emperor Khai Dinh",
                        "KhaiDinh's was the last Mausoleum built during the Nguyen Dynasty, and is arguably the most beautiful of all the royal tombs." +
                                "Situated on one of the Chau Mountains, amidst pine, cassava and sugar cane, KhaiDinh's tomb is surrounded by natural beauty." +
                                "Its architecture is a blend of East and West. It took eleven years to build and was completed in 1931.",
                        R.drawable.khaidinh
                )
        );

        middle.add(
                new Place(
                        "Thien Mu Pagoda",
                        "Thien Mu Pagoda is one of the oldest religious structures in Hue and is also one of the most impressive." +
                                "It was constructed during the 17th century to worship the legend of a celestial lady." +
                                "In 1844, Emperor Thieu Tri added the Phuoc Duyen stupa." +
                                "This seven-storey stupa is 21 meters high, with each level dedicated to one of the various human forms taken by Buddha. In the 1930s and 1940s the Thien Mu Pagoda became an important meeting place for Buddhists." +
                                "It became well-known worldwide when, in 1963, Thich QuangDuc, a 66 year old resident monk, died after setting himself on fire to protest anti-Buddhist policies of the government of South Vietnam." +
                                "It is best to visit the pagoda by sampan as it sits on the banks of the Perfume River.",
                        R.drawable.thienmu
                )
        );

        middle.add(
                new Place(
                        "My Son",
                        "My Son is a remarkable archaeological site dating back over a thousand years." +
                                "Located in a remote forested valley some 70 km west of Da Nang, this former capital and religious center of the Cham Kingdom once contained in excess of 70 styles of temples and pagodas." +
                                "Although badly damaged by bombing raids in the 1960s the site still has over 20 structures and was declared a UNESCO World Heritage Site in 1999.",
                        R.drawable.myson
                )
        );

        /****************************************************
         *                    SOUTHERN DATA
         ****************************************************/

        southern = new ArrayList<>();

        southern.add(
                new Place(
                        "Nha Trang",
                        "The coastal city of Nha Trang is around 275 miles from Ho Chi Minh City and its 4 mile stretch of beach is considered one of the jewels of Vietnam's long coastline." +
                                "Nha Trang is blessed with deep, quiet and warm waters all the year round." +
                                "It is surrounded by archipelagos, islands, mountains and white sand beaches which make it a wonderful and attractive tourist resort." +
                                "The magnificent coral sea bed also makes it ideal for scuba diving and snorkelling.",
                        R.drawable.nhatrang
                )
        );

        southern.add(
                new Place(
                        "Dalat",
                        "Dalat is located in Lam Dong province, approximately 125 miles northeast of Ho Chi Minh City, at an elevation of 1,500 m. Founded by the French colonial administration in 1912, Dalat was once called Le Petit Paris and was established as a place to retreat to from Saigon during the hot season.\n" +
                                "The French traders who settled here built large European-style villas and many of these villas have survived the Vietnam War undamaged giving the town a unique appearance. The colonial architecture combined with the stunning natural backdrop of forests, waterfalls and lakes make Dalat one of Vietnam’s most beautiful towns.\n" +
                                "As well as the town itself the Central Highlands, where Dalat lies, offer opportunities to meet the ethnic minorities and trek through some stunning landscapes.",
                        R.drawable.dalat
                )
        );

        southern.add(
                new Place(
                        "Ho Chi Minh City",
                        "Ho Chi Minh City, formerly known as Saigon, is a bustling, energetic city which is embracing the new lease of economic life that Vietnam is experiencing. With its tropical climate and constant buzz it may have more in common with Bangkok than the more sedate Hanoi, which is some 1,080 miles away. That said, as with Hanoi, the French legacy is evident in the wonderful colonial buildings that dominate the downtown area and you are never far away from the face of Ho Chi Minh himself as he stares down at you from the Post Office wall or from the various statues erected in his honour.\n" +
                                "Ho Chi Minh City has much to offer as a short break destination in its own right and we have outlined a number of the sightseeing options, in and around, the city below.",
                        R.drawable.hcm
                )
        );

        southern.add(
                new Place(
                        "Mekong Delta",
                        "At the southernmost part of Vietnam lies a flat and lush area of land known as the Mekong Delta. The miles of inter-connecting canals and rivers here are known by locals simply as \"the green lungs of the Mekong.\" These ‘lungs’ are responsible for the vast quantities of rice, fruit and vegetables that are produced in the region, much of which ends up in the Delta’s fascinating and bustling floating markets.\n" +
                                "It makes a great escape from the pressures of everyday life, to spend a few days in the Delta coursing through its veins and relaxing as you soak up the local way of life and glimpse a totally different part of the country. Recently it has also become possible to travel from Ho Chi Minh City all the way to Angkor using the Mekong as your gateway to Cambodia.",
                        R.drawable.mekong
                )
        );

        southern.add(
                new Place(
                        "Phu Quoc Island",
                        "Sitting in the Gulf of Thailand, the island of Phu Quoc is about the same size as Singapore and is the largest of all the Vietnamese islands. The island offers visitors a mix of mountains, lush forest covered hills, waterfalls, bubbling streams and some of Vietnam’s best beaches. It is also one of the few places in Vietnam that you can enjoy the sun setting over the sea.\n" +
                                "Phu Quoc Island has long had the natural ingredients that one expects from a beach holiday but now it has the hotels to match.",
                        R.drawable.phuquoc
                )
        );
    }
}
