run("8-bit");
setAutoThreshold("Default dark");
//run("Threshold...");
setThreshold(150, 255);
//setThreshold(150, 255);
setOption("BlackBackground", true);
run("Convert to Mask");
run("Watershed");
run("Analyze Particles...", "size=200-Infinity display summarize");
run("Close");