package fr.umontpellier.iut;

public class GestionnairePseudonyme {

        private GestionnairePseudonyme() {
                throw new IllegalStateException("Utility class");
        }

        public static int getNbHarryPotterPersonnages() {
                return HARRY_POTTER_PERSONNAGES.length;
        }

        public static String getMessageNominationParLaCape(int indexPseudo) {
                return String.format("Ça y est la *Cape* a prit sa décision et vous a nommé %s%n%s",
                                getDenomination(indexPseudo), getDescription(indexPseudo));
        }

        public static String getDenomination(int indexPseudo) {
                return String.format("%s %s", ICONES_ANIMAUX[indexPseudo % ICONES_ANIMAUX.length],
                                HARRY_POTTER_PERSONNAGES[indexPseudo]);
        }

        public static String getDescription(int indexPseudo) {
                return HARRY_POTTER_PERSONNAGES_DESCRIPTIONS[indexPseudo];
        }

        private static final String[] ICONES_ANIMAUX = { ":dog:", ":cat:", ":mouse:", ":hamster:", ":rabbit:", ":fox:",
                        ":bear:", ":panda_face:", ":polar_bear:", ":koala:", ":tiger:", ":lion_face:", ":cow:", ":pig:",
                        ":pig_nose:", ":frog:", ":monkey_face:", ":see_no_evil:", ":hear_no_evil:", ":speak_no_evil:",
                        ":monkey:", ":chicken:", ":penguin:", ":bird:", ":baby_chick:", ":hatching_chick:",
                        ":hatched_chick:", ":duck:", ":dodo:", ":eagle:", ":owl:", ":bat:", ":wolf:", ":boar:",
                        ":horse:", ":unicorn:", ":bee:", ":bug:", ":butterfly:", ":snail:", ":worm:", ":lady_beetle:",
                        ":ant:", ":fly:", ":mosquito:", ":cockroach:", ":beetle:", ":cricket:", ":spider:",
                        ":spider_web:", ":scorpion:", ":turtle:", ":snake:", ":lizard:", ":t_rex:", ":sauropod:",
                        ":octopus:", ":squid:", ":shrimp:", ":lobster:", ":crab:", ":blowfish:", ":tropical_fish:",
                        ":fish:", ":seal:", ":dolphin:", ":whale:", ":whale2:", ":shark:", ":crocodile:", ":tiger2:",
                        ":leopard:", ":zebra:", ":gorilla:", ":orangutan:", ":elephant:", ":mammoth:", ":bison:",
                        ":hippopotamus:", ":rhino:", ":dromedary_camel:", ":camel:", ":giraffe:", ":kangaroo:",
                        ":water_buffalo:", ":ox:", ":cow2:", ":racehorse:", ":pig2:", ":ram:", ":sheep:", ":llama:",
                        ":goat:", ":deer:", ":dog2:", ":poodle:", ":guide_dog:", ":service_dog:", ":cat2:",
                        ":black_cat:", ":rooster:", ":turkey:", ":peacock:", ":parrot:", ":swan:", ":flamingo:",
                        ":dove:", ":rabbit2:", ":raccoon:", ":skunk:", ":badger:", ":beaver:", ":otter:", ":sloth:",
                        ":mouse2:", ":rat:", ":chipmunk:", ":hedgehog:", ":dragon:", ":dragon_face:" };

        private static final String[] HARRY_POTTER_PERSONNAGES = { // Repertoire des personnages d'Harry Potter
                        "Hannah Abbot", //
                        "Grand-oncle Algie", //
                        "Avery Jr.", //
                        "Barjow", //
                        "Baron Sanglant", //
                        "Beedle le Barde", //
                        "Marcus Belby", //
                        "Katie Bell", //
                        "Croyance Bellebosse", //
                        "Mary Lou Bellebosse", //
                        "Modestie Bellebosse", //
                        "Amy Benson", //
                        "Caractacus Beurk", //
                        "Renée Bibine", //
                        "Cuthbert Binns", //
                        "Orion Black", //
                        "Phineas Nigellus Black", //
                        "Regulus Arcturus Black", //
                        "Sirius Black", //
                        "Walburga Black", //
                        "Lucien Bole", //
                        "Amelia Bones", //
                        "Edgar Bones", //
                        "Susan Bones", //
                        "Terry Boot", //
                        "Lavande Brown", //
                        "Silvanus Brûlopot", //
                        "Frank Bryce", //
                        "Millicent Bulstrode", //
                        "Charity Burbage", //
                        "Alecto Carrow", //
                        "Amycus Carrow", //
                        "Reginal Cattermole", //
                        "Cho Chang", //
                        "Pomona Chourave", //
                        "Richie Coote", //
                        "Michael Corner", //
                        "Crabbe Sr.", //
                        "Vincent Crabbe", //
                        "Dirk Cresswell", //
                        "Colin Cresswell", //
                        "Dennis Cresswell", //
                        "Croupton Jr. Bartemius", //
                        "Croupton Sr. Bartemius Alias Barty", //
                        "La Dame Grise", //
                        "Ernie Danlmur", //
                        "Roger Davies", //
                        "John Dawlish", //
                        "Pénélope Deauclaire", //
                        "Fleur Delacour", //
                        "Gabrielle Delacour", //
                        "Dilys Derwent", //
                        "Dedalus Diggle", //
                        "Amos Diggory", //
                        "Cedric Diggory", //
                        "Delphi Diggory", //
                        "Armando Dippet", //
                        "Elphias Doge", //
                        "Antonin Dolohov", //
                        "Norbert Dragonneau", //
                        "Thésée Dragonneau", //
                        "Olivier Dubois", //
                        "Abelforth Dumbledore", //
                        "Albus Dumbledore", //
                        "Ariana Dumbledore", //
                        "Aurelius Dumbledore", //
                        "Kendra Dumbledore", //
                        "Perceval Dumbledore", //
                        "Dudley Dursley", //
                        "Marjorie Dursley", //
                        "Pétunia Dursley", //
                        "Vernon Dursley", //
                        "Marietta Edgecombe", //
                        "Everard", //
                        "Araballa Doreen Figg", //
                        "Justin Finch-Fletchley", //
                        "Seamus Finnigan", //
                        "Nicolas Flamel", //
                        "Mondingus Fletcher", //
                        "Marcus Flint", //
                        "Filius Flitwick", //
                        "Florian Fortarôme", //
                        "Cornelius Oswald Fudge", //
                        "Elvis Marvolo Gaunt", //
                        "Merope Gaunt", //
                        "Morfin Gaunt", //
                        "Gibbon", //
                        "Wilhelmina Gobe-Planche", //
                        "Anthony Goldstein", //
                        "Tina Goldstein", //
                        "Queenie Goldstein", //
                        "Goyle Sr.", //
                        "Gregory Goyle", //
                        "Mr Granger", //
                        "Mrs Granger", //
                        "Hermione Granger", //
                        "Rose Granger-Weasley", //
                        "Hugo Granger-Weasley", //
                        "Percival Graves", //
                        "Astoria Greengrass", //
                        "Gregorovitch", //
                        "Fenrir Greyback", //
                        "Gunnar Grimmson", //
                        "Gellert Grindelwald", //
                        // Ajouter la peinture "La grosse Dame" ?
                        "Godric Gryffondor", //
                        "Guipure", //
                        "Arnold Guzman", //
                        "Rubeus Hagrid", //
                        "Eulalie Hicks", //
                        "Terence Higgs", //
                        "Mafalda Hopkrik", //
                        "Olive Hornby", //
                        "Tom Jedusor", //
                        "Jedusor", //
                        "Angelina Johnson", //
                        "Gwenog Jones", //
                        "Hestia Jones", //
                        "Lee Jordan", //
                        "Bertha Jorkins", //
                        "Laurena Kama", //
                        "Mustafa Kama", //
                        "Yusuf Kama", //
                        "Igor Karkaroff", //
                        "Jacob Kowalski", //
                        "Viktor Krum", //
                        "Leanne", //
                        "Bellatrix Lestrange", //
                        "Corvus Sr. Lestrange", //
                        "Corvus Jr. Lestrange", //
                        "Leta Lestrange", //
                        "Rabastan Lestrange", //
                        "Rodolphus Lestrange", //
                        "Gilderoy Lockhart", //
                        "Augusta Londubat", //
                        "Frank Londubat", //
                        "Alice Londubat", //
                        "Neville Londubat", //
                        "Luna Lovegood", //
                        "Xenophilius Lovegood", //
                        "Remus Lupin", //
                        "Teddy Lupin", //
                        "Madame Mason", //
                        "Monsieur Mason", //
                        "Minerva McGonagall", //
                        "Marlene McKinnon", //
                        "Cormac McLaggen", //
                        "Ernie Macmillan", //
                        "Walden Macnair", //
                        "Drago Malefoy", //
                        "Lucius Malefoy", //
                        "Narcissa Malefoy", //
                        "Scorpius Malefoy", //
                        "Griselda Marchebank", //
                        "Alastor Maugrey", //
                        "Olympe Maxime", //
                        "Mimi Geignarde", //
                        // Ajouter le fantôme "Moine Gras" ?
                        "Craig Montague", //
                        "Broderick Moroz", //
                        "Mulciber Sr.", //
                        "Nick Quasi-sans-tête", //
                        "Theodore Sr. Nott", //
                        "Theodore Jr. Nott", //
                        "Bob Ogden", //
                        "Garrick Ollivander", //
                        "Dolores Ombrage", //
                        "Pansy Parkinson", //
                        "Padma Patil", //
                        "Parvati Patil", //
                        "Jimmy Peakes", //
                        "Peter Pettigrow", //
                        "Antioch Peverell", //
                        "Cadmus Peverell", //
                        "Ignotus Peverell", //
                        "Séraphine Picquery", //
                        "Irma Pince", //
                        "Sturgis Podmore", //
                        "Piers Polkiss", //
                        "Poppy Pomfresh", //
                        "Albus Severus Potter", //
                        "Harry Potter", //
                        "James Potter", //
                        "James Sirius Potter", //
                        "Lily Potter", //
                        "Lily Luna Potter", //
                        "Helga Poufsouffle", //
                        "Fabian et Gideon Prewett", //
                        "Eileen Prince", //
                        "Augustus Pye", //
                        "Quirinus Quirrell", //
                        "Demelza Robins", //
                        "Stan Shunpike", //
                        "Severus Rogue", //
                        "Tobias Rogue", //
                        "Augustus Rookwood", //
                        "Evan Rosier", //
                        "Vinda Rosier", //
                        "Rosmerta", //
                        "Thorfinn Rowle", //
                        "Albert Runcorn", //
                        "Argus Rusard", //
                        "Scabior", //
                        "Rufus Scrimgeour", //
                        "Selwyn", //
                        "Rowena Serdaigle", //
                        "Helena Serdaigle", //
                        "Salazar Serpentard", //
                        "Kingsley Shacklebolt", //
                        "Henry Shaw", //
                        "Aurora Sinistra", //
                        "Rita Skeeter", //
                        "Horace Slughorn", //
                        "Hepzibah Smith", //
                        "Zacharias Smith", //
                        "Rudolph Spielman", //
                        "Alicia Spinnet", //
                        "Galatea Têtenjoy", //
                        "Pius Thicknesse", //
                        "Dean Thomas", //
                        "Tom le barman", //
                        "Andromeda Tonks", //
                        "Nymphadora Tonks", //
                        "Ted Tonks", //
                        "Bathilda Tourdesac", //
                        "Torquil Travers", //
                        "Travers", //
                        "Sibylle Trelawney", //
                        "Emmeline Vance", //
                        "Romilda Vane", //
                        "Septima Vector", //
                        "Ludovic Verpey", //
                        "Violette", //
                        "Voldemort", //
                        "Cassius Warrington", //
                        "Arthur Weasley", //
                        "Bilius Weasley", //
                        "Bill Weasley", //
                        "Charlie Weasley", //
                        "Dominique Weasley", //
                        "Fred Weasley", //
                        "Fred Jr. Weasley", //
                        "George Weasley", //
                        "Ginny Weasley", //
                        "Louis Weasley", //
                        "Lucy Weasley", //
                        "Molly Weasley", //
                        "Muriel Weasley", //
                        "Percy Weasley", //
                        "Ron Weasley", //
                        "Roxanne Weasley", //
                        "Victoire Weasley", //
                        "Wilkes", //
                        "Williamson", //
                        "Nigel Wolpert", //
                        "Corban Yaxley", //
                        "Blaise Zabini"

        };

        private static final String[] HARRY_POTTER_PERSONNAGES_DESCRIPTIONS = {
                        // Repertoire des descriptions des personnages d'Harry Potter
                        "Élève de Poufsouffle, membre de l'armée de Dumbledore. Vous participerez à la bataille de Poudlard. Après l'histoire principale, Vous vous-marierez avec Neville Londubat.", //
                        "Vous êtes un membre de la famille de Neville Londubat. Vous avez tenté de piéger Neville, pour qu'il montre ses capacités magiques. Vous avez acheté à Neville un crapaud du nom de Trévor et un Mimbulus mimbletonia.", //
                        "Vous êtes un Mangemort, félicitation.", //
                        "Vous tenez la boutique « Barjow et Beurk » dans l’Allée des Embrumes. Vous êtes un homme aux épaules voutées avec des cheveux longs et gras. Vous avez aussi été l'employeur de Tom Jedusor.", //
                        "Fantôme de la maison Serpentard. Vous êtes le seul de tout Poudlard, avec Albus Dumbledore, à avoir assez d'autorité pour vous faire obéir par Peeves.\n On apprend dans Harry Potter et les Reliques de la Mort que vous étaiez jadis l'amant dédaigné de la Dame Grise (fantôme de Serdaigle), de son vrai nom Helena Serdaigle, et que vous l'avait tuée avant de vous suicider de remords et de désespoir. .-. (tu peux toujours changer de perso)", //
                        "Vous êtes connu dans le monde magique pour avoir écrit un recueil de contes pour enfants : Les Contes de Beedle le barde (Le Conte des trois frères, Le Sorcier et la Marmite sauteuse, La Fontaine de la bonne fortune, Le Sorcier au cœur velu et Babbitty Lapina et la Souche qui gloussait).", //
                        "Élève de Serdaigle, membre du club de Slug, de un an l'aîné de Harry. Vôtre oncle, Damoclès (ancien élève de Slughorn) a eu l'Ordre de Merlin en inventant la potion Tue-Loup.", //
                        "Élève de Gryffondor, membre de l'armée de Dumbledore. Vous êtes poursuiveuse dans l'équipe de Gryffondor de la première à la sixième année de Harry.", //
                        "Vous êtes le fils adoptif de Mary Lou Bellebosse.", //
                        "Vous êtes la dirigeante de la « Ligue des Fidèles de Salem » et mère adoptive de Croyance Bellebosse.", //
                        "Vous êtes la plus jeune des enfants adoptifs Bellebosse. Vous êtes très liée à votre frère Croyance.", //
                        "Pensionnaire d'un orphelinat à Londres, vous êtes allé dans une grotte emmenée par Tom Elvis Jedusor enfant accompagnée d'un autre enfant.", //
                        "Vous êtes l'un des fondateurs de la boutique « Barjow et Beurk » dans l’Allée des Embrumes.", //
                        "Membre du personnel de Poudlard.", //
                        "Vous êtes membre du personnel de Poudlard", //
                        "Vous êtes le père de Sirius et de Regulus. Époux de Walburga Black.", //
                        "Vous êtes l'ancien directeur de Poudlard, arrière-arrière-grand-père de Sirius Black8.", //
                        "Vous êtes un ancien Mangemort, frère cadet de Sirius Black. Vous avez volé le médaillon de Salazar Serpentard (transformé en horcruxe) dans la caverne, avant d'être entraîné par les inferi au fond du lac.", //
                        "Vous êtes le parrain de Harry Potter, maraudeur et membre de l'Ordre du Phénix. Vous avez été élève à Gryffondor, contrairement à toute votre famille qui a étudié parmi les Serpentard.", //
                        "Vous êtes la mère de Sirius et de Regulus, épouse d'Orion Black. Vous êtes la propriétaire de l'elfe de maison Kreattur, qui vous restera dévoué même après votre mort, bien qu'il se voie obligé d'obéir à Sirius.", //
                        "Vous êtes un élève de Serpentard, batteur de l'équipe de quidditch de Serpentard jusqu'au quatrième livre où vous êtes remplacé par Gregory Goyle. Vous avez délibérément commis une faute contre Alicia Spinnet pendant la finale de quidditch de l'année scolaire 93-94.", //
                        "Vous êtes la tante de Susan Bones et sœur d'Edgar Bones, fonctionnaire au ministère de la Magie. Vous avez été à la tête du département de la Justice magique et présidait le Magenmagot. ", //
                        "Vous êtes l'oncle de Susan Bones et frère d'Amelia Bones, membre de l'Ordre du Phénix. Considéré comme un grand sorcier par Alastor Maugrey, vous avez été membre de l'Ordre dans les années 1970. Malehureusement avous avez été tué avec avec votre famille par un mangemort.", //
                        "Vous êtes élève de Poufsouffle et une membre de l'armée de Dumbledore.", //
                        "Vous êtes élève de Serdaigle et un membre de l'armée de Dumbledore.", //
                        "Vous êtes une élève de Gryffondor, membre de l'armée de Dumbledore. Durant la bataille de Poudlard, Vous avez été attaqué par Fenrir Greyback.", //
                        "Vous êtes un membre du personnel de Poudlard.", //
                        "Vous êtes le jardinier de la maison des Jedusor, au service des grands-parents paternels et du père de Lord Voldemort. Vous avez été accusé à tort du meurtre de vos anciens employeurs, vous continuerez d'entretenir la propriété à l'abandon. Jusqu'à ce que Lord Voldemort emporte votre âme.", //
                        "Vous êtes élève de Serpentard, membre de la Brigade Inquisitoriale. Lors du club de duel inventé par le professeur Gilderoy Lockhart, vous vous êtes battue contre Hermione Granger. Vous ête élue membre de la Brigade Inquisitoriale d'Ombrage pendant votre cinquième année.", //
                        "Vous êtes un membre du personnel de Poudlard.", //
                        "Vous êtes la Sœur d'Amycus Carrow, mangemort. Vous faite partie des Mangemorts introduits par Drago Malefoy dans l'école lors de la bataille de la tour d'astronomie. Vous avez été chargée de l'étude des Moldus lors de la septième année de Harry Potter.", //
                        "Vous êtes le frère d'Alecto Carrow, mangemort. Vous faite partie des mangemorts introduits par Drago Malefoy dans l'école lors de la bataille de la tour d'astronomie20. Vous avez été chargé des cours de défense contre les forces du Mal lors de la septième année de Harry Potter.", //
                        "Vous êtes un fonctionnair au ministère de la Magie. L'époux de Mary Cattermole et le père de Maisie, Ellie et Alfred Cattermole.", //
                        "Vous êtes une élève de Serdaigle âgée d'un an de plus que Harry, attrapeuse au quidditch et membre de l'armée de Dumbledore.", //
                        "Vous êtes membre du personnel de Poudlard.", //
                        "Vous êtes élève de Gryffondor, avec avez rejoint l'équipe de quidditch en tant que batteur à partir de la sixième année de Harry.", //
                        "Vous êtes élève à Serdaigle et membre de l'armée de Dumbledore.", //
                        "Vous êtes père de Vincent Crabbe, mangemort.", //
                        "Ami de Drago Malefoy, élève de Serpentard. Vous faite partie de la Brigade Inquisitoriale de Dolores Ombrage à Poudlard. Mais vous êtes mort par votre prore sort « Avada Kedavra ».", //
                        "Vous êtes fonctionnaire au ministère de la Magie, directeur du « bureau de liaison des gobelins ».", //
                        "Vous êtes élèves de Gryffondor et membre de l'armée de Dumbledore. Vous mourrez en héro pendant la Bataille de Poudlard.", //
                        "Vous êtes élèves de Gryffondor et membre de l'armée de Dumbledore.", //
                        "Vous êtes un mangemort ayant été jugé puis condamné par son propre père et emprisonné à Azkaban.", //
                        "Droit, impartial, raide et très exigeant. Vous êtes fonctionnaire au ministère de la Magie. Vous avez donné toute votre énergie afin d'éradiquer le « mal » du monde magique, notamment pour éliminer les Mangemorts et Voldemort.\nVous avez tout de même enfermer votre fils, en tentant d'oublier son existence. Mais vous êtes finalement tué par votre fils, qui vous transforme en os et vous enterre dans le jardin d'Hagrid.", //
                        "Vous êtes fantôme de Serdaigle, de votre vrai nom Helena Serdaigle, fille de Rowena Serdaigle. Vous avez jouer un rôle important dans la quête du diadème de votre mère.", //
                        "Vous êtes chauffeur du Magicobus. Si ça c'est pas stylé 😎", //
                        "Vous êtes élève de Serdaigle, capitaine et poursuiveur de leur équipe de quidditch. Vous avez aussi été le cavalier de Fleur Delacour, championne de Beauxbatons, durant le Bal de Noël,", //
                        "Vous êtes Auror et un fonctionnaire au ministère de la Magie.", //
                        "Vous êtes élève de Serdaigle et une élève de Poudlard de 1987 à 1994. Le 8 mai 1993, vous été pétrifiée par le Basilic ce qui donna un dur coup à Percy Weasley(votre petit ami), qui ne croyait pas que l'héritier de Serpentard s'en prendrait à un préfet.", //
                        "Vous êtes championne de l'Académie Beauxbâtons sélectionnée lors du Tournoi des Trois Sorciers, membre de l'Ordre du Phénix et épouse de Bill Weasley.", //
                        "Vous êtes la sœur cadette de Fleur Delacour. Vous avez été sauvée du Lac Noir par Harry Potter lors de la deuxième tâche du tournoi des 3 sorciers. Vous êtes née en 1986.", //
                        "Vous êtes une guérisseuse à l'hôpital Sainte-Mangouste puis directrice de l'école de Poudlard.", //
                        "Vous êtes membre de l'Ordre du Phénix et fonctionnaire au ministère de la Magie. Votre maison finira incendiée, lorsque le ministère de la Magie tombera aux mains de Voldemort.", //
                        "Vous êtes le père de Cedric Diggory, fonctionnaire au ministère de la Magie. Vous travaillez au ministère dans le département de contrôle et de régulation des créatures magiques.", //
                        "Vous êtes élève de Poufsouffle, participant au tournoi des trois sorciers. Né en 1977, fils de Amos Diggory, Vous êtes assassiné le 24 juin 1995 par Queudver (Peter Pettigrow) sous les ordres de Voldemort.\n En 1993, en cinquième année, vous devinez le capitaine de l’équipe de quidditch où vous jouez comme attrapeur. Vous êtes un très bon élève et vous devenez également préfet. En 1994, vous êtes sélectionné par la Coupe de Feu pour représenter Poudlard au Tournoi des Trois Sorciers. Vous devenez très proche de Cho Chang, ce qui rend Harry jaloux. Lors de la dernière épreuve du tournoi, vous remportez celui-ci, exæquo avec Harry Potter, et touchant ensemble la coupe qui était en fait un Portoloin, vous êtes tous deux envoyés auprès de Voldemort, dans le cimetière de son père. C’est là que vous êtes assassiné par Peter Pettigrow sous les yeux de Harry.", //
                        "Vous apparaissez dans la pièce de théâtre Harry Potter et l'enfant maudit en tant que principale antagoniste.", //
                        "Vous êtes ancien directeur de Poudlard.", //
                        "Vous êtes membre de l'Ordre du Phénix. Vous êtes l'un des plus vieux amis d'Albus Dumbledore, avec lequel il a fait ses études à Poudlard à la fin du XIXe siècle, et à qui vous vouez une indéfectible vénération. Bien que vous êtes membre de l'Ordre du Phénix, vous ne participerez pas à la bataille finale de Poudlard.", //
                        "Vous êtes un Mangemort", //
                        "Vous êtes le héros de la série de films dérivée Les Animaux fantastiques. Mais aussi l'auteur du livre Vie et habitat des animaux fantastiques ", //
                        "Vous êtes le frère aîné de Norbert et vous êtes un Auror au ministère de la Magie britannique.", //
                        "Vous êtes un élève de Gryffondor, ancien gardien et capitaine de l'équipe de quidditch de Gryffondor.", //
                        "Vous êtes né en 1883, frère cadet d'Albus Dumbledore, membre de l'Ordre du Phénix, barman de la Tête de sanglier, à Pré-au-Lard.", //
                        "Vous êtes le principal directeur de Poudlard au cours de l'histoire de Harry Potter et fondateur de l'Ordre du Phénix.", //
                        "Vous la sœur d'Albus Dumbledore. Ne maîtrisant pas vos pouvoirs magiques après avoir été traumatisée par trois jeunes Moldus lorsque vous aviez six ans, vous avez été cachée par votre mère, puis par votre frère Albus, pour ne pas être envoyée à l'hôpital Sainte-Mangouste. Vous avez été tuée au cours d'une violente dispute entre Albus, Abelforth et Gellert Grindelwald. Ils ne surent jamais lequel d'entre eux avait lancé le sort fatal..", //
                        "Vous avez été évoqué par Grindelwald dans Les Animaux fantastiques : Les Crimes de Grindelwald.", //
                        "Vous êtes la mère d'Albus Dumbledore. Vous avez été tuée en 1899 accidentellement par votre fille Ariana, alors que celle-ci n'avait que quatorze ans. Vous avez été enterrée avec votre fille, décédée quelques années plus tard, à Godric's Hollow. Sur votre tombe est gravée une citation de la Bible : « Là où est ton trésor, là aussi sera ton cœur. » (Matthieu, 6:21).", //
                        "Vous êtes le père d'Albus Dumbledore. En son temps, vous avez été connu pour avoir agressé trois jeunes Moldus. L'affaire fit la une de la presse de l'époque, et une réputation d'anti-Moldu tomba sur votre famille Dumbledore. En 1891, un an avant l'entrée de votre fils Albus à Poudlard, vous avez été condamné à purger votre peine à Azkaban, la prison des sorciers. Vous décédez dans votre cellule quelques années plus tard. La réalité était toute autre. Lorsque votre fille Ariana avait six ans, trois enfants Moldus l'agressèrent sans qu'elle puisse se défendre d'une quelconque manière. Le choc de l'attaque la fit perdre l'usage de la magie. Furieux, vous vous vengiez et attaquiez les trois enfants. Lors de votre procès, vous ne racontez pas ce qui s'était réellement passé, car si le ministère de la Magie avait su ce qu'Ariana était devenue, celle-ci aurait été envoyée à l'hôpital Sainte-Mangouste. Vous sacrifiez votre liberté pour celle de votre fille. Vous êtes mort dans les années 1890.", //
                        "Vous êtes le cousin de Harry Potter, né le 23 juin 1980, soit quelques semaines avant Harry. Vous avez au court de votre vie de garçon indiscipliné, violent, colérique et capricieux, déjà porté une queue de cochon.", //
                        "Vous êtes la sœur de Vernon Dursley. Appelez aussi « tante Marge », vous êtes une moldue. Vous avez douze bouledogues, pour qui vous témoignez plus d’intérêt que pour les humains. Ah oui et vous détestez Harry.", //
                        "Vous êtes la tante de Harry Potter, sœur de Lily Evans, femme de Vernon, mère de Dudley. Vous adorez votre fils à qui vous offrez de nombreux cadeaux. En ce qui concerne votre neveu, Harry, vous êtes loin d’être aussi aimante que pour votre fils et ne ratez aucune occasion de le blâmer. ", //
                        "Vous êtes le mari de Pétunia et père de Dudley. Vous êtes un moldu. Vous avez une sœur, Marjorie Dursley. Vous êtes un homme brusque et bourru qui n'apprécie guère l'univers étrange des sorciers ; en fait, vous ne tolèrez ni les sorciers, ni leur mode de vie, ni les phénomènes étranges qui les entourent. Vous êtes très heureux d'être « normal », et méprisez tout ce qui se rapproche de la magie.", //
                        "vous êtes une élève de Serdaigle, membre de l'armée de Dumbledore.", //
                        "Vous êtes l'Ancien directeur de Poudlard parmi les plus célèbres, Vous possèdez un portrait à Poudlard et un autre au ministère de la Magie. Vous avez donné l'alerte au ministère dans Harry Potter et l'Ordre du Phénix en passant dans votre autre tableau à la suite de l'attaque qu'a subie Arthur Weasley.", //
                        "Vous êtes une cracmol voisine de la famille Dursley, membre de l'Ordre du Phénix. Vous habitez Wisteria Walk, à Little Whinging, le quartier de la famille Dursley. Vous êtes une vieille dame excentrique qui affectionne les chats.", //
                        "Vous êtes élève de Poufsouffle, membre de l'armée de Dumbledore.", //
                        "Vous êtes élève de Gryffondor, membre de l'armée de Dumbledore.", //
                        "Vous êtes un alchimiste travaillant en étroite collaboration avec Albus Dumbledore. Vous avez nottament découvert le secret de fabrication de la pierre philosophale qui procure l'élixir de longue vie particulièrement prisé par Voldemort. C'est ainsi que vous avez pu atteindre l'âge canonique de 665 ans. Jusqu'à que vous et votre femme mettiez fin à votre vie en détruisant l'objet.", //
                        "Vous êtes membre de l'Ordre du Phénix.", //
                        "Vous êtes élève de Serpentard plus âgé que Harry,et capitaine de l'équipe de quidditch de Serpentard", //
                        "Vous êtes membre du personnel de Poudlard.", //
                        "Vous êtes un vendeur de glaces sur le chemin de Traverse. Vous donnez des glaces gratuites toutes les demi-heures à Harry Potter lorsque celui-ci fait ses devoirs d'école sur sa terrasse. Vous avez été enlevé par les Mangemorts.", //
                        "Vous êtes le ministre de la Magie de 1990 à 1996. Vous demandiez régulièrement conseil auprès de Dumbledore à ses débuts. Vous prenez ensuite goût au pouvoir et finissez par refuser de reconnaître le retour de Voldemort par facilité, aveuglé par l'amour de votre fonction. Vous faite pression sur les journaux et envoiyez votre sous-secrétaire d'État à Poudlard afin de rendre officielle et « publique » votre version des faits. Lorsque la preuve du retour du célèbre mage noir est faite, vous êtes remplacé par Rufus Scrimgeour après avoir essayé de tout faire pour sauver votre poste.", //
                        "Vous êtes le père de Merope, descendant de Salazar Serpentard. Le grand-père maternel de Voldemort, descendant au sang pur de Salazar Serpentard. On ignore tout de votre épouse, mais vous avez eu deux enfants, Morfin et Merope. Condamné à un emprisonnement de six mois à Azkaban pour avoir défendu votre fils lors de votre première arrestation, vous meurez avant la libération de ce dernier.", //
                        "Vous êtes la mère de Voldemort, fille d'Elvis Gaunt. Méprisée par votre père qui vous croit Cracmolle, vous nourrissez une passion secrète pour Tom Jedusor, un riche et beau Moldu vivant dans le manoir voisin de Little Hangleton. Un soir, alors que vous attendiez que Jedusor passe, votre frère Morfin vous surprend et raconte tout à votre père, fou de rage en apprenant la nouvelle « Ma propre fille, une descendante au sang-pur de Salazard Serpentard, courant après un répugnant Moldu aux veines souillées ». Bob Ogden, un employé du département de la Justice magique, est chez les Gaunt lorsque votre frère veut vous étrangler. Il se précipite pour vous défendre et votre frère Morfin s'élance vers lui, fou de rage. Ogden est retourné au ministère en transplanant et il est revenu un quart d'heure plus tard avec des renforts. Votre frère Morfin et votre père Elvis Gaunt ont essayé de résister mais ils ont fini par s'incliner et sont jugés coupables par le Magenmagot. Morfin Gaunt, qui avait déjà attaqué plusieurs Moldus, dont Tom Jedusor, a été condamné à passer trois ans à Azkaban et Elvis a écopé de six mois de prison. D'après les hypothèses émises par Dumbledore, alors que sa famille était à Azkaban, vous avez dû convaincre Jedusor, un jour de grande chaleur, de boire un verre d'eau rempli d'un philtre d'amour. Quelques mois après, Jedusor s'enfuit avec vous. Plus tard, après s'être enfui pour se marier, Tom Jedusor est revenu au manoir familial de Little Hangleton sans vous. Il vous a laissé alors que vous étiez enceinte d'un bébé qui deviendra un jour Lord Voldemort. Vous passez le reste de votre grossesse à Londres. Dumbledore et Harry le découvrent grâce au témoignage de Caractacus Beurk, un des fondateurs de Barjow et Beurk. D'après lui, vous avez vendu le seul objet de valeur que vous possédiez (à savoir, le médaillon de Salazar Serpentard) afin de survivre et de sauver votre enfant. Le 31 décembre 1926, vous accouchez. Une heure plus tard, vous demandez que l'on nomme votre fils « Tom Elvis » (faisant hommage à votre père Elvis) et vous mourez.", //
                        "Vous êtes le frère de Merope, fils d'Elvis Marvolo. Vous parliez le Fourchelang comme votre père, aptitude rare héritée des Serpentard. À la suite d'un maléfice que vous aviez lancé à Tom Jedusor, parce que votre sœur s'intéressait trop à celui-ci à son goût, vous êtes condamné à trois ans d'emprisonnement à Azkaban. Plusieurs années plus tard, lorsque votre neveu, le futur Voldemort, que vous n'avez jamais connu, vous rend visite, il est accusé des trois crimes commis par celui-ci, les meurtres de Tom Jedusor senior et des parents de ce dernier. Vous mourez à Azkaban.", //
                        "Vous êtes un Mangemort.", //
                        "Membre du personnel de Poudlard.", //
                        "Vous êtes élève de Serdaigle, membre de l'armée de Dumbledore.", //
                        "Vous êtes une amie de Norbert Dragonneau et sœur de Queenie.", //
                        "Vous êtes la petite sœur de Tina.", //
                        "Vous êtes le père de Gregory Goyle, mangemort. Vous prétendiez avoir été soumis au sortilège de l'Imperium. Vous avez participé à la cérémonie de renaissance de Voldemort.", //
                        "Vous êtes l'ami de Drago Malefoy et vous êtes un élève de Serpentard. vous avez une carrure imposante qui vous a permis de devenir « garde du corps » de Drago Malefoy avec Vincent Crabbe. Vous devenez batteur de l'équipe de quidditch de Serpentard en même temps que Vincent Crabbe.", //
                        "Vous êtes le père d'Hermione.", //
                        "Vous êtes la mère d'Hermione.", //
                        "Vous êtes la meilleure amie de Harry Potter (avec Ronald Weasley). Vous êtes une élève de Gryffondor et une membre de l'armée de Dumbledore.", //
                        "Vous êtes la fille aînée de Ron et d'Hermione Granger.", //
                        "Vous êtes Fils cadet de Ron et d'Hermione Granger. Vous avez le même âge que Lily Luna Potter.", //
                        "Vous êtes le directeur du département de la Justice magique du MACUSA et chef de la division des Aurors.", //
                        "Vous petes l'épouse de Drago Malefoy et mère de Scorpius Hyperion Malefoy.", //
                        "Vous êtes fabricant de baguette magique. Vous vivez en Europe de l'Est et vous êtes considéré comme l'un des plus grands fabricants de votre époque. Vous êtes l'artisan qui a fabriqué la baguette de Viktor Krum. Vous êtes traqué, torturé et tué par Voldemort, qui cherchait à s'emparer de la Baguette de l'Aîné, l'une des trois Reliques de la Mort.", //
                        "Vous êtes un loup-garou, allié des mangemorts.", //
                        "Vous êtes un chasseur de créatures, ennemi de Norbert Dragonneau.", //
                        "Vous êtes un sorcier qui fait partie des « mages noirs les plus dangereux de tous les temps »", //
                        // Ajouter la peinture "La grosse Dame" ?
                        "Vous êtes l'un des quatre pères fondateurs de Poudlard auquel vous avez donné votre nom à une maison. Vous recherchiez comme principale qualité chez vos élèves le courage.", //
                        "Vous êtes une sorcière qui tient la boutique « Madame Guipure prêt-à-porter pour mages et sorciers », située dans le chemin de Traverse.", //
                        "Vous êtes le délégué des États-Unis auprès de la Confédération Internationale des Sorciers.", //
                        "Vous êtes le Garde-chasse et le professeur de soins aux créatures magiques à Poudlard et ami de Harry Potter.", //
                        "Vous êtes une une sorcière américaine, professeur à l'école de magie et de sorcellerie d'Ilvermorny. Vous êtes une alliée d'Albus Dumbledore et de Nicolas Flamel, avec lesquels vous communiquez par le biais du rolodex.", //
                        "Vous êtes une élève de Serpentard, membre de l'équipe de quidditch de Serpentard au poste d'attrapeur pendant la première année de Harry.", //
                        "Vous êtes fonctionnaire au ministère de la Magie. Vous travaillez comme assistante au Service des usages abusifs de la magie. Vous avez les cheveux noir et portez des lunettes rondes. C'est Vous qui avez écrit à Harry Potter lorsque ce dernier utilise la magie hors de l'école de Poudlard.", //
                        "Vous êtes un élève de Poudlard, camarade de classe de Mimi Geignarde. L'année où la chambre des Secrets a été ouverte pour la première fois, vous vous êtes moquée des lunettes de Mimi Geignarde qui s'est réfugiée dans les toilettes du deuxième étage pour pleurer. Sur demande du directeur, le professeur Dippet, vous êtes allée chercher Mimi et l'avez trouvée morte dans sa cabine. Vous avez subi la vengeance de Mimi qui a hantée, jusqu'à ce que vous vous plaignez au ministère, obligeant le fantôme à s'installer dans les toilettes.", //
                        "Vous êtes le père de Voldemort. Vous êtes est un moldu vivant dans le même village que celui de Merope Gaunt (Little Hangleton). Celle-ci, amoureuse de vous, profite que son père et son frère soient en prison à Azkaban pour vous séduire et vous épouser grâce à un philtre d'amour. Lorsque Merope, qui pense que vous l'aimez, cesse de vous donner le philtre d'amour, vous la quittez sans se soucier de savoir qu'elle attend un enfant. Votre fils, Tom Elvis Jedusor, qui deviendra plus tard Voldemort, vous tue avec l'Avada Kedavra, ainsi que vos parents. C'est en partie grâce à vos ossements que Voldemort retrouvera un corps", //
                        "Vous êtes un des parents de Tom Jedusor. Les Jedusor habitaient un manoir avec leur fils Tom dans le village de Little Hangleton jusqu'à ce qu'ils se fassent tous les trois assassiner par le fils caché de ce dernier : Tom Elvis Jedusor qui deviendra plus tard Lord Voldemort. À leur mort, on fut incapable de trouver par quoi ils avaient été tués ; les autopsies ont démontré qu'ils n'avaient été ni empoisonnés, ni poignardés, ni tués par une arme à feu, ni étranglés, ni étouffés. Leurs tombes font toujours l'objet d'une attention toute particulière et leur maison a été rebaptisée par les villageois : La maison des « Jeux du sort ».", //
                        "Vous êtes une élève de Gryffondor et poursuiveuse de l'équipe de quidditch, membre de l'armée de Dumbledore.", //
                        "Vous êtes capitaine de l'équipe de quidditch les Harpies de Holyhead dans laquelle jouera Ginny.", //
                        "Vous êtes une membre de l'Ordre du Phénix. Vous faite partie de la garde rapprochée chargée d'escorter Harry jusqu'au 12, square Grimmaurd. Vous vous amusez beaucoup dans la maison des Dursley à observer des épluches-légumes. D'après Kinsgley Shacklebolt, vous avez l'une des capes d'invisibilité de Maugrey Fol-Œil, lors des nombreuses gardes organisées par l'Ordre du Phénix au ministère.", //
                        "Vous êtes élève de Gryffondor, membre de l'armée de Dumbledore et meilleur ami de Fred et George Weasley.", //
                        "Vous êtes une fonctionnaire au ministère de la Magie. Vous avez découvert un jour par hasard que Barty Croupton cachait son fils, censé purger une peine à vie à Azkaban en tant que Mangemort. Barty Croupton senior, pour protéger son fils en mémoire de sa mère, vous infligea un sortilège d'amnésie si puissant qu'il affecta définitivement votre mémoire, vous rendant distraite et étourdie.", //
                        "Vous êtes une une sorcière de « sang-pur », décrite comme particulièrement belle. Vous êtes la mère de Yusuf Kama et de Leta Lestrange. Corvus Lestrange Sr. a recours au sortilège de l'Imperium pour vous séduire et vous enlever lorsque Yusuf a douze ans. Vous mour en donnant la vie à Leta.", //
                        "Vous êtes est un sorcier de « sang-pur », d'origine sénégalaise. Vous êtes le père de Yusuf. Trahi par Corvus Lestrange Sr., vous mourez peu de temps à la suite de votre épouse Laurena, après avoir chargé votre fils Yusuf de venger l'honneur de sa famille en tuant la personne que Corvus Lestrange aimait le plus : son fils Corvus Jr.", //
                        "Vous êtes le fils de Mustafa et Laurena Kama et demi-frère de Leta Lestrange.", //
                        "Vous êtes l'ancien directeur de Durmstrang, ancien mangemort. Après avoir déserté, vous êtes tué par des mangemorts au cours de l'été 1996.", //
                        "Vous êtes un Non-Maj' américain et ami de Norbert Dragonneau.", //
                        "Vous êtes un élève à Durmstrang, participant au Tournoi des Trois Sorciers. Vous êtes est un sorcier né en 1977, un jeune homme mince, au teint sombre et cireux. Vous êtes surtout connu pour être l'attrapeur des Bulgares lors de la finale de la coupe du monde de quidditch en août 1994. Vous comptez 88 sélections en équipe bulgare. Vous êtes également désigné par la coupe de feu pour être le champion de Dumstrang lors de l'édition 1994-95 du Tournoi des Trois Sorciers, vous êtiez alors en dernière année et l'étudiant préféré du directeur, Igor Karkaroff.", //
                        "Vous êtes un élève de Gryffondor, amie de Katie Bell.", //
                        "Vous êtes une membre de la famille Black, mangemort. Vous torturez les parents de Neville Londubat, assassinez Sirius Black lors de la bataille du département des mystères ", //
                        "Vous êtes le père de Leta et de Corvus Jr.. Grâce au sortilège de l'Imperium, vous avez séduit la mère de Yusuf Kama, avec laquelle vous avez eu une fille, Leta. Lorsque Laurena Kama est morte en mettant Leta au monde, vous vous êtes remarié puis avez eu un deuxième enfant, Corvus Jr.. Vous envoyez ensuite Corvus Jr. en Amérique avec sa domestique Irma Dugard et Leta (qu'il n'aime pas), après avoir eu vent de la menace qui planait sur votre fils à cause du fils de Mustafa Kama qui souhaite venger sa famille que vous avez brisé.", //
                        "Vous êtes le demi-frère de Leta. Vous êtes mort bébé lors du naufrage d'un paquebot transatlantique en 1901, après avoir été échangé avec Croyance Bellebosse bébé par Leta Lestrange, alors que celle-ci était enfant et voyageait à bord du même bateau en direction de l'Amérique. Yusuf Kama a longtemps cru que Croyance était Corvus(vous).", //
                        "Vous êtes la fille de Corvus Lestrange Sr. et demi-sœur de Yusuf Kama. Vous êtes également l'amie d'enfance de Norbert Dragonneau et la fiancée de Thésée Dragonneau.", //
                        "Vous êtes le frère de Rodolphus Lestrange et êtes un mangemort.", //
                        "Vous êtes le mari de Bellatrix Lestrange et un mangemort.", //
                        "Vous faite partie du membre du personnel de Poudlard.", //
                        "Vous êtes la mère de Frank Londubat, grand-mère de Neville Londubat. Vous êtes une femme décrite comme une personne forte au caractère bien trempé élève Neville d'une façon stricte, en l'absence de ses parents. Vous avez beau être une « petite vieille qui vit seule », selon les propres termes de Neville, vous êtes tout de même une sorcière coriace, capable de se défendre contre l'Auror Dawlish qui a vainement essayé de vous arrêter. Vous faite partie des sorciers qui, lors de la bataille finale de Poudlard, rejoignent l'école pour combattre les Mangemorts aux côtés de l'Ordre du Phénix. Il semble que vous connaîssez personnellement le professeur McGonagall qui rappelle à Neville le résultat des BUSES de sa grand-mère. Au début de la série, Neville affirme qu'il craignait que vous soyez un cracmol en raison du temps qu'il vous vous avez fallu pour montrer un signe magique (provoqué par votre oncle en vous lâchant du haut d'une fenêtre).", //
                        "Vous êtes un parent de Neville Londubat, membres de l'Ordre du Phénix. Ex-Aurors connus et appréciés qui faisaient partie du premier Ordre du Phénix. Après avoir échappé trois fois à Voldemort, Vous avez été torturés par quatre Mangemorts", //
                        "Vous êtes unt parent de Neville Londubat, membres de l'Ordre du Phénix. Ex-Aurors connus et appréciés qui faisaient partie du premier Ordre du Phénix. Après avoir échappé trois fois à Voldemort, Vous avez été torturés par quatre Mangemorts", //
                        "Vous êtes un élève de Gryffondor, membre de l'armée de Dumbledore et ami de Harry Potter. Vous devenez professeur de botanique à Poudlard et vous êtes marié avec Hannah Abbot.", //
                        "Vous êtes un Élève de Serdaigle, membre de l'armée de Dumbledore et amie de Harry Potter.", //
                        "Vous êtes père de Luna Lovegood. Veuf, vous avez élèvé seul votre fille depuis la mort de Madame Lovegood. Luna avait alors 9 ans. Vous êtes le directeur du journal le Chicaneur, qui a toujours défendu Harry. La plupart des sorciers ne prennent pas très au sérieux ce qui est dit dans le journal. Vous affirmez à chaque numéro de votre magazine que le « Ronflak Cornu » (animal imaginaire inventé par vous) existe, et montrez une corne en guise de preuve. Hermione vous affirmera que cette corne est une Corne d'Eruptif, et qu'elle est très dangereuse et prête à sauter d'un moment à l'autre. Vous l'apprendrez à ses dépens lorsque votre maison explose.", //
                        "Vous êtes loup-garou, maraudeur et membre de l'Ordre du Phénix décédé lors de la bataille finale de Poudlard main dans la main avec Nymphadora Tonks.", //
                        "Vous êtes le fils de Nymphadora Tonks et de Remus Lupin. Vous êtes né vers avril 1998. Vous êtes un métamorphomage, comme votre mère, mais vous n'avez pas hérité de la lycanthropie de votre père. Vous devenez orphelin et êtes le filleul de Harry.", //
                        "Vous êtes la femme de Monsieur Mason, Doby a déjà fait tombé un gateau sur votre tête.", //
                        "Vous êtes une riche promoteur immobilier qui souhaite faire affaire avec Vernon Dursley. Vous pensez que la magie est une farce.", //
                        "Vous êtes une professeure de métamorphose à Poudlard, directrice de la maison des Gryffondor membre l'Ordre du Phénix. Vous êtes aussi une animagus qui peut prendre la forme d'un chat.", //
                        "Vous êtes une membre de l'Ordre du Phénix, assassinée par Mulciber Sr.", //
                        "Vous êtes un élève de Gryffondor, d'un an plus âgé que Harry Potter. Vous êtes si grand que certains élèves disent que vous êtes aussi grand qu'un troll. ", //
                        "Vous êtes élève de Poufsouffle, membre de l'armée de Dumbledore.", //
                        "Vous êtes un Mangemort.", //
                        "Vous êtes élève à Serpentard et un mangemort. Vous êtes l'ennemi de Harry Potter. Tout comme votre père, vous vous ralliez à la cause de Voldemort. Vous avez mit en place un système à l'aide des armoires à disparaître, pour faire entrer des mangemorts dans Poudlard.", //
                        "Vous êtes le père de Drago Malefoy, mangemort et un fonctionnaire au ministère de la Magie.", //
                        "Vous êtes la mère de Drago Malefoy et la sœur de Bellatrix Lestrange et Andromeda Tonks.", //
                        "Vous êtes le fils de Drago Malefoy. Vous êtes également le meilleur ami de Albus Potter.", //
                        "Vous êtes une fonctionnaire au ministère de la Magie. Vieille sorcière, présidente de l'Académie des examinateurs magiques et ancienne membre du Magenmagot, bien que vous ayez (de même que Tiberius Ogden) démissionné en signe de protestation contre la nomination de Dolores Ombrage au poste de Grande Inquisitrice de Poudlard. La Gazette du Sorcier s'attaqua également à vous au cours de votre campagne de dénigrement, insinuant que vous aviez des « liens avec des groupes subversifs de gobelins ». En juin 1996, vous étiez minuscule et voûtée, le visage tellement ridé qu'il semblait couvert de toiles d'araignée. Vous êtes plus âgée que Dumbledore d'au moins une décennie.", //
                        "Vous êtes un ancien Auror et membre de l'Ordre du Phénix.", //
                        "Vous êtes la directrice de l'Académie de Magie de Beauxbâtons, vous êtes une française et une demi-géante tout comme Rubeus Hagrid qui est amoureux de vous.", //
                        "Vous êtes une un fantôme de Poudlard, ancienne étudiante de Serdaigle. Vous êtes le fantôme d'une jeune fille qui hante les toilettes des filles du 2e étage de Poudlard où se situe l’accès à la Chambre des Secrets. Vous ne cessez de gémir et pensez très souvent à la mort. Vous êtes petite et trapue et votre visage est constamment maussade. Vos cheveux sont longs et vous portez des lunettes aux verres épais.", //
                        // Ajouter le fantôme "Moine Gras" ?
                        "Vous êtes un élève de Serpentard, successeur de Marcus Flint comme capitaine de quidditch et membre de la Brigade Inquisitoriale.", //
                        "Vous êtes un employé du ministère de la Magie, Langue-de-Plomb du département des mystères.", //
                        "Vous êtes l'un des premiers Mangemorts.", //
                        "Vous êtes un fantôme de Gryffondor. Sir Nicholas de Mimsy-Porpington alias « Nick Quasi-Sans-Tête » est le spectre de Gryffondor, exécuté le 31 octobre 1492.", //
                        "Vous êtes l'un des premiers Mangemorts.", //
                        "Vous êtes un élève de Serpentard en même année que Harry Potter, son père est un Mangemort. Selon J. K. Rowling, vous êtes l'un des seuls élèves auquel Drago Malefoy s'adresse comme à un égal car vous avez un sang aussi pur que lui.", //
                        "Vous êtes un fonctionnaire au ministère de la Magie. Vous avez été membre de la Brigade de police magique. Vous êtes un petit homme replet qui porte des lunettes extraordinairement épaisses, réduisant vos yeux à deux petits points semblables à des grains de beauté. Vous aviez eu des contacts assez houleux avec la famille Gaunt via votre travail pour le ministère.", //
                        "Vous tenez une boutique au chemin de Traverse. Né un 25 septembre, vous aez été élève de Serdaigle à Poudlard. Votre père est un sorcier et votre mère une moldue.", //
                        "Vous êtes une fonctionnaire au ministère de la Magie, professeure de Défense contre les forces du mal et directrice de Poudlard. Dans celui-ci, on découvre que vous haissez les hybrides en méprisant les centaures, le professeur Lupin (loup-garou) et Hagrid qui est mi-géant.", //
                        "Née en 1979 ou en 1980, vous êtes issue d'une famille de sang pur, inscrite dans le registre des Sang-pur. Lors de votre rentrée à Poudlard en 1991 (la même année que le protagoniste, Harry Potter), vous intègrez la maison Serpentard. Vous devenez préfète et membre de la brigade inquisitoriale lors de sa 5e année.", //
                        "Vous êtes la sœur jumelle de Parvati, élève de Serdaigle, membre de l'armée de Dumbledore.", //
                        "Vous êtes la sœur jumelle de Padma, élève de Gryffondor, membre de l'armée de Dumbledore.", //
                        "Vous êtes élève de Gryffondor, vous rejoinez l'équipe de quidditch de votre maison en tant que batteur à la suite du départ des jumeaux Weasley.", //
                        "Vous êtes un maraudeur, ancien membre de l'Ordre du Phénix, mangemort et animagus non déclaré.", //
                        "Vous êtes le propriétaire original de la Baguette de Sureau. Vous étiez le plus âgé des trois frères Peverell. Vous avez été tué dans votre sommeil après vous êtres vanté de l'invincibilité de votre baguette. Le meurtrier a alors volé la Baguette de Sureau, de ce fait lançant son histoire sanglante.", //
                        "Vous êtes le propriétaire original de la Pierre de résurrection. Vous êtes le second frère Peverell. Utilisant la pierre, vous avez ressuscité la fille que vous aviez par le passé espéré épouser, qui était morte d'une mort prématurée. Bien qu'elle soit revenue au monde mortel, elle n'a jamais vraiment appartenu à ce monde et vous vous étes donc tué pour la rejoindre. La pierre a été enfoncée plus tard dans un anneau, la bague des Gaunt, qui a appartenu à Elvis Gaunt puis à Tom Jedusor. Vous êtes un ancêtre de Voldemort.", //
                        "Vous êtes le propriétaire original de la Cape d'invisibilité, une des trois reliques de la mort. Vous êtes le plus jeune des frères Peverell, décrit dans Les Contes de Beedle le Barde comme étant le plus humble et le plus sage des frères Peverell. À la différence de vos frères, vous avez vécu une longue vie. Vous êtes un ancêtre de Harry Potter. Votre tombe se trouve dans le cimetière de Godric's Hollow.", //
                        "Vous êtes la présidente du Congrès magique des États-Unis d'Amérique de 1920 à 1928.", //
                        "Vous faite partie des membres du personnel de Poudlard.", //
                        "Vous êtes un membre de l'Ordre du Phénix. Petit sorcier à la mâchoire carrée et aux cheveux jaune paille, vous êtes membre de l'Ordre du Phénix depuis l'origine.", //
                        "Vous êtes le meilleur ami de Dudley Dursley, vous êtes garçon efflanqué avec une tête de rat, grand et stupide. Vous accompagnez Harry et les Dursley au zoo pour les onze ans de Dudley et entend Harry parler au boa constrictor.", //
                        "Vous êtes une membre du personnel de Poudlard.", //
                        "Vous êtes le second fils de Harry et Ginny. Personnage principal de la pièce de théâtre Harry Potter et l'Enfant maudit.", //
                        "Héros de la série du même nom.", //
                        "Vous êtes un Membre de l'Ordre du Phénix et père de Harry Potter.", //
                        "Vous êtes le fils aîné de Ginny et de Harry Potter. Vous avez pour prénoms celui du père et celui du parrain de Harry. Vous êtes le portrait craché de votre grand-père James Potter.", //
                        "Vous êtes un membre de l'Ordre du Phénix et mère de Harry Potter.", //
                        "Vous êtes la fille cadette de Harry et Ginny. Vous êtes prénommée ainsi en référence à la mère de Harry et à Luna Lovegood. Vous avez les cheveux roux caractéristiques des Weasley.", //
                        "Vous êtes l'un des quatre pères fondateurs de Poudlard qui avez donné votre nom à une maison. Vous recherchiez des élèves honnêtes, loyaux et travailleurs. Votre objet fétiche était une coupe ornée d'un blaireau (votre symbole) qui fut transformé en horcruxe par Voldemort.", //
                        "Vous êtes les frères de Molly Weasley, membres du premier Ordre du Phénix. Vous êtes morts en héros d'après Maugrey, puisqu'il a fallu cinq Mangemorts pour vous achever.", //
                        "Vous êtes une sorcière de sang-pur. Vous êtes la mère de Severus et l'épouse du moldu Tobias Rogue. Dans un des souvenirs de Severus, vous êtes décrite comme une femme mince au teint jaunâtre et à l'air revêche. Vous êtes ancienne élève de l'école Poudlard (sur une coupure de presse, on découvre que vous avez été capitaine de l'équipe des bavboules de Poudlard, un jeu sorcier). On sait aussi que vous étiez particulièrement douée dans l'art des potions.", //
                        "Vous êtes un guérisseur stagiaire à Sainte-Mangouste. Vous avez déjà fait des points de suture à Arthur Weasley.", //
                        "Vous êtes fait partie des membres du personnel de Poudlard.", //
                        "Vous êtes une poursuiveuse de l'équipe de quidditch de Gryffondor dans Harry Potter et le Prince de sang-mêlé.", //
                        "Vous êtes le contrôleur du Magicobus et un mangemort.", //
                        "Vous êtes professeur de potions, directeur de la maison des Serpentard puis directeur à Poudlard, ancien mangemort, membre de l'Ordre du Phénix.", //
                        "Vous êtes moldu, père de Severus Rogue et mari de Eileen Prince. Vous êtes décrit comme ayant un nez crochu et des cheveux noirs. Dans les souvenirs de Rogue, on découvre que vous n'aimiez pas la magie.", //
                        "Un Mangemort.", //
                        "Vous êtes un Mangemort", //
                        "Vous êtes un disciple de Gellert Grindelwald.", //
                        "Vous êtes la patronne du pub Les Trois Balais à Pré-au-Lard.", //
                        "Féléiciation, Vous êtes un Mangemort.", //
                        "Vous êtes un fonctionnaire au ministère de la Magie. Vous êtes Haut-Placé au Ministère après la prise au pouvoir de Voldemort. Vous êtes en bons termes avec les Mangemorts et avec Dolores Ombrage. Vous vous faite respecter par l'intimidation au sein du ministère. Vous êtes un partisan des idées de Voldemort. ", //
                        "Vous faite partie des membres du personnel de Poudlard.", //
                        "Vous êtes un fafleur qui fait partie du groupe de Greyback.", //
                        "Vous êtes l'ancien ministre de la Magie. Vous officiez, avant sa nomination au poste de ministre en juillet 1996, en tant que directeur du département des Aurors, et ce depuis 1979. Vous êtes un homme d'action, qui ne mâche pas ses mots et fait preuve d'un grand manque de tact.", //
                        "Vous êtes Mangemort.", //
                        "Vous êtes la cofondatrice de Poudlard qui a donné son nom à une maison. Vous recherchiez des élèves particulièrement intelligents, avides d'apprendre.", //
                        "Vous êtes la Dame Grise", //
                        "Vous êtes l'un des quatre pères fondateurs de Poudlard qui a donné son nom à une maison. Vous recherchiez des élèves rusés et ambitieux, issus de nobles lignées.", //
                        "Vous êtes un employé du ministère de la Magie et membre de l'Ordre du Phénix.", //
                        "Vous êtes un Moldu qui siégeait au Sénat des États-Unis en 1926. Vous petes le fils d'un riche éditorialiste.", //
                        "Vous faite partie du personnel de Poudlard.", //
                        "Vous êtes une reporter pour la Gazette du Sorcier. Née en 1951, vous ne cessez de déformer ce qu'on vous dit en interview grâce à votre Plume à Papote, pour que vos articles se vendent mieux. Vous êtes un Animagus non déclaré, vous pouvez vous transformer en scarabée, pouvant ainsi mieux écouter les conversations privées.", //
                        "Vous faite partie du personnel de Poudlard.", //
                        "Vous êtes une vieille sorcière riche, descendante d'Helga Poufsouffle. C'est à vous que Voldemort a dérobé la coupe de Poufsouffle, un trésor de famille. Il vous a également tué pour transformer la coupe en Horcruxe.", //
                        "Vous êtes un élève de Poufsouffle, poursuiveur de leur équipe de quidditch après la mort de Cedric Diggory, membre de l'armée de Dumbledore.", //
                        "Vous êtes le responsable des mises en détention de la Confédération Internationale des Sorciers.", //
                        "Vous êtes une élève de Gryffondor et poursuiveuse au quidditch, membre de l'armée de Dumbledore.", //
                        "Vous êtes du personnel de Poudlard.", //
                        "Vous êtes l'ancien ministre de la Magie et aussi un mangemort.", //
                        "Vous êtes un élève de Gryffondor, membre de l'armée de Dumbledore.", //
                        "Vous êtes le propriétaire et barman du Chaudron Baveur. Homme chauve et âgé qui rencontre Harry pour la première fois lorsqu'il se rend sur le chemin de Traverse avec Hagrid.", //
                        "Vous êtes la mère de Nymphadora Tonks, sœur de Bellatrix Lestrange et de Narcissa Malefoy. Vous êtes mariée à Ted Tonks, un sorcier d'ascendance moldue, raison pour laquelle vous fut reniée par votre famille. Vous êtes issue de la famille Black.", //
                        "Vous êtes un membre de l'Ordre du Phénix.", //
                        "Vous êtes le père de Nymphadora Tonks. Sorcier d'ascendance moldue, vous êtes le mari d'Andromeda. Vous étiez décrit par votre fille comme un « vrai cochon », en contraste avec les Dursley, dont la maison est un peu trop propre et manque de naturel pour Nymphadora. Le mariage d'Andromeda avec vous lui attira le déni de la famille Black.", //
                        "Vous êtes la voisine de la famille Dumbledore dans votre jeunesse. Vous êtes l'auteur du manuel Histoire de la magie. Après la mort de Dumbledore, Rita Skeeter vous fait boire du Veritaserum avant de vous poser des questions sur la famille Dumbledore pour écrire son livre.", //
                        "Vous êtes le chef du département de la justice magique britannique en 1927.", //
                        "Vous êtes un Mangemort, tout simplement.", //
                        "Vous êtes du personnel de Poudlard.", //
                        "Vous êtes membre de l'Ordre du Phénix depuis son origine. Vous avez fait partie de la garde rapprochée qui aide Harry à quitter Privet Drive pour rejoindre le siège de l'Ordre. Vous y êtes décrite comme une sorcière « majestueuse » et porte un châle vert émeraude.", //
                        "Vous êtes une élève de Gryffondor de deux ans plus jeune que Harry dont vous êtes amoureuse. Vous lui offrez des chaudrons au chocolat dans lesquels vous avez mis un philtre d'amour mais c'est Ron qui finalement les mange et qui tombe éperdument amoureux de vous.", //
                        "Vous êtes au sein du personnel de Poudlard.", //
                        "Vous êtes un fonctionnaire au ministère de la Magie, ancien joueur professionnel de quidditch. Vous étiez très populaire alors que vous étiez batteur pour les Frelons de Wimbourne et pour la sélection nationale anglaise. Vous êtes décrit comme quelqu'un de sympathique et prêt à aider mais à l'intelligence limitée. Physiquement vous êtes grand, fort et blond aux yeux bleus avec un visage assez rond.", //
                        "Vous êtes la portrait ami de la Grosse Dame146.", //
                        "Vous êtes le mage noir réputé invincible, chef et fondateur des mangemorts.", //
                        "Vous êtes élève de Serpentard, et membre de l'équipe de quidditch de Serpentard au poste de poursuiveur durant la troisième et la cinquième année de Harry Potter.", //
                        "Vous êtes membre de l'Ordre du Phénix, fonctionnaire au ministère de la Magie, père de Bill, Charlie, Percy, Fred, George, Ron et Ginny Weasley.", //
                        "Vous êtes un des deux frères d'Arthur. Vous seriez mort dans les vingt-quatre heures qui ont suivi sa rencontre avec un Sinistros. Vous êtes décrit comme un personnage excentrique et amusant par les jumeaux Weasley lors du mariage de Bill et Fleur Delacour.", //
                        "Vous êtes un membre de l'Ordre du Phénix, vous travaillez pour Gringotts et êtes l'aîné de la fratrie Weasley.", //
                        "Vous êtes un membre de l'Ordre du Phénix, vous étudiez les dragons en Roumanie. Vous êtes le deuxième enfant Weasley.", //
                        "Vous êtes la fille cadette de Bill et Fleur.", //
                        "Vous êtes élève de Gryffondor (1er avril 1978 - 2 mai 1998), membre de l'armée de Dumbledore, jumeau de George Weasley. Vous êtes décrit comme très amusant.", //
                        "Vous êtes le fils de George et d'Angelina Johnson. Appelé ainsi en hommage à votre oncle Fred Weasley, mort lors du combat final contre Voldemort.", //
                        "Né le 1er avril 1978, Élève de Gryffondor, membre de l'armée de Dumbledore, jumeau de Fred Weasley. Vous êtes comme votre frère jumeau, décrit comme très amusant. Vous resterez marqué à jamais par la mort de votre jumeau. Mais vous vous marirez avec l'ex de ce dernier, Angelina Johnson.", //
                        "Vous êtes élève de Gryffondor, membre de l'armée de Dumbledore, vous vous marierez avec Harry.", //
                        "Vous êtes le fils cadet de Bill et Fleur.", //
                        "Vous êtes la fille de Percy et Audrey.", //
                        "Vous êtes un membre de l'Ordre du Phénix, mère de Bill, Charlie, Percy, Fred, George, Ron et Ginny Weasley.", //
                        "Vous êtes la grand-tante de Ron. Centenaire, vous avez prêté votre tiare à Fleur Delacour à l'occasion de son mariage avec Bill, auquel vous avez assisté. Vous aimez beaucoup les articles de Rita Steeker et est décrite comme très désagréable.", //
                        "Vous êtes un fonctionnaire au ministère de la Magie, Percy Ignatus Weasley, vous être le troisième fils de la famille et êtes né en 1976. Vous êtes le membre ambitieux de la famille et qui n'avez qu'une seule envie : sortir de la pauvreté et faire une grande carrière au ministère. Vous êtes arrogant et pompeux et vous serez le seul membre de la famille Weasley à ne pas soutenir Harry au moment du retour de Voldemort, suivant en cela la ligne du ministère. En cinquième vous êtes un des meilleurs élèves de Poudlard ; cette année-là, vous avez été nommé préfet de la maison Gryffondor,", //
                        "Vous êtes meilleur ami de Harry Potter, élève de Gryffondor, membre de l'armée de Dumbledore.", //
                        "Vous êtes la fille de George et Angelina Johnson.", //
                        "Vous êtes la fille aînée de Bill et Fleur Delacour. Vous avez la chevelure blonde et les yeux bleus de votre mère.", //
                        "Vous faite partie des Mangemorts.", //
                        "Vous êtes un fonctionnaire au ministère de la Magie. Vous êtes un sorcier au teint écarlate et aux cheveux coiffés en catogan, qui avez participé à la capture de Rubeus Hagrid par Dolores Ombrage.", //
                        "Vous êtes un membre de l'Armée de Dumbledore.", //
                        "Vous êtes un mangemort et un fonctionnaire au ministère de la Magie.", //
                        "Vous êtes élève de Serpentard, de la même année que Harry, fils d'une célèbre sorcière connue pour avoir été mariée sept fois, devenue veuve avec une montagne d'or à la mort mystérieuse de chacun de ses maris. Vous êtes membre du Club de Slug." //
        };
}
