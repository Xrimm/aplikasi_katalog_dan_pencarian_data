package com.example.uas_seluler

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailClass : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_class)
        supportActionBar?.hide()

        val className = intent.getStringExtra("EXTRA_CLASS")

        val tvClassName = findViewById<TextView>(R.id.tvClassName)
        val tvDescription = findViewById<TextView>(R.id.tvDescription)
        val tvSkill1 = findViewById<TextView>(R.id.tvSkill1)
        val tvSkill2 = findViewById<TextView>(R.id.tvSkill2)
        val tvSkill3 = findViewById<TextView>(R.id.tvSkill3)
        val tvSkill4 = findViewById<TextView>(R.id.tvSkill4)
        val tvSkill5 = findViewById<TextView>(R.id.tvSkill5)
        val tvSkill1Detail = findViewById<TextView>(R.id.tvSkill1Detail)
        val tvSkill2Detail = findViewById<TextView>(R.id.tvSkill2Detail)
        val tvSkill3Detail = findViewById<TextView>(R.id.tvSkill3Detail)
        val tvSkill4Detail = findViewById<TextView>(R.id.tvSkill4Detail)
        val tvSkill5Detail = findViewById<TextView>(R.id.tvSkill5Detail)

        tvClassName.text = "DATA: $className"

        when (className) {

            "Arcanist" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Arcane Circle [Max SL : 4]."
                tvSkill1Detail.text = "After you willingly dismiss an Arcanum on your turn during a conflict (see next page), if that Arcanum had not been summoned during this same turn and you have an arcane weapon equipped, you may immediately perform the Spell action for free. The spell you cast this way must have a total Mind Point cost of 【SL × 5】or lower (you must still pay the spell's MP cost)."
                tvSkill2.text = "2. Arcane Regeneration [Max SL : 2]."
                tvSkill2Detail.text = "When you summon an Arcanum, you immediately recover 【SL × 5】 Hit Points."
                tvSkill3.text = "3. Bind And Summon [Max SL : 1]."
                tvSkill3Detail.text = "You may bind Arcana to your soul and summon them later. The Game Master will tell you the details of each binding process when you first encounter the Arcanum in question.\n" +
                        "You may use an action and spend 30 Mind Points to summon an Arcanum you have bound: the details of this process are explained on the next page.\n" +
                        "If you take this Skill at character creation, you begin play with one Arcanum of your choice already bound to you, chosen from the list on the next pages. Other than that, you may only obtain new Arcana through exploration and story progression."
                tvSkill4.text = "4. Emergency Arcanum [Max SL : 6]."
                tvSkill4Detail.text = "As long as you are in Crisis, the cost for summoning your Arcana is reduced by 【SL × 5】 Mind Points."
                tvSkill5.text = "5. Ritual Arcanism [Max SL : 1]."
                tvSkill5Detail.text = "You may perform Rituals of the Arcanism discipline, as long as their effects fall within the domains of one or more Arcana you have bound (see next pages). Arcanism Rituals use 【WLP + WLP】 for the Magic Check"
            }

            "Esper" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima Atlas High Fantasy] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Cognitive Focus [Max SL : 5]."
                tvSkill1Detail.text = "\"At the start of your turn during a conflict, you may choose one ally who is able to hear you or one enemy you can see that is suffering from dazed, enraged, and/or shaken. Until the start of your next turn, the chosen creature becomes your focus.\n" +
                        "You gain a bonus equal to [SL] to Checks you perform to examine your focus, as well as to your Accuracy Checks and Magic Checks for attacks and offensive spells (r) that include your focus among the targets. When you cause your focus to recover Hit Points and/or Mind Points, they recover [SL × 2] additional HP and/or MP, respectively.\""
                tvSkill2.text = "2. Hypercognition [Max SL : 5]."
                tvSkill2Detail.text = "The total MP cost of your spells and verses (see High Fantasy Atlas, page 138) that include your focus among their targets is reduced by [SL], or by [SL × 2] if your focus is the only target (to a minimum cost of 0 Mind Points)."
                tvSkill3.text = "3. Navigator [Max SL : 1]."
                tvSkill3Detail.text = "You can communicate telepathically with any conscious ally within 1 travel day of you; you are able to hear each other for the sake of Skills and effects. You gain the ability to perform Rituals of the Ritualism discipline. Additionally, you may use Ritualism to transport creatures in and out of the soul network, and to gain information and track entities while inside the soul network."
                tvSkill4.text = "4. Psychic Gift [Max SL : 5]."
                tvSkill4Detail.text = "Each time you take this Skill, you gain a gift. The rules for gifts and for the Brainwave Clock can be found on the next page."
                tvSkill5.text = "5. Psychokinesis [Max SL : 1]."
                tvSkill5Detail.text = "When you perform an Accuracy Check, you may replace one of the Attribute dice with Willpower (such as 【DEX + WLP】 for a shortbow). Additionally, your melee attacks with weapons belonging to the arcane or sword Categories may target flying creatures"
            }

            "Wayfarer" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Faithful Companion [Max SL : 5]."
                tvSkill1Detail.text = "\"Together with the rest of your group, design a level 5 beast, construct, elemental or plant creature that becomes your companion. This creature has no Initiative score and does not level up, can have up to two basic attacks, gains a bonus equal to【SL】 to Accuracy Checks and Magic Checks, and their maximum Hit Points are equal to【(SL multiplied by the companion's base Might die size) + half your level】.\n" +
                        "Your companion doesn't get a turn during conflicts, but on your turn you can use an action to have the companion perform an action (only once per turn). If you leave a scene, your companion leaves with you.\n" +
                        "If your companion falls to 0 Hit Points, they flee and rejoin you at the start of the next scene in which you are present, with HP equal to their Crisis score. \n" +
                        "When you rest, your companion also gains the full benefits of resting.\""
                tvSkill2.text = "2. Resourceful [Max SL : 4]."
                tvSkill2Detail.text = "You recover【SL】 Inventory Points after each travel roll."
                tvSkill3.text = "3. Tavern Talk [Max SL : 3]."
                tvSkill3Detail.text = "When you rest inside an inn or tavern, you may ask the Game Master up to 【SL】 questions about your surroundings and the people who live here; the Game Master will answer truthfully and you describe how you gathered the information."
                tvSkill4.text = "4. Treasure Hunter [Max SL : 2]."
                tvSkill4Detail.text = "When your group journeys on the world map, you will make a discovery on a roll of 【SL + 1】 or lower on the travel roll (instead of only on a 1)."
                tvSkill5.text = "5. Well-Traveled [Max SL : 1]."
                tvSkill5Detail.text = "\"You reduce the die rolled for your travel rolls by one size (to a minimum of d6).\n" +
                        "If multiple characters have this Skill, the effects are not cumulative.\n" +
                        "\""
            }

            "Guardian" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Retaliation [Max SL : 5]."
                tvSkill1Detail.text = "When you deal damage during your turn, if you performed the Guard action during your previous turn and chose to cover an ally, you deal【SL】extra damage"
                tvSkill2.text = "2. Defensive Mastery [Max SL : 5]."
                tvSkill2Detail.text = "As long as you have a shield or a martial armor equipped, all damage you suffer is reduced by【SL】(applied before damage Affinities)."
                tvSkill3.text = "3. Dual Shieldbearer [Max SL : 1]."
                tvSkill3Detail.text = "\"You may now equip a shield in your main hand slot. As long as you have two shields equipped, you gain the benefits of both items and may treat them as the following combined two-handed melee brawling weapon: \n" +
                        "Twin Shields 【MIG + MIG】 【HR + 5】 Physical. Deals extra damage equal to your 【SL】 in defensive mastery.\""
                tvSkill4.text = "4. Fortress [Max SL : 4]."
                tvSkill4Detail.text = "Permanently increase your maximum Hit Points by【SL × 5】"
                tvSkill5.text = "5. Protect [Max SL : 1]."
                tvSkill5Detail.text = "When another creature is threatened by an attack, spell or other danger, you may take their place (any Checks that are part of the danger will be performed against you; you may declare the use of this Skill before or after the Checks have been made). If the danger already affected you, it affects you twice (resolve both instances separately); you also cannot protect multiple creatures from the same danger. If you use this Skill during a conflict, you cannot use it again until the start of your next turn."
            }

            "Arcanist Variant" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] + [Arcane Whispers] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Arcane Regeneration [Max SL : 6]."
                tvSkill1Detail.text = "After you willingly dismiss an Arcanum you are merged with, if you are in Crisis, you may have yourself and every ally present on the scene recover 【SL × 5】 Hit Points."
                tvSkill2.text = "2. Bind And Summon [Max SL : 1]."
                tvSkill2Detail.text = "\"You may bind Arcana to your soul and summon them later. When you encounter a new Arcanum, the Game Master will reveal what you must do in order to bind them. \n" +
                        "You may use an action and spend 30 Mind Points to summon the power of one of the Arcana you have previously bound (see next page). \n" +
                        "If you take this Skill at character creation, you begin play with one Arcanum bound to you (you may choose it from the sample Arcana or create it with your group). Any further Arcana must be obtained through exploration and story progression.\""
                tvSkill3.text = "3. Phantom Strength [Max SL : 6]."
                tvSkill3Detail.text = "When you perform a pulse, before resolving its effects, you may choose to have all damage you deal ignore Affinities until the end of this turn. If you do, the next time you deal damage before the end of this turn, you deal 【SL + 4】 extra damage."
                tvSkill4.text = "4. Quick Summoning [Max SL : 2]."
                tvSkill4Detail.text = "When you summon an Arcanum on your turn during a conflict, choose up to two options: reduce its MP cost by【SL × 5】; and/or after you summon the Arcanum, if you are merged with it, immediately perform its pulse. If you choose at least one option, you cannot willingly dismiss that Arcanum until the start of your next turn; if you choose both options, that Arcanum's dismiss effect will not be available for this summoning."
                tvSkill5.text = "5. Ritual Arcanism [Max SL : 1]."
                tvSkill5Detail.text = "You may perform Rituals of the Arcanism discipline, as long as their effects fall within the domains of one or more Arcana you have bound (see next pages). Arcanism Rituals use 【WLP + WLP】 for the Magic Check"
            }

            "Chimerist" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Consume [Max SL : 5]."
                tvSkill1Detail.text = "After you deal damage to one or more creatures with a spell, if you have an arcane, dagger or flail weapon equipped, you recover 【SL × 2】 Mind Points."
                tvSkill2.text = "2. Feral Speech [Max SL : 1]."
                tvSkill2Detail.text = "You can communicate with creatures of the beast, monster and plant Species."
                tvSkill3.text = "3. Pathogenesis [Max SL : 1]."
                tvSkill3Detail.text = "When you deal damage to one or more creatures with one of your Chimerist spells, each of those creatures that share their Species with the creature you originally learned that spell from suffers poisoned."
                tvSkill4.text = "4. Ritual Chimerism [Max SL : 1]."
                tvSkill4Detail.text = "You may perform Rituals whose effects fall within the Chimerism discipline. When you acquire this Skill, choose 【INS + WLP】or【MIG + WLP】. From now on, your Chimerism Rituals will use the chosen Attributes for the Magic Check"
                tvSkill5.text = "5. Spell Mimic [Max SL : 10]."
                tvSkill5Detail.text = "\"When you see a creature belonging to the beast, monster or plant Species cast a spell, you may immediately choose to learn that spell as a Chimerist spell of your own: if you do, record the Species of the creature you learned it from.\n" +
                        "When you first acquire this Skill, choose 【INS + WLP】or【MIG + WLP】. From now on, your offensive (r) Chimerist spells will use the chosen Attributes for the Magic Check, regardless of the Attributes used by the creature you learned the spell from.\n" +
                        "You may have up to 【SL + 2】 different Chimerist spells memorized this way. If you want to memorize a new Chimerist spell but are already at your limit, you must forget one of your old spells and replace it with the new spell.\""
            }

            "Darkblade" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Agony [Max SL : 5]."
                tvSkill1Detail.text = "Once per turn (including other player's turn), after you deal damage to one or more creatures, if you have a Bond towards at least one of those creatures, you may recover【SL × 2】 Hit Points and【SL × 2】 Mind Points"
                tvSkill2.text = "2. Dark Blood [Max SL : 1]."
                tvSkill2Detail.text = "As long as you are in Crisis, you have Resistance to dark damage and poison damage."
                tvSkill3.text = "3. Heart of Darkness [Max SL : 1]."
                tvSkill3Detail.text = "Once per scene upon entering Crisis, you may choose a specific creature you can see that you don't have a Bond towards. If you do, create a Bond of hatred towards that creature."
                tvSkill4.text = "4. Painful Lesson [Max SL : 3]."
                tvSkill4Detail.text = "\"After another creature causes you to lose Hit Points (with an attack, a spell or any other method), you may immediately perform the Study action on that creature (see page 74) for free. If you do, gain a bonus equal to【SL】 to your Check.\n" +
                        "Remember, you can study the same aspect of a creature only once.\""
                tvSkill5.text = "5. Shadow Strike [Max SL : 5]."
                tvSkill5Detail.text = "You have learned to channel your vital force into your attacks. You may use an action to perform a Shadow Strike: roll your current Might die and lose an amount of Hit Points equal to【the number rolled on your Might die】. If this didn't reduce your Hit Points to 0, you may perform a free attack with a weapon you have equipped: if this attack hits one or more targets, it deals extra damage equal to 【SL + the number rolled on your Might die】. However, all damage dealt by this attack becomes dark and its damage type cannot be changed."
            }

            "Elementalist" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Cataclysm [Max SL : 3]."
                tvSkill1Detail.text = "When you cast an instantaneous spell, if you have an arcane weapon equipped, you may increase the spell's total MP cost by up to【SL × 10】 Mind Points. If you do so and the spell deals damage to one or more creatures, it will deal 5 extra damage to each creature for every 10 Mind Points by which you increased its total MP cost."
                tvSkill2.text = "2. Elemental Magic [Max SL : 10]."
                tvSkill1Detail.text = "Each time you acquire this Skill, learn one   Elementalist spell. Offensive   Elementalist spells use【INS + WLP】 for the Magic Check."
                tvSkill3.text = "3. Magical Artillery [Max SL : 3]."
                tvSkill1Detail.text = "When you cast an offensive spell, if you have an arcane weapon equipped, you gain a bonus to your Magic Check equal to【SL × 2】"
                tvSkill4.text = "4. Ritual Elementalism [Max SL : 1]."
                tvSkill1Detail.text = "You may perform Rituals whose effects fall within the Elementalism discipline. Elementalism Rituals use【INS + WLP】 for the Magic Check"
                tvSkill5.text = "5. Spellblade [Max SL : 3]."
                tvSkill1Detail.text = "When you cast an offensive (r) spell targeting a single creature, if the spell has a total Mind Point cost of【SL × 20】or lower, you may choose one non-arcane weapon among those equipped. If you do, your Magic Check for the spell will use the chosen weapon's Accuracy Check formula; if that formula includes Dexterity, the Magic Check also gains a bonus equals to【SL】. For instance, the Magic Check for an   Elementalist spell cast through a bronze sword (page 131) when you have Skill Level 2 in Spellblade will cause the Magic Check be【DEX + MIG】+3 instead of【INS + WLP】"
            }

            "Entropist" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Absorb MP [Max SL : 5]."
                tvSkill1Detail.text = "After you suffer damage, you may immediately recover【SL × 2】 Mind Points."
                tvSkill2.text = "2. Entropic Magic [Max SL : 10]."
                tvSkill2Detail.text = "Each time you acquire this Skill. Offensive   Entropist spells use【INS + WLP】 for the Magic Check."
                tvSkill3.text = "3. Lucky Seven [Max SL : 1]."
                tvSkill3Detail.text = "You have a lucky number; at the beginning of each session, that number is 7. Once per scene after you perform a Check, you may replace the value shown on one of the dice you rolled with your lucky number (even if this would give an impossible Result, such as a value of 7 on a d6). If you do, the replaced value becomes your new lucky number."
                tvSkill4.text = "4. Ritual Entropism [Max SL : 1]."
                tvSkill4Detail.text = "You may perform Rituals whose effects fall within the Entropism discipline. Entropism Rituals use【INS + WLP】 for the Magic Check."
                tvSkill5.text = "5. Stolen Time [Max SL : 4]."
                tvSkill5Detail.text = "\"During a conflict, you may use an action to interfere with the flow of time by spending up to【SL × 5】Mind Points. For every 5 Mind Points you spend this way, choose one option: \n" +
                        "* one creature you can see suffers slow; \n" +
                        "* or one creature you can see recovers from slow; \n" +
                        "* or one enemy you can see who is suffering from slow loses 【10 + (SL × 5)】Hit Points\n" +
                        "* or one creature you can see may immediately perform the Equipment action for free; \n" +
                        "* or choose one ally you can see who has yet to take a turn during this round: that ally may take their turn immediately after yours during this round.\n" +
                        "Each option can only be chosen once per use of this Skill.\""
            }

            "Fury" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Adrenaline [Max SL : 5]."
                tvSkill1Detail.text = "As long as you are in Crisis, you deal【SL × 2】 extra damage (be it with attacks, spells, Arcana, items or any other method)."
                tvSkill2.text = "2. Frenzy [Max SL : 1]."
                tvSkill2Detail.text = "Your Accuracy Checks with brawling, dagger, flail and thrown weapons trigger a critical success if both dice show the same number (and the Check is not a fumble)."
                tvSkill3.text = "3. Indomitable Spirit [Max SL : 4]."
                tvSkill3Detail.text = "When you spend one or more Fabula Points, you get an additional benefit — choose one option: you recover【SL × 5】 Hit Points; or you recover【SL × 5】 Mind Points; or you recover from a single status effect of your choice."
                tvSkill4.text = "4. Provoke [Max SL : 5]."
                tvSkill4Detail.text = "\"You may use an action and spend 5 Mind Points to perform an Opposed【MIG + WLP】 Check against a creature you can see — describe how you taunt them! If you succeed, the target suffers enraged and is compelled to focus their attention on you (their attacks and offensive spells must include you among the targets if possible). This compulsion ends if you fall unconscious or leave the scene, if the creature is no longer enraged, or if they are successfully provoked by someone else.\n" +
                        "You gain a bonus equal to【SL】 to your【MIG + WLP】Checks for this Skill.\""
                tvSkill5.text = "5. Withstand [Max SL : 5]."
                tvSkill5Detail.text = "When you perform the Guard action, if you choose not to provide cover to another creature, you recover Hit Points equal to 【SL, multiplied by the highest strength among your Bonds】 and choose Might or Willpower: you treat the chosen Attribute as being one die size higher (up to a maximum of d12) until the end of your next turn."
            }

            "Loremaster" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Flash of Insight [Max SL : 3]."
                tvSkill1Detail.text = "\"When you roll a 13 or higher on a Check performed to investigate a creature, item or location this includes using the Study action during a conflict — you may ask the Game Master up to【SL】 questions concerning the subject of your investigation. You may ask these questions immediately or save them for later; whenever you ask one of these questions, the Game Master will answer truthfully and you will describe your character's deductive process.\n" +
                        "This Skill may only be used once on the same creature, item or location.\""
                tvSkill2.text = "2. Focused [Max SL : 6]."
                tvSkill2Detail.text = "\"Permanently increase your maximum Mind Points by【SL × 5】.\n" +
                        "When you perform an Open or Opposed Check using【INS + INS】, you gain a bonus equal to【SL】on that Check (this only applies to Open Checks).\""
                tvSkill3.text = "3. Knowledge Is Power [Max SL : 1]."
                tvSkill3Detail.text = "When you perform an Accuracy Check, you may replace one of the Attribute dice with Insight (such as【INS + INS】 for a pistol or【INS + MIG】 for a waraxe)."
                tvSkill4.text = "4. Quick Assessment [Max SL : 6]."
                tvSkill4Detail.text = "At the start of a conflict, you may spend up to【SL × 5】 Mind Points. For every 5 Mind Points you spend this way, choose one option: choose a creature you can see and the GM reveals one of their Traits; or name a damage type and choose a creature you can see, and the GM reveals that creature's Affinity towards that damage type."
                tvSkill5.text = "5. Trained Memory [Max SL : 1]."
                tvSkill5Detail.text = "You may perfectly recall the details of any scene you have visited within the past week. You can \"go back in time\" within your mind in order to examine and investigate such scenes again — your Flash of Insight Skill will apply to these memories as well."
            }

            "Orator" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Condemn [Max SL : 6]."
                tvSkill1Detail.text = "\"You may use an action and spend 5 Mind Points to perform an Opposed【INS + WLP】Check against a creature that can hear and understand — you describe your accusations! If you succeed, the target loses【SL × 5】 Mind Points and suffers dazed or shaken (your choice) and All sources of damage deals【SL】extra damage until the end of your next turn.\n" +
                        "You gain a bonus equal to【SL】 to your【INS + WLP】 Checks for this Skill.\""
                tvSkill2.text = "2. Encourage [Max SL : 6]."
                tvSkill2Detail.text = "During a conflict, you may use an action and spend 5 Mind Points to choose another creature that can hear and understand you. That creature recovers【10 + (SL × 5)】 Hit Points and chooses Dexterity, Insight, Might, or Willpower: they treat the chosen Attribute as being one die size higher (up to a maximum of d12) until the start of your next turn."
                tvSkill3.text = "3. My Trust In You [Max SL : 2]."
                tvSkill3Detail.text = "After another Player Character who is able to hear you performs a Check, you may spend 1 Fabula Point and invoke one of their Traits or Bonds in order to let them reroll dice or improve the Result of the Check (following the normal rules). Then, if you have a Bond towards that character, they recover【SL × 10】 Mind Points."
                tvSkill4.text = "4. Persuasive [Max SL : 2]."
                tvSkill4Detail.text = "When you successfully perform a Check to fill or erase sections of a Clock, if your approach relied on charm, diplomacy, deception or intimidation, you may spend up to【SL × 20】 Mind Points. If you do, fill or erase an additional section of that Clock for every 20 Mind Points you spend this way."
                tvSkill5.text = "5. Unexpected Ally [Max SL : 1]."
                tvSkill5Detail.text = "You may use an action and spend 1 Fabula Point to choose a non-hostile creature able to hear and understand you. If you do, that creature becomes helpful towards you so long as you are kind and respectful to them and your requests are reasonable."
            }

            "Rogue" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Cheap Shot [Max SL : 5]."
                tvSkill1Detail.text = "When you hit a creature with an attack, if the attack only targeted that creature and they are suffering from one or more status effects, you may have it deal extra damage equal to【SL + the number of status effects on the creature】"
                tvSkill2.text = "2. Dodge [Max SL : 3]."
                tvSkill2Detail.text = "As long as you have no shields and no martial armor equipped, your Defense score is increased by【SL】"
                tvSkill3.text = "3. High Speed [Max SL : 3]."
                tvSkill3Detail.text = "At the start of a conflict, you may spend 10 Mind Points. If you do, choose one option and apply it before the start of the first round: perform a free attack with a weapon you have equipped; or perform a Hinder or Objective action. You also gain a bonus equal to【SL】 to all Checks you perform as part of the chosen option."
                tvSkill4.text = "4. See You Later [Max SL : 1]."
                tvSkill4Detail.text = "You may use an action and spend 1 Fabula Point to vanish from the current scene, reappearing whenever you want during a different scene in which another Player Character is present. Describe how you escaped and miraculously got here!"
                tvSkill5.text = "5. Soul Steal [Max SL : 5]."
                tvSkill5Detail.text = "\"During a Conflict, you may use an action to perform a【DEX + WLP】 Check against the Magic Defense of a creature you can see. If you succeed and the target is a soldier, you recover【SL】 Inventory Points; if they are an elite or champion, the GM gives you the target’s soul treasure, an item worth an amount of zenit equal to or lower than【the target's level multiplied by 30, or by 50 if they are a Villain】. This soul treasure will appear inside your backpack; a creature can be successfully stolen from with this Skill only once.\n" +
                        "You gain a bonus equal to【SL】 to your【DEX + WLP】 Checks for this Skill.\""
            }

            "Sharpshooter" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Barrage [Max SL : 1]."
                tvSkill1Detail.text = "When you perform a ranged attack, you may spend 10 Mind Points to choose one option: the attack gains multi (2); or you increase the attack's multi property by one, up to a maximum of multi (3)."
                tvSkill2.text = "2. Crossfire [Max SL : 1]."
                tvSkill2Detail.text = "After a creature you can see performs a ranged attack, you may spend an amount of Mind Points equal to【5 + The result of their Accuracy Check】in order to have the attack fail automatically against all targets. You can only use this Skill if you have a ranged weapon equipped, and it has no effect if the Accuracy Check you targetted was a critical success."
                tvSkill3.text = "3. Hawkeye [Max SL : 5]."
                tvSkill3Detail.text = "When you perform the Guard action, if you choose not to provide cover to another creature, you may spend 10 Mind Points to choose one option: the next ranged attack you perform before the end of your next turn will deal【5 + (SL × 5)】extra damage and all its damage ignores Resistances and Vulnerabilities; or you may immediately perform a free attack with a bow or firearm you have equipped, treating your High Roll (HR) as 0 when calculating damage dealt by this attack."
                tvSkill4.text = "4. Ranged Weapon Mastery [Max SL : 4]."
                tvSkill4Detail.text = "You gain a bonus equal to【SL】 to all Accuracy Checks with ranged weapons."
                tvSkill5.text = "5. Warning Shot [Max SL : 4]."
                tvSkill5Detail.text = "When you hit one or more targets with a ranged attack that would deal damage, you may have the attack deal no damage. If you do, choose one option: inflict shaken on each target hit by the attack; or inflict slow on each target hit by the attack; or each target hit by the attack loses【SL × 10】 Mind Points. Describe your maneuver!"
            }

            "Spiritist" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Healing Power [Max SL : 2]."
                tvSkill1Detail.text = "\"When you cast a spell that targets one or more allies, if you have an arcane weapon equipped, you may have each of those allies recover an amount of Hit Points equal to【3 + (SL, multiplied by the number of Bonds you have towards your target)】.\n" +
                        "This healing is separate from any healing caused by the effects of the spell.\""
                tvSkill2.text = "2. Ritual Spiritism [Max SL : 1]."
                tvSkill2Detail.text = "\"You may perform Rituals whose effects fall within the Spiritism discipline.\n" +
                        "Spiritism Rituals use【INS + WLP】 for the Magic Check.\n" +
                        "\""
                tvSkill3.text = "3. Spiritual Magic [Max SL : 10]."
                tvSkill3Detail.text = "Each time you acquire this Skill, learn one   Spiritist spell. Offensive   Spiritist spells use【INS + WLP】 for the Magic Check."
                tvSkill4.text = "4. Support Magic [Max SL : 1]."
                tvSkill4Detail.text = "When you cast a spell that targets one or more allies, if you have an arcane weapon equipped, you may choose one of those allies you have a Bond towards. If you do, that ally gains a bonus to the next Check they perform during the current scene; this bonus is equal to the strength of your Bond towards them."
                tvSkill5.text = "5. Vismagus [Max SL : 1]."
                tvSkill5Detail.text = "When you cast a spell, if you don’t have enough Mind Points to pay for its total cost, you may choose to spend an amount of Hit Points equal to (10 + the spell’s total MP cost) instead. If a spell cast this way would cause you to recover Hit Points, you instead recover no Hit Points (the spell functions normally on any other target)."
            }

            "Tinkerer" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Emergency Item [Max SL : 1]."
                tvSkill1Detail.text = "Once per conflict scene, if you are in Crisis, you may perform an additional action on your turn. This action must be the Inventory action."
                tvSkill2.text = "2. Gadgets [Max SL : 5]."
                tvSkill2Detail.text = "\"When you first acquire this Skill, choose a gadget type: alchemy, infusions, magiarmament, magisphere, magitech (old) or magitech (override). You gain its basic benefits.\n" +
                        "\n" +
                        "Whenever you take this Skill again, choose one option: you gain the basic benefits of a new gadget type; or you gain the advanced benefits of a gadget type whose basic benefits you already obtained; or you gain the superior benefits of a gadget type whose advanced benefits you already obtained\""
                tvSkill3.text = "3. Potion Rain [Max SL : 2]."
                tvSkill3Detail.text = "When you create a potion that restores a single creature's HP and/or MP, you may have it affect up to【SL】 additional creatures. If you do, the potion only restores half the normal amount of HP and MP to each creature."
                tvSkill4.text = "4. Secret Formula [Max SL : 5]."
                tvSkill4Detail.text = "\"When you create a potion or magisphere whose effects restore HP and/or MP, each restored amount is increased by【SL × 5】.\n" +
                        "When you create an elemental shard, potion or magisphere that deals damage, that item deals【SL】 extra damage.\n" +
                        "\""
                tvSkill5.text = "5. Visionary [Max SL : 5]."
                tvSkill5Detail.text = "When you work on a Project, up to【SL × 100】 zenit of material costs are automatically paid; additionally, you generate an additional 【SL】 progress every day. If multiple characters with this Skill work on the same Project, the effects will be cumulative."
            }

            "Weaponmaster" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Bladestorm [Max SL : 1]."
                tvSkill1Detail.text = "When you perform a melee attack, you may spend 10 Mind Points to choose one option: the attack gains multi (2); or you increase the attack's multi property by one, up to a maximum of multi (3)."
                tvSkill2.text = "2. Bonecrusher [Max SL : 4]."
                tvSkill2Detail.text = "When you hit one or more targets with a melee attack that would deal damage, you may have the attack deal no damage. If you do, choose one option: inflict dazed on each target hit by the attack; or inflict weak on each target hit by the attack; or each target hit by the attack loses【SL × 10】 Mind Points. Describe your maneuver!"
                tvSkill3.text = "3. Breach [Max SL : 4]."
                tvSkill3Detail.text = "You may use an action and spend 10 Mind Points to perform a free attack with a melee weapon you have equipped; this attack must target only one creature. If the attack is successful, choose one option: the attack deals no damage and, until the start of your next turn, your allies deal【SL + 4】extra damage to its target; or the attack deals【SL × 5】extra damage and all its damage ignores Resistances, but it also ignores Vulnerabilities unless the type of damage dealt is physical."
                tvSkill4.text = "4. Counterattack [Max SL : 1]."
                tvSkill4Detail.text = "After an enemy hits or misses you with a melee attack, if the Result of their Accuracy Check was an even number, you may perform a free attack against that enemy (after their attack has been fully resolved). This attack must be a melee attack and must have that enemy as its only target; treat your High Roll (HR) as 0 when calculating damage dealt by this attack."
                tvSkill5.text = "5. Melee Weapon Mastery [Max SL : 4]."
                tvSkill5Detail.text = "You gain a bonus equal to【SL】 to all Accuracy Checks with melee weapons"
            }

            "Dancer" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima Atlas High Fantasy] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Dance [Max SL : 10]."
                tvSkill1Detail.text = "Each time you take this Skill, you learn a dance (see next page). On your turn during a conflict scene, if you have no martial armor equipped, you may spend 10 Mind Points to perform a dance you have learned. This doesn’t require an action, but it can only be done before or after an action, and only once per turn. If you already performed a different dance during your previous turn in this scene, the cost of the new dance is reduced to 5 Mind Points.Some dances are instantaneous and resolve immediately, while others have effects that last until the start of your next turn."
                tvSkill2.text = "2. Follow my lead [Max SL : 1]."
                tvSkill2Detail.text = "When you perform a dance with a duration of “Until the start of your next turn”, youmay spend 10 additional Mind Points. If you do, choose one ally you can see towardswhom you have a Bond of affection: apply the benefits of the dance to that ally as wellas yourself (the benefits still last until the start of your next turn)."
                tvSkill3.text = "3. Frenetic Footwork [Max SL : 2]."
                tvSkill3Detail.text = "After you perform a dance with a duration of “Until the start of your next turn”, you gain a bonus equal to 【SL × 2】 to all Opposed Checks that rely on acrobatics, coordinationor speed until the start of your next turn."
                tvSkill4.text = "4. Quick Change [Max SL : 1]."
                tvSkill4Detail.text = "After you perform a dance, you may perform the Equipment action for free."
                tvSkill5.text = "5. War  Dancer [Max SL : 5]."
                tvSkill5Detail.text = "After you perform a dance, your attacks with brawling, dagger, flail, sword, and thrown weapons deal (SL) extra damage until the start of your next turn. If you have an arcane weapon equipped, offensive spells (OO) you cast also deal (SL) extra damage until the start of your next turn."
            }

            "Commander" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima Atlas High Fantasy] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Bishop's Edict [Max SL : 5]."
                tvSkill1Detail.text = "During a conflict, you may use an action and spend 10 Mind Points to choose one option: all MP costs are doubled; or all sources of damage deal 【SL × 3】 extra damage. The chosen effect lasts until the start of your next turn."
                tvSkill2.text = "2. Charging Cavalry [Max SL : 5]."
                tvSkill2Detail.text = "During a conflict, you may use an action and spend 10 MP to choose one ally that can hear you. That ally may immediately perform a free attack with a weapon they have equipped (or with a basic attack if they are an NPC). They gain a bonus equal to 【SL 3】to the Accuracy Check, but treat their High Roll (HR) as 0 when calculating damage."
                tvSkill3.text = "3. Crushing Chariot [Max SL : 1]."
                tvSkill3Detail.text = "After you use Bishop’s Edict, Charging Cavalry or King’s Castle, you may choose another Player Character that can hear you who has yet to take a turn during this round. That character may take their turn immediately after yours during this round."
                tvSkill4.text = "4. King's Castle [Max SL : 4]."
                tvSkill4Detail.text = "During a conflict, you may use an action and spend 10 Mind Points to choose one option: no creature can recover Hit Points or Mind Points; or all effects that restore Mind Points restore 【SL × 5】 additional Mind Points. The chosen effect lasts until the start of your next turn."
                tvSkill5.text = "5. Queen's Gambit [Max SL : 6]."
                tvSkill5Detail.text = "During a conflict, you may use an action to perform a free attack with a weapon you have equipped, treating your High Roll (HR) as 0 when calculating damage. After the attack is resolved, choose one option: one ally who is able to hear you recovers 【5 + (SL × 5)】 Hit Points; or you may immediately use a Skill you acquired among Bishop’s Edict, Charging Cavalry or King’s Castle for free (spending the appropriate MP)."
            }

            "Chanter" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima Atlas High Fantasy] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Magichant [Max SL : 10]."
                tvSkill1Detail.text = "On your turn during a conflict scene, you may use an action and spend a variable amount of MP to weave voice and music into a magical effect known as a verse. You may only sing one verse per turn, even if you have access to multiple actions; the full rules for verses can be found starting on the next page. When you first acquire this Skill, you learn all three volumes, plus one key and one tone (see next page). Whenever you acquire this Skill again, you may learn one key or one tone (your choice)"
                tvSkill2.text = "2. Resonance [Max SL : 3]."
                tvSkill2Detail.text = "After you affect one or more enemies with a verse, if you have an arcane weapon equipped, you may choose one option: until the start of your next turn, your allies deal 【SL】 extra damage to those enemies; or until the start of your next turn, you recover 【SL】 Mind Points every time one of those enemies suffers damage (if the same source deals damage to two or more of those enemies at the same time, you recover【SL】 MP for each damaged enemy)"
                tvSkill3.text = "3. Siren's  [Max SL : 1]."
                tvSkill3Detail.text = "You gain the ability to perform Rituals of the Ritualism discipline; additionally, you may use Ritualism to create hearing-based illusions."
                tvSkill4.text = "4. Sound Barrier [Max SL : 5]."
                tvSkill4Detail.text = "After you sing a verse with medium or high volume, all physical damage you suffer until the start of your next turn is reduced by 【SL】 (applied before Affinities)"
                tvSkill5.text = "5. Vibrato [Max SL : 1]."
                tvSkill5Detail.text = "After you sing a verse with low or medium volume, you may perform a free attack with a weapon you have equipped; treat your High Roll (HR) as 0 when calculating damage dealt by this attack."
            }

            "Symbolist" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima Atlas High Fantasy] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Magic Symbols [Max SL : 3]."
                tvSkill1Detail.text = "If an ally bears one of your symbols, that ally may perform the Spell action and destroy that symbol to cast a single spell among those you know, as long as it has a total Mind Point cost equal to or lower than【SL × 10】 (that ally must still pay the MP cost)."
                tvSkill2.text = "2. Mirage [Max SL : 1]."
                tvSkill2Detail.text = "You gain the ability to perform Rituals of the Ritualism discipline; additionally, you may use Ritualism to create sight-based illusions."
                tvSkill3.text = "3. Personal Touch [Max SL : 5]."
                tvSkill3Detail.text = "When a creature you can see that is bearing one of your symbols suffers damage or recovers Hit Points and/or Mind Points, you may have that creature suffer 【SL】extra damage or recover 【SL】 additional Hit Points and/or Mind Points, respectively)."
                tvSkill4.text = "4. Symbolic Connection [Max SL : 1]."
                tvSkill4Detail.text = "You always know the exact direction in which to find any creature bearing one of your symbols, as long as that creature is within 2 travel days of your position."
                tvSkill5.text = "5. Symbolism [Max SL : 5]."
                tvSkill5Detail.text = "Each time you acquire this Skill, you learn two symbols (see next page).You may have up to【SL + 1】symbols active at the same time; if you create more while at your limit, you must first choose and destroy some of your previous symbols. You may perform the Inventory action and spend 2 Inventory Points to create a symbol you have learned and choose one option: apply that symbol to yourself; or apply that symbol to an ally you can see; or perform a free attack with a weapon you have equipped. This attack deals no damage, but you apply a copy of the chosen symbol to each enemy hit by the attack (each copy counts as a separate symbol towards your limit of【SL + 1】 active symbols)."
            }

            "Mutant" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima Atlas Techno Fantasy] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Akhromorphosis [Max SL : 3]."
                tvSkill1Detail.text = "\"Your unarmed strikes deal 【6 + (SL × 2)】 extra damage, and you gain a bonus equal to 【SL】 to your Accuracy Checks with them.\n" +
                        "At the start of your turn during a conflict, you may choose a weapon Category other than brawling. If you do, your unarmed strikes now belong to the chosen Category. If you choose bow, firearm or thrown, they become ranged weapons instead of melee. If you choose dagger or sword, they cannot be used with Triple Slash (see High Fantasy Atlas, page 161). These changes last until the start of your next turn.\""
                tvSkill2.text = "2. Biophagy [Max SL : 4]."
                tvSkill2Detail.text = "After one of your attacks or offensive spells (r) causes one or more enemies to lose Hit Points, if you are in Crisis, you may recover 【SL × 5】 Hit Points."
                tvSkill3.text = "3. Ecdysis [Max SL : 1]."
                tvSkill3Detail.text = "After you lose Hit Points due to damage, if that damage had a type other than physical, you may spend 10 Hit Points to gain Resistance to that damage type until you use this Skill again. You cannot use this Skill if doing so would reduce you to 0 HP."
                tvSkill4.text = "4. Genoclepsis [Max SL : 2]."
                tvSkill4Detail.text = "When you deal damage to one or more NPCs, you learn their Species and the GM chooses 【SL】 therioforms appropriate to those NPCs (see next page): if you have acquired the Theriomorphosis Skill, you may immediately pay its HP cost and use it to manifest those therioforms (even if they are not among those you have learned)."
                tvSkill5.text = "5. Theriomorphosis [Max SL : 6]."
                tvSkill5Detail.text = "\"Each time you acquire this Skill, you learn a therioform (see next page).\n" +
                        "You may use an action and spend one third of your current Hit Points (rounded down) to manifest the effects of up to two therioforms from those you have learned. The details of this transformation are explained on the next page.\""
            }

            "Pilot" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima Atlas Techno Fantasy] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Compression Tech [Max SL : 1]."
                tvSkill1Detail.text = "\"As long as there is no one aboard your personal vehicle, you may have it safely disappear from the game world at any time. What magic or technology allows it?\n" +
                        "If your personal vehicle is not present in the game world and you are in a space big enough to contain it, you may perform the Inventory action and spend 2 Inventory Points to have the vehicle appear near you, and enter it for free.\""
                tvSkill2.text = "2. Flexible Configuration [Max SL : 4]."
                tvSkill2Detail.text = "When you perform the Equipment or Guard action while driving your personal vehicle, you may choose up to [SL] of its enabled modules and disable them. If you do, choose up to an equal amount of its disabled modules and enable them."
                tvSkill3.text = "3. Heart in The Engine [Max SL : 3]."
                tvSkill3Detail.text = "At the start of your turn during a conflict, if you are driving your personal vehicle, you may spend 10 Mind Points. If you do, choose one option: the next time you deal damage during this turn, deal [SL × 2] extra damage; or, the next time you suffer damage before the start of your next turn, that damage is reduced by [SL × 2] (applied before damage Affinities); or, you recover from either the slow or weak status effects (your choice)."
                tvSkill4.text = "4. Personal Vehicle [Max SL : 5]."
                tvSkill4Detail.text = "\"When you acquire this Skill, you gain a personal vehicle with a frame of your choice and three different modules of your choice (see next page).\n" +
                        "\n" +
                        "Whenever you acquire this Skill again, you acquire two additional modules of your choice. The maximum number of modules enabled at the same time on a personal vehicle is equal to【3 + its   Pilot’s SL in Personal Vehicle】. \""
                tvSkill5.text = "5. Strong Grip [Max SL : 1]."
                tvSkill5Detail.text = "When you perform an Accuracy Check with a weapon module, you may replace one of the Attributes with Might (such as 【MIG + WLP】 for an arcane module)."
            }

            "Necromancer" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Necromancer] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Beyond The Realms Of Death [Max SL : 5]."
                tvSkill1Detail.text = "When another creature you can see loses Hit Points while in Crisis, if they are not undead, you gain 1 Grave Point. You may never have more than【 SL + 1】 Grave Points. When you are reduced to 0 Hit Points, you lose all Grave Points; then, if you lost at least 1 Grave Point this way and this is the first time you are reduced to 0 HP during this scene, you do not Surrender nor Sacrifice yourself: instead, you recover an amount of HP equal to【 SL, multiplied by the amount of Grave Points you lost this way】"
                tvSkill2.text = "2. Children of the grave [Max SL : 1]."
                tvSkill2Detail.text = "You can always communicate verbally with undead creatures. Once per scene, you may ask an undead a single question; they are compelled to answer truthfully."
                tvSkill3.text = "3. Fear is the key [Max SL : 3]."
                tvSkill3Detail.text = "After you cause one or more enemies to lose Hit Points, if you have acquired the Beyond the Realms of Death Skill and at least one of them is suffering from shaken and/or weak, you gain 1 Grave Point and recover【SL × 2】 Hit Points and Mind Points."
                tvSkill4.text = "4. For whom the bells toll [Max SL : 3]."
                tvSkill4Detail.text = "When you deal damage to a creature with a spell, if that spell only deals damage to that creature, you may spend 1 Grave Point. If you do, choose one option: if that creature is suffering from one or more status effects, the spell deals extra damage equal to【 (SL × 2) + the number of status effects on that creature】; or if that creature is suffering from no status effects, they suffer shaken."
                tvSkill5.text = "5. Rondo of nightmare [Max SL : 1]."
                tvSkill5Detail.text = "When you cast an offensive spell (r) with a target of \"One creature\", you may spend 2 Grave Points to have it target all creatures you can see that are present on the scene (perform a single Magic Check and confront it with the Magic Defense of each target). If you do, all damage dealt by the spell becomes dark and its type cannot change."
            }

            "Floralist" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima Atlas Natural Fantasy] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Battle Gardening [Max SL : 3]."
                tvSkill1Detail.text = "After you plant a magiseed through the Chloromancy Skill (not when using Graft), you may choose one option: you perform a free attack with an equipped weapon; or you immediately perform the Spell action for free, casting a spell with a total Mind Point cost equal to or lower than【5 + (SL × 5)】 (you must still pay its MP cost). Treat the High Roll (HR) of your Accuracy Check or Magic Check as being equal to 0 when determining damage dealt by this attack or spell."
                tvSkill2.text = "2. Chloromancy [Max SL : 10]."
                tvSkill2Detail.text = "Each time you acquire this Skill, you discover a new type of magiseed. The rules for discovering magiseeds can be found in the next pages. During a conflict, if there are no magiseeds in your garden, you may use an action and spend 20 Mind Points to plant a magiseed among those you have discovered. The rules for the garden and for growing magiseeds can be found in the next pages."
                tvSkill3.text = "3. Graft [Max SL : 1]."
                tvSkill3Detail.text = "As long as there is a magiseed in your garden and 1 or more sections of your Growth Clock are filled, you may use an action to remove that magiseed from your garden: if you do, you immediately plant a different magiseed among those you have discovered (keep the current filled sections of your Growth Clock unchanged)."
                tvSkill4.text = "4. Tree of Life [Max SL : 5]."
                tvSkill4Detail.text = "When you remove a magiseed from your garden, you may choose one creature you can see: if that creature is in Crisis, they recover 【5 + (SL × 5)】 Hit Points."
                tvSkill5.text = "5. Verdant Sway [Max SL : 1]."
                tvSkill5Detail.text = "You gain the ability to perform Rituals of the Ritualism discipline; additionally, you may use Ritualism to create, animate, and/or control vegetation, pollen, spores, and toxins (but you cannot create nor control plant-Species NPCs this way)."
            }

            "Gourmet" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima Atlas Natural Fantasy] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Cooking [Max SL : 5]."
                tvSkill1Detail.text = "When you rest inside a settlement, you gain【SL】 ingredients (see next page). You may use an action and combine 2 or 3 ingredients to prepare a delicacy (see next page) and choose one option: you apply its effects to yourself or an ally you can see; or you perform a free attack with a weapon you have equipped. This attack deals no damage, but you apply the delicacy's effects to each enemy hit by the attack. You may carry up to 10 + 【SL × 5】 ingredients, and they will never spoil until you use them; if you take this Skill during character creation, you begin play with ten ingredients with random tastes."
                tvSkill2.text = "2. Knife and Fork [Max SL : 1]."
                tvSkill2Detail.text = "When you perform the free attack granted by the Cooking Skill, if you combined no more than 2 ingredients, you may have the attack deal damage as normal. If you do, you treat your High Roll (HR) as 0 when calculating damage dealt by this attack."
                tvSkill3.text = "3. Made With Love [Max SL : 3]."
                tvSkill3Detail.text = "When you use the Cooking Skill and choose to apply the effects of the delicacy to yourself or an ally you can see, you may spend up to【SL × 10】 MP. For every 10 MP you spend this way, you also apply the delicacy's effects to another ally you can see."
                tvSkill4.text = "4. Salt and Pepper [Max SL : 1]."
                tvSkill4Detail.text = "When you prepare a delicacy, you may spend 2 Inventory Points: if you do, change the taste of one ingredient to a different taste of your choice."
                tvSkill5.text = "5. Traveling Cook [Max SL : 3]."
                tvSkill5Detail.text = "After each travel roll, if you acquired the Cooking Skill, you gain【SL × 2】 ingredients."
            }

            "Invoker" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima Atlas Natural Fantasy] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Elemental Harmony [Max SL : 2]."
                tvSkill1Detail.text = "You may verbally communicate with creatures of the elemental Species. When you restore a creature's Hit Points with an invocation or spell, if an elemental is present on the scene, the restored amount is increased by 【SL × 5】"
                tvSkill2.text = "2. Invocation [Max SL : 3]."
                tvSkill2Detail.text = "You may use an action and spend 5 Mind Points to perform an invocation, drawing energy from one of the wellsprings present on the scene (see next page). Your 【SL】 in this Skill determines which invocations you have access to."
                tvSkill3.text = "3. Linked Invocation [Max SL : 3]."
                tvSkill3Detail.text = "When you perform an invocation, you may spend up to【SL × 10】 additional Mind Points. For every 10 Mind Points you spend this way, the invocation may target an additional creature you can see."
                tvSkill4.text = "4. Ripples [Max SL : 5]."
                tvSkill4Detail.text = "After an enemy you can see loses Hit Points due to damage dealt by one of your allies, if that damage was increased by one or more of your \"hex\" invocations, you may perform a free attack with a weapon you have equipped. This attack may only target that enemy, and receives a bonus equal to 【SL】 to its Accuracy Check; if it is successful, all its damage becomes of the same type dealt by your ally, and all \"hex\" invocations present on its target end immediately after the attack has been resolved. If two or more enemies trigger this Skill at the same time, you can perform a free attack against each of them, in whatever order you prefer."
                tvSkill5.text = "5. Wellspring Expansion [Max SL : 5]."
                tvSkill5Detail.text = "As long as you have a weapon belonging to the arcane, bow, brawling, flail, sword, or thrown Category equipped, your \"blast\" invocations deal 【SL】 extra damage, and the extra damage granted by your \"hex\" invocations is increased by 【SL】"
            }

            "Merchant" -> {
                tvDescription.text = "SL = Skill Level. \n" +
                        "See next page = For this class, reference in the book [Fabula Ultima Atlas Natural Fantasy] : \n" +
                        "https://drive.google.com/drive/folders/1xfllTyh9h4nwjAc89KCt93dVVmQYIvLC"

                tvSkill1.text = "1. Expiration Date [Max SL : 3]."
                tvSkill1Detail.text = "When a potion or delicacy (see page XXX) you created that does not deal damage causes one or more creatures to recover Hit Points, you may instead have it deal poison damage equal to 【half your level + (SL × 10)】 to each of those creatures. This damage's type cannot change, and it is halved if you are dealing damage to two or more creatures."
                tvSkill2.text = "2. I've heard of it! [Max SL : 3]."
                tvSkill2Detail.text = "When you or an ally who is able to hear and understand you perform a Check to examine a creature, item, or location, you may spend 1 Trade Point to grant a bonus equal to 【SL × 2】 to the Result of that Check."
                tvSkill3.text = "3. Private Stock [Max SL : 3]."
                tvSkill3Detail.text = "When you or another Player Character spend 【SL + 2】 or fewer Inventory Points, you may spend 1 Trade Point to ignore that cost."
                tvSkill4.text = "4. Real Treasure [Max SL : 3]."
                tvSkill4Detail.text = "Once per session, when you help an NPC or community defeat greed and corruption, improve their quality of life, or coexist with other creatures, if you have acquired the Winds of Trade Skill, you gain 【SL + 1】 Trade Points."
                tvSkill5.text = "5. Winds of Trade [Max SL : 3]."
                tvSkill5Detail.text = "\"After you rest in an area where commerce is possible, you gain 【SL + 1】 Trade Points. You may never have more than 【SL + 3】 Trade Points; if you acquire this Skill during character creation, you begin play with 2 Trade Points.\n" +
                        "During a non-conflict scene, you may spend 2 Trade Points to choose one option: you create a material or rare item approved by the Game Master whose value in zenit is equal to or lower than【your level, multiplied by 30】; or you create an NPC that lives nearby and explain their occupation as well as how you met them, then the Game Master tells you what they require in exchange for their services.\""
            }

            else -> {
                tvDescription.text = "Class tidak diketahui."
            }
        }
    }
}