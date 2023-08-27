module Tunel ( Tunel, newT, connectsT, usesT, delayT )
   where

import City 
import Point 
import Quality 
import Link



data Tunel = Tun [Link] deriving (Eq, Show)

newT :: [Link] -> Tunel
newT linkT = Tun linkT

connectsT :: City -> City -> Tunel -> Bool -- inidca si este tunel conceta estas dos ciudades distintas
connectsT ciudadT1 ciudadT2 (Tun linkT) = any (\link -> Lin linkT ciudadT1 == ciudadT2) linkT

usesT :: Link -> Tunel -> Bool  -- indica si este tunel atraviesa ese link
usesT (Lin ciudadL1 ciudadl2 calidadL) (Tun linkT) = any (\link -> link == (Lin ciudadL1 ciudadl2 calidadL)) linkT

delayT :: Tunel -> Float -- la demora que sufre una conexion en este tunel
delayT (Tun linkT) =  sum (map delayL linkT)