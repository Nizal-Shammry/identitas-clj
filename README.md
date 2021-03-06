# identitas-clj 

A set of libraries for coining, manipulating and checking identifiers. More details available at https://arxiv.org/abs/1709.09021

An identifier is short string or integer which is used to represent other
things, called here the *identifed*, such as database records, terms in an
ontology or physical entities such as a people or proteins. Identifiers are
*semantics-free* -- that is they do not depend on the characteristics of the
thing that they represent; therefore, they can remain constant, even while the
identified changes.

Identifier schemes can have many different characteristics, many of which
conflict. A good identifier scheme, therefore, is one that makes the correct
compromises for the requirements.

Identitas provides the following functionality:

 - proquint: functions to convert between numbers and an equivalent
   "pronouceable" version, following the
   [http://arxiv.org/html/0901.4016](proquint) scheme.
 - damm: check-digits using the [http://arxiv.org/html/0901.4016](Damm) algorithm.
 - core: combining all of these!

## Usage

### Proquint

Proquint are a transformation from numbers to a more pronounceable form.

    (identitas.proquint/int-to-proint 0)
    ;; => "babab-babab"

    (identitas.proquint/int-to-proint Integer/MAX_INTEGER)
    ;; => "luzuz-zuzuz"


As an extension to original algorithm, we also provide support short and long
transformations, useful depending on the size of identifier space required.

    (identitas.proquint/short-to-proshort 0)
    ;; => "babab"

    (identitas.proquint/long-to-prolong 0)
    ;; => "babab-babab-babab-babab"




## License

The contents of this file are subject to the LGPL License, Version 3.0.

Copyright (C) 2016, Phillip Lord, Newcastle University

This program is free software: you can redistribute it and/or modify it
under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or (at your
option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
for more details.

You should have received a copy of the GNU Lesser General Public License
along with this program. If not, see http://www.gnu.org/licenses/.
