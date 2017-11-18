(ns
    ^{:doc "Validate integers with a check-digit according to the Damm algorithm."
      :author "Nizal Alshammry and Phillip Lord"}
    identitas.damm
  (:gen-class)
  (:import
   (uk.org.russet.identitas   Util   Damm)
   (uk.org.russet.proquint  Proquint)))


(defn  valid?
  "Returns a boolean given a number"
  [number]
  (Damm/validate number))
