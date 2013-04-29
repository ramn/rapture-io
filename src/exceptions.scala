/**************************************************************************************************
Rapture I/O Library
Version 0.7.2

The primary distribution site is

  http://www.propensive.com/

Copyright 2010-2013 Propensive Ltd.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is
distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
implied. See the License for the specific language governing permissions and limitations under the
License.
***************************************************************************************************/

package rapture.implementation
import rapture._

trait Exceptions { this: BaseIo =>
  sealed trait IoException extends Exception

  sealed trait GeneralIoExceptions extends IoException
  sealed trait HttpExceptions extends IoException
  
  case class InterruptedIo() extends GeneralIoExceptions

  sealed trait NotFoundExceptions extends GeneralIoExceptions

  case class NotFound() extends NotFoundExceptions with HttpExceptions

  case class Forbidden() extends HttpExceptions
}
