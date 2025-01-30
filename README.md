# Section C

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.

***

Modifications to: mainscreen.html

lines where modified: 

* 10 - added stylesheet for CSS linking
* 16 - Modified title of web page 
* 18 - add class for background image
* 29 - change the template to sell books 
* 38 - change the template to add Inhouse books
* 39 - change the template to add special order books
* 61 - modify template to show book collections instead of products
* 75 - modify template to add collections instead of products

Modifications to demo.css

* lines 1-6: adding transparent background to web page

# Section D

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

***

Add the file: about.html
* lines 1 to 49: add content of About page 

Add the file: AboutPageController.java

lines added/modified: 
* 1-14: New controller class for the about page. Gets mapping so the server understands what to do when we navigate to the about page. 

* Add background image: Bookshop-background.jpg

Modifications to demo.css

lines 7-29: 
* add new class styling for about page content and other classes found in mainscreen.html

Modifications to mainscreen.html 

lines where modified: 

* 14 - Move demo.css link to BELOW bootstrap stylesheet. 

* 21 - Add new class for header of the page.

* 24 to 27 - Add a button link to about page.

* 29 - Add new class to books heading.

* 61 - Add new class for book collections heading.




# Section E

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

***

Modified file: BootStrapData.java

* lines 40-120: uncommented and modified existing code to create 5 new book "Parts" and 5 new book collections as "Product" objects. 


# Section F

F. Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

* The “Buy Now” button must be next to the buttons that update and delete products.

* The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.

* Display a message that indicates the success or failure of a purchase.
***

Created new files:
- buyNowFailure.html
- buyNowSuccess.html

These are simple html files sharing much of the same boiler plate info. These output a success or failure from the buy now transaction. 

Modify mainscreen.html: 
Line 91 
* add Buy Now button to Book Collections "Products" list. 

Modify Product.java:
Lines 107-120
- Add new method to check if inventory value is greater than 0. 
- Add new method to decrement the inventory by 1, for current product only. 

Modify AddProductController.java: 
Lines 176-189:
- Add GetMapping for buyNow to allow the Buy Now button to function properly. Calls the two newly created methods from Product.java to produce the expected result. 

Modify demo.css
* lines 7, 12-15:

Modify order of heading and center-items properties, split these up into their own selectors entirely for better control of styling on new success/failure pages. 

# Section G

G.  Modify the parts to track maximum and minimum inventory by doing the following:

* Add additional fields to the part entity for maximum and minimum inventory.

* Modify the sample inventory to include the maximum and minimum fields.

* Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.

* Rename the file the persistent storage is saved to.

* Modify the code to enforce that the inventory is between or at the minimum and maximum value.

***

Modify Part.java: 
* Lines 3-4 - import validator classes.
* Lines 21-22 apply validator annotations.
* Lines 36-38 - create new minInv and maxInv variables.
* Lines 92-98 - create setter and getter methods for the minInv and maxInv variables. 

Modify BootStrapData.java: 
* Lines:
* 48-49
* 58-59
* 68-69
* 78-79
* 88-89
* Initialize and set the min and max inventory values for baseline sample data. Repeated for all the above lines. 

Modify mainscreen.html:
* Line 46-48 - Add new table headers/columns for the min and max inventories. 
* Line 56-58 - Populate the table rows with the initial min/max inventory fields from part entity. 

Create ValidMaxParts.java:
* Validator annotation interface to check for max inventory value. Contains default message output that displays when inventory value exceeds maximum.  

Create ValidMinParts.java:
* Validator annotation interface to check for max inventory value. Contains default message output that displays when inventory value is below minimum.

Create MaxInventoryValidator.java:
* Validator file that implements logic to check whether the current part's inventory values are below the maximum.

Create MinInventoryValidator.java:
* Validator file that implements logic to check whether the current part's inventory values are above the minimum.

Modify InHousePartForm.html 
* Lines 33-38 - Add fields for min and max inventory. 
* Lines 42-47 Check and display on page if there are any errors with user inputs. 

Modify OutsourcedPartForm.html
* Lines 33-38 - Add fields for min and max inventory.
* Lines 42-47 Check and display on page if there are any errors with user inputs.

Modify MainScreenController.java:
* lines 22,32,37 - refactor fix spelling mistake. 

# Section H

H. Add validation for between or at the maximum and minimum fields. The validation must include the following:

* Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.

* Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.

* Display error messages when adding and updating parts if the inventory is greater than the maximum.

***
No additional modifications required. I validated my existing code, it seems to be function as expected with these requirements already with the work I applied to part G. 

# Section I

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

*** 

Modify PartTest.java:
* Lines 96-113 - add unit test to check getMaxInv and getMinInv methods.

Modify pom.xml:
* Lines 57-62 - Add dependency for Jupiter testing.

# Section J

J.  Remove the class files for any unused validators in order to clean your code.

*** 
Delete file DeletePartValidator.java
* This was not used anywhere else in the project.
