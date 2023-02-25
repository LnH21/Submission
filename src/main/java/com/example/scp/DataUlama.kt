package com.example.scp

import java.util.*


object DataUlama {
    private val kyaiNames = arrayOf("Habib Luthfi Bin Yahya",
        "Emha Ainun Najib",
        "KH Bahaudin Nur Salim",
        "KH Abdurrahaman Wahid",
        "KH Miftah Maulana Habiburrahman",
        "KH Mustofa Bisri",
        "KH Ahmad Muwafiq",
        "Habib Ali Zainal Abidin",
        "KH Maimun Zubair",
        "KH Yahya Cholil")

    private val kyaiDetails = arrayOf("Dr.(HC). Habib Muhammad Luthfi bin Ali bin Yahya (lahir 10 November 1947) adalah seorang Sayyid, Kiai, Ulama, Mursyid dan Dai berkebangsaan Indonesia.Selain menjadi pendakwah, Habib Luthfi juga menjadi Ketua Majelis Ulama Indonesia Jawa Tengah. Beliau juga menjabat sebagai anggota Dewan Pertimbangan Presiden Republik Indonesia sejak 13 Desember 2019.Maulana Habib Muhammad Luthfi bin Yahya Pekalongan juga merupakan Ro'is 'am JATMAN Jam'iyyah Ahlith Thoriqoh al-Mu'tabaroh an-Nahdliyyah",
        "Muhammad Ainun Nadjib atau biasa dikenal Emha Ainun Nadjib atau Cak Nun atau Mbah Nun[4] (lahir di Jombang, Jawa Timur, 27 Mei 1953; umur 68 tahun) adalah seorang tokoh intelektual Muslim Indonesia. Ia menyampaikan gagasan pemikiran dan kritik-kritiknya dalam berbagai bentuk: puisi, esai, cerpen, film, drama, lagu, musik, talkshow televisi, siaran radio, seminar, ceramah, dan tayangan video. Ia menggunakan beragam media komunikasi dari cetak hingga digital dan sangat produktif dalam berkarya.",
        "K.H. Ahmad Bahauddin Nursalim, lebih dikenal sebagai Gus Baha[1] (lahir 29 September 1970), merupakan ulama yang berasal dari Rembang. Ia dikenal sebagai salah satu ulama ahli tafsir yang memiliki pengetahuan mendalam seputar al-Qur'an. Ia merupakan salah satu murid dari ulama kharismatik, Kiai Maimun Zubair. Gus Baha merupakan putra dari seorang ulama pakar Al-Qur’an dan juga pengasuh Pondok Pesantren Tahfidzul Qur'an LP3IA, Kiai Nursalim al-Hafizh, dari Narukan, Kragan, Rembang",
        "Dr. (H.C.). K.H. Abdurrahman Wahid (lahir dengan nama Abdurrahman ad-Dakhil; 7 September 1940 – 30 Desember 2009), atau yang akrab disapa Gus Dur,[1] adalah tokoh Muslim Indonesia dan pemimpin politik yang menjadi Presiden Indonesia yang keempat dari tahun 1999 hingga 2001. Ia menggantikan Presiden B.J. Habibie setelah dipilih oleh Majelis Permusyawaratan Rakyat hasil Pemilu 1999. Penyelenggaraan pemerintahannya dibantu oleh Kabinet Persatuan Nasional.",
        "Miftah Maulana Habiburrahman atau lebih dikenal dengan Gus Miftah (lahir 5 Agustus 1981) adalah seorang mubaligh dan pimpinan Pondok Pesantren Ora Aji di Sleman, Yogyakarta.[1][2] Ia merupakan keturunan ke-9 Kiai Muhammad Ageng Besari, pendiri Pesantren Tegalsari di Ponorogo. Gus Miftah lulusan UIN Sunan Kalijaga Yogyakarta. Sewaktu kuliah, ia aktif di Pegerakan Mahasiswa Islam Indonesia (PMII) yang berafiliasi dengan Nahdlatul 'Ulama",
        "Dr. (H.C.) K.H. Ahmad Mustofa Bisri atau lebih sering dipanggil dengan Gus Mus (lahir 10 Agustus 1944 di Rembang) adalah pimpinan Pondok Pesantren Raudlatut Thalibin, Leteh, Rembang. Gus Mus pernah menjadi Rais 'Aam Pengurus Besar Nahdlatul Ulama pada tahun 2014 hingga 2015 karena menggantikan KH. Sahal Mahfudz yang wafat. Beliau juga merupakan salah seorang pendeklarasi Partai Kebangkitan Bangsa dan sekaligus perancang logo PKB yang digunakan hingga kini. Ia juga seorang penyair dan penulis kolom yang sangat dikenal di kalangan sastrawan. Di samping budayawan, dia juga dikenal sebagai penyair",
        "K.H. Ahmad Muwafiq (bahasa Arab: كياي حاج أحمد موفق‎) atau lebih dikenal dengan Kyai Muwafiq atau Gus Muwafiq (lahir 02 Maret 1974) adalah salah satu ulama Nahdlatul Ulama' (NU) yang mencerminkan pola pikir PBNU saat ini, dan kini tinggal di Sleman Yogyakarta. Gus Muwafiq pernah menjabat sebagai asisten pribadi KH. Abdurrahman Wahid (Gus Dur), termasuk saat menjabat sebagai Presiden Republik Indonesia. Gus Muwafiq memiliki ciri khas bersuara lantang dan berambut gondrong. Ia dikenal sebagai seorang orator sejak aktif di Pergerakan Mahasiswa Islam Indonesia(PMII) saat kuliah di Universitas Islam Negeri (UIN) Sunan Kaljaga Yogyakarta.",
        "Habib Ali Zainal Abidin bin Segaf Assegaf, Habib Bidin, begitu Beliau biasa disapa, dilahirkan pada 20 September 1977.Beliau merupakan putra dari Habib Segaf Assagaf bin Al-Quthb Habib Abu Bakar Assegaf Gresik.Habib Bidin panggilan akrab Al Habib Ali Zainal Abidin bin Segaf bin Abu Bakar Assegaf memimpin secara langsung pembacaan maulid nabi dengan diiringi oleh grup rebana binaannya, Majelis Azzahir Pekalongan.",
        "K.H. Maimun Zubair, kadang ditulis menggunakan ejaan lama Maimoen Zoebair, (28 Oktober 1928 – 6 Agustus 2019), atau akrab dipanggil Mbah Moen, adalah seorang ulama dan politikus Indonesia. Ia Pengasuh Pondok Pesantren Al-Anwar Sarang, Rembang dan menjabat sebagai Ketua Majelis Syariah Partai Persatuan Pembangunan hingga ia wafat.[2] Ia pernah menjadi anggota DPRD Kabupaten Rembang selama 7 tahun. Setelah berakhirnya masa tugas, ia mulai berkonsentrasi mengurus pondok pesantrennya. Ia pernah menjadi anggota MPR RI mewakili Jawa Tengah selama tiga periode.",
        "K.H. Yahya Cholil Staquf dikenal juga dengan sapaan Gus Yahya (lahir 16 Februari 1966 di Rembang, Jawa Tengah) adalah ulama yang saat ini menjabat sebagai Ketua Umum Pengurus Besar Nahdlatul Ulama (PBNU) masa khidmat 2022-2027, sebelumnya pada masa khidmat 2015-2021 ia menjabat sebagai Katib 'Aam PBNU. Gus Yahya adalah putra salah satu pendiri Partai Kebangkitan Bangsa, KH. M. Cholil Bisri, dan ia juga merupakan kakak kandung dari Menteri Agama, Yaqut Cholil Qoumas.[1] Gus Yahya juga menjadi salah satu pengasuh di Pondok Pesantren Roudlotut Tholibin, Leteh, Rembang, Jawa Tengah.")

    private val kyaiImages = intArrayOf(R.drawable.abah_lutfhi,
        R.drawable.cak_nun,
        R.drawable.gus_baha,
        R.drawable.gus_dur,
        R.drawable.gus_miftah,
        R.drawable.gus_mus,
        R.drawable.gus_muwafiq,
        R.drawable.habib_bidin,
        R.drawable.mbah_maimoen,
        R.drawable.yahya_cholil)

    val listData: ArrayList<Ulama>
        get() {
            val list = arrayListOf<Ulama>()
            for (position in kyaiNames.indices) {
                val ulama = Ulama()
                ulama.name = kyaiNames[position]
                ulama.detail = kyaiDetails[position]
                ulama.photo = kyaiImages[position]
                list.add(ulama)
            }
            return list
        }

}
