export function deployProjectsLink() {
    return deployPrefix() + "#/projects";
}

export function deployProjectCreateLink() {
    return deployPrefix() + "#/createProject";
}

export function deploySourcesLink() {
    return deployPrefix() + "#/sources";
}

export function deploySourceCreateLink() {
    return deployPrefix() + "#/createSource";
}

export function deployTargetsLink() {
    return deployPrefix() + "#/targets";
}

function deployPrefix() {
    try {
        const current = window.location.pathname;
        if (current && !current.startsWith("/deploy")) return "/deploy";
    } catch (e) {
    }
    return "";
}