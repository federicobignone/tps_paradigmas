
module City ( City, newC, nameC, distanceC )
   where

data City = Cit String Point deriving (Eq, Show)

newC :: String -> Point -> City
newC nombreC lugarC = cit nombreC lugarC

nameC :: City -> String
nameC cit nombreC = nombreC

distanceC :: City -> City -> Float
distanceC (cit lugarC1) (cit lugarC2) = difP (lugarC1) (lugarC2)