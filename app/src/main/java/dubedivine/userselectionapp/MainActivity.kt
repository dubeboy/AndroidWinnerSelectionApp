package dubedivine.userselectionapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cleanList = massageData()
        Log.d(TAG, "the people are $cleanList")
        val numPeople = cleanList.size

        val winner = Random().nextInt(numPeople)

        user_name.text =  "Winner: ${cleanList[winner]}"
    }

    private fun massageData(): List<String> {
        val x =  l.split(Regex("\\n"))
        return x.filterNot { it.isEmpty() || it.trim()[0].toString().matches(Regex("\\d")) }
    }

    companion object {
        const val TAG = "MainActivity"

        private const val l = "Bridgette Mbisow Magoloza\n" +
                "30/01/2018\n" +
                "\n" +
                "Silinda Mduduzi\n" +
                "30/01/2018\n" +
                "\n" +
                "Khanya Ksb Shaun Banda III\n" +
                "26/01/2018\n" +
                "\n" +
                "Tseko Moloi\n" +
                "24/01/2018\n" +
                "\n" +
                "Thabiso Mol\n" +
                "24/01/2018\n" +
                "\n" +
                "Nathan Edward Swartz\n" +
                "22/01/2018\n" +
                "\n" +
                "Nduvho Muregu\n" +
                "19/01/2018\n" +
                "\n" +
                "Nomonde Smondezar Sibiya\n" +
                "19/01/2018\n" +
                "\n" +
                "Man-bee Pee Mathebula\n" +
                "14/01/2018\n" +
                "\n" +
                "Brian Gwæz Gwaze\n" +
                "13/01/2018\n" +
                "\n" +
                "Shelly Mahlatsi Mashilo\n" +
                "04/12/2017\n" +
                "\n" +
                "Tshepo Siyoba\n" +
                "20/10/2017\n" +
                "\n" +
                "Molefi Matla\n" +
                "21/09/2017\n" +
                "\n" +
                "Makgabane Motsitso\n" +
                "11/08/2017\n" +
                "\n" +
                "Moses Tapfuma\n" +
                "14/07/2017\n" +
                "\n" +
                "Thapelo Scottman\n" +
                "10/07/2017\n" +
                "\n" +
                "Bongane Mesh-mara Gamede\n" +
                "05/07/2017\n" +
                "\n" +
                "Notty Happiness\n" +
                "02/07/2017\n" +
                "\n" +
                "Kamohelo Tlhapane\n" +
                "31/05/2017\n" +
                "\n" +
                "Micampusmag UJ\n" +
                "31/05/2017\n" +
                "\n" +
                "Wapmaster Dale Sehume\n" +
                "22/05/2017\n" +
                "\n" +
                "Songezo Mswenya\n" +
                "10/05/2017\n" +
                "\n" +
                "Quinton Innocent Feni\n" +
                "24/04/2017\n" +
                "\n" +
                "Legoadi Nthabi\n" +
                "10/03/2017\n" +
                "\n" +
                "Mlindoc Mtshali\n" +
                "07/03/2017\n" +
                "\n" +
                "Reuben Mohlala\n" +
                "03/03/2017\n" +
                "\n" +
                "Auto-correct Schoni Mangayne\n" +
                "02/03/2017\n" +
                "\n" +
                "Mahlangu Petrus\n" +
                "01/03/2017\n" +
                "\n" +
                "Dikarabo Molele\n" +
                "01/03/2017\n" +
                "\n" +
                "Tshegofatso Tee Ramoroa\n" +
                "01/03/2017\n" +
                "\n" +
                "Veron Munsaka\n" +
                "27/02/2017\n" +
                "\n" +
                "Ayanda Blaauw\n" +
                "24/02/2017\n" +
                "\n" +
                "Kgontse Thabiso\n" +
                "23/02/2017\n" +
                "\n" +
                "Màŕqùéš Çhàúkè\n" +
                "17/02/2017\n" +
                "\n" +
                "Deep Edge\n" +
                "16/02/2017\n" +
                "\n" +
                "DopeBoy Cameron\n" +
                "10/02/2017\n" +
                "\n" +
                "Goodman Sakhile\n" +
                "08/02/2017\n" +
                "\n" +
                "Lungile Mabena May\n" +
                "07/02/2017\n" +
                "\n" +
                "Mukoni Wayne Ramulongo\n" +
                "07/02/2017\n" +
                "\n" +
                "Quenten Ngobeni\n" +
                "02/02/2017\n" +
                "\n" +
                "Siyabonga Malume KaPhiliswa Buthelezi\n" +
                "31/01/2017\n" +
                "\n" +
                "Kevin Mitnick\n" +
                "30/01/2017\n" +
                "\n" +
                "Thato Kekana\n" +
                "29/01/2017\n" +
                "\n" +
                "Kenny Matea\n" +
                "25/01/2017\n" +
                "\n" +
                "Emmanuel Mukwevho\n" +
                "23/01/2017\n" +
                "\n" +
                "Mzuandile Mzuar Mthembu\n" +
                "22/01/2017\n" +
                "\n" +
                "Christian Morgan\n" +
                "16/01/2017\n" +
                "\n" +
                "Sandile Samkelo Biyela\n" +
                "16/01/2017\n" +
                "\n" +
                "Solly Dyonta\n" +
                "13/01/2017\n" +
                "\n" +
                "Shannon Jonkers\n" +
                "02/01/2017\n" +
                "\n" +
                "Refiloe Fifi Kgokong\n" +
                "05/12/2016\n" +
                "\n" +
                "Minenhle Sibanda\n" +
                "04/12/2016\n" +
                "\n" +
                "Ariel Raúl Payano Reyes\n" +
                "18/11/2016\n" +
                "\n" +
                "Nkululeko Dlamini\n" +
                "13/11/2016\n" +
                "\n" +
                "Mashudu Mbulaheni\n" +
                "31/10/2016\n" +
                "\n" +
                "Dakalo Mbulaheni\n" +
                "30/10/2016\n" +
                "\n" +
                "Velile Velly Vamba Wangdu\n" +
                "13/10/2016\n" +
                "\n" +
                "Njabulo Marvin Mdaka\n" +
                "06/10/2016\n" +
                "\n" +
                "Nicholas Theophilus Chauke\n" +
                "21/09/2016\n" +
                "\n" +
                "Mandla Mathebula\n" +
                "20/09/2016\n" +
                "\n" +
                "Mulalo Ralinala\n" +
                "20/09/2016\n" +
                "\n" +
                "Shaun Mfundo\n" +
                "20/09/2016\n" +
                "\n" +
                "Isaya Tshosi Monyamane\n" +
                "20/09/2016\n" +
                "\n" +
                "Lehlohonolo Matlou\n" +
                "20/09/2016\n" +
                "\n" +
                "Nkateko Aubrey Recourtz\n" +
                "20/09/2016\n" +
                "\n" +
                "Stan Page\n" +
                "20/09/2016\n" +
                "\n" +
                "Justin Letlhogonolo Dube\n" +
                "20/09/2016\n" +
                "\n" +
                "Nkuckz Enkhay\n" +
                "20/09/2016\n" +
                "\n" +
                "Dannie Ogwok\n" +
                "20/09/2016\n" +
                "\n" +
                "Kelly Ralph Maruva\n" +
                "20/09/2016\n" +
                "\n" +
                "Michael Madbeats Sibiya\n" +
                "20/09/2016\n" +
                "\n" +
                "Marcus Madumo\n" +
                "19/09/2016\n" +
                "\n" +
                "Ntuthuko Punka Zikalala\n" +
                "19/09/2016\n" +
                "\n" +
                "Akil Kenne Ledwaba"

    }
}
