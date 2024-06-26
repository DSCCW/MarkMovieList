package com.movieList.Repository;

import com.movieList.Service.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    MovieRepository movies;
    @Override
    public void run(String... args) throws Exception {

        SecureRandom random = new SecureRandom();

        movies.save(new Movie(random.nextLong(), "The Shawshank Redemption", 1994, "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
                "Frank Darabont", new String[]{"Tim Robbins", "Morgan Freeman"}, 142, 9.3, 10000, 28341469, 80));

        movies.save(new Movie(random.nextLong(), "The Godfather", 1972, "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
                "Francis Ford Coppola", new String[]{"Marlon Brando", "Al Pacino", "James Caan"}, 175, 9.2, 9000, 245066411, 100));

        movies.save(new Movie(random.nextLong(), "The Dark Knight", 2008, "When the menace known as The Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham.",
                "Christopher Nolan", new String[]{"Christian Bale", "Heath Ledger", "Aaron Eckhart", "Gary Oldman"}, 152, 9.0, 11000, 1004558444, 84));

        movies.save(new Movie(random.nextLong(), "Pulp Fiction", 1994, "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.",
                "Quentin Tarantino", new String[]{"John Travolta", "Uma Thurman", "Samuel L. Jackson", "Bruce Willis"}, 154, 8.9, 9500, 213928762, 94));

        movies.save(new Movie(random.nextLong(), "Schindler's List", 1993, "In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.",
                "Steven Spielberg", new String[]{"Liam Neeson", "Ben Kingsley", "Ralph Fiennes"}, 195, 8.9, 8700, 32216177, 93));

        movies.save(new Movie(random.nextLong(), "Forrest Gump", 1994, "The presidencies of Kennedy and Johnson, the events of Vietnam, Watergate and other historical events unfold from the perspective of an Alabama man with an IQ of 75, whose only desire is to be reunited with his childhood sweetheart.",
                "Robert Zemeckis", new String[]{"Tom Hanks", "Robin Wright", "Gary Sinise"}, 142, 8.8, 9200, 677945399, 82));

        movies.save(new Movie(random.nextLong(), "The Lord of the Rings: The Return of the King", 2003, "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.",
                "Peter Jackson", new String[]{"Elijah Wood", "Viggo Mortensen", "Ian McKellen", "Orlando Bloom"}, 201, 8.9, 9800, 1119695797, 94));

        movies.save(new Movie(random.nextLong(), "Fight Club", 1999, "An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into much more.",
                "David Fincher", new String[]{"Brad Pitt", "Edward Norton", "Helena Bonham Carter"}, 139, 8.8, 8500, 100853753, 66));

        movies.save(new Movie(random.nextLong(), "Inception", 2010, "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.",
                "Christopher Nolan", new String[]{"Leonardo DiCaprio", "Joseph Gordon-Levitt", "Ellen Page", "Tom Hardy"}, 148, 8.8, 9200, 836836967, 74));

        movies.save(new Movie(random.nextLong(), "The Matrix", 1999, "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.",
                "Lana Wachowski, Lilly Wachowski", new String[]{"Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss", "Hugo Weaving"}, 136, 8.7, 8000, 463517383, 73));

        movies.save(new Movie(random.nextLong(), "Goodfellas", 1990, "The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners Jimmy Conway and Tommy DeVito in the Italian-American crime syndicate.",
                "Martin Scorsese", new String[]{"Robert De Niro", "Ray Liotta", "Joe Pesci"}, 146, 8.7, 8900, 46836394, 89));

        movies.save(new Movie(random.nextLong(), "Star Wars: Episode V - The Empire Strikes Back", 1980, "After the Rebels are brutally overpowered by the Empire on the ice planet Hoth, Luke Skywalker begins Jedi training with Yoda, while his friends are pursued by Darth Vader.",
                "Irvin Kershner", new String[]{"Mark Hamill", "Harrison Ford", "Carrie Fisher"}, 124, 8.7, 8300, 538375067, 82));

        movies.save(new Movie(random.nextLong(), "The Silence of the Lambs", 1991, "A young F.B.I. cadet must receive the help of an incarcerated and manipulative cannibal killer to help catch another serial killer, a madman who skins his victims.",
                "Jonathan Demme", new String[]{"Jodie Foster", "Anthony Hopkins", "Scott Glenn"}, 118, 8.6, 7800, 272742922, 85));

        movies.save(new Movie(random.nextLong(), "Se7en", 1995, "Two detectives, a rookie and a veteran, hunt a serial killer who uses the seven deadly sins as his motives.",
                "David Fincher", new String[]{"Morgan Freeman", "Brad Pitt", "Kevin Spacey"}, 127, 8.6, 7700, 327311859, 65));

        movies.save(new Movie(random.nextLong(), "Inglourious Basterds", 2009, "In Nazi-occupied France during World War II, a plan to assassinate Nazi leaders by a group of Jewish U.S. soldiers coincides with a theatre owner's vengeful plans for the same.",
                "Quentin Tarantino", new String[]{"Brad Pitt", "Diane Kruger", "Eli Roth"}, 153, 8.3, 8200, 321455689, 69));

        movies.save(new Movie(random.nextLong(), "The Departed", 2006, "An undercover cop and a mole in the police attempt to identify each other while infiltrating an Irish gang in South Boston.",
                "Martin Scorsese", new String[]{"Leonardo DiCaprio", "Matt Damon", "Jack Nicholson"}, 151, 8.5, 9200, 291465034, 85));

        movies.save(new Movie(random.nextLong(), "Gladiator", 2000, "A former Roman General sets out to exact vengeance against the corrupt emperor who murdered his family and sent him into slavery.",
                "Ridley Scott", new String[]{"Russell Crowe", "Joaquin Phoenix", "Connie Nielsen"}, 155, 8.5, 9600, 457640427, 67));

        movies.save(new Movie(random.nextLong(), "The Prestige", 2006, "After a tragic accident, two stage magicians engage in a battle to create the ultimate illusion while sacrificing everything they have to outwit each other.",
                "Christopher Nolan", new String[]{"Christian Bale", "Hugh Jackman", "Scarlett Johansson"}, 130, 8.5, 8700, 109676311, 66));

        movies.save(new Movie(random.nextLong(), "The Green Mile", 1999, "The lives of guards on Death Row are affected by one of their charges: a black man accused of child murder and rape, yet who has a mysterious gift.",
                "Frank Darabont", new String[]{"Tom Hanks", "Michael Clarke Duncan", "David Morse"}, 189, 8.6, 8900, 286801374, 61));

        movies.save(new Movie(random.nextLong(), "The Usual Suspects", 1995, "A sole survivor tells of the twisty events leading up to a horrific gun battle on a boat, which began when five criminals met at a seemingly random police lineup.",
                "Bryan Singer", new String[]{"Kevin Spacey", "Gabriel Byrne", "Chazz Palminteri"}, 106, 8.5, 7800, 23341568, 77));

        movies.save(new Movie(random.nextLong(), "American History X", 1998, "A former neo-nazi skinhead tries to prevent his younger brother from going down the same wrong path that he did.",
                "Tony Kaye", new String[]{"Edward Norton", "Edward Furlong", "Beverly D'Angelo"}, 119, 8.5, 8100, 23906377, 62));

        movies.save(new Movie(random.nextLong(), "The Social Network", 2010, "As Harvard student Mark Zuckerberg creates the social networking site that would become known as Facebook, he is sued by the twins who claimed he stole their idea, and by the co-founder who was later squeezed out of the business.",
                "David Fincher", new String[]{"Jesse Eisenberg", "Andrew Garfield", "Justin Timberlake"}, 120, 7.7, 9300, 224920315, 95));

        movies.save(new Movie(random.nextLong(), "Saving Private Ryan", 1998, "Following the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action.",
                "Steven Spielberg", new String[]{"Tom Hanks", "Matt Damon", "Tom Sizemore"}, 169, 8.6, 9200, 482349603, 91));

        movies.save(new Movie(random.nextLong(), "Interstellar", 2014, "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
                "Christopher Nolan", new String[]{"Matthew McConaughey", "Anne Hathaway", "Jessica Chastain"}, 169, 8.6, 9700, 677481473, 74));

        movies.save(new Movie(random.nextLong(), "The Grand Budapest Hotel", 2014, "A concierge teams up with a lobby boy to prove his innocence after he is framed for murder.",
                "Wes Anderson", new String[]{"Ralph Fiennes", "Tony Revolori", "F. Murray Abraham"}, 99, 8.1, 7800, 172943450, 88));

        movies.save(new Movie(random.nextLong(), "Star Wars: Episode IV - A New Hope", 1977, "Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a Wookiee and two droids to save the galaxy from the Empire's world-destroying battle station, while also attempting to rescue Princess Leia from the mysterious Darth Vader.",
                "George Lucas", new String[]{"Mark Hamill", "Harrison Ford", "Carrie Fisher"}, 121, 8.6, 9200, 775398007, 90));

        movies.save(new Movie(random.nextLong(), "Star Wars: Episode VII - The Force Awakens", 2015, "Three decades after the Empire's defeat, a new threat arises in the militant First Order. Stormtrooper defector Finn and the scavenger Rey are caught up in the Resistance's search for the missing Luke Skywalker.",
                "J.J. Abrams", new String[]{"Daisy Ridley", "John Boyega", "Oscar Isaac"}, 138, 7.8, 8900, 2068223624, 81));

        movies.save(new Movie(random.nextLong(), "Iron Man", 2008, "After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil.",
                "Jon Favreau", new String[]{"Robert Downey Jr.", "Gwyneth Paltrow", "Jeff Bridges"}, 126, 7.9, 9100, 585366247, 79));

        movies.save(new Movie(random.nextLong(), "The Avengers", 2012, "Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
                "Joss Whedon", new String[]{"Robert Downey Jr.", "Chris Evans", "Scarlett Johansson"}, 143, 8.0, 9500, 1518812988, 69));

        movies.save(new Movie(random.nextLong(), "Guardians of the Galaxy", 2014, "A group of intergalactic criminals must pull together to stop a fanatical warrior with plans to purge the universe.",
                "James Gunn", new String[]{"Chris Pratt", "Zoe Saldana", "Dave Bautista"}, 121, 8.0, 8400, 773328629, 76));

        movies.save(new Movie(random.nextLong(), "Star Wars: Episode VIII - The Last Jedi", 2017, "Rey develops her newly discovered abilities with the guidance of Luke Skywalker, who is unsettled by the strength of her powers. Meanwhile, the Resistance prepares for battle with the First Order.",
                "Rian Johnson", new String[]{"Daisy Ridley", "John Boyega", "Mark Hamill"}, 152, 7.0, 9300, 1332539889, 85));

        movies.save(new Movie(random.nextLong(), "Wonder Woman", 2017, "When a pilot crashes and tells of conflict in the outside world, Diana, an Amazonian warrior in training, leaves home to fight a war, discovering her full powers and true destiny.",
                "Patty Jenkins", new String[]{"Gal Gadot", "Chris Pine", "Robin Wright"}, 141, 7.4, 8700, 821847012, 76));

        movies.save(new Movie(random.nextLong(), "Blade Runner 2049", 2017, "A young blade runner's discovery of a long-buried secret leads him to track down former blade runner Rick Deckard, who's been missing for thirty years.",
                "Denis Villeneuve", new String[]{"Harrison Ford", "Ryan Gosling", "Ana de Armas"}, 164, 8.0, 9200, 260502446, 81));

        movies.save(new Movie(random.nextLong(), "Get Out", 2017, "A young African-American visits his white girlfriend's parents for the weekend, where his simmering uneasiness about their reception of him eventually reaches a boiling point.",
                "Jordan Peele", new String[]{"Daniel Kaluuya", "Allison Williams", "Bradley Whitford"}, 104, 7.7, 8900, 255407969, 84));

        movies.save(new Movie(random.nextLong(), "Logan", 2017, "In a future where mutants are nearly extinct, an elderly and weary Logan leads a quiet life. But when Laura, a mutant child pursued by scientists, comes to him for help, he must get her to safety.",
                "James Mangold", new String[]{"Hugh Jackman", "Patrick Stewart", "Dafne Keen"}, 137, 8.1, 9500, 619021436, 77));

        movies.save(new Movie(random.nextLong(), "Dunkirk", 2017, "Allied soldiers from Belgium, the British Empire, and France are surrounded by the German Army and evacuated during a fierce battle in World War II.",
                "Christopher Nolan", new String[]{"Fionn Whitehead", "Barry Keoghan", "Mark Rylance"}, 106, 7.8, 9300, 526940665, 94));

        movies.save(new Movie(random.nextLong(), "The Shape of Water", 2017, "At a top-secret research facility in the 1960s, a lonely janitor forms a unique relationship with an amphibious creature that is being held in captivity.",
                "Guillermo del Toro", new String[]{"Sally Hawkins", "Octavia Spencer", "Michael Shannon"}, 123, 7.3, 9100, 195243464, 87));

        movies.save(new Movie(random.nextLong(), "Coco", 2017, "Aspiring musician Miguel, confronted with his family's ancestral ban on music, enters the Land of the Dead to find his great-great-grandfather, a legendary singer.",
                "Lee Unkrich, Adrian Molina", new String[]{"Anthony Gonzalez", "Gael García Bernal", "Benjamin Bratt"}, 105, 8.4, 8800, 807082196, 81));

        movies.save(new Movie(random.nextLong(), "Baby Driver", 2017, "After being coerced into working for a crime boss, a young getaway driver finds himself taking part in a heist doomed to fail.",
                "Edgar Wright", new String[]{"Ansel Elgort", "Jon Hamm", "Jamie Foxx"}, 113, 7.6, 8500, 226945087, 86));

        movies.save(new Movie(random.nextLong(), "Three Billboards Outside Ebbing, Missouri", 2017, "A mother personally challenges the local authorities to solve her daughter's murder when they fail to catch the culprit.",
                "Martin McDonagh", new String[]{"Frances McDormand", "Woody Harrelson", "Sam Rockwell"}, 115, 8.2, 9000, 160192237, 88));

        movies.save(new Movie(random.nextLong(), "Dune", 2021, "Feature adaptation of Frank Herbert's science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy.",
                "Denis Villeneuve", new String[]{"Timothée Chalamet", "Rebecca Ferguson", "Zendaya"}, 155, 7.9, 8700, 40450000, 74));

        movies.save(new Movie(random.nextLong(), "No Time to Die", 2021, "James Bond has left active service. His peace is short-lived when Felix Leiter, an old friend from the CIA, turns up asking for help, leading Bond onto the trail of a mysterious villain armed with dangerous new technology.",
                "Cary Joji Fukunaga", new String[]{"Daniel Craig", "Ana de Armas", "Rami Malek"}, 163, 7.5, 9300, 77407476, 68));

        movies.save(new Movie(random.nextLong(), "Joker", 2019, "In Gotham City, mentally troubled comedian Arthur Fleck is disregarded and mistreated by society. He then embarks on a downward spiral of revolution and bloody crime. This path brings him face-to-face with his alter-ego: the Joker.",
                "Todd Phillips", new String[]{"Joaquin Phoenix", "Robert De Niro", "Zazie Beetz"}, 122, 8.4, 9300, 1074251311, 59));

        movies.save(new Movie(random.nextLong(), "Avengers: Endgame", 2019, "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
                "Anthony Russo, Joe Russo", new String[]{"Robert Downey Jr.", "Chris Evans", "Mark Ruffalo"}, 181, 8.4, 9500, 2797501328L, 78));

        movies.save(new Movie(random.nextLong(), "Independence Day", 1996, "The aliens are coming and their goal is to invade and destroy Earth. Fighting superior technology, mankind's best weapon is the will to survive.",
                "Roland Emmerich", new String[]{"Will Smith", "Bill Pullman", "Jeff Goldblum"}, 145, 7.0, 8400, 817400891, 59));

        movies.save(new Movie(random.nextLong(), "Mission: Impossible", 1996, "An American agent, under false suspicion of disloyalty, must discover and expose the real spy without the help of his organization.",
                "Brian De Palma", new String[]{"Tom Cruise", "Jon Voight", "Emmanuelle Béart"}, 110, 7.1, 8100, 457696359, 60));
    }
}
