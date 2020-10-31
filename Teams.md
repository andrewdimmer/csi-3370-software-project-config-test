# Teams

This document shall explain the team structure defined by the professor that guides this group project.

> "Each SCRUM Team participates in the Case Study & Root Cause Analysis. All are supervised by the _Project Scrum Team_. The SCRUM Teams, 1 through 4 have been assigned to specific subsystems: _Display 1, Display 2 , Middleware 1, Middleware2, & Database 1, Database 2_. Teams have been split into 2 parts due to the Class Project’s complexity. These Subsystems conform to the _classical 3-layer closed architecture_. That is, Display knows only about Middleware, and Middleware only knows about Database. Only Display can issue requests to Middleware in response to requests from an External Actor. Only Middleware can issue requests to Database. Database can only respond to requests from Middleware."
>
> \- 2020_Fall_CSI3370 Class Project SCRUM Team Assignments, Roles & Responsibilities_v1.0_201018

## Product Owner

The professor is the product owner. All requirements come from the professor.

## Admin (Project SCRUM Team)

> "The Project SCRUM Team is responsible for managing the Project. The Project SCRUM Team will coordinate the efforts of all the other SCRUM Teams. The Project SCRUM Master will ensure that all SCRUM Teams meet their objectives so that the Class Project finishes on time (Final Project Review). The Project Assistant SCRUM Master will ensure that all required work products meet the requirements as provided by the Instructor & are completed in time to support the Class Project overall objectives."
>
> \- 2020_Fall_CSI3370 Class Project SCRUM Team Assignments, Roles & Responsibilities_v1.0_201018

**Project SCRUM Master:** Brendan Fraser (@brendanfraser597)

**Project SCRUM Assistant Master:** Tessa Peruzzi (@TessaPeruzzi)

**Project SCRUM Integration Master:** Andrew Dimmer (@andrewdimmer)

## Display

> The SCRUM Display Team is responsible for all work products & efforts involved in developing the Display Interface to the _SecureLocTracker System_ for all human and machine External Actors. Display shall not perform persistent calculations or storage. Display shall pass all requests to Middleware and take returns from requests to Middleware.
>
> \- 2020_Fall_CSI3370 Class Project SCRUM Team Assignments, Roles & Responsibilities_v1.0_201018

### Display_01

In particular, the Display_01 team is in charge of the GPS Receiver and the ~~GIS RFID Transponder Interface~~ (cut due to time constraints by the professor).

**Team SCRUM Master:** Eric Chan (@EC01EC)

**Team SCRUM Assistant Master:** Steve Catherman (@stevecatherman)

**Team SCRUM Integrator:** Cody Asher (@casher-ou)

**Team Members:**

- John Akroush (@John-A11)
- Evan Lilley (@elilley15)
- David Lindner (@DLidz)
- Andrew Poynter (@atpoynter)
- Reed Sikorski (@reedsikorskiOU)

### Display_02

In particular, the Display_02 team is in charge of the COMM 2-Way Link Interface.

**Team SCRUM Master:** Jessica Cortes (@jcortes18)

**Team SCRUM Assistant Master:** Sydney Hill (@sydneyhill3901)

**Team SCRUM Integrator:** Jonathan Chan (@Volter43)

**Team Members:**

- David Baker (@Dbaker19972)
- Paul Hardwoodward (@phardwoodward)
- Anthony Hartman (@Ahartman3)
- Tin Liu (MetalMan1992@)
- Jacob McCloud (@jmccloud827)
- Yousif Sallan (TODO: Add GitHub Username once I have it)

## Middleware

> "The SCRUM Middleware1 & Middleware2 Teams (_'Middleware'_) are responsible for all work products & efforts involved in developing the logic manager for the System. Middleware shall implement the 'business rules' that govern the functional & nonfunctional behavior of the System. Middleware shall handle all requests from Display and make any store or retrieve requests to Database."
>
> \- 2020_Fall_CSI3370 Class Project SCRUM Team Assignments, Roles & Responsibilities_v1.0_201018

### Middleware_01

In particular, the Middleware_01 team is in charge of the GIS Processor.

**Team SCRUM Master:** Brenda Morquecho (@brendam19)

**Team SCRUM Assistant Master:** Julia Wang (@juliawang2014)

**Team SCRUM Integrator:** Martin Hughes (@martinhughes0722)

**Team Members:**

- Stan Barczak (@BarczakS)
- Y Duong (@yduong)
- Syed Hayat (@shayat97)
- Talha Memon (@slackjaw1431)
- Pujan Shah (@Bimmerboi-248)
- Steven Naoum (@san4497)

### Middleware_02

In particular, the Middleware_02 team is in charge of the COMM Link Manager.

**Team SCRUM Master:** Kenzie King (@mckenzieking)

**Team SCRUM Assistant Master:** Kal Willard (@kwillard34)

**Team SCRUM Integrator:** Rayvin Benno (@tomtomtomcat)

**Team Members:**

- Nik Bergamin (@nbergamin123)
- Rio Capollari (@rcapollari)
- Ali El-Nazly (@GitLee32)
- Tyler Rode (TODO: Add GitHub Username once I have it)
- Nou Moua (@NMoua-Edu)
- Caleb White (@windwakes)

## Database

> "The SCRUM Database Team is responsible for all work products & efforts involved in developing the data storage capability for the System. Database shall not initiate any requests but rather, take all requests from, & respond to, Middleware."
>
> \- 2020_Fall_CSI3370 Class Project SCRUM Team Assignments, Roles & Responsibilities_v1.0_201018

In particular, the Database team is in charge of the ~~GIS Volatile Info~~ (cut due to time constraints by the professor), GIS Persistent Info, ~~COMM Volatile Info~~ (cut due to time constraints by the professor), and COMM Persistent Info.

**Team SCRUM Master:** Cam'Ron Grant (@camrongrant1)

**Team SCRUM Assistant Master:** Kyle Poterek (@kylepoterek)

**Team SCRUM Integrator:** Mathew Yaldo (@MathewYaldo)

**Team Members:**

- Robertson Brinker (@robertsonbrinker)
- Jake Gleason (@Jake-wq)
- Ian Klaus (@Ian-Klaus)
- Kemal Koymen (@letthatbe)
- Endrit Zenuni (@Endritz)
