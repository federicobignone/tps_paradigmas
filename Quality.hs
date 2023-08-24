module Quality ( Quality, newQ, capacityQ, delayQ )
   where

data Quality = Qua String Int Float deriving (Eq, Show)

newQ :: String -> Int -> Float -> Quality
newQ nombreQ capacidadQ demoraQ = Qua nombreQ capacidadQ demoraQ

capacityQ :: Quality -> Int -- cuantos túneles puede tolerar esta conexión
capacityQ (Qua nombreQ capacidadQ demoraQ) = capacidadQ

delayQ :: Quality -> Float  -- la demora por unidad de distancia que sucede en las conexiones de este canal
delayQ (Qua nombreQ capacidadQ delayQ) = delayQ