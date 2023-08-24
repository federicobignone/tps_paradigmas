module Link ( Link, newL, linksL, connectsL, capacityL, delayL )
   where

import City 
import Point 
import Quality 

data Link = Lin City City Quality deriving (Eq, Show)

newL :: City -> City -> Quality -> Link -- genera un link entre dos ciudades distintas
newL ciudadL1 ciudadl2 calidadL = Lin ciudadL1 ciudadl2 calidadL

connectsL :: City -> Link -> Bool   -- indica si esta ciudad es parte de este link
connectsL ciudadtestL (Lin ciudadL1 ciudadL2 calidadL) = ciudadtestL == ciudadL1 || ciudadtestL == ciudadL2


linksL :: City -> City -> Link -> Bool -- indica si estas dos ciudades distintas estan conectadas mediante este link
linksL ciudadL1 ciudadL2 (Lin ciudadL1' ciudadL2' calidadL) = ciudadL1 == ciudadL1' && ciudadL2 == ciudadL2'  

capacityL :: Link -> Int
capacityL (Lin ciudadL1 ciudadl2 calidadL) = capacityQ calidadL

delayL :: Link -> Float     -- la demora que sufre una conexion en este canal
delayL (Lin ciudadL1 ciudadl2 calidadL) = delayQ calidadL