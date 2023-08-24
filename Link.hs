module Link ( Link, newL, linksL, connectsL, capacityL, delayL )
   where

import City 
import Point 
import Quality 

data Link = Lin City City Quality deriving (Eq, Show)

newL :: City -> City -> Quality -> Link -- genera un link entre dos ciudades distintas
newL ciudadL1 ciudadl2 calidadL = Lin ciudadL1 ciudadl2 calidadL

connectsL :: City -> Link -> Bool   -- indica si esta ciudad es parte de este link
connectsL lin ciudadtestL = link_ciudadL1 == ciudadtestL || link_ciudadL2 == ciudadtestL

linksL :: City -> City -> Link -> Bool -- indica si estas dos ciudades distintas estan conectadas mediante este link
linksL ciudadL1 ciudadL2 lin = ciudadL1 == link_ciudadL1 && ciudadL2 == link_ciudadL2  

capacityL :: Link -> Int
capacityL (Lin ciudadL1 ciudadl2 calidadL) = capacidadL calidadL

delayL :: Link -> Float     -- la demora que sufre una conexion en este canal
delayL (Lin ciudadL1 ciudadl2 calidadL) = demoraL calidadL