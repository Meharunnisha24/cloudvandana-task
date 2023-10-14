const form1 = document.getElementById("form1");
const closeb = document.getElementById("closeb");
const sb = document.getElementById("sb");
const rb = document.getElementById("rb");
const popup = document.getElementById("popup");

sb.addEventListener("click", () => {
  if (form1.checkValidity()) {
    const form2 = new FormData(form1);
    var res = "not mentioned"; 

    const maleCheckbox = document.getElementById("maleCheckbox");
    const femaleCheckbox = document.getElementById("femaleCheckbox");
    const otherCheckbox = document.getElementById("otherCheckbox");

    if (maleCheckbox.checked) {
      res = "male";
    } else if (femaleCheckbox.checked) {
      res = "female";
    } else if (otherCheckbox.checked) {
      res = "Other";
    }

    document.getElementById("fn").textContent = form2.get("fname");
    document.getElementById("ln").textContent = form2.get("lname");
    document.getElementById("dob").textContent = form2.get("dob1");
    document.getElementById("c").textContent = form2.get("country");
    document.getElementById("g").textContent = res;
    document.getElementById("p").textContent = form2.get("profession");
    document.getElementById("e").textContent = form2.get("email");
    document.getElementById("m").textContent = form2.get("mobile");

    popup.style.display = "block";
  }
});

closeb.addEventListener("click", () => {
  popup.style.display = "none";
  form1.reset();
});
