package com.example.covidtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FAQAnswer extends AppCompatActivity {

    String val, str;
    int num;
    TextView tv1, tv2;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq_answer);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);

//        toolbar=findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowTitleEnabled(false);

        val = getIntent().getStringExtra("num").toString();
        num = Integer.parseInt(val);

        if (num == 11) {

            tv1.setText("1) What is COVID-19?");
            tv2.setText("Coronaviruses are a large family of viruses that are common in many different species of animals, including camels, cattle, cats, and bats.\n" +
                    "On 12th March 2020, WHO has declared a pandemic, outbreak of respiratory disease caused by novel (new) corona virus, the virus is called “SARS-CoV-2”\n" +
                    "and the disease it causes has been named “coronavirus disease 2019” (abbreviated “COVID-19”).\n" +
                    "In the past, other types of coronaviruses have caused illness such as 1. SARS-associated coronavirus (SARS-CoV), first detected in Asia in February 2003.\n" +
                    "Since 2004, there have not been any known cases of SARS reported anywhere in the world. 2. Middle East Respiratory Syndrome Coronavirus (MERS-CoV),\n" +
                    "first reported in Jordan in April 2012 and later detected in Saudi Arabia in September 2012. The largest known outbreak of MERS outside the Arabian\n" +
                    "Peninsula occurred in the Republic of Korea in 2015. All cases have been linked through travel to, or residence in, countries in and near the Arabian\n" +
                    "Peninsula. COVID-19 epicentre was in Wuhan, Hubei Province, China. The first case was detected on 31st December 2019.\n" +
                    "Last Updated");

        } else if (num == 12) {

            tv1.setText("2) What is the difference between SARS and COVID 19?");
            tv2.setText("Severe Acute Respiratory Syndrome (SARS) and COVID-19 are diseases caused by viruses belonging to a large family of coronaviruses. The viruses are\n" +
                    "related to each other genetically, but the diseases they cause are quite different.");

        } else if (num == 13) {

            tv1.setText("3) What is the difference between MERS and COVID 19?");
            tv2.setText("Middle East Respiratory Syndrome (MERS) and COVID-19 are diseases caused by viruses belonging to a large family of coronaviruses. The viruses are related to each other genetically, but the diseases they cause are quite different.");
        } else if (num == 21) {

            tv1.setText("1) How long does it take for symptoms to appear?");
            tv2.setText("Symptoms of COVID-19 may appear 2-14 days after exposure. However in some cases, such as younger people, symptom appearance may be as delayed as 27-28 days.");

        } else if (num == 22) {

            tv1.setText("2) Can symptoms of COVID-19 present even after 14 days?");
            tv2.setText("Commonly, the symptoms of COVID-19 may appear 2-14 days after exposure. However in some cases symptom appearance may be as delayed as 27-28 days.");

        } else if (num == 23) {

            tv1.setText("3) Who is at higher risk of severe illness with COVID-19?");
            tv2.setText("These include elderly, individuals with weak immune system (underlying chronic health conditions such as Diabetes, hypertension, Heart ailments, lung ailments, cancer).");

        } else if (num == 31) {

            tv1.setText("1) Why does the coronavirus spread relatively easily between people?");
            tv2.setText("The virus is thought to spread mainly from person-to-person contact.\n" +
                    "When an infected person coughs or sneezes, they release virus containing droplets of saliva or mucus. These droplets fall on people in the vicinity and can" +
                    "be either directly inhaled especially between people who are in close contact with one another within 1 meter (3 feet).\n" +
                    "These droplets are heavy and they fall quickly to the surface/ground below. If you touch a surface with the virus on it and then touch your mouth, nose or eyes, you may get sick.");

        } else if (num == 32) {

            tv1.setText("2) Can someone spread the virus without being sick?");
            tv2.setText("People are thought to be most contagious when they are most symptomatic (the sickest). Some spread might be possible before people show symptoms, but this is not thought to be the main way the virus spreads.");

        } else if (num == 33) {

            tv1.setText("3) What is close contact?");
            tv2.setText("Close contact is defined as—\na) being within approximately 6 feet (2 meters) of a COVID-19 case for a prolonged period of time;" +
                    "OR\nb) close contact can occur while caring for, living with, visiting, or sharing a health care waiting area or room with a COVID-19 case\n+" +
                    "OR \n c) having direct contact with infectious secretions of a COVID-19 case (e.g., being coughed on, handshake, hugging). Touched body fluids of infected" +
                    "individual (respiratory tract secretions, blood, vomitus, saliva, urine, faeces).\n" +
                    "If such contact occurs while not wearing recommended personal protective equipment (PPE) e.g., gowns, gloves, NIOSH-certified disposable N95 respirator, eye protection.");

        } else if (num == 34) {

            tv1.setText("4) How long does the virus survive on surfaces?");
            tv2.setText("It is not certain how long the virus that causes COVID-19 survives on surfaces, but it seems to behave like other coronaviruses. Studies suggest that" +
                    "coronaviruses (including preliminary information on the COVID-19 virus) may persist on surfaces for a few hours or up to several days. This may vary under" +
                    "different conditions.\n" + "A new analysis found that the virus can remain viable in the air for up to 3 hours, on copper for up to 4 hours, on cardboard up to 24 hours and on plastic " +
                    "and stainless steel up to 2 to 3 days. This study, which was published in the preprint database medRxiv on March 11, 2020.");

        } else if (num == 35) {

            tv1.setText("5) If a colleague gets infected, what should be done?");
            tv2.setText("Suggest your colleague to observe self-isolation & seek urgent medical help.\n" +
                    "If you were in close contact with your infected colleague, observe home quarantine and monitor yourself for symptoms. If you develop symptoms, seek medical help.");

        } else if (num == 36) {

            tv1.setText("6) Can I get sick with COVID-19 from touching food, the food packaging, or food contact surfaces, if the coronavirus was present on it?");
            tv2.setText("Currently there is no evidence of food or food packaging being associated with transmission of COVID-19. Like other viruses, it is possible that the virus " +
                    "that causes COVID-19 can survive on surfaces or objects.\n For that reason, it is critical to follow the key steps of food safety—clean, separate, cook.");

        } else if (num == 41) {

            tv1.setText("1) What does social distancing mean?");
            tv2.setText("Social distancing is the practice of reducing close contact between people in order to reduce opportunities for disease transmission. It can include large " +
                    "scale measures such as cancelling large gatherings, closing public places, cancelling events.\n" +
                    "Avoid: Group gatherings, concerts, theatre outings, athletic events, retail stores & malls, workouts in gym, mass transit systems like trains/buses, reduce non-essential workers in your home, restrict visitors to your home.");

        } else if (num == 42) {

            tv1.setText("2) What steps should I to take to prevent COVID-19?");
            tv2.setText("The best way to prevent illness is to avoid being exposed to this virus.\n" +
                    "Take following steps to protect yourself (these apply to populations across all age groups including pregnant women):\n" +
                    "i) Use any available form of face mask to cover your nose and mouth while stepping out of the house for any purpose*.\n" +
                    "ii) Wash your hands often with soap and water for at least 20 seconds especially after you have been in a public place, or after blowing your nose,\n" +
                    "coughing, or sneezing.\n" +
                    "If soap and water are not readily available, use a hand sanitizer that contains at least 60% alcohol. Cover all surfaces of your hands and rub them together\n" +
                    "until they feel dry.\n" +
                    "iii) Avoid touching your eyes, nose, and mouth with unwashed hands.\n" +
                    "iv) Avoid close contact with people who are sick. Maintain social distancing. At least 1 metre (3 feet) distance between yourself and anyone who is\n" +
                    "coughing or sneezing.\n" +
                    "v) Practice safe greetings. Avoid physical contact (handshakes, hugging). Greet with a Namaste, hand wave, nod or a bow.\n" +
                    "*Important: As per new guidelines issued by Government of India, the general public is directed to cover their mouth and nose with any available form of\n" +
                    "mask while stepping out of the house for any purpose in order to curb the spread of COVID-19 and maintain personal hygiene.\n" +
                    "As per the Central government advisory, people can use homemade face mask of basic cloth, handkerchief or fabric in at least two layers for this purpose.\n" +
                    "Cloth masks should be cleaned with soap/detergent/disinfectant and water and sun-dried for at least 5 hours after every single use. Masks used by one\n" +
                    "person must not be used by any other person.\n" +
                    "Homemade face mask is not recommended for Health care workers, Individuals who are in contact with or working with COVID-19 patients, patients with\n" +
                    "COVID-19. These individuals and patients are required to wear specified protective gear.");

        } else if (num == 43) {

            tv1.setText("3) Are hand sanitizers better than soap in order to kill the virus?");
            tv2.setText("In general, both handwashing with soap and water and hand sanitizer, when practiced/used correctly, are highly effective at killing most germs and\n" +
                    "pathogens.\n" +
                    "Wash your hands with soap and water, covering all surfaces for at least 20 seconds. If soap & water are not available, clean your hands with an alcoholbased hand sanitizer that contains at least 60% alcohol, covering all surfaces of your hands and rubbing them together until they feel dry.\n");

        } else if (num == 44) {

            tv1.setText("4) What is difference between isolation & quarantine?");
            tv2.setText("Isolation and quarantine help protect the public by preventing exposure to people who have or may have a contagious disease.\n" +
                    "Isolation separates sick people with a contagious disease from people who are not sick.\n" +
                    "Quarantine separates and restricts the movement of people who were exposed to a contagious disease to see if they become sick.\n" +
                    "While isolation serves the same purpose as quarantine, it’s reserved for those who are already sick. It keeps infected individuals away from healthy\n" +
                    "individuals to prevent sickness from spreading");

        } else if (num == 45) {

            tv1.setText("5) What is the duration of home quarantine?");
            tv2.setText("The home quarantine period is usually for 14 days from contact with a confirmed case. However, the decision to discontinue home isolation precautions\n" +
                    "will be made on a case-by-case basis, in consultation with your doctor and state and local health departments based on your heath until the risk of\n" +
                    "secondary transmission to others is thought to be low.\n");


        } else if (num == 46) {

            tv1.setText("6) I am on home quarantine and I notice symptom appearing, what should I do?\n");
            tv2.setText("Contact your doctor or nearest hospital immediately (local authorities or government approved hospital/clinics for COVID-19) as you may require\n" +
                    "hospitalisation for further care and management.\n");


        } else if (num == 51) {

            tv1.setText("1) Is there a treatment for the COVID-19?");
            tv2.setText("Currently there is no specific treatment for this disease, so healthcare providers treat the clinical symptoms with supportive care which has been highly\n" +
                    "effective for patients with symptoms.\n" +
                    "Various drug trials are underway (e.g; chloroquine, hydroxychloroquine, remdesivir)");

        } else if (num == 52) {

            tv1.setText("2) Is there a vaccine available to prevent COVID-19?");
            tv2.setText("There is currently no vaccine to prevent coronavirus disease 2019 (COVID-19)");


        } else if (num == 53) {

            tv1.setText("3) Am I protected against COVID-19 if I had the influenza vaccine this year?");
            tv2.setText("Influenza and the virus that causes COVID-19 are two very different viruses and the seasonal influenza vaccine will not protect against COVID-19.\n");

        } else if (num == 54) {

            tv1.setText("4) Will a pneumococcal vaccine help protect me against coronavirus?");
            tv2.setText("Vaccines against pneumonia, such as pneumococcal vaccine and Haemophilus influenza type B (Hib) vaccine, only help protect people from these specific\n" +
                    "bacterial infections. They do not protect against any coronavirus pneumonia, including pneumonia that may be part of COVID-19. However, even though\n" +
                    "these vaccines do not specifically protect against the coronavirus that causes COVID-19, they are highly recommended to protect against other respiratory\n" +
                    "illnesses");

        } else if (num == 55) {

            tv1.setText("5) Are antibiotics effective in treating or preventing COVID-19?");
            tv2.setText("No. Antibiotics do not work against viruses; they only work on bacterial infections. Antibiotics do not prevent or treat coronavirus disease (COVID-19),\n" +
                    "because COVID-19 is caused by a virus, not bacteria.");

        } else if (num == 56) {
            tv1.setText("6) Can antivirals such as Oseltamavir or other antivirals help treat COVID-19?");
            tv2.setText("Currently, there is no specific treatment for this disease, so healthcare providers treat the clinical symptoms with supportive care which has been highly\n" +
                    "effective for patients with symptoms. Various drug trials are underway (e.g; chloroquine, hydroxychloroquine, remdesivir).\n");


        } else if (num == 61) {

            tv1.setText("1) Can a person who has had coronavirus get infected again?");
            tv2.setText("While we don't know the answer yet, most people would likely develop at least short-term immunity to the specific coronavirus that causes COVID-19.\n" +
                    "However, you would still be susceptible to a different coronavirus infection. Or, this particular virus could mutate, just like the influenza virus does each\n" +
                    "year. Often these mutations change the virus enough to make you susceptible, because your immune system thinks it is an infection that it has never seen\n" +
                    "before.");


        } else if (num == 72) {

            tv1.setText("2) Should I avoid contact with pet or other animals if I am sick with COVID-19?");
            tv2.setText("Yes, you should restrict contact with pets and other animals while you are sick with COVID-19, just like you would around other people.\n" +
                    "Although there have not been reports of pets or other animals becoming sick with COVID-19, it is still recommended that people sick with COVID-19 limit\n" +
                    "contact with animals until more information is known about the virus.\n" +
                    "When possible, have another member of your household care for your animals while you are sick. If you must care for your pet or be around animals while\n" +
                    "you are sick, wash your hands before and after you interact with pets and wear a facemask. Avoid petting, snuggling, being kissed or licked, and sharing\n" +
                    "food.\n");

        } else if (num == 71) {

            tv1.setText("1) Can humans become infected with the COVID-19 from an animal source?");
            tv2.setText("Current research links COVID-19 to certain types of bat as the original source but does not exclude the involvement of other animals. However possible\n" +
                    "animal sources of COVID-19 have not yet been confirmed. There is no evidence that companion animals (e.g. dogs or cats) or other pet animals or birds\n" +
                    "pose a risk of infection to humans. As a general precaution, it is always wise to observe basic principles of hygiene when in contact with animals.\n" +
                    "To protect yourself, such as when visiting live animal markets, avoid direct contact with animals and surfaces in contact with animals. Ensure good food\n" +
                    "safety hygiene practices at all times. Handle raw meat, milk or animal organs with care to avoid contamination of uncooked foods and avoid consuming\n" +
                    "raw or undercooked animal products\n");

        } else if (num == 73) {


            tv1.setText("3) Can eating chicken or eggs cause COVID-19?");
            tv2.setText("Currently there is no evidence to suggest the spread of new corona virus through poultry products. However it is safest to avoid uncooked meat.\n" +
                    "For that reason, it is critical to follow the key steps of food safety—clean, separate, cook");

        } else if (num == 74) {

            tv1.setText("4) Should non vegetarian food be avoided?");
            tv2.setText("Ans. Currently, there is no evidence to suggest the spread of new corona virus through non vegetarian food. However it is safest to avoid uncooked meat.\n" +
                    "Practice safe food habits: Separate, Clean, Cook");

        } else if (num == 81) {

            tv1.setText("1) What is the mortality rate for Corona Virus?");
            tv2.setText("The WHO Estimated COVID-19 mortality at 3.4% as of March 2020. However as per recent studies from China, the mortality rate is different for age groups.\n" +
                    "It is 14.8% in people 80 or older, 8% in people between 70 to 79 years, 1.3% in people in their 50s, 0.4% in people in their 40s, and 0.2% in people 10 to 39\n" +
                    "years age group\n");

        } else if (num == 82) {

            tv1.setText("2) Can disinfectant sprays or wipes be used on my skin to prevent spread of COVID-19?");
            tv2.setText("No. Do not use disinfect sprays or wipes on your skin because it may cause skin and eye irritation. Disinfectant sprays or wipes are not intended for use on\n" +
                    "humans or animals. Disinfectant sprays or wipes are intended for use on hard, non-porous surfaces.\n");

        } else if (num == 83) {

            tv1.setText("3) Will warm weather stop the outbreak of COVID-19?");
            tv2.setText("Some viruses, like the common cold and flu, spread more when the weather is colder. But it is still possible to become sick with these viruses during\n" +
                    "warmer months. At this time, we do not know whether the spread of COVID-19 will decrease when the weather warms up.\n");

        } else if (num == 84) {

            tv1.setText("4) How effective are thermal scanners in detecting people infected with the new coronavirus?");
            tv2.setText("Thermal scanners are effective in detecting people who have developed a fever (i.e. have a higher than normal body temperature) because of infection with\n" +
                    "the new coronavirus.\n" +
                    "However, they cannot detect people who are infected but are not yet sick with fever. This is because it takes between 2 and 14 days before people who are\n" +
                    "infected become sick and develop a fever");

        } else if (num == 85) {

            tv1.setText("5) Will I die if I get COVID-19?\n");
            tv2.setText("No. Most people have mild symptoms and recover from the disease in 2 weeks with supportive medical care.\n");

        } else if (num == 86) {

            tv1.setText("6) How can I clean or disinfect my phone to protect myself from new corona virus?");
            tv2.setText("Wiping the hard, non-porous surfaces of a phones, such as displays and keyboards with 70% isopropyl alcohol is fine, as long as no moisture gets into any\n" +
                    "openings, keys, or charging ports.\n" +
                    "Phone cleaning tips:\n" +
                    "i. Unplug the phone before you clean\n" +
                    "ii. Use only soft, microfiber cloth. Do not use paper towels, which can scratch. Avoid excessive wiping, which may cause damage to the screen or finish.\n" +
                    "Spray the disinfectant containing 70% isopropyl alcohol onto the cloth and wipe the surface gently and allow to dry.\n" +
                    "iii. Do not spray the phone directly with disinfectants.\n" +
                    "iv. Avoid bleaches or other cleaning products.\n" +
                    "v. Even if your phone is water proof, do not wash it with soap and water under a tap.\n" +
                    "vi. Remember to clean your phone case as well. Use a washable case that you can take off, wash, wipe it dry and use.\n" +
                    "Remember to clean your hands after cleaning your phone. Follow guidelines on washing hands with soap & water for at least 20 seconds. If soap and water\n" +
                    "are not readily available, use a hand sanitizer that contains at least 60% alcohol. Cover all surfaces of your hands and rub them together until they feel dry");

        }

    }

    @Override
    public void finish() {

        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}
