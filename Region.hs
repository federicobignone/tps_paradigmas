module Region ( Region, newR, foundR, linkR, tunelR, pathR, linksForR, connectedR, linkedR, delayR, availableCapacityForR, usedCapacityForR )
   where

import Point
import City
import Quality
import Link
import Tunel

data Region = Reg [City] [Link] [Tunel]

newR :: Region
newR = Reg [] [] []

foundR :: Region -> City -> Region -- agrega una nueva ciudad a la región
foundR = Reg (city:cities) links tunels

linkR :: Region -> City -> City -> Quality -> Region -- enlaza dos ciudades de la región con un enlace de la calidad indicada
linkR (Reg cities links tunels) city1 city2 quality = Reg cities (newL city1 city2 quality:links) tunels

-- tunelR :: Region -> [ City ] -> Region -- genera una comunicación entre dos ciudades distintas de la región
connectedR :: Region -> City -> City -> Bool -- indica si estas dos ciudades estan conectadas por un tunel
connectedR (Reg cities links tunels) city1 city2 = lenght([tunel | tunel <- tunels, connectsT city1 city2 tunel]) > 0
linkedR :: Region -> City -> City -> Bool -- indica si estas dos ciudades estan enlazadas
linkedR (Reg cities links tunels) city1 city2 = lenght([link | link <- links, linkL city1 city2 link]) > 0

delayR :: Region -> City -> City -> Float -- dadas dos ciudades conectadas, indica la demora
delayR (Reg cities links tunels) city1 city2 | connectedR (Reg cities links tunels) city1 city2  = head [delayT tunel | tunel <- tunels, connectsT city1 city2 tunel]
                                             | otherwise = error "Estas ciudades no están conectadas"

availableCapacityForR :: Region -> City -> City -> Int -- indica la capacidad disponible entre dos ciudades
availableCapacityForR (Reg cities links tunels) city1 city2 | linkedR  (Reg cities links tunels) city1 city2 = capacityL (head [link | link <- links, linksL city1 city2 link])
                                                            | otherwise = error "Estas ciudades no están conectadas"