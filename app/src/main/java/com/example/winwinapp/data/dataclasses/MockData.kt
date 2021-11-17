package com.example.winwinapp.data.dataclasses

object MockData {

    fun dataForForProductCatalog(): List<ProductX> {
        val mainList = mutableListOf<ProductX>()
        val bidding1 = Bidding("", 100)
        val biddingList1 = listOf(bidding1)
        val imageList1: List<String> = listOf(
            "https://falabella.scene7.com/is/image/Falabella/15136982_1?wid=1500&hei=1500&qlt=70",
        )
        val product1 = ProductX(
            biddingList1,
            1000000,
            "abc",
            imageList1,
            "Enjoy the most realistic color experience on a large, state-of-the-art screen, with blacker blacks and in 4K with Crystal UDS AU9000. Ultra-slim design, perfect for hanging on the wall, unmatched sound and great gaming performance.",
            "LED 55 AU9000 Crystal UHD 4K Smart TV 2021",
            "sonali1.work@gmail.com",
            "8687676788687",
            899.00, 4.6F, 20
        )


        val bidding2 = Bidding("", 10)
        val biddingList2 = listOf(bidding2)
        val imageList2: List<String> = listOf(
            "https://falabella.scene7.com/is/image/Falabella/6356563_1?wid=1500&hei=1500&qlt=70",
        )
        val product2 = ProductX(
            biddingList2,
            520000,
            "abc",
            imageList2,
            "The new Vertuo coffees are made in five cup sizes, and they come in 4 different capsule sizes. From a short espresso, a smooth lungo or an indulgent Carafe to share. Choose from a wide variety of capsules, each with a barcode where the machine identifies its variety to ensure perfect extraction.",
            "Vertuo Next Gray Coffee Maker + Milk Frother",
            "sonali1.work@gmail.com",
            "8687676788687",
            249.00, 4.5F, 10

        )

        val bidding3 = Bidding("", 10)
        val biddingList3 = listOf(bidding3)
        val imageList3: List<String> = listOf(
            "https://sodimac.scene7.com/is/image/SodimacCL/3926885_01?wid=800&hei=800&qlt=70",
        )
        val product3 = ProductX(
            biddingList3,
            1200000,
            "abc",
            imageList3,
            "With an avant-garde design, this microwave delivers everything you need: great power and capacity, without altering the taste or texture of your food.",
            "TH-25DM microwave",
            "sonali1.work@gmail.com",
            "8687676788687",
            890.00, 5F, 1000
        )

        val bidding4 = Bidding("", 10)
        val biddingList4 = listOf(bidding4)
        val imageList4: List<String> = listOf(
            "https://falabella.scene7.com/is/image/Falabella/15137011_1?wid=1500&hei=1500&qlt=70",
        )
        val product4 = ProductX(
            biddingList4,
            1200000,
            "abc",
            imageList4,
            "Quantum Processor 4K Quantum Processor 4K intelligently optimizes picture, sound and more. Plus, this incredible 4K upscaling technology ensures you get up to 4K resolution for the content you want. * The viewing experience may vary by content type and format. The upgrade may not apply for PC connection and gaming mode.",
            "LED 43 TU7090 Crystal UHD 4K Smart TV",
            "sonali1.work@gmail.com",
            "8687676788687",
            6999.00, 4.4F, 90
        )

        val bidding5 = Bidding("", 10)
        val biddingList5 = listOf(bidding5)
        val imageList5: List<String> = listOf(
            "https://falabella.scene7.com/is/image/Falabella/15204109_1?wid=1500&hei=1500&qlt=70",
        )
        val product5 = ProductX(
            biddingList5, 1200000, "abc", imageList5, "DEMO APPLE TV 4K 32GBAPPLEMXGY2CI",
            "Apple TV 4K 32GB", "sonali1.work@gmail.com", "8687676788687", 1799.900, 4.3F, 15
        )

        val bidding6 = Bidding("", 10)
        val biddingList6 = listOf(bidding6)
        val imageList6: List<String> = listOf(
            "https://falabella.scene7.com/is/image/Falabella/15521443_1?wid=1500&hei=1500&qlt=70",
        )
        val product6 = ProductX(
            biddingList6,
            1200000,
            "abc",
            imageList6,
            "The JBL Charge Essential speaker can connect wirelessly with up to two smartphones or tablets. Take turns between DJ and DJ and let the musical battle begin!",
            "Charge Essential Waterproof Bluetooth Speaker",
            "sonali1.work@gmail.com",
            "8687676788687",
            129.00, 4.6F, 65
        )


        mainList.add(product1)
        mainList.add(product2)
        mainList.add(product3)
        mainList.add(product4)
        mainList.add(product5)
        mainList.add(product6)
        return mainList
    }

}