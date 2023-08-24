

module City ( City, newC, nameC, distanceC )
   where

import Point

data City = Cit String Point deriving (Eq, Show)

newC :: String -> Point -> City
newC nombreC lugarC = Cit nombreC lugarC

nameC :: City -> String
nameC (Cit nombreC lugarC)= nombreC

distanceC :: City -> City -> Float
distanceC (Cit nombre1 lugarC1) (Cit nombre2 lugarC2) = difP (lugarC1) (lugarC2)